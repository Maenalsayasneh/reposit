package org.bouncycastle.pqc.jcajce.provider.qtesla;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import s0.a.a.c3.m0;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.d.b;
import s0.a.f.b.g.a;

public class BCqTESLAPublicKey implements PublicKey {
    public transient b c;

    public BCqTESLAPublicKey(m0 m0Var) throws IOException {
        this.c = (b) a.a(m0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCqTESLAPublicKey)) {
            return false;
        }
        BCqTESLAPublicKey bCqTESLAPublicKey = (BCqTESLAPublicKey) obj;
        b bVar = this.c;
        if (bVar.d != bCqTESLAPublicKey.c.d || !Arrays.equals(bVar.a(), bCqTESLAPublicKey.c.a())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return h3.e1(this.c.d);
    }

    public byte[] getEncoded() {
        try {
            return h3.u0(this.c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        b bVar = this.c;
        return (h3.m1(bVar.a()) * 37) + bVar.d;
    }
}
