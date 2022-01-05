package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.e.d.a;
import s0.a.g.k.d;

public class z0 extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
    public int[] h;

    public z0() {
        this.h = new int[12];
    }

    public z0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        int[] P0 = h3.P0(384, bigInteger);
        if (P0[11] == -1) {
            int[] iArr = y0.a;
            if (h3.f1(12, P0, iArr)) {
                h3.g3(12, iArr, P0);
            }
        }
        this.h = P0;
    }

    public z0(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[12];
        y0.a(this.h, ((z0) gVar).h, iArr);
        return new z0(iArr);
    }

    public g b() {
        int[] iArr = new int[12];
        if (h3.y1(12, this.h, iArr) != 0 || (iArr[11] == -1 && h3.f1(12, iArr, y0.a))) {
            y0.b(iArr);
        }
        return new z0(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[12];
        h3.G(y0.a, ((z0) gVar).h, iArr);
        y0.d(iArr, this.h, iArr);
        return new z0(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        return h3.C0(12, this.h, ((z0) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[12];
        h3.G(y0.a, this.h, iArr);
        return new z0(iArr);
    }

    public boolean h() {
        return h3.I1(12, this.h);
    }

    public int hashCode() {
        return g.hashCode() ^ h3.o1(this.h, 0, 12);
    }

    public boolean i() {
        return h3.S1(12, this.h);
    }

    public g j(g gVar) {
        int[] iArr = new int[12];
        y0.d(this.h, ((z0) gVar).h, iArr);
        return new z0(iArr);
    }

    public g m() {
        int[] iArr = new int[12];
        int[] iArr2 = this.h;
        if (y0.c(iArr2) != 0) {
            int[] iArr3 = y0.a;
            h3.W2(12, iArr3, iArr3, iArr);
        } else {
            h3.W2(12, y0.a, iArr2, iArr);
        }
        return new z0(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.S1(12, iArr) || h3.I1(12, iArr)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[24];
        a.e(iArr, iArr6);
        y0.e(iArr6, iArr2);
        int[] iArr7 = new int[24];
        a.d(iArr2, iArr, iArr7);
        y0.e(iArr7, iArr2);
        y0.h(iArr2, 2, iArr3);
        int[] iArr8 = new int[24];
        a.d(iArr3, iArr2, iArr8);
        y0.e(iArr8, iArr3);
        int[] iArr9 = new int[24];
        a.e(iArr3, iArr9);
        y0.e(iArr9, iArr3);
        int[] iArr10 = new int[24];
        a.d(iArr3, iArr, iArr10);
        y0.e(iArr10, iArr3);
        y0.h(iArr3, 5, iArr4);
        int[] iArr11 = new int[24];
        a.d(iArr4, iArr3, iArr11);
        y0.e(iArr11, iArr4);
        y0.h(iArr4, 5, iArr5);
        int[] iArr12 = new int[24];
        a.d(iArr5, iArr3, iArr12);
        y0.e(iArr12, iArr5);
        y0.h(iArr5, 15, iArr3);
        int[] iArr13 = new int[24];
        a.d(iArr3, iArr5, iArr13);
        y0.e(iArr13, iArr3);
        y0.h(iArr3, 2, iArr4);
        int[] iArr14 = new int[24];
        a.d(iArr2, iArr4, iArr14);
        y0.e(iArr14, iArr2);
        y0.h(iArr4, 28, iArr4);
        int[] iArr15 = new int[24];
        a.d(iArr3, iArr4, iArr15);
        y0.e(iArr15, iArr3);
        y0.h(iArr3, 60, iArr4);
        int[] iArr16 = new int[24];
        a.d(iArr4, iArr3, iArr16);
        y0.e(iArr16, iArr4);
        y0.h(iArr4, 120, iArr3);
        int[] iArr17 = new int[24];
        a.d(iArr3, iArr4, iArr17);
        y0.e(iArr17, iArr3);
        y0.h(iArr3, 15, iArr3);
        int[] iArr18 = new int[24];
        a.d(iArr3, iArr5, iArr18);
        y0.e(iArr18, iArr3);
        y0.h(iArr3, 33, iArr3);
        int[] iArr19 = new int[24];
        a.d(iArr3, iArr2, iArr19);
        y0.e(iArr19, iArr3);
        y0.h(iArr3, 64, iArr3);
        int[] iArr20 = new int[24];
        a.d(iArr3, iArr, iArr20);
        y0.e(iArr20, iArr3);
        y0.h(iArr3, 30, iArr2);
        int[] iArr21 = new int[24];
        a.e(iArr2, iArr21);
        y0.e(iArr21, iArr3);
        if (h3.C0(12, iArr, iArr3)) {
            return new z0(iArr2);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[12];
        y0.g(this.h, iArr);
        return new z0(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[12];
        y0.i(this.h, ((z0) gVar).h, iArr);
        return new z0(iArr);
    }

    public boolean s() {
        return h3.Z0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.l3(12, this.h);
    }
}
