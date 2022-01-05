package org.bouncycastle.x509.util;

public class StreamParsingException extends Exception {
    public Throwable c;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    public Throwable getCause() {
        return this.c;
    }
}
