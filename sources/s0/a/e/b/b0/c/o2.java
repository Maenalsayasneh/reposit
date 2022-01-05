package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.e.d.a;

public class o2 extends g.a {
    public long[] g;

    public o2() {
        this.g = new long[4];
    }

    public o2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.g = h3.U0(233, bigInteger);
    }

    public o2(long[] jArr) {
        this.g = jArr;
    }

    public g a(g gVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((o2) gVar).g;
        return new o2(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    public g b() {
        long[] jArr = this.g;
        return new o2(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    public g d(g gVar) {
        return j(gVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        return h3.J0(this.g, ((o2) obj).g);
    }

    public int f() {
        return 233;
    }

    public g g() {
        long[] jArr = new long[4];
        long[] jArr2 = this.g;
        if (!h3.a2(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            g2.y(jArr2, jArr3);
            long[] jArr5 = new long[8];
            g2.h(jArr3, jArr2, jArr5);
            g2.w(jArr5, jArr3);
            g2.y(jArr3, jArr3);
            long[] jArr6 = new long[8];
            g2.h(jArr3, jArr2, jArr6);
            g2.w(jArr6, jArr3);
            g2.B(jArr3, 3, jArr4);
            long[] jArr7 = new long[8];
            g2.h(jArr4, jArr3, jArr7);
            g2.w(jArr7, jArr4);
            g2.y(jArr4, jArr4);
            long[] jArr8 = new long[8];
            g2.h(jArr4, jArr2, jArr8);
            g2.w(jArr8, jArr4);
            g2.B(jArr4, 7, jArr3);
            long[] jArr9 = new long[8];
            g2.h(jArr3, jArr4, jArr9);
            g2.w(jArr9, jArr3);
            g2.B(jArr3, 14, jArr4);
            long[] jArr10 = new long[8];
            g2.h(jArr4, jArr3, jArr10);
            g2.w(jArr10, jArr4);
            g2.y(jArr4, jArr4);
            long[] jArr11 = new long[8];
            g2.h(jArr4, jArr2, jArr11);
            g2.w(jArr11, jArr4);
            g2.B(jArr4, 29, jArr3);
            long[] jArr12 = new long[8];
            g2.h(jArr3, jArr4, jArr12);
            g2.w(jArr12, jArr3);
            g2.B(jArr3, 58, jArr4);
            long[] jArr13 = new long[8];
            g2.h(jArr4, jArr3, jArr13);
            g2.w(jArr13, jArr4);
            g2.B(jArr4, 116, jArr3);
            long[] jArr14 = new long[8];
            g2.h(jArr3, jArr4, jArr14);
            g2.w(jArr14, jArr3);
            g2.y(jArr3, jArr);
            return new o2(jArr);
        }
        throw new IllegalStateException();
    }

    public boolean h() {
        return h3.P1(this.g);
    }

    public int hashCode() {
        return h3.p1(this.g, 0, 4) ^ 2330074;
    }

    public boolean i() {
        return h3.a2(this.g);
    }

    public g j(g gVar) {
        long[] jArr = new long[4];
        g2.q(this.g, ((o2) gVar).g, jArr);
        return new o2(jArr);
    }

    public g k(g gVar, g gVar2, g gVar3) {
        return l(gVar, gVar2, gVar3);
    }

    public g l(g gVar, g gVar2, g gVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((o2) gVar).g;
        long[] jArr3 = ((o2) gVar2).g;
        long[] jArr4 = ((o2) gVar3).g;
        long[] jArr5 = new long[8];
        g2.t(jArr, jArr2, jArr5);
        g2.t(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        g2.w(jArr5, jArr6);
        return new o2(jArr6);
    }

    public g m() {
        return this;
    }

    public g n() {
        long[] jArr = new long[4];
        long[] jArr2 = this.g;
        int i = 0;
        long f = a.f(jArr2[0]);
        long f2 = a.f(jArr2[1]);
        long j = (f & 4294967295L) | (f2 << 32);
        long j2 = (f >>> 32) | (f2 & -4294967296L);
        long f3 = a.f(jArr2[2]);
        int i2 = 3;
        long f4 = a.f(jArr2[3]);
        long j3 = (4294967295L & f3) | (f4 << 32);
        long j4 = (f3 >>> 32) | (f4 & -4294967296L);
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        while (i < i2) {
            int i3 = iArr[i] >>> 6;
            int i4 = iArr[i] & 63;
            jArr3[i3] = jArr3[i3] ^ (j7 << i4);
            int i5 = i3 + 1;
            int i6 = -i4;
            jArr3[i5] = jArr3[i5] ^ ((j6 << i4) | (j7 >>> i6));
            int i7 = i3 + 2;
            jArr3[i7] = jArr3[i7] ^ ((j5 << i4) | (j6 >>> i6));
            i2 = 3;
            int i8 = i3 + 3;
            jArr3[i8] = jArr3[i8] ^ (j5 >>> i6);
            i++;
        }
        g2.w(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new o2(jArr);
    }

    public g o() {
        long[] jArr = new long[4];
        g2.y(this.g, jArr);
        return new o2(jArr);
    }

    public g p(g gVar, g gVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((o2) gVar).g;
        long[] jArr3 = ((o2) gVar2).g;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        g2.n(jArr, jArr5);
        g2.b(jArr4, jArr5, jArr4);
        g2.t(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[4];
        g2.w(jArr4, jArr6);
        return new o2(jArr6);
    }

    public g q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        g2.B(this.g, i, jArr);
        return new o2(jArr);
    }

    public g r(g gVar) {
        return a(gVar);
    }

    public boolean s() {
        return (this.g[0] & 1) != 0;
    }

    public BigInteger t() {
        return h3.r3(this.g);
    }

    public g u() {
        long[] jArr = new long[4];
        long[] jArr2 = this.g;
        long[] jArr3 = new long[8];
        h3.k0(jArr2, jArr);
        for (int i = 1; i < 233; i += 2) {
            g2.n(jArr, jArr3);
            g2.w(jArr3, jArr);
            g2.n(jArr, jArr3);
            g2.w(jArr3, jArr);
            jArr[0] = jArr[0] ^ jArr2[0];
            jArr[1] = jArr[1] ^ jArr2[1];
            jArr[2] = jArr[2] ^ jArr2[2];
            jArr[3] = jArr[3] ^ jArr2[3];
        }
        return new o2(jArr);
    }

    public boolean v() {
        return true;
    }

    public int w() {
        long[] jArr = this.g;
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}
