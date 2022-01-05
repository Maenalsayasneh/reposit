package s0.a.e.b.b0.c;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.e.d.a;

public class a3 extends g.a {
    public long[] g;

    public a3() {
        this.g = new long[5];
    }

    public a3(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.g = h3.U0(283, bigInteger);
    }

    public a3(long[] jArr) {
        this.g = jArr;
    }

    public g a(g gVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((a3) gVar).g;
        return new a3(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4]});
    }

    public g b() {
        long[] jArr = this.g;
        return new a3(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    public g d(g gVar) {
        return j(gVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        long[] jArr = this.g;
        long[] jArr2 = ((a3) obj).g;
        for (int i = 4; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return 283;
    }

    public g g() {
        long[] jArr = new long[5];
        long[] jArr2 = this.g;
        if (!h3.b2(jArr2)) {
            long[] jArr3 = new long[5];
            long[] jArr4 = new long[5];
            z2.i(jArr2, jArr3);
            long[] jArr5 = new long[10];
            z2.c(jArr3, jArr2, jArr5);
            z2.h(jArr5, jArr3);
            z2.j(jArr3, 2, jArr4);
            long[] jArr6 = new long[10];
            z2.c(jArr4, jArr3, jArr6);
            z2.h(jArr6, jArr4);
            z2.j(jArr4, 4, jArr3);
            long[] jArr7 = new long[10];
            z2.c(jArr3, jArr4, jArr7);
            z2.h(jArr7, jArr3);
            z2.j(jArr3, 8, jArr4);
            long[] jArr8 = new long[10];
            z2.c(jArr4, jArr3, jArr8);
            z2.h(jArr8, jArr4);
            z2.i(jArr4, jArr4);
            long[] jArr9 = new long[10];
            z2.c(jArr4, jArr2, jArr9);
            z2.h(jArr9, jArr4);
            z2.j(jArr4, 17, jArr3);
            long[] jArr10 = new long[10];
            z2.c(jArr3, jArr4, jArr10);
            z2.h(jArr10, jArr3);
            z2.i(jArr3, jArr3);
            long[] jArr11 = new long[10];
            z2.c(jArr3, jArr2, jArr11);
            z2.h(jArr11, jArr3);
            z2.j(jArr3, 35, jArr4);
            long[] jArr12 = new long[10];
            z2.c(jArr4, jArr3, jArr12);
            z2.h(jArr12, jArr4);
            z2.j(jArr4, 70, jArr3);
            long[] jArr13 = new long[10];
            z2.c(jArr3, jArr4, jArr13);
            z2.h(jArr13, jArr3);
            z2.i(jArr3, jArr3);
            long[] jArr14 = new long[10];
            z2.c(jArr3, jArr2, jArr14);
            z2.h(jArr14, jArr3);
            z2.j(jArr3, PubNubErrorBuilder.PNERR_CHANNEL_AND_GROUP_MISSING, jArr4);
            long[] jArr15 = new long[10];
            z2.c(jArr4, jArr3, jArr15);
            z2.h(jArr15, jArr4);
            z2.i(jArr4, jArr);
            return new a3(jArr);
        }
        throw new IllegalStateException();
    }

    public boolean h() {
        long[] jArr = this.g;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return h3.p1(this.g, 0, 5) ^ 2831275;
    }

    public boolean i() {
        return h3.b2(this.g);
    }

    public g j(g gVar) {
        long[] jArr = new long[5];
        z2.f(this.g, ((a3) gVar).g, jArr);
        return new a3(jArr);
    }

    public g k(g gVar, g gVar2, g gVar3) {
        return l(gVar, gVar2, gVar3);
    }

    public g l(g gVar, g gVar2, g gVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((a3) gVar).g;
        long[] jArr3 = ((a3) gVar2).g;
        long[] jArr4 = ((a3) gVar3).g;
        long[] jArr5 = new long[9];
        z2.g(jArr, jArr2, jArr5);
        z2.g(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[5];
        z2.h(jArr5, jArr6);
        return new a3(jArr6);
    }

    public g m() {
        return this;
    }

    public g n() {
        long[] jArr = new long[5];
        long[] jArr2 = this.g;
        long[] jArr3 = new long[5];
        long f = a.f(jArr2[0]);
        long f2 = a.f(jArr2[1]);
        long j = (f & 4294967295L) | (f2 << 32);
        jArr3[0] = (f >>> 32) | (f2 & -4294967296L);
        long f3 = a.f(jArr2[2]);
        long f4 = a.f(jArr2[3]);
        jArr3[1] = (f3 >>> 32) | (f4 & -4294967296L);
        long f5 = a.f(jArr2[4]);
        jArr3[2] = f5 >>> 32;
        long[] jArr4 = new long[10];
        z2.c(jArr3, z2.a, jArr4);
        z2.h(jArr4, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ ((f3 & 4294967295L) | (f4 << 32));
        jArr[2] = jArr[2] ^ (4294967295L & f5);
        return new a3(jArr);
    }

    public g o() {
        long[] jArr = new long[5];
        z2.i(this.g, jArr);
        return new a3(jArr);
    }

    public g p(g gVar, g gVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((a3) gVar).g;
        long[] jArr3 = ((a3) gVar2).g;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        z2.e(jArr, jArr5);
        z2.a(jArr4, jArr5, jArr4);
        z2.g(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[5];
        z2.h(jArr4, jArr6);
        return new a3(jArr6);
    }

    public g q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[5];
        z2.j(this.g, i, jArr);
        return new a3(jArr);
    }

    public g r(g gVar) {
        return a(gVar);
    }

    public boolean s() {
        return (this.g[0] & 1) != 0;
    }

    public BigInteger t() {
        long[] jArr = this.g;
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = jArr[i];
            if (j != 0) {
                h3.l2(j, bArr, (4 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public g u() {
        long[] jArr = this.g;
        long[] jArr2 = new long[9];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2], jArr[3], jArr[4]};
        for (int i = 1; i < 283; i += 2) {
            z2.e(jArr3, jArr2);
            z2.h(jArr2, jArr3);
            z2.e(jArr3, jArr2);
            z2.h(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
            jArr3[2] = jArr3[2] ^ jArr[2];
            jArr3[3] = jArr3[3] ^ jArr[3];
            jArr3[4] = jArr3[4] ^ jArr[4];
        }
        return new a3(jArr3);
    }

    public boolean v() {
        return true;
    }

    public int w() {
        long[] jArr = this.g;
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
