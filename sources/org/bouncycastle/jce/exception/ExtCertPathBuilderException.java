package org.bouncycastle.jce.exception;

import java.security.cert.CertPathBuilderException;

public class ExtCertPathBuilderException extends CertPathBuilderException {
    public Throwable c;

    public ExtCertPathBuilderException(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    public Throwable getCause() {
        return this.c;
    }
}
