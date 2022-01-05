package org.bouncycastle.jce.provider;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s0.a.a.d3.m;
import s0.a.a.g2.a;
import s0.a.a.n;
import s0.a.a.v2.b;
import s0.a.c.f;
import s0.a.c.g;
import s0.a.c.o.c;

public class ProvRevocationChecker extends PKIXRevocationChecker implements f {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final ProvCrlRevocationChecker crlChecker;
    private final c helper;
    private final ProvOcspRevocationChecker ocspChecker;
    private g parameters;

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

    public ProvRevocationChecker(c cVar) {
        this.helper = cVar;
        this.crlChecker = new ProvCrlRevocationChecker(cVar);
        this.ocspChecker = new ProvOcspRevocationChecker(this, cVar);
    }

    private boolean hasOption(PKIXRevocationChecker.Option option) {
        return getOptions().contains(option);
    }

    public void check(Certificate certificate, Collection<String> collection) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (hasOption(PKIXRevocationChecker.Option.ONLY_END_ENTITY) && x509Certificate.getBasicConstraints() != -1) {
            return;
        }
        if (hasOption(PKIXRevocationChecker.Option.PREFER_CRLS)) {
            try {
                this.crlChecker.check(certificate);
            } catch (RecoverableCertPathValidatorException e) {
                if (!hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                    this.ocspChecker.check(certificate);
                    return;
                }
                throw e;
            }
        } else {
            try {
                this.ocspChecker.check(certificate);
            } catch (RecoverableCertPathValidatorException e2) {
                if (!hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                    this.crlChecker.check(certificate);
                    return;
                }
                throw e2;
            }
        }
    }

    public List<CertPathValidatorException> getSoftFailExceptions() {
        return this.ocspChecker.getSoftFailExceptions();
    }

    public Set<String> getSupportedExtensions() {
        return null;
    }

    public void init(boolean z) throws CertPathValidatorException {
        this.parameters = null;
        this.crlChecker.init(z);
        this.ocspChecker.init(z);
    }

    public void initialize(g gVar) {
        this.parameters = gVar;
        this.crlChecker.initialize(gVar);
        this.ocspChecker.initialize(gVar);
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }

    public void setParameter(String str, Object obj) {
    }
}
