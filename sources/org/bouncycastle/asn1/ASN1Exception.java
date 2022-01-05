package org.bouncycastle.asn1;

import java.io.IOException;

public class ASN1Exception extends IOException {
    public Throwable c;

    public ASN1Exception(String str) {
        super(str);
    }

    public ASN1Exception(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    public Throwable getCause() {
        return this.c;
    }
}
