package org.bouncycastle.jce.provider;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import s0.a.c.f;
import s0.a.c.g;

public class WrappedRevocationChecker implements f {
    private final PKIXCertPathChecker checker;

    public WrappedRevocationChecker(PKIXCertPathChecker pKIXCertPathChecker) {
        this.checker = pKIXCertPathChecker;
    }

    public void check(Certificate certificate) throws CertPathValidatorException {
        this.checker.check(certificate);
    }

    public void initialize(g gVar) throws CertPathValidatorException {
        this.checker.init(false);
    }

    public void setParameter(String str, Object obj) {
    }
}
