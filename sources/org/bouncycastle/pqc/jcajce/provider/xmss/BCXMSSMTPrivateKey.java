package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import s0.a.a.n;
import s0.a.a.v;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.j;
import s0.a.f.b.h.p;

public class BCXMSSMTPrivateKey implements PrivateKey {
    public transient n c;
    public transient p d;
    public transient v q;

    public BCXMSSMTPrivateKey(s0.a.a.w2.p pVar) throws IOException {
        this.q = pVar.x;
        this.c = j.s(pVar.d.d).x.c;
        this.d = (p) h3.s0(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPrivateKey)) {
            return false;
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey) obj;
        return this.c.w(bCXMSSMTPrivateKey.c) && Arrays.equals(this.d.a(), bCXMSSMTPrivateKey.d.a());
    }

    public String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return h3.t0(this.d, this.q).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (h3.m1(this.d.a()) * 37) + this.c.hashCode();
    }
}
