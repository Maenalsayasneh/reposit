package org.bouncycastle.asn1;

public class ASN1ParsingException extends IllegalStateException {
    public Throwable c;

    public ASN1ParsingException(String str) {
        super(str);
    }

    public ASN1ParsingException(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    public Throwable getCause() {
        return this.c;
    }
}
