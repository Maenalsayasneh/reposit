package s0.a.c;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;

public interface f {
    void check(Certificate certificate) throws CertPathValidatorException;

    void initialize(g gVar) throws CertPathValidatorException;
}
