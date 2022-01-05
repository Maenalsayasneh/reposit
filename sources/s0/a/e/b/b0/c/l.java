package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.g.k.d;

public class l extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    public int[] h;

    public l() {
        this.h = new int[5];
    }

    public l(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        int[] Q0 = h3.Q0(bigInteger);
        if (Q0[4] == -1) {
            int[] iArr = k.a;
            if (h3.h1(Q0, iArr)) {
                h3.h3(iArr, Q0);
            }
        }
        this.h = Q0;
    }

    public l(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[5];
        k.a(this.h, ((l) gVar).h, iArr);
        return new l(iArr);
    }

    public g b() {
        int[] iArr = new int[5];
        if (h3.y1(5, this.h, iArr) != 0 || (iArr[4] == -1 && h3.h1(iArr, k.a))) {
            h3.w(5, -2147483647, iArr);
        }
        return new l(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[5];
        h3.G(k.a, ((l) gVar).h, iArr);
        k.c(iArr, this.h, iArr);
        return new l(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return h3.E0(this.h, ((l) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[5];
        h3.G(k.a, this.h, iArr);
        return new l(iArr);
    }

    public boolean h() {
        return h3.K1(this.h);
    }

    public int hashCode() {
        return g.hashCode() ^ h3.o1(this.h, 0, 5);
    }

    public boolean i() {
        return h3.U1(this.h);
    }

    public g j(g gVar) {
        int[] iArr = new int[5];
        k.c(this.h, ((l) gVar).h, iArr);
        return new l(iArr);
    }

    public g m() {
        int[] iArr = new int[5];
        int[] iArr2 = this.h;
        if (k.b(iArr2) != 0) {
            int[] iArr3 = k.a;
            h3.a3(iArr3, iArr3, iArr);
        } else {
            h3.a3(k.a, iArr2, iArr);
        }
        return new l(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.U1(iArr) || h3.K1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[10];
        h3.R2(iArr, iArr3);
        k.d(iArr3, iArr2);
        int[] iArr4 = new int[10];
        h3.u2(iArr2, iArr, iArr4);
        k.d(iArr4, iArr2);
        int[] iArr5 = new int[5];
        k.g(iArr2, 2, iArr5);
        int[] iArr6 = new int[10];
        h3.u2(iArr5, iArr2, iArr6);
        k.d(iArr6, iArr5);
        k.g(iArr5, 4, iArr2);
        int[] iArr7 = new int[10];
        h3.u2(iArr2, iArr5, iArr7);
        k.d(iArr7, iArr2);
        k.g(iArr2, 8, iArr5);
        int[] iArr8 = new int[10];
        h3.u2(iArr5, iArr2, iArr8);
        k.d(iArr8, iArr5);
        k.g(iArr5, 16, iArr2);
        int[] iArr9 = new int[10];
        h3.u2(iArr2, iArr5, iArr9);
        k.d(iArr9, iArr2);
        k.g(iArr2, 32, iArr5);
        int[] iArr10 = new int[10];
        h3.u2(iArr5, iArr2, iArr10);
        k.d(iArr10, iArr5);
        k.g(iArr5, 64, iArr2);
        int[] iArr11 = new int[10];
        h3.u2(iArr2, iArr5, iArr11);
        k.d(iArr11, iArr2);
        int[] iArr12 = new int[10];
        h3.R2(iArr2, iArr12);
        k.d(iArr12, iArr5);
        int[] iArr13 = new int[10];
        h3.u2(iArr5, iArr, iArr13);
        k.d(iArr13, iArr5);
        k.g(iArr5, 29, iArr5);
        int[] iArr14 = new int[10];
        h3.R2(iArr5, iArr14);
        k.d(iArr14, iArr2);
        if (h3.E0(iArr, iArr2)) {
            return new l(iArr5);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[5];
        k.f(this.h, iArr);
        return new l(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[5];
        k.h(this.h, ((l) gVar).h, iArr);
        return new l(iArr);
    }

    public boolean s() {
        return h3.V0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.m3(this.h);
    }
}
