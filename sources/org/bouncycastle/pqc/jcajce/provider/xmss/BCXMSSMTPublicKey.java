package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import s0.a.a.c3.m0;
import s0.a.a.n;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.g.a;
import s0.a.f.b.h.q;

public class BCXMSSMTPublicKey implements PublicKey {
    public transient n c;
    public transient q d;

    public BCXMSSMTPublicKey(m0 m0Var) throws IOException {
        q qVar = (q) a.a(m0Var);
        this.d = qVar;
        this.c = h3.c1(qVar.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPublicKey)) {
            return false;
        }
        BCXMSSMTPublicKey bCXMSSMTPublicKey = (BCXMSSMTPublicKey) obj;
        return this.c.w(bCXMSSMTPublicKey.c) && Arrays.equals(this.d.a(), bCXMSSMTPublicKey.d.a());
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return h3.u0(this.d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (h3.m1(this.d.a()) * 37) + this.c.hashCode();
    }
}
