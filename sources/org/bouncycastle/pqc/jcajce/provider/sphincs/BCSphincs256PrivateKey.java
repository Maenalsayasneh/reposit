package org.bouncycastle.pqc.jcajce.provider.sphincs;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import s0.a.a.n;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.e;
import s0.a.f.a.h;
import s0.a.f.b.f.b;

public class BCSphincs256PrivateKey implements PrivateKey, Key {
    public transient n c;
    public transient b d;
    public transient v q;

    public BCSphincs256PrivateKey(p pVar) throws IOException {
        this.q = pVar.x;
        this.c = h.s(pVar.d.d).d.c;
        this.d = (b) h3.s0(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PrivateKey)) {
            return false;
        }
        BCSphincs256PrivateKey bCSphincs256PrivateKey = (BCSphincs256PrivateKey) obj;
        return this.c.w(bCSphincs256PrivateKey.c) && Arrays.equals(this.d.a(), bCSphincs256PrivateKey.d.a());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        p pVar;
        try {
            b bVar = this.d;
            if (bVar.d != null) {
                pVar = h3.t0(bVar, this.q);
            } else {
                pVar = new p(new s0.a.a.c3.b(e.e, new h(new s0.a.a.c3.b(this.c))), new x0(this.d.a()), this.q, (byte[]) null);
            }
            return pVar.getEncoded();
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
