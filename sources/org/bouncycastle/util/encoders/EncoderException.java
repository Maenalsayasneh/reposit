package org.bouncycastle.util.encoders;

public class EncoderException extends IllegalStateException {
    public Throwable c;

    public EncoderException(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    public Throwable getCause() {
        return this.c;
    }
}
