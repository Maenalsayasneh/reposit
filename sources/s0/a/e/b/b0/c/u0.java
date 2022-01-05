package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.g.k.d;

public class u0 extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));
    public int[] h;

    public u0() {
        this.h = new int[8];
    }

    public u0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        int[] T0 = h3.T0(bigInteger);
        if (T0[7] == -1) {
            int[] iArr = t0.a;
            if (h3.k1(T0, iArr)) {
                h3.j3(iArr, T0);
            }
        }
        this.h = T0;
    }

    public u0(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[8];
        t0.a(this.h, ((u0) gVar).h, iArr);
        return new u0(iArr);
    }

    public g b() {
        int[] iArr = new int[8];
        if (h3.y1(8, this.h, iArr) != 0 || (iArr[7] == -1 && h3.k1(iArr, t0.a))) {
            t0.b(iArr);
        }
        return new u0(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[8];
        h3.G(t0.a, ((u0) gVar).h, iArr);
        t0.d(iArr, this.h, iArr);
        return new u0(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        return h3.H0(this.h, ((u0) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[8];
        h3.G(t0.a, this.h, iArr);
        return new u0(iArr);
    }

    public boolean h() {
        return h3.N1(this.h);
    }

    public int hashCode() {
        return g.hashCode() ^ h3.o1(this.h, 0, 8);
    }

    public boolean i() {
        return h3.X1(this.h);
    }

    public g j(g gVar) {
        int[] iArr = new int[8];
        t0.d(this.h, ((u0) gVar).h, iArr);
        return new u0(iArr);
    }

    public g m() {
        int[] iArr = new int[8];
        int[] iArr2 = this.h;
        if (t0.c(iArr2) != 0) {
            int[] iArr3 = t0.a;
            h3.e3(iArr3, iArr3, iArr);
        } else {
            h3.e3(t0.a, iArr2, iArr);
        }
        return new u0(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.X1(iArr) || h3.N1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[16];
        h3.U2(iArr, iArr4);
        t0.e(iArr4, iArr2);
        int[] iArr5 = new int[16];
        h3.x2(iArr2, iArr, iArr5);
        t0.e(iArr5, iArr2);
        t0.h(iArr2, 2, iArr3);
        int[] iArr6 = new int[16];
        h3.x2(iArr3, iArr2, iArr6);
        t0.e(iArr6, iArr3);
        t0.h(iArr3, 4, iArr2);
        int[] iArr7 = new int[16];
        h3.x2(iArr2, iArr3, iArr7);
        t0.e(iArr7, iArr2);
        t0.h(iArr2, 8, iArr3);
        int[] iArr8 = new int[16];
        h3.x2(iArr3, iArr2, iArr8);
        t0.e(iArr8, iArr3);
        t0.h(iArr3, 16, iArr2);
        int[] iArr9 = new int[16];
        h3.x2(iArr2, iArr3, iArr9);
        t0.e(iArr9, iArr2);
        t0.h(iArr2, 32, iArr2);
        int[] iArr10 = new int[16];
        h3.x2(iArr2, iArr, iArr10);
        t0.e(iArr10, iArr2);
        t0.h(iArr2, 96, iArr2);
        int[] iArr11 = new int[16];
        h3.x2(iArr2, iArr, iArr11);
        t0.e(iArr11, iArr2);
        t0.h(iArr2, 94, iArr2);
        int[] iArr12 = new int[16];
        h3.U2(iArr2, iArr12);
        t0.e(iArr12, iArr3);
        if (h3.H0(iArr, iArr3)) {
            return new u0(iArr2);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[8];
        t0.g(this.h, iArr);
        return new u0(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[8];
        t0.i(this.h, ((u0) gVar).h, iArr);
        return new u0(iArr);
    }

    public boolean s() {
        return h3.Y0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.p3(this.h);
    }
}
