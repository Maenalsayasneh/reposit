package s0.a.e.b.b0.c;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.e.d.a;

public class w1 extends g.a {
    public long[] g;

    public w1() {
        this.g = new long[3];
    }

    public w1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.g = h3.U0(PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS, bigInteger);
    }

    public w1(long[] jArr) {
        this.g = jArr;
    }

    public g a(g gVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((w1) gVar).g;
        return new w1(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2]});
    }

    public g b() {
        long[] jArr = this.g;
        return new w1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    public g d(g gVar) {
        return j(gVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        return h3.I0(this.g, ((w1) obj).g);
    }

    public int f() {
        return PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS;
    }

    public g g() {
        long[] jArr = new long[3];
        long[] jArr2 = this.g;
        if (!h3.Z1(jArr2)) {
            long[] jArr3 = new long[3];
            long[] jArr4 = new long[3];
            long[] jArr5 = new long[6];
            v1.d(jArr2, jArr5);
            v1.g(jArr5, jArr3);
            v1.h(jArr3, 1, jArr4);
            long[] jArr6 = new long[8];
            v1.b(jArr3, jArr4, jArr6);
            v1.g(jArr6, jArr3);
            v1.h(jArr4, 1, jArr4);
            long[] jArr7 = new long[8];
            v1.b(jArr3, jArr4, jArr7);
            v1.g(jArr7, jArr3);
            v1.h(jArr3, 3, jArr4);
            long[] jArr8 = new long[8];
            v1.b(jArr3, jArr4, jArr8);
            v1.g(jArr8, jArr3);
            v1.h(jArr4, 3, jArr4);
            long[] jArr9 = new long[8];
            v1.b(jArr3, jArr4, jArr9);
            v1.g(jArr9, jArr3);
            v1.h(jArr3, 9, jArr4);
            long[] jArr10 = new long[8];
            v1.b(jArr3, jArr4, jArr10);
            v1.g(jArr10, jArr3);
            v1.h(jArr4, 9, jArr4);
            long[] jArr11 = new long[8];
            v1.b(jArr3, jArr4, jArr11);
            v1.g(jArr11, jArr3);
            v1.h(jArr3, 27, jArr4);
            long[] jArr12 = new long[8];
            v1.b(jArr3, jArr4, jArr12);
            v1.g(jArr12, jArr3);
            v1.h(jArr4, 27, jArr4);
            long[] jArr13 = new long[8];
            v1.b(jArr3, jArr4, jArr13);
            v1.g(jArr13, jArr3);
            v1.h(jArr3, 81, jArr4);
            long[] jArr14 = new long[8];
            v1.b(jArr3, jArr4, jArr14);
            v1.g(jArr14, jArr);
            return new w1(jArr);
        }
        throw new IllegalStateException();
    }

    public boolean h() {
        return h3.O1(this.g);
    }

    public int hashCode() {
        return h3.p1(this.g, 0, 3) ^ 163763;
    }

    public boolean i() {
        return h3.Z1(this.g);
    }

    public g j(g gVar) {
        long[] jArr = new long[3];
        v1.e(this.g, ((w1) gVar).g, jArr);
        return new w1(jArr);
    }

    public g k(g gVar, g gVar2, g gVar3) {
        return l(gVar, gVar2, gVar3);
    }

    public g l(g gVar, g gVar2, g gVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((w1) gVar).g;
        long[] jArr3 = ((w1) gVar2).g;
        long[] jArr4 = ((w1) gVar3).g;
        long[] jArr5 = new long[6];
        v1.f(jArr, jArr2, jArr5);
        v1.f(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        v1.g(jArr5, jArr6);
        return new w1(jArr6);
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
        v1.b(jArr3, v1.a, jArr4);
        v1.g(jArr4, jArr);
        jArr[0] = jArr[0] ^ ((f & 4294967295L) | (f2 << 32));
        jArr[1] = jArr[1] ^ j;
        return new w1(jArr);
    }

    public g o() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        v1.d(this.g, jArr2);
        v1.g(jArr2, jArr);
        return new w1(jArr);
    }

    public g p(g gVar, g gVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((w1) gVar).g;
        long[] jArr3 = ((w1) gVar2).g;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[6];
        v1.d(jArr, jArr5);
        v1.a(jArr4, jArr5, jArr4);
        v1.f(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[3];
        v1.g(jArr4, jArr6);
        return new w1(jArr6);
    }

    public g q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        v1.h(this.g, i, jArr);
        return new w1(jArr);
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
        long[] jArr2 = new long[6];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2]};
        for (int i = 1; i < 163; i += 2) {
            v1.d(jArr3, jArr2);
            v1.g(jArr2, jArr3);
            v1.d(jArr3, jArr2);
            v1.g(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
            jArr3[2] = jArr3[2] ^ jArr[2];
        }
        return new w1(jArr3);
    }

    public boolean v() {
        return true;
    }

    public int w() {
        long[] jArr = this.g;
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
