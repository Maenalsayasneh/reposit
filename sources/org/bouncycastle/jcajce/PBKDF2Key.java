package org.bouncycastle.jcajce;

import javax.crypto.SecretKey;
import s0.a.b.g;

public class PBKDF2Key implements SecretKey {
    public final char[] c;
    public final g d;

    public PBKDF2Key(char[] cArr, g gVar) {
        this.c = cArr == null ? null : (char[]) cArr.clone();
        this.d = gVar;
    }

    public String getAlgorithm() {
        return "PBKDF2";
    }

    public byte[] getEncoded() {
        return this.d.convert(this.c);
    }

    public String getFormat() {
        return this.d.getType();
    }
}
