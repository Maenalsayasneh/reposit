package org.bouncycastle.jcajce;

import javax.crypto.SecretKey;
import s0.a.b.g;

public class PBKDF1Key implements SecretKey {
    public final char[] c;
    public final g d;

    public PBKDF1Key(char[] cArr, g gVar) {
        char[] cArr2 = new char[cArr.length];
        this.c = cArr2;
        this.d = gVar;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public String getAlgorithm() {
        return "PBKDF1";
    }

    public byte[] getEncoded() {
        return this.d.convert(this.c);
    }

    public String getFormat() {
        return this.d.getType();
    }

    public char[] getPassword() {
        return this.c;
    }
}
