package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.e.d.a;

public class h2 extends g.a {
    public long[] g;

    public h2() {
        this.g = new long[4];
    }

    public h2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.g = h3.U0(193, bigInteger);
    }

    public h2(long[] jArr) {
        this.g = jArr;
    }

    public g a(g gVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((h2) gVar).g;
        return new h2(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    public g b() {
        long[] jArr = this.g;
        return new h2(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    public g d(g gVar) {
        return j(gVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        return h3.J0(this.g, ((h2) obj).g);
    }

    public int f() {
        return 193;
    }

    public g g() {
        long[] jArr = new long[4];
        long[] jArr2 = this.g;
        if (!h3.a2(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            long[] jArr5 = new long[8];
            g2.m(jArr2, jArr5);
            g2.v(jArr5, jArr3);
            g2.A(jArr3, 1, jArr4);
            long[] jArr6 = new long[8];
            g2.g(jArr3, jArr4, jArr6);
            g2.v(jArr6, jArr3);
            g2.A(jArr4, 1, jArr4);
            long[] jArr7 = new long[8];
            g2.g(jArr3, jArr4, jArr7);
            g2.v(jArr7, jArr3);
            g2.A(jArr3, 3, jArr4);
            long[] jArr8 = new long[8];
            g2.g(jArr3, jArr4, jArr8);
            g2.v(jArr8, jArr3);
            g2.A(jArr3, 6, jArr4);
            long[] jArr9 = new long[8];
            g2.g(jArr3, jArr4, jArr9);
            g2.v(jArr9, jArr3);
            g2.A(jArr3, 12, jArr4);
            long[] jArr10 = new long[8];
            g2.g(jArr3, jArr4, jArr10);
            g2.v(jArr10, jArr3);
            g2.A(jArr3, 24, jArr4);
            long[] jArr11 = new long[8];
            g2.g(jArr3, jArr4, jArr11);
            g2.v(jArr11, jArr3);
            g2.A(jArr3, 48, jArr4);
            long[] jArr12 = new long[8];
            g2.g(jArr3, jArr4, jArr12);
            g2.v(jArr12, jArr3);
            g2.A(jArr3, 96, jArr4);
            long[] jArr13 = new long[8];
            g2.g(jArr3, jArr4, jArr13);
            g2.v(jArr13, jArr);
            return new h2(jArr);
        }
        throw new IllegalStateException();
    }

    public boolean h() {
        return h3.P1(this.g);
    }

    public int hashCode() {
        return h3.p1(this.g, 0, 4) ^ 1930015;
    }

    public boolean i() {
        return h3.a2(this.g);
    }

    public g j(g gVar) {
        long[] jArr = new long[4];
        g2.p(this.g, ((h2) gVar).g, jArr);
        return new h2(jArr);
    }

    public g k(g gVar, g gVar2, g gVar3) {
        return l(gVar, gVar2, gVar3);
    }

    public g l(g gVar, g gVar2, g gVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((h2) gVar).g;
        long[] jArr3 = ((h2) gVar2).g;
        long[] jArr4 = ((h2) gVar3).g;
        long[] jArr5 = new long[8];
        g2.s(jArr, jArr2, jArr5);
        g2.s(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        g2.v(jArr5, jArr6);
        return new h2(jArr6);
    }

    public g m() {
        return this;
    }

    public g n() {
        long[] jArr = this.g;
        long f = a.f(jArr[0]);
        long f2 = a.f(jArr[1]);
        long j = (f & 4294967295L) | (f2 << 32);
        long j2 = (f >>> 32) | (f2 & -4294967296L);
        long f3 = a.f(jArr[2]);
        long j3 = f3 >>> 32;
        return new h2(new long[]{j ^ (j2 << 8), (((j3 << 8) ^ ((f3 & 4294967295L) ^ (jArr[3] << 32))) ^ (j2 >>> 56)) ^ (j2 << 33), ((j3 >>> 56) ^ (j3 << 33)) ^ (j2 >>> 31), j3 >>> 31});
    }

    public g o() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        g2.m(this.g, jArr2);
        g2.v(jArr2, jArr);
        return new h2(jArr);
    }

    public g p(g gVar, g gVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((h2) gVar).g;
        long[] jArr3 = ((h2) gVar2).g;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        g2.m(jArr, jArr5);
        g2.a(jArr4, jArr5, jArr4);
        g2.s(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[4];
        g2.v(jArr4, jArr6);
        return new h2(jArr6);
    }

    public g q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        g2.A(this.g, i, jArr);
        return new h2(jArr);
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
        for (int i = 1; i < 193; i += 2) {
            g2.m(jArr, jArr3);
            g2.v(jArr3, jArr);
            g2.m(jArr, jArr3);
            g2.v(jArr3, jArr);
            jArr[0] = jArr[0] ^ jArr2[0];
            jArr[1] = jArr[1] ^ jArr2[1];
            jArr[2] = jArr[2] ^ jArr2[2];
            jArr[3] = jArr[3] ^ jArr2[3];
        }
        return new h2(jArr);
    }

    public boolean v() {
        return true;
    }

    public int w() {
        return ((int) this.g[0]) & 1;
    }
}
