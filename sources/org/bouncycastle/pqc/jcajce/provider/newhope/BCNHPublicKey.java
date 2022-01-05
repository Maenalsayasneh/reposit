package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import s0.a.a.c3.m0;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.c.b;
import s0.a.f.b.g.a;

public class BCNHPublicKey implements Key, PublicKey {
    public transient b c;

    public BCNHPublicKey(m0 m0Var) throws IOException {
        this.c = (b) a.a(m0Var);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPublicKey)) {
            return false;
        }
        return Arrays.equals(this.c.a(), ((BCNHPublicKey) obj).c.a());
    }

    public final String getAlgorithm() {
        return "NH";
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
        return h3.m1(this.c.a());
    }
}
