package s0.a.e.b.b0.c;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;
import s0.a.e.b.g;

public class g1 extends g.a {
    public long[] g;

    public g1() {
        this.g = new long[2];
    }

    public g1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.g = h3.U0(113, bigInteger);
    }

    public g1(long[] jArr) {
        this.g = jArr;
    }

    public g a(g gVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((g1) gVar).g;
        return new g1(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1]});
    }

    public g b() {
        long[] jArr = this.g;
        return new g1(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    public g d(g gVar) {
        return j(gVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        long[] jArr = this.g;
        long[] jArr2 = ((g1) obj).g;
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return 113;
    }

    public g g() {
        long[] jArr = new long[2];
        long[] jArr2 = this.g;
        if (!h3.Y1(jArr2)) {
            long[] jArr3 = new long[2];
            long[] jArr4 = new long[2];
            a.F3(jArr2, jArr3);
            long[] jArr5 = new long[8];
            a.g2(jArr3, jArr2, jArr5);
            a.e3(jArr5, jArr3);
            a.F3(jArr3, jArr3);
            long[] jArr6 = new long[8];
            a.g2(jArr3, jArr2, jArr6);
            a.e3(jArr6, jArr3);
            a.G3(jArr3, 3, jArr4);
            long[] jArr7 = new long[8];
            a.g2(jArr4, jArr3, jArr7);
            a.e3(jArr7, jArr4);
            a.F3(jArr4, jArr4);
            long[] jArr8 = new long[8];
            a.g2(jArr4, jArr2, jArr8);
            a.e3(jArr8, jArr4);
            a.G3(jArr4, 7, jArr3);
            long[] jArr9 = new long[8];
            a.g2(jArr3, jArr4, jArr9);
            a.e3(jArr9, jArr3);
            a.G3(jArr3, 14, jArr4);
            long[] jArr10 = new long[8];
            a.g2(jArr4, jArr3, jArr10);
            a.e3(jArr10, jArr4);
            a.G3(jArr4, 28, jArr3);
            long[] jArr11 = new long[8];
            a.g2(jArr3, jArr4, jArr11);
            a.e3(jArr11, jArr3);
            a.G3(jArr3, 56, jArr4);
            long[] jArr12 = new long[8];
            a.g2(jArr4, jArr3, jArr12);
            a.e3(jArr12, jArr4);
            a.F3(jArr4, jArr);
            return new g1(jArr);
        }
        throw new IllegalStateException();
    }

    public boolean h() {
        long[] jArr = this.g;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return h3.p1(this.g, 0, 2) ^ 113009;
    }

    public boolean i() {
        return h3.Y1(this.g);
    }

    public g j(g gVar) {
        long[] jArr = new long[2];
        a.N2(this.g, ((g1) gVar).g, jArr);
        return new g1(jArr);
    }

    public g k(g gVar, g gVar2, g gVar3) {
        return l(gVar, gVar2, gVar3);
    }

    public g l(g gVar, g gVar2, g gVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((g1) gVar).g;
        long[] jArr3 = ((g1) gVar2).g;
        long[] jArr4 = ((g1) gVar3).g;
        long[] jArr5 = new long[4];
        a.O2(jArr, jArr2, jArr5);
        a.O2(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[2];
        a.e3(jArr5, jArr6);
        return new g1(jArr6);
    }

    public g m() {
        return this;
    }

    public g n() {
        long[] jArr = this.g;
        long f = s0.a.e.d.a.f(jArr[0]);
        long f2 = s0.a.e.d.a.f(jArr[1]);
        long j = (f >>> 32) | (f2 & -4294967296L);
        return new g1(new long[]{((j << 57) ^ ((4294967295L & f) | (f2 << 32))) ^ (j << 5), (j >>> 7) ^ (j >>> 59)});
    }

    public g o() {
        long[] jArr = new long[2];
        a.F3(this.g, jArr);
        return new g1(jArr);
    }

    public g p(g gVar, g gVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((g1) gVar).g;
        long[] jArr3 = ((g1) gVar2).g;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        a.l2(jArr, jArr5);
        a.M(jArr4, jArr5, jArr4);
        a.O2(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[2];
        a.e3(jArr4, jArr6);
        return new g1(jArr6);
    }

    public g q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[2];
        a.G3(this.g, i, jArr);
        return new g1(jArr);
    }

    public g r(g gVar) {
        return a(gVar);
    }

    public boolean s() {
        return (this.g[0] & 1) != 0;
    }

    public BigInteger t() {
        long[] jArr = this.g;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                h3.l2(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public g u() {
        long[] jArr = this.g;
        long[] jArr2 = new long[4];
        long[] jArr3 = {jArr[0], jArr[1]};
        for (int i = 1; i < 113; i += 2) {
            a.l2(jArr3, jArr2);
            a.e3(jArr2, jArr3);
            a.l2(jArr3, jArr2);
            a.e3(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
        }
        return new g1(jArr3);
    }

    public int w() {
        return ((int) this.g[0]) & 1;
    }
}
