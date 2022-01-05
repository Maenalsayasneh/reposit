package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PrivateKey;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.a;
import s0.a.f.a.e;
import s0.a.f.b.b.b;

public class BCMcElieceCCA2PrivateKey implements PrivateKey {
    public b c;

    public BCMcElieceCCA2PrivateKey(b bVar) {
        this.c = bVar;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof BCMcElieceCCA2PrivateKey)) {
            BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey = (BCMcElieceCCA2PrivateKey) obj;
            b bVar = this.c;
            int i = bVar.q;
            b bVar2 = bCMcElieceCCA2PrivateKey.c;
            return i == bVar2.q && bVar.x == bVar2.x && bVar.y.equals(bVar2.y) && this.c.Y1.equals(bCMcElieceCCA2PrivateKey.c.Y1) && this.c.Z1.equals(bCMcElieceCCA2PrivateKey.c.Z1) && this.c.a2.equals(bCMcElieceCCA2PrivateKey.c.a2);
        }
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            b bVar = this.c;
            return new p(new s0.a.a.c3.b(e.d), new a(bVar.q, bVar.x, bVar.y, bVar.Y1, bVar.Z1, h3.a1(bVar.d)), (v) null, (byte[]) null).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        b bVar = this.c;
        int hashCode = bVar.Y1.hashCode();
        int hashCode2 = this.c.Z1.hashCode();
        return this.c.a2.hashCode() + ((hashCode2 + ((hashCode + (((((bVar.x * 37) + bVar.q) * 37) + bVar.y.b) * 37)) * 37)) * 37);
    }
}
