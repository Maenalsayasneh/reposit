package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.PublicKey;
import s0.a.a.c3.m0;
import s0.a.a.v0;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.e;
import s0.a.f.a.g;
import s0.a.f.c.b.b;

public class BCRainbowPublicKey implements PublicKey {
    public short[][] c;
    public short[][] d;
    public short[] q;
    public int x;

    public BCRainbowPublicKey(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.x = i;
        this.c = sArr;
        this.d = sArr2;
        this.q = sArr3;
    }

    public BCRainbowPublicKey(b bVar) {
        int i = bVar.x;
        short[][] sArr = bVar.c;
        short[][] sArr2 = bVar.d;
        short[] sArr3 = bVar.q;
        this.x = i;
        this.c = sArr;
        this.d = sArr2;
        this.q = sArr3;
    }

    public short[][] a() {
        short[][] sArr = new short[this.d.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.d;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = h3.N(sArr2[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof BCRainbowPublicKey)) {
            BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) obj;
            return this.x == bCRainbowPublicKey.x && h3.M0(this.c, bCRainbowPublicKey.c) && h3.M0(this.d, bCRainbowPublicKey.a()) && h3.L0(this.q, h3.N(bCRainbowPublicKey.q));
        }
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public byte[] getEncoded() {
        try {
            return new m0(new s0.a.a.c3.b(e.a, v0.c), (s0.a.a.e) new g(this.x, this.c, this.d, this.q)).r("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        int r1 = h3.r1(this.c);
        int r12 = h3.r1(this.d);
        return h3.q1(this.q) + ((r12 + ((r1 + (this.x * 37)) * 37)) * 37);
    }
}
