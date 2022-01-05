package org.bouncycastle.pqc.jcajce.provider.sphincs;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.n;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.e;
import s0.a.f.a.h;
import s0.a.f.b.f.c;
import s0.a.f.b.g.a;

public class BCSphincs256PublicKey implements PublicKey, Key {
    public transient n c;
    public transient c d;

    public BCSphincs256PublicKey(m0 m0Var) throws IOException {
        this.c = h.s(m0Var.c.d).d.c;
        this.d = (c) a.a(m0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PublicKey)) {
            return false;
        }
        BCSphincs256PublicKey bCSphincs256PublicKey = (BCSphincs256PublicKey) obj;
        return this.c.w(bCSphincs256PublicKey.c) && Arrays.equals(this.d.a(), bCSphincs256PublicKey.d.a());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            c cVar = this.d;
            return (cVar.d != null ? h3.u0(cVar) : new m0(new b(e.e, new h(new b(this.c))), this.d.a())).getEncoded();
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
