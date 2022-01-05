package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import s0.a.a.b1;
import s0.a.a.c1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.j;
import s0.a.a.k;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.w2.n;
import s0.a.a.w2.w;
import s0.a.c.o.a;
import s0.a.c.o.c;
import s0.a.g.l.c.b;
import s0.a.g.l.c.d;

public class PKIXCertPath extends CertPath {
    public static final List certPathEncodings;
    private List certificates;
    private final c helper;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    public PKIXCertPath(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        a aVar = new a();
        this.helper = aVar;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7")) {
                    if (!str.equalsIgnoreCase("PEM")) {
                        throw new CertificateException("unsupported encoding: " + str);
                    }
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                CertificateFactory e = aVar.e("X.509");
                while (true) {
                    Certificate generateCertificate = e.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
            } else {
                r i = new j(inputStream).i();
                if (i instanceof s) {
                    Enumeration E = ((s) i).E();
                    this.certificates = new ArrayList();
                    CertificateFactory e2 = aVar.e("X.509");
                    while (E.hasMoreElements()) {
                        this.certificates.add(0, e2.generateCertificate(new ByteArrayInputStream(((e) E.nextElement()).c().r("DER"))));
                    }
                } else {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
            }
            this.certificates = sortCerts(this.certificates);
        } catch (IOException e3) {
            StringBuilder P0 = i0.d.a.a.a.P0("IOException throw while decoding CertPath:\n");
            P0.append(e3.toString());
            throw new CertificateException(P0.toString());
        } catch (NoSuchProviderException e4) {
            StringBuilder P02 = i0.d.a.a.a.P0("BouncyCastle provider not found while trying to get a CertificateFactory:\n");
            P02.append(e4.toString());
            throw new CertificateException(P02.toString());
        }
    }

    public PKIXCertPath(List list) {
        super("X.509");
        this.helper = new a();
        this.certificates = sortCerts(new ArrayList(list));
    }

    private List sortCerts(List list) {
        boolean z;
        boolean z2;
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        int i = 1;
        while (true) {
            if (i != list.size()) {
                if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    z = false;
                    break;
                }
                issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            int i3 = 0;
            while (true) {
                if (i3 == list.size()) {
                    z2 = false;
                    break;
                } else if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z2) {
                arrayList.add(x509Certificate);
                list.remove(i2);
            }
        }
        if (arrayList.size() > 1) {
            return arrayList2;
        }
        for (int i4 = 0; i4 != arrayList.size(); i4++) {
            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
            int i5 = 0;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                    arrayList.add(x509Certificate2);
                    list.remove(i5);
                    break;
                }
                i5++;
            }
        }
        return list.size() > 0 ? arrayList2 : arrayList;
    }

    private r toASN1Object(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new j(x509Certificate.getEncoded()).i();
        } catch (Exception e) {
            throw new CertificateEncodingException(i0.d.a.a.a.b0(e, i0.d.a.a.a.P0("Exception while encoding certificate: ")));
        }
    }

    private byte[] toDEREncoded(e eVar) throws CertificateEncodingException {
        try {
            return eVar.c().r("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: " + e);
        }
    }

    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.certificates));
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    public byte[] getEncoded(String str) throws CertificateEncodingException {
        if (str.equalsIgnoreCase("PkiPath")) {
            f fVar = new f(10);
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                fVar.a(toASN1Object((X509Certificate) listIterator.previous()));
            }
            return toDEREncoded(new b1(fVar));
        }
        int i = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            s0.a.a.w2.c cVar = new s0.a.a.w2.c(n.d0, (e) null);
            f fVar2 = new f(10);
            while (i != this.certificates.size()) {
                fVar2.a(toASN1Object((X509Certificate) this.certificates.get(i)));
                i++;
            }
            return toDEREncoded(new s0.a.a.w2.c(n.e0, new w(new k(1), new c1(), cVar, new c1(fVar2), (v) null, new c1())));
        } else if (str.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            d dVar = new d(new OutputStreamWriter(byteArrayOutputStream));
            while (i != this.certificates.size()) {
                try {
                    dVar.a(new b("CERTIFICATE", ((X509Certificate) this.certificates.get(i)).getEncoded()));
                    i++;
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            dVar.close();
            return byteArrayOutputStream.toByteArray();
        } else {
            throw new CertificateEncodingException(i0.d.a.a.a.n0("unsupported encoding: ", str));
        }
    }

    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }
}
