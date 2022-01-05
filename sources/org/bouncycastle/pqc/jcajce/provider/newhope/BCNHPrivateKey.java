package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.c.a;

public class BCNHPrivateKey implements Key, PrivateKey {
    public transient a c;
    public transient v d;

    public BCNHPrivateKey(p pVar) throws IOException {
        this.d = pVar.x;
        this.c = (a) h3.s0(pVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCNHPrivateKey)) {
            return false;
        }
        return Arrays.equals(this.c.a(), ((BCNHPrivateKey) obj).c.a());
    }

    public final String getAlgorithm() {
        return "NH";
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
        return h3.q1(this.c.a());
    }
}
