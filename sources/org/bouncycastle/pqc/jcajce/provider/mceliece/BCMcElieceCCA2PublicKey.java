package org.bouncycastle.pqc.jcajce.provider.mceliece;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.PublicKey;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.b.i;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.e;
import s0.a.f.b.b.c;

public class BCMcElieceCCA2PublicKey implements i, PublicKey {
    public c c;

    public BCMcElieceCCA2PublicKey(c cVar) {
        this.c = cVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PublicKey)) {
            return false;
        }
        c cVar = this.c;
        int i = cVar.q;
        c cVar2 = ((BCMcElieceCCA2PublicKey) obj).c;
        if (i == cVar2.q && cVar.x == cVar2.x && cVar.y.equals(cVar2.y)) {
            return true;
        }
        return false;
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        c cVar = this.c;
        try {
            return new m0(new b(e.d), (s0.a.a.e) new s0.a.f.a.b(cVar.q, cVar.x, cVar.y, h3.a1(cVar.d))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        c cVar = this.c;
        int i = cVar.q;
        return cVar.y.hashCode() + (((cVar.x * 37) + i) * 37);
    }

    public String toString() {
        StringBuilder S0 = a.S0(a.u0(a.S0(a.u0(a.S0("McEliecePublicKey:\n", " length of the code         : "), this.c.q, "\n"), " error correction capability: "), this.c.x, "\n"), " generator matrix           : ");
        S0.append(this.c.y.toString());
        return S0.toString();
    }
}
