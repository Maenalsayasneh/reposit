package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import s0.a.a.c3.m0;
import s0.a.a.n;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.g.a;
import s0.a.f.b.h.u;

public class BCXMSSPublicKey implements PublicKey {
    public transient u c;
    public transient n d;

    public BCXMSSPublicKey(m0 m0Var) throws IOException {
        u uVar = (u) a.a(m0Var);
        this.c = uVar;
        this.d = h3.c1(uVar.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCXMSSPublicKey) {
            BCXMSSPublicKey bCXMSSPublicKey = (BCXMSSPublicKey) obj;
            try {
                return this.d.w(bCXMSSPublicKey.d) && Arrays.equals(this.c.getEncoded(), bCXMSSPublicKey.c.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "XMSS";
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
        try {
            return (h3.m1(this.c.getEncoded()) * 37) + this.d.hashCode();
        } catch (IOException unused) {
            return this.d.hashCode();
        }
    }
}
