package org.bouncycastle.crypto.io;

import java.io.IOException;

public class CipherIOException extends IOException {
    public final Throwable c;

    public CipherIOException(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    public Throwable getCause() {
        return this.c;
    }
}
