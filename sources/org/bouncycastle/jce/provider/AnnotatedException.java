package org.bouncycastle.jce.provider;

public class AnnotatedException extends Exception {
    private Throwable _underlyingException;

    public AnnotatedException(String str) {
        this(str, (Throwable) null);
    }

    public AnnotatedException(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }

    public Throwable getCause() {
        return this._underlyingException;
    }

    public Throwable getUnderlyingException() {
        return this._underlyingException;
    }
}
