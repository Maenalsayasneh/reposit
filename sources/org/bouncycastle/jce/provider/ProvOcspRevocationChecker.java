package org.bouncycastle.jce.provider;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import s0.a.a.c3.c0;
import s0.a.a.c3.h;
import s0.a.a.c3.m0;
import s0.a.a.c3.u;
import s0.a.a.c3.w;
import s0.a.a.d3.m;
import s0.a.a.e;
import s0.a.a.g2.a;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.s;
import s0.a.a.u2.i;
import s0.a.a.u2.j;
import s0.a.a.u2.l;
import s0.a.a.v0;
import s0.a.a.v2.b;
import s0.a.a.x0;
import s0.a.a.y;
import s0.a.c.f;
import s0.a.c.g;
import s0.a.c.o.c;
import s0.a.c.o.d;

public class ProvOcspRevocationChecker implements f {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final c helper;
    private boolean isEnabledOCSP;
    private String ocspURL;
    private g parameters;
    private final ProvRevocationChecker parent;

    static {
        HashMap hashMap = new HashMap();
        oids = hashMap;
        hashMap.put(new n("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(s0.a.a.w2.n.C, "SHA224WITHRSA");
        hashMap.put(s0.a.a.w2.n.z, "SHA256WITHRSA");
        hashMap.put(s0.a.a.w2.n.A, "SHA384WITHRSA");
        hashMap.put(s0.a.a.w2.n.B, "SHA512WITHRSA");
        hashMap.put(a.n, "GOST3411WITHGOST3410");
        hashMap.put(a.o, "GOST3411WITHECGOST3410");
        hashMap.put(s0.a.a.x2.a.i, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(s0.a.a.x2.a.j, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(s0.a.a.d2.a.d, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(s0.a.a.d2.a.e, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(s0.a.a.d2.a.f, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(s0.a.a.d2.a.g, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(s0.a.a.d2.a.h, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(s0.a.a.d2.a.i, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(s0.a.a.h2.a.i, "SHA1WITHCVC-ECDSA");
        hashMap.put(s0.a.a.h2.a.j, "SHA224WITHCVC-ECDSA");
        hashMap.put(s0.a.a.h2.a.k, "SHA256WITHCVC-ECDSA");
        hashMap.put(s0.a.a.h2.a.l, "SHA384WITHCVC-ECDSA");
        hashMap.put(s0.a.a.h2.a.m, "SHA512WITHCVC-ECDSA");
        hashMap.put(s0.a.a.m2.a.a, "XMSS");
        hashMap.put(s0.a.a.m2.a.b, "XMSSMT");
        hashMap.put(new n("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new n("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new n("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(m.f1, "SHA1WITHECDSA");
        hashMap.put(m.j1, "SHA224WITHECDSA");
        hashMap.put(m.k1, "SHA256WITHECDSA");
        hashMap.put(m.l1, "SHA384WITHECDSA");
        hashMap.put(m.m1, "SHA512WITHECDSA");
        hashMap.put(b.h, "SHA1WITHRSA");
        hashMap.put(b.g, "SHA1WITHDSA");
        hashMap.put(s0.a.a.r2.b.S, "SHA224WITHDSA");
        hashMap.put(s0.a.a.r2.b.T, "SHA256WITHDSA");
    }

    public ProvOcspRevocationChecker(ProvRevocationChecker provRevocationChecker, c cVar) {
        this.parent = provRevocationChecker;
        this.helper = cVar;
    }

    private static byte[] calcKeyHash(MessageDigest messageDigest, PublicKey publicKey) {
        return messageDigest.digest(m0.s(publicKey.getEncoded()).d.B());
    }

    private s0.a.a.u2.b createCertID(s0.a.a.u2.b bVar, s0.a.a.c3.n nVar, k kVar) throws CertPathValidatorException {
        return createCertID(bVar.c, nVar, kVar);
    }

    private s0.a.a.c3.n extractCert() throws CertPathValidatorException {
        try {
            return s0.a.a.c3.n.s(this.parameters.e.getEncoded());
        } catch (Exception e) {
            String a0 = i0.d.a.a.a.a0(e, i0.d.a.a.a.P0("cannot process signing cert: "));
            g gVar = this.parameters;
            throw new CertPathValidatorException(a0, e, gVar.c, gVar.d);
        }
    }

    private static String getDigestName(n nVar) {
        String a = d.a(nVar);
        int indexOf = a.indexOf(45);
        if (indexOf <= 0 || a.startsWith("SHA3")) {
            return a;
        }
        return a.substring(0, indexOf) + a.substring(indexOf + 1);
    }

    public static URI getOcspResponderURI(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(u.l2.d);
        if (extensionValue == null) {
            return null;
        }
        byte[] bArr = o.B(extensionValue).c;
        s0.a.a.c3.a[] aVarArr = (bArr instanceof h ? (h) bArr : bArr != null ? new h(s.B(bArr)) : null).c;
        int length = aVarArr.length;
        s0.a.a.c3.a[] aVarArr2 = new s0.a.a.c3.a[length];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
        for (int i = 0; i != length; i++) {
            s0.a.a.c3.a aVar = aVarArr2[i];
            if (s0.a.a.c3.a.c.w(aVar.d)) {
                w wVar = aVar.q;
                if (wVar.d == 6) {
                    try {
                        return new URI(((y) wVar.c).e());
                    } catch (URISyntaxException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static String getSignatureName(s0.a.a.c3.b bVar) {
        e eVar = bVar.d;
        if (eVar == null || v0.c.v(eVar) || !bVar.c.w(s0.a.a.w2.n.w)) {
            Map map = oids;
            if (map.containsKey(bVar.c)) {
                return (String) map.get(bVar.c);
            }
            return bVar.c.d;
        }
        return i0.d.a.a.a.y0(new StringBuilder(), getDigestName(s0.a.a.w2.u.s(eVar).y.c), "WITHRSAANDMGF1");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.cert.X509Certificate getSignerCert(s0.a.a.u2.a r3, java.security.cert.X509Certificate r4, java.security.cert.X509Certificate r5, s0.a.c.o.c r6) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException {
        /*
            s0.a.a.u2.k r3 = r3.c
            s0.a.a.u2.i r3 = r3.x
            s0.a.a.e r3 = r3.c
            boolean r0 = r3 instanceof s0.a.a.o
            r1 = 0
            if (r0 == 0) goto L_0x0011
            r2 = r3
            s0.a.a.o r2 = (s0.a.a.o) r2
            byte[] r2 = r2.c
            goto L_0x0012
        L_0x0011:
            r2 = r1
        L_0x0012:
            if (r2 == 0) goto L_0x003c
            java.lang.String r3 = "SHA1"
            java.security.MessageDigest r3 = r6.b(r3)
            if (r5 == 0) goto L_0x002b
            java.security.PublicKey r6 = r5.getPublicKey()
            byte[] r6 = calcKeyHash(r3, r6)
            boolean r6 = java.util.Arrays.equals(r2, r6)
            if (r6 == 0) goto L_0x002b
            return r5
        L_0x002b:
            if (r4 == 0) goto L_0x0074
            java.security.PublicKey r5 = r4.getPublicKey()
            byte[] r3 = calcKeyHash(r3, r5)
            boolean r3 = java.util.Arrays.equals(r2, r3)
            if (r3 == 0) goto L_0x0074
            return r4
        L_0x003c:
            s0.a.a.b3.d r6 = s0.a.a.b3.e.b.Q
            if (r0 == 0) goto L_0x0042
            r3 = r1
            goto L_0x0046
        L_0x0042:
            s0.a.a.b3.c r3 = s0.a.a.b3.c.s(r3)
        L_0x0046:
            s0.a.a.b3.c r3 = s0.a.a.b3.c.t(r6, r3)
            if (r5 == 0) goto L_0x005f
            javax.security.auth.x500.X500Principal r0 = r5.getSubjectX500Principal()
            byte[] r0 = r0.getEncoded()
            s0.a.a.b3.c r0 = s0.a.a.b3.c.t(r6, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005f
            return r5
        L_0x005f:
            if (r4 == 0) goto L_0x0074
            javax.security.auth.x500.X500Principal r5 = r4.getSubjectX500Principal()
            byte[] r5 = r5.getEncoded()
            s0.a.a.b3.c r5 = s0.a.a.b3.c.t(r6, r5)
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0074
            return r4
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.ProvOcspRevocationChecker.getSignerCert(s0.a.a.u2.a, java.security.cert.X509Certificate, java.security.cert.X509Certificate, s0.a.c.o.c):java.security.cert.X509Certificate");
    }

    private static boolean responderMatches(i iVar, X509Certificate x509Certificate, c cVar) throws NoSuchProviderException, NoSuchAlgorithmException {
        e eVar = iVar.c;
        boolean z = eVar instanceof o;
        s0.a.a.b3.c cVar2 = null;
        byte[] bArr = z ? ((o) eVar).c : null;
        if (bArr != null) {
            return Arrays.equals(bArr, calcKeyHash(cVar.b("SHA1"), x509Certificate.getPublicKey()));
        }
        s0.a.a.b3.d dVar = s0.a.a.b3.e.b.Q;
        if (!z) {
            cVar2 = s0.a.a.b3.c.s(eVar);
        }
        return s0.a.a.b3.c.t(dVar, cVar2).equals(s0.a.a.b3.c.t(dVar, x509Certificate.getSubjectX500Principal().getEncoded()));
    }

    public static boolean validatedOcspResponse(s0.a.a.u2.a aVar, g gVar, byte[] bArr, X509Certificate x509Certificate, c cVar) throws CertPathValidatorException {
        try {
            s sVar = aVar.x;
            Signature createSignature = cVar.createSignature(getSignatureName(aVar.d));
            X509Certificate signerCert = getSignerCert(aVar, gVar.e, x509Certificate, cVar);
            if (signerCert == null) {
                if (sVar == null) {
                    throw new CertPathValidatorException("OCSP responder certificate not found");
                }
            }
            if (signerCert != null) {
                createSignature.initVerify(signerCert.getPublicKey());
            } else {
                X509Certificate x509Certificate2 = (X509Certificate) cVar.e("X.509").generateCertificate(new ByteArrayInputStream(sVar.D(0).c().getEncoded()));
                x509Certificate2.verify(gVar.e.getPublicKey());
                x509Certificate2.checkValidity(gVar.a());
                if (responderMatches(aVar.c.x, x509Certificate2, cVar)) {
                    List<String> extendedKeyUsage = x509Certificate2.getExtendedKeyUsage();
                    if (extendedKeyUsage == null || !extendedKeyUsage.contains(c0.d.q.d)) {
                        throw new CertPathValidatorException("responder certificate not valid for signing OCSP responses", (Throwable) null, gVar.c, gVar.d);
                    }
                    createSignature.initVerify(x509Certificate2);
                } else {
                    throw new CertPathValidatorException("responder certificate does not match responderID", (Throwable) null, gVar.c, gVar.d);
                }
            }
            createSignature.update(aVar.c.r("DER"));
            if (!createSignature.verify(aVar.q.B())) {
                return false;
            }
            if (bArr == null) {
                return true;
            }
            if (Arrays.equals(bArr, aVar.c.Z1.s(s0.a.a.u2.d.c).q2.c)) {
                return true;
            }
            throw new CertPathValidatorException("nonce mismatch in OCSP response", (Throwable) null, gVar.c, gVar.d);
        } catch (CertPathValidatorException e) {
            throw e;
        } catch (GeneralSecurityException e2) {
            StringBuilder P0 = i0.d.a.a.a.P0("OCSP response failure: ");
            P0.append(e2.getMessage());
            throw new CertPathValidatorException(P0.toString(), e2, gVar.c, gVar.d);
        } catch (IOException e3) {
            throw new CertPathValidatorException(i0.d.a.a.a.V(e3, i0.d.a.a.a.P0("OCSP response failure: ")), e3, gVar.c, gVar.d);
        }
    }

    public void check(Certificate certificate) throws CertPathValidatorException {
        byte[] bArr;
        boolean z;
        X509Certificate x509Certificate = (X509Certificate) certificate;
        Map<X509Certificate, byte[]> ocspResponses = this.parent.getOcspResponses();
        URI ocspResponder = this.parent.getOcspResponder();
        if (ocspResponder == null) {
            if (this.ocspURL != null) {
                try {
                    ocspResponder = new URI(this.ocspURL);
                } catch (URISyntaxException e) {
                    StringBuilder P0 = i0.d.a.a.a.P0("configuration error: ");
                    P0.append(e.getMessage());
                    String sb = P0.toString();
                    g gVar = this.parameters;
                    throw new CertPathValidatorException(sb, e, gVar.c, gVar.d);
                }
            } else {
                ocspResponder = getOcspResponderURI(x509Certificate);
            }
        }
        URI uri = ocspResponder;
        if (ocspResponses.get(x509Certificate) != null || uri == null) {
            List<Extension> ocspExtensions = this.parent.getOcspExtensions();
            bArr = null;
            for (int i = 0; i != ocspExtensions.size(); i++) {
                Extension extension = ocspExtensions.get(i);
                byte[] value = extension.getValue();
                if (s0.a.a.u2.d.c.d.equals(extension.getId())) {
                    bArr = value;
                }
            }
            z = false;
        } else if (this.ocspURL == null && this.parent.getOcspResponder() == null && !this.isEnabledOCSP) {
            g gVar2 = this.parameters;
            throw new RecoverableCertPathValidatorException("OCSP disabled by \"ocsp.enable\" setting", (Throwable) null, gVar2.c, gVar2.d);
        } else {
            try {
                ocspResponses.put(x509Certificate, OcspCache.getOcspResponse(createCertID(new s0.a.a.c3.b(b.f), extractCert(), new k(x509Certificate.getSerialNumber())), this.parameters, uri, this.parent.getOcspResponderCert(), this.parent.getOcspExtensions(), this.helper).getEncoded());
                bArr = null;
                z = true;
            } catch (IOException e2) {
                g gVar3 = this.parameters;
                throw new CertPathValidatorException("unable to encode OCSP response", e2, gVar3.c, gVar3.d);
            }
        }
        if (!ocspResponses.isEmpty()) {
            s0.a.a.u2.f s = s0.a.a.u2.f.s(ocspResponses.get(x509Certificate));
            k kVar = new k(x509Certificate.getSerialNumber());
            if (s == null) {
                g gVar4 = this.parameters;
                throw new RecoverableCertPathValidatorException("no OCSP response found for certificate", (Throwable) null, gVar4.c, gVar4.d);
            } else if (s.c.c.E() == 0) {
                j s2 = j.s(s.d);
                if (s2.c.w(s0.a.a.u2.d.b)) {
                    try {
                        s0.a.a.u2.a s3 = s0.a.a.u2.a.s(s2.d.c);
                        if (z || validatedOcspResponse(s3, this.parameters, bArr, this.parent.getOcspResponderCert(), this.helper)) {
                            s sVar = s0.a.a.u2.k.s(s3.c).Y1;
                            s0.a.a.u2.b bVar = null;
                            for (int i2 = 0; i2 != sVar.size(); i2++) {
                                s0.a.a.u2.m s4 = s0.a.a.u2.m.s(sVar.D(i2));
                                if (kVar.w(s4.c.x)) {
                                    s0.a.a.i iVar = s4.x;
                                    if (iVar != null) {
                                        if (this.parameters.a().after(iVar.D())) {
                                            throw new ExtCertPathValidatorException("OCSP response expired");
                                        }
                                    }
                                    if (bVar == null || !bVar.c.equals(s4.c.c)) {
                                        bVar = createCertID(s4.c, extractCert(), kVar);
                                    }
                                    if (bVar.equals(s4.c)) {
                                        s0.a.a.u2.c cVar = s4.d;
                                        int i3 = cVar.c;
                                        if (i3 != 0) {
                                            if (i3 == 1) {
                                                l s5 = l.s(cVar.d);
                                                String str = "certificate revoked, reason=(" + s5.d + "), date=" + s5.c.D();
                                                g gVar5 = this.parameters;
                                                throw new CertPathValidatorException(str, (Throwable) null, gVar5.c, gVar5.d);
                                            }
                                            g gVar6 = this.parameters;
                                            throw new CertPathValidatorException("certificate revoked, details unknown", (Throwable) null, gVar6.c, gVar6.d);
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (CertPathValidatorException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        g gVar7 = this.parameters;
                        throw new CertPathValidatorException("unable to process OCSP response", e4, gVar7.c, gVar7.d);
                    }
                }
            } else {
                StringBuilder P02 = i0.d.a.a.a.P0("OCSP response failed: ");
                P02.append(s.c.c.D());
                String sb2 = P02.toString();
                g gVar8 = this.parameters;
                throw new CertPathValidatorException(sb2, (Throwable) null, gVar8.c, gVar8.d);
            }
        } else {
            g gVar9 = this.parameters;
            throw new RecoverableCertPathValidatorException("no OCSP response found for any certificate", (Throwable) null, gVar9.c, gVar9.d);
        }
    }

    public List<CertPathValidatorException> getSoftFailExceptions() {
        return null;
    }

    public Set<String> getSupportedExtensions() {
        return null;
    }

    public void init(boolean z) throws CertPathValidatorException {
        if (!z) {
            this.parameters = null;
            this.isEnabledOCSP = s0.a.g.g.b("ocsp.enable");
            this.ocspURL = s0.a.g.g.a("ocsp.responderURL");
            return;
        }
        throw new CertPathValidatorException("forward checking not supported");
    }

    public void initialize(g gVar) {
        this.parameters = gVar;
        this.isEnabledOCSP = s0.a.g.g.b("ocsp.enable");
        this.ocspURL = s0.a.g.g.a("ocsp.responderURL");
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }

    public void setParameter(String str, Object obj) {
    }

    private s0.a.a.u2.b createCertID(s0.a.a.c3.b bVar, s0.a.a.c3.n nVar, k kVar) throws CertPathValidatorException {
        try {
            MessageDigest b = this.helper.b(d.a(bVar.c));
            return new s0.a.a.u2.b(bVar, new x0(b.digest(nVar.d.a2.r("DER"))), new x0(b.digest(nVar.d.b2.d.B())), kVar);
        } catch (Exception e) {
            throw new CertPathValidatorException("problem creating ID: " + e, e);
        }
    }
}
