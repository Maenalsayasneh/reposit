package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.PrivateKey;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.e.a;

public class BCRainbowPrivateKey implements PrivateKey {
    public int[] Y1;
    public short[][] c;
    public short[] d;
    public short[][] q;
    public short[] x;
    public a[] y;

    public BCRainbowPrivateKey(s0.a.f.c.b.a aVar) {
        short[][] sArr = aVar.c;
        short[] sArr2 = aVar.d;
        short[][] sArr3 = aVar.q;
        short[] sArr4 = aVar.x;
        int[] iArr = aVar.y;
        a[] aVarArr = aVar.Y1;
        this.c = sArr;
        this.d = sArr2;
        this.q = sArr3;
        this.x = sArr4;
        this.Y1 = iArr;
        this.y = aVarArr;
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, a[] aVarArr) {
        this.c = sArr;
        this.d = sArr2;
        this.q = sArr3;
        this.x = sArr4;
        this.Y1 = iArr;
        this.y = aVarArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean z = (((h3.M0(this.c, bCRainbowPrivateKey.c) && h3.M0(this.q, bCRainbowPrivateKey.q)) && h3.L0(this.d, bCRainbowPrivateKey.d)) && h3.L0(this.x, bCRainbowPrivateKey.x)) && Arrays.equals(this.Y1, bCRainbowPrivateKey.Y1);
        a[] aVarArr = this.y;
        if (aVarArr.length != bCRainbowPrivateKey.y.length) {
            return false;
        }
        for (int length = aVarArr.length - 1; length >= 0; length--) {
            z &= this.y[length].equals(bCRainbowPrivateKey.y[length]);
        }
        return z;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r8 = this;
            s0.a.f.a.f r7 = new s0.a.f.a.f
            short[][] r1 = r8.c
            short[] r2 = r8.d
            short[][] r3 = r8.q
            short[] r4 = r8.x
            int[] r5 = r8.Y1
            s0.a.f.b.e.a[] r6 = r8.y
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            s0.a.a.c3.b r1 = new s0.a.a.c3.b     // Catch:{ IOException -> 0x0025 }
            s0.a.a.n r2 = s0.a.f.a.e.a     // Catch:{ IOException -> 0x0025 }
            s0.a.a.v0 r3 = s0.a.a.v0.c     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0025 }
            s0.a.a.w2.p r2 = new s0.a.a.w2.p     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r1, r7, r0, r0)     // Catch:{ IOException -> 0x0025 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int r1 = h3.r1(this.c);
        int q1 = h3.q1(this.d);
        int r12 = h3.r1(this.q);
        int n1 = h3.n1(this.Y1) + ((h3.q1(this.x) + ((r12 + ((q1 + ((r1 + (this.y.length * 37)) * 37)) * 37)) * 37)) * 37);
        for (int length = this.y.length - 1; length >= 0; length--) {
            n1 = (n1 * 37) + this.y[length].hashCode();
        }
        return n1;
    }
}
