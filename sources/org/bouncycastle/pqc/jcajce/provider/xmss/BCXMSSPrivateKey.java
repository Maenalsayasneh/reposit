package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import s0.a.a.n;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.i;
import s0.a.f.b.h.t;

public class BCXMSSPrivateKey implements PrivateKey {
    public transient t c;
    public transient n d;
    public transient v q;

    public BCXMSSPrivateKey(p pVar) throws IOException {
        this.q = pVar.x;
        this.d = i.s(pVar.d.d).q.c;
        this.c = (t) h3.s0(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSPrivateKey)) {
            return false;
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) obj;
        return this.d.w(bCXMSSPrivateKey.d) && Arrays.equals(this.c.a(), bCXMSSPrivateKey.c.a());
    }

    public String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return h3.t0(this.c, this.q).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (h3.m1(this.c.a()) * 37) + this.d.hashCode();
    }
}
