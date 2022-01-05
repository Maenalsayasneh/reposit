package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.PrivateKey;
import s0.a.b.i;
import s0.a.f.b.b.e;

public class BCMcEliecePrivateKey implements i, PrivateKey {
    public e c;

    public BCMcEliecePrivateKey(e eVar) {
        this.c = eVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        e eVar = this.c;
        int i = eVar.d;
        e eVar2 = bCMcEliecePrivateKey.c;
        if (i != eVar2.d || eVar.q != eVar2.q || !eVar.x.equals(eVar2.x) || !this.c.y.equals(bCMcEliecePrivateKey.c.y) || !this.c.Y1.equals(bCMcEliecePrivateKey.c.Y1) || !this.c.Z1.equals(bCMcEliecePrivateKey.c.Z1) || !this.c.a2.equals(bCMcEliecePrivateKey.c.a2)) {
            return false;
        }
        return true;
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r9 = this;
            s0.a.f.a.c r8 = new s0.a.f.a.c
            s0.a.f.b.b.e r0 = r9.c
            int r1 = r0.d
            int r2 = r0.q
            s0.a.f.d.a.b r3 = r0.x
            s0.a.f.d.a.e r4 = r0.y
            s0.a.f.d.a.d r5 = r0.Z1
            s0.a.f.d.a.d r6 = r0.a2
            s0.a.f.d.a.a r7 = r0.Y1
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            s0.a.a.c3.b r1 = new s0.a.a.c3.b     // Catch:{ IOException -> 0x0027 }
            s0.a.a.n r2 = s0.a.f.a.e.c     // Catch:{ IOException -> 0x0027 }
            r1.<init>((s0.a.a.n) r2)     // Catch:{ IOException -> 0x0027 }
            s0.a.a.w2.p r2 = new s0.a.a.w2.p     // Catch:{ IOException -> 0x0027 }
            r2.<init>(r1, r8, r0, r0)     // Catch:{ IOException -> 0x0027 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        e eVar = this.c;
        int hashCode = eVar.y.hashCode();
        int hashCode2 = this.c.Z1.hashCode();
        int hashCode3 = this.c.a2.hashCode();
        return this.c.Y1.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (((((eVar.q * 37) + eVar.d) * 37) + eVar.x.b) * 37)) * 37)) * 37)) * 37);
    }
}
