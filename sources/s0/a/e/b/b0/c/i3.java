package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.e.d.a;

public class i3 extends g.a {
    public long[] g;

    public i3() {
        this.g = new long[7];
    }

    public i3(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.g = h3.U0(409, bigInteger);
    }

    public i3(long[] jArr) {
        this.g = jArr;
    }

    public g a(g gVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((i3) gVar).g;
        return new i3(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4], jArr[5] ^ jArr2[5], jArr[6] ^ jArr2[6]});
    }

    public g b() {
        long[] jArr = this.g;
        return new i3(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    public g d(g gVar) {
        return j(gVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        long[] jArr = this.g;
        long[] jArr2 = ((i3) obj).g;
        for (int i = 6; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return 409;
    }

    public g g() {
        long[] jArr = new long[7];
        long[] jArr2 = this.g;
        if (!h3.c2(jArr2)) {
            long[] jArr3 = new long[7];
            long[] jArr4 = new long[7];
            long[] jArr5 = new long[7];
            long[] jArr6 = new long[13];
            h3.w1(jArr2, jArr6);
            h3.H2(jArr6, jArr3);
            h3.V2(jArr3, 1, jArr4);
            long[] jArr7 = new long[14];
            h3.u1(jArr3, jArr4, jArr7);
            h3.H2(jArr7, jArr3);
            h3.V2(jArr4, 1, jArr4);
            long[] jArr8 = new long[14];
            h3.u1(jArr3, jArr4, jArr8);
            h3.H2(jArr8, jArr3);
            h3.V2(jArr3, 3, jArr4);
            long[] jArr9 = new long[14];
            h3.u1(jArr3, jArr4, jArr9);
            h3.H2(jArr9, jArr3);
            h3.V2(jArr3, 6, jArr4);
            long[] jArr10 = new long[14];
            h3.u1(jArr3, jArr4, jArr10);
            h3.H2(jArr10, jArr3);
            h3.V2(jArr3, 12, jArr4);
            long[] jArr11 = new long[14];
            h3.u1(jArr3, jArr4, jArr11);
            h3.H2(jArr11, jArr5);
            h3.V2(jArr5, 24, jArr3);
            h3.V2(jArr3, 24, jArr4);
            long[] jArr12 = new long[14];
            h3.u1(jArr3, jArr4, jArr12);
            h3.H2(jArr12, jArr3);
            h3.V2(jArr3, 48, jArr4);
            long[] jArr13 = new long[14];
            h3.u1(jArr3, jArr4, jArr13);
            h3.H2(jArr13, jArr3);
            h3.V2(jArr3, 96, jArr4);
            long[] jArr14 = new long[14];
            h3.u1(jArr3, jArr4, jArr14);
            h3.H2(jArr14, jArr3);
            h3.V2(jArr3, 192, jArr4);
            long[] jArr15 = new long[14];
            h3.u1(jArr3, jArr4, jArr15);
            h3.H2(jArr15, jArr3);
            long[] jArr16 = new long[14];
            h3.u1(jArr3, jArr5, jArr16);
            h3.H2(jArr16, jArr);
            return new i3(jArr);
        }
        throw new IllegalStateException();
    }

    public boolean h() {
        long[] jArr = this.g;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return h3.p1(this.g, 0, 7) ^ 4090087;
    }

    public boolean i() {
        return h3.c2(this.g);
    }

    public g j(g gVar) {
        long[] jArr = new long[7];
        h3.D2(this.g, ((i3) gVar).g, jArr);
        return new i3(jArr);
    }

    public g k(g gVar, g gVar2, g gVar3) {
        return l(gVar, gVar2, gVar3);
    }

    public g l(g gVar, g gVar2, g gVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((i3) gVar).g;
        long[] jArr3 = ((i3) gVar2).g;
        long[] jArr4 = ((i3) gVar3).g;
        long[] jArr5 = new long[13];
        h3.E2(jArr, jArr2, jArr5);
        h3.E2(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[7];
        h3.H2(jArr5, jArr6);
        return new i3(jArr6);
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
        long f4 = a.f(jArr[3]);
        long j3 = (f3 & 4294967295L) | (f4 << 32);
        long j4 = (f3 >>> 32) | (f4 & -4294967296L);
        long f5 = a.f(jArr[4]);
        long f6 = a.f(jArr[5]);
        long j5 = (f5 >>> 32) | (f6 & -4294967296L);
        long f7 = a.f(jArr[6]);
        long j6 = f7 & 4294967295L;
        long j7 = f7 >>> 32;
        return new i3(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (((f5 & 4294967295L) | (f6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20), (((j7 << 44) ^ j6) ^ (j5 >>> 20)) ^ (j2 << 13), (j2 >>> 51) ^ ((j7 >>> 20) ^ (j4 << 13)), (j5 << 13) ^ (j4 >>> 51), (j5 >>> 51) ^ (j7 << 13)});
    }

    public g o() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        h3.w1(this.g, jArr2);
        h3.H2(jArr2, jArr);
        return new i3(jArr);
    }

    public g p(g gVar, g gVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((i3) gVar).g;
        long[] jArr3 = ((i3) gVar2).g;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[13];
        h3.w1(jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        h3.E2(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[7];
        h3.H2(jArr4, jArr6);
        return new i3(jArr6);
    }

    public g q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[7];
        h3.V2(this.g, i, jArr);
        return new i3(jArr);
    }

    public g r(g gVar) {
        return a(gVar);
    }

    public boolean s() {
        return (this.g[0] & 1) != 0;
    }

    public BigInteger t() {
        long[] jArr = this.g;
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = jArr[i];
            if (j != 0) {
                h3.l2(j, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public g u() {
        long[] jArr = this.g;
        long[] jArr2 = new long[13];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]};
        for (int i = 1; i < 409; i += 2) {
            h3.w1(jArr3, jArr2);
            h3.H2(jArr2, jArr3);
            h3.w1(jArr3, jArr2);
            h3.H2(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
            jArr3[2] = jArr3[2] ^ jArr[2];
            jArr3[3] = jArr3[3] ^ jArr[3];
            jArr3[4] = jArr3[4] ^ jArr[4];
            jArr3[5] = jArr3[5] ^ jArr[5];
            jArr3[6] = jArr3[6] ^ jArr[6];
        }
        return new i3(jArr3);
    }

    public boolean v() {
        return true;
    }

    public int w() {
        return ((int) this.g[0]) & 1;
    }
}
