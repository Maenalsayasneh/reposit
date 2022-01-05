package s0.a.e.b.b0.c;

import com.instabug.library.settings.SettingsManager;
import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.e.d.a;

public class q3 extends g.a {
    public long[] g;

    public q3() {
        this.g = new long[9];
    }

    public q3(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.g = h3.U0(571, bigInteger);
    }

    public q3(long[] jArr) {
        this.g = jArr;
    }

    public g a(g gVar) {
        long[] jArr = new long[9];
        p3.a(this.g, ((q3) gVar).g, jArr);
        return new q3(jArr);
    }

    public g b() {
        long[] jArr = new long[9];
        p3.e(this.g, jArr);
        return new q3(jArr);
    }

    public g d(g gVar) {
        return j(gVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        long[] jArr = this.g;
        long[] jArr2 = ((q3) obj).g;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return 571;
    }

    public g g() {
        long[] jArr = new long[9];
        long[] jArr2 = this.g;
        if (!h3.d2(jArr2)) {
            long[] jArr3 = new long[9];
            long[] jArr4 = new long[9];
            long[] jArr5 = new long[9];
            p3.o(jArr2, jArr5);
            p3.o(jArr5, jArr3);
            p3.o(jArr3, jArr4);
            p3.j(jArr3, jArr4, jArr3);
            p3.q(jArr3, 2, jArr4);
            p3.j(jArr3, jArr4, jArr3);
            p3.j(jArr3, jArr5, jArr3);
            p3.q(jArr3, 5, jArr4);
            p3.j(jArr3, jArr4, jArr3);
            p3.q(jArr4, 5, jArr4);
            p3.j(jArr3, jArr4, jArr3);
            p3.q(jArr3, 15, jArr4);
            p3.j(jArr3, jArr4, jArr5);
            p3.q(jArr5, 30, jArr3);
            p3.q(jArr3, 30, jArr4);
            p3.j(jArr3, jArr4, jArr3);
            p3.q(jArr3, 60, jArr4);
            p3.j(jArr3, jArr4, jArr3);
            p3.q(jArr4, 60, jArr4);
            p3.j(jArr3, jArr4, jArr3);
            p3.q(jArr3, SettingsManager.MAX_ASR_DURATION_IN_SECONDS, jArr4);
            p3.j(jArr3, jArr4, jArr3);
            p3.q(jArr4, SettingsManager.MAX_ASR_DURATION_IN_SECONDS, jArr4);
            p3.j(jArr3, jArr4, jArr3);
            p3.j(jArr3, jArr5, jArr);
            return new q3(jArr);
        }
        throw new IllegalStateException();
    }

    public boolean h() {
        long[] jArr = this.g;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return h3.p1(this.g, 0, 9) ^ 5711052;
    }

    public boolean i() {
        return h3.d2(this.g);
    }

    public g j(g gVar) {
        long[] jArr = new long[9];
        p3.j(this.g, ((q3) gVar).g, jArr);
        return new q3(jArr);
    }

    public g k(g gVar, g gVar2, g gVar3) {
        return l(gVar, gVar2, gVar3);
    }

    public g l(g gVar, g gVar2, g gVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((q3) gVar).g;
        long[] jArr3 = ((q3) gVar2).g;
        long[] jArr4 = ((q3) gVar3).g;
        long[] jArr5 = new long[18];
        p3.k(jArr, jArr2, jArr5);
        p3.k(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        p3.n(jArr5, jArr6);
        return new q3(jArr6);
    }

    public g m() {
        return this;
    }

    public g n() {
        long[] jArr = new long[9];
        long[] jArr2 = this.g;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long f = a.f(jArr2[i]);
            i = i3 + 1;
            long f2 = a.f(jArr2[i3]);
            jArr3[i2] = (4294967295L & f) | (f2 << 32);
            jArr4[i2] = (f >>> 32) | (-4294967296L & f2);
        }
        long f3 = a.f(jArr2[i]);
        jArr3[4] = 4294967295L & f3;
        jArr4[4] = f3 >>> 32;
        p3.j(jArr4, p3.a, jArr);
        p3.a(jArr, jArr3, jArr);
        return new q3(jArr);
    }

    public g o() {
        long[] jArr = new long[9];
        p3.o(this.g, jArr);
        return new q3(jArr);
    }

    public g p(g gVar, g gVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((q3) gVar).g;
        long[] jArr3 = ((q3) gVar2).g;
        long[] jArr4 = new long[18];
        p3.p(jArr, jArr4);
        p3.k(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        p3.n(jArr4, jArr5);
        return new q3(jArr5);
    }

    public g q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[9];
        p3.q(this.g, i, jArr);
        return new q3(jArr);
    }

    public g r(g gVar) {
        return a(gVar);
    }

    public boolean s() {
        return (this.g[0] & 1) != 0;
    }

    public BigInteger t() {
        long[] jArr = this.g;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                h3.l2(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public g u() {
        long[] jArr = this.g;
        long[] jArr2 = new long[18];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6], jArr[7], jArr[8]};
        for (int i = 1; i < 571; i += 2) {
            p3.i(jArr3, jArr2);
            p3.n(jArr2, jArr3);
            p3.i(jArr3, jArr2);
            p3.n(jArr2, jArr3);
            for (int i2 = 0; i2 < 9; i2++) {
                jArr3[i2] = jArr3[i2] ^ jArr[i2];
            }
        }
        return new q3(jArr3);
    }

    public boolean v() {
        return true;
    }

    public int w() {
        long[] jArr = this.g;
        return ((int) ((jArr[0] ^ (jArr[8] >>> 49)) ^ (jArr[8] >>> 57))) & 1;
    }
}
