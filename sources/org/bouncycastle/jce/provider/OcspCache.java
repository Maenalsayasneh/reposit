package org.bouncycastle.jce.provider;

import com.instabug.library.networkv2.request.RequestMethod;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.util.io.StreamOverflowException;
import s0.a.a.b1;
import s0.a.a.c3.u;
import s0.a.a.c3.v;
import s0.a.a.c3.w;
import s0.a.a.i;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.s;
import s0.a.a.u2.a;
import s0.a.a.u2.b;
import s0.a.a.u2.d;
import s0.a.a.u2.e;
import s0.a.a.u2.f;
import s0.a.a.u2.h;
import s0.a.a.u2.j;
import s0.a.a.u2.k;
import s0.a.a.u2.m;
import s0.a.c.g;
import s0.a.c.o.c;

public class OcspCache {
    private static final int DEFAULT_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<Map<b, f>>> cache = Collections.synchronizedMap(new WeakHashMap());

    public static f getOcspResponse(b bVar, g gVar, URI uri, X509Certificate x509Certificate, List<Extension> list, c cVar) throws CertPathValidatorException {
        f fVar;
        i iVar;
        b bVar2 = bVar;
        g gVar2 = gVar;
        URI uri2 = uri;
        WeakReference weakReference = cache.get(uri2);
        Map map = weakReference != null ? (Map) weakReference.get() : null;
        if (!(map == null || (fVar = (f) map.get(bVar2)) == null)) {
            s sVar = k.s(a.s(o.B(fVar.d.d).c).c).Y1;
            for (int i = 0; i != sVar.size(); i++) {
                m s = m.s(sVar.D(i));
                if (bVar2.equals(s.c) && (iVar = s.x) != null) {
                    try {
                        if (gVar.a().after(iVar.D())) {
                            map.remove(bVar2);
                            fVar = null;
                        }
                    } catch (ParseException unused) {
                        map.remove(bVar2);
                    }
                }
            }
            if (fVar != null) {
                return fVar;
            }
        }
        try {
            URL url = uri.toURL();
            s0.a.a.f fVar2 = new s0.a.a.f(10);
            fVar2.a(new h(bVar2, (v) null));
            s0.a.a.f fVar3 = new s0.a.a.f(10);
            byte[] bArr = null;
            for (int i2 = 0; i2 != list.size(); i2++) {
                Extension extension = list.get(i2);
                byte[] value = extension.getValue();
                if (d.c.d.equals(extension.getId())) {
                    bArr = value;
                }
                fVar3.a(new u(new n(extension.getId()), extension.isCritical(), value));
            }
            try {
                byte[] encoded = new e(new s0.a.a.u2.n((w) null, new b1(fVar2), v.t(new b1(fVar3)))).getEncoded();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod(RequestMethod.POST);
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", String.valueOf(encoded.length));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(encoded);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = DEFAULT_MAX_RESPONSE_SIZE;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                long j = (long) contentLength;
                int i3 = 4096;
                byte[] bArr2 = new byte[4096];
                long j2 = 0;
                boolean z = false;
                while (true) {
                    int read = inputStream.read(bArr2, 0, i3);
                    if (read >= 0) {
                        long j3 = j - j2;
                        long j4 = j;
                        long j5 = (long) read;
                        if (j3 >= j5) {
                            j2 += j5;
                            byteArrayOutputStream.write(bArr2, 0, read);
                            i3 = 4096;
                            j = j4;
                        } else {
                            throw new StreamOverflowException("Data Overflow");
                        }
                    } else {
                        f s2 = f.s(byteArrayOutputStream.toByteArray());
                        if (s2.c.c.E() == 0) {
                            j s3 = j.s(s2.d);
                            if (s3.c.w(d.b)) {
                                z = ProvOcspRevocationChecker.validatedOcspResponse(a.s(s3.d.c), gVar2, bArr, x509Certificate, cVar);
                            }
                            if (z) {
                                WeakReference weakReference2 = cache.get(uri2);
                                if (weakReference2 != null) {
                                    ((Map) weakReference2.get()).put(bVar2, s2);
                                } else {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put(bVar2, s2);
                                    cache.put(uri2, new WeakReference(hashMap));
                                }
                                return s2;
                            }
                            throw new CertPathValidatorException("OCSP response failed to validate", (Throwable) null, gVar2.c, gVar2.d);
                        }
                        throw new CertPathValidatorException("OCSP responder failed: " + s2.c.c.D(), (Throwable) null, gVar2.c, gVar2.d);
                    }
                }
            } catch (IOException e) {
                throw new CertPathValidatorException(i0.d.a.a.a.V(e, i0.d.a.a.a.P0("configuration error: ")), e, gVar2.c, gVar2.d);
            }
        } catch (MalformedURLException e2) {
            MalformedURLException malformedURLException = e2;
            StringBuilder P0 = i0.d.a.a.a.P0("configuration error: ");
            P0.append(malformedURLException.getMessage());
            throw new CertPathValidatorException(P0.toString(), malformedURLException, gVar2.c, gVar2.d);
        }
    }
}
