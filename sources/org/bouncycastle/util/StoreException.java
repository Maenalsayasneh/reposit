package org.bouncycastle.util;

public class StoreException extends RuntimeException {
    public Throwable c;

    public Throwable getCause() {
        return this.c;
    }
}
