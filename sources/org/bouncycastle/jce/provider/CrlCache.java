package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import s0.a.c.d;
import s0.a.g.c;
import s0.a.g.h;
import s0.a.g.i;

public class CrlCache {
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<d>> cache = Collections.synchronizedMap(new WeakHashMap());

    public static class LocalCRLStore<T extends CRL> implements d, Iterable {
        private Collection<CRL> _local;

        public LocalCRLStore(i<CRL> iVar) {
            this._local = new ArrayList(iVar.getMatches((h<CRL>) null));
        }

        public Collection getMatches(h hVar) {
            if (hVar == null) {
                return new ArrayList(this._local);
            }
            ArrayList arrayList = new ArrayList();
            for (CRL next : this._local) {
                if (hVar.r0(next)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public Iterator<CRL> iterator() {
            return getMatches((h) null).iterator();
        }
    }

    public static synchronized d getCrl(CertificateFactory certificateFactory, Date date, URI uri) throws IOException, CRLException {
        synchronized (CrlCache.class) {
            WeakReference weakReference = cache.get(uri);
            d dVar = weakReference != null ? (d) weakReference.get() : null;
            if (dVar != null) {
                boolean z = false;
                Iterator it = dVar.getMatches((h) null).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Date nextUpdate = ((X509CRL) it.next()).getNextUpdate();
                        if (nextUpdate != null && nextUpdate.before(date)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    return dVar;
                }
            }
            LocalCRLStore localCRLStore = new LocalCRLStore(new c(uri.getScheme().equals("ldap") ? getCrlsFromLDAP(certificateFactory, uri) : getCrls(certificateFactory, uri)));
            cache.put(uri, new WeakReference(localCRLStore));
            return localCRLStore;
        }
    }

    private static Collection getCrls(CertificateFactory certificateFactory, URI uri) throws IOException, CRLException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) uri.toURL().openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        InputStream inputStream = httpURLConnection.getInputStream();
        Collection<? extends CRL> generateCRLs = certificateFactory.generateCRLs(inputStream);
        inputStream.close();
        return generateCRLs;
    }

    private static Collection getCrlsFromLDAP(CertificateFactory certificateFactory, URI uri) throws IOException, CRLException {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(new ByteArrayInputStream(bArr));
            }
            throw new CRLException("no CRL returned from: " + uri);
        } catch (NamingException e) {
            StringBuilder P0 = a.P0("issue connecting to: ");
            P0.append(uri.toString());
            throw new CRLException(P0.toString(), e);
        }
    }
}
