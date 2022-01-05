package org.bouncycastle.pqc.jcajce.provider.mceliece;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.PublicKey;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.f.a.d;
import s0.a.f.a.e;
import s0.a.f.b.b.f;

public class BCMcEliecePublicKey implements PublicKey {
    public f c;

    public BCMcEliecePublicKey(f fVar) {
        this.c = fVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePublicKey)) {
            return false;
        }
        f fVar = this.c;
        int i = fVar.d;
        f fVar2 = ((BCMcEliecePublicKey) obj).c;
        if (i == fVar2.d && fVar.q == fVar2.q && fVar.x.equals(fVar2.x)) {
            return true;
        }
        return false;
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        f fVar = this.c;
        try {
            return new m0(new b(e.c), (s0.a.a.e) new d(fVar.d, fVar.q, fVar.x)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        f fVar = this.c;
        int i = fVar.d;
        return fVar.x.hashCode() + (((fVar.q * 37) + i) * 37);
    }

    public String toString() {
        StringBuilder S0 = a.S0(a.u0(a.S0(a.u0(a.S0("McEliecePublicKey:\n", " length of the code         : "), this.c.d, "\n"), " error correction capability: "), this.c.q, "\n"), " generator matrix           : ");
        S0.append(this.c.x);
        return S0.toString();
    }
}
