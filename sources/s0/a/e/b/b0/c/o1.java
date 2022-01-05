package s0.a.e.b.b0.c;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.e.d.a;

public class o1 extends g.a {
    public long[] g;

    public o1() {
        this.g = new long[3];
    }

    public o1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.g = h3.U0(PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, bigInteger);
    }

    public o1(long[] jArr) {
        this.g = jArr;
    }

    public g a(g gVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((o1) gVar).g;
        return new o1(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2]});
    }

    public g b() {
        long[] jArr = this.g;
        return new o1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    public g d(g gVar) {
        return j(gVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        return h3.I0(this.g, ((o1) obj).g);
    }

    public int f() {
        return PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS;
    }

    public g g() {
        long[] jArr = new long[3];
        long[] jArr2 = this.g;
        if (!h3.Z1(jArr2)) {
            long[] jArr3 = new long[3];
            long[] jArr4 = new long[3];
            n1.h(jArr2, jArr3);
            long[] jArr5 = new long[8];
            n1.b(jArr3, jArr2, jArr5);
            n1.g(jArr5, jArr3);
            n1.i(jArr3, 2, jArr4);
            long[] jArr6 = new long[8];
            n1.b(jArr4, jArr3, jArr6);
            n1.g(jArr6, jArr4);
            n1.i(jArr4, 4, jArr3);
            long[] jArr7 = new long[8];
            n1.b(jArr3, jArr4, jArr7);
            n1.g(jArr7, jArr3);
            n1.i(jArr3, 8, jArr4);
            long[] jArr8 = new long[8];
            n1.b(jArr4, jArr3, jArr8);
            n1.g(jArr8, jArr4);
            n1.i(jArr4, 16, jArr3);
            long[] jArr9 = new long[8];
            n1.b(jArr3, jArr4, jArr9);
            n1.g(jArr9, jArr3);
            n1.i(jArr3, 32, jArr4);
            long[] jArr10 = new long[8];
            n1.b(jArr4, jArr3, jArr10);
            n1.g(jArr10, jArr4);
            n1.h(jArr4, jArr4);
            long[] jArr11 = new long[8];
            n1.b(jArr4, jArr2, jArr11);
            n1.g(jArr11, jArr4);
            n1.i(jArr4, 65, jArr3);
            long[] jArr12 = new long[8];
            n1.b(jArr3, jArr4, jArr12);
            n1.g(jArr12, jArr3);
            n1.h(jArr3, jArr);
            return new o1(jArr);
        }
        throw new IllegalStateException();
    }

    public boolean h() {
        return h3.O1(this.g);
    }

    public int hashCode() {
        return h3.p1(this.g, 0, 3) ^ 131832;
    }

    public boolean i() {
        return h3.Z1(this.g);
    }

    public g j(g gVar) {
        long[] jArr = new long[3];
        n1.e(this.g, ((o1) gVar).g, jArr);
        return new o1(jArr);
    }

    public g k(g gVar, g gVar2, g gVar3) {
        return l(gVar, gVar2, gVar3);
    }

    public g l(g gVar, g gVar2, g gVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((o1) gVar).g;
        long[] jArr3 = ((o1) gVar2).g;
        long[] jArr4 = ((o1) gVar3).g;
        long[] jArr5 = new long[5];
        n1.f(jArr, jArr2, jArr5);
        n1.f(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        n1.g(jArr5, jArr6);
        return new o1(jArr6);
    }

    public g m() {
        return this;
    }

    public g n() {
        long[] jArr = new long[3];
        long[] jArr2 = this.g;
        long[] jArr3 = new long[3];
        long f = a.f(jArr2[0]);
        long f2 = a.f(jArr2[1]);
        jArr3[0] = (f >>> 32) | (f2 & -4294967296L);
        long f3 = a.f(jArr2[2]);
        long j = f3 & 4294967295L;
        jArr3[1] = f3 >>> 32;
        long[] jArr4 = new long[8];
        n1.b(jArr3, n1.a, jArr4);
        n1.g(jArr4, jArr);
        jArr[0] = jArr[0] ^ ((f & 4294967295L) | (f2 << 32));
        jArr[1] = jArr[1] ^ j;
        return new o1(jArr);
    }

    public g o() {
        long[] jArr = new long[3];
        n1.h(this.g, jArr);
        return new o1(jArr);
    }

    public g p(g gVar, g gVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((o1) gVar).g;
        long[] jArr3 = ((o1) gVar2).g;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        n1.d(jArr, jArr5);
        n1.a(jArr4, jArr5, jArr4);
        n1.f(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[3];
        n1.g(jArr4, jArr6);
        return new o1(jArr6);
    }

    public g q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        n1.i(this.g, i, jArr);
        return new o1(jArr);
    }

    public g r(g gVar) {
        return a(gVar);
    }

    public boolean s() {
        return (this.g[0] & 1) != 0;
    }

    public BigInteger t() {
        return h3.q3(this.g);
    }

    public g u() {
        long[] jArr = this.g;
        long[] jArr2 = new long[5];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2]};
        for (int i = 1; i < 131; i += 2) {
            n1.d(jArr3, jArr2);
            n1.g(jArr2, jArr3);
            n1.d(jArr3, jArr2);
            n1.g(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
            jArr3[2] = jArr3[2] ^ jArr[2];
        }
        return new o1(jArr3);
    }

    public boolean v() {
        return true;
    }

    public int w() {
        long[] jArr = this.g;
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
