package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;

public class ExtCertificateEncodingException extends CertificateEncodingException {
    public Throwable getCause() {
        return null;
    }
}
