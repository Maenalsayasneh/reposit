package org.bouncycastle.util.encoders;

public class DecoderException extends IllegalStateException {
    public Throwable c;

    public DecoderException(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    public Throwable getCause() {
        return this.c;
    }
}
