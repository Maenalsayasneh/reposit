package org.bouncycastle.x509;

import java.security.cert.CertificateEncodingException;

public class ExtCertificateEncodingException extends CertificateEncodingException {
    public Throwable getCause() {
        return null;
    }
}
