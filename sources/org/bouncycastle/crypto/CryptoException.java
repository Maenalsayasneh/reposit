package org.bouncycastle.crypto;

public class CryptoException extends Exception {
    public Throwable c;

    public CryptoException() {
    }

    public CryptoException(String str) {
        super(str);
    }

    public CryptoException(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    public Throwable getCause() {
        return this.c;
    }
}
