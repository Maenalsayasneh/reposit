package org.bouncycastle.jcajce;

import javax.crypto.SecretKey;
import s0.a.b.t;

public class PKCS12Key implements SecretKey {
    public final char[] c;
    public final boolean d;

    public PKCS12Key(char[] cArr, boolean z) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.c = cArr2;
        this.d = z;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public String getAlgorithm() {
        return "PKCS12";
    }

    public byte[] getEncoded() {
        return (!this.d || this.c.length != 0) ? t.PKCS12PasswordToBytes(this.c) : new byte[2];
    }

    public String getFormat() {
        return "PKCS12";
    }

    public char[] getPassword() {
        return this.c;
    }
}
