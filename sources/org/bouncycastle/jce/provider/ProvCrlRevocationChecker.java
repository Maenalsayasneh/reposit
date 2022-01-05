package org.bouncycastle.jce.provider;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Date;
import s0.a.c.f;
import s0.a.c.g;
import s0.a.c.o.c;

public class ProvCrlRevocationChecker implements f {
    private Date currentDate = null;
    private final c helper;
    private g params;

    public ProvCrlRevocationChecker(c cVar) {
        this.helper = cVar;
    }

    public void check(Certificate certificate) throws CertPathValidatorException {
        try {
            g gVar = this.params;
            g gVar2 = this.params;
            RFC3280CertPathUtilities.checkCRLs(gVar, gVar.a, this.currentDate, gVar.a(), (X509Certificate) certificate, gVar2.e, gVar2.f, gVar2.c.getCertificates(), this.helper);
        } catch (AnnotatedException e) {
            Throwable cause = e.getCause() != null ? e.getCause() : e;
            String message = e.getMessage();
            g gVar3 = this.params;
            throw new CertPathValidatorException(message, cause, gVar3.c, gVar3.d);
        }
    }

    public void init(boolean z) throws CertPathValidatorException {
        if (!z) {
            this.params = null;
            this.currentDate = new Date();
            return;
        }
        throw new CertPathValidatorException("forward checking not supported");
    }

    public void initialize(g gVar) {
        this.params = gVar;
        this.currentDate = new Date();
    }

    public void setParameter(String str, Object obj) {
    }
}
