package org.bouncycastle.pqc.jcajce.provider.qtesla;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.d.a;

public class BCqTESLAPrivateKey implements PrivateKey {
    public transient a c;
    public transient v d;

    public BCqTESLAPrivateKey(p pVar) throws IOException {
        this.d = pVar.x;
        this.c = (a) h3.s0(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCqTESLAPrivateKey)) {
            return false;
        }
        BCqTESLAPrivateKey bCqTESLAPrivateKey = (BCqTESLAPrivateKey) obj;
        a aVar = this.c;
        if (aVar.d != bCqTESLAPrivateKey.c.d || !Arrays.equals(aVar.a(), bCqTESLAPrivateKey.c.a())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return h3.e1(this.c.d);
    }

    public byte[] getEncoded() {
        try {
            return h3.t0(this.c, this.d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        a aVar = this.c;
        return (h3.m1(aVar.a()) * 37) + aVar.d;
    }
}
