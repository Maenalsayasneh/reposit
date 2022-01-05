package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.g.k.d;

public class p0 extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));
    public int[] h;

    public p0() {
        this.h = new int[8];
    }

    public p0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        int[] T0 = h3.T0(bigInteger);
        if (T0[7] == -1) {
            int[] iArr = o0.a;
            if (h3.k1(T0, iArr)) {
                h3.j3(iArr, T0);
            }
        }
        this.h = T0;
    }

    public p0(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[8];
        if (h3.i(this.h, ((p0) gVar).h, iArr) != 0 || (iArr[7] == -1 && h3.k1(iArr, o0.a))) {
            h3.h(8, 977, iArr);
        }
        return new p0(iArr);
    }

    public g b() {
        int[] iArr = new int[8];
        if (h3.y1(8, this.h, iArr) != 0 || (iArr[7] == -1 && h3.k1(iArr, o0.a))) {
            h3.h(8, 977, iArr);
        }
        return new p0(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[8];
        h3.G(o0.a, ((p0) gVar).h, iArr);
        o0.b(iArr, this.h, iArr);
        return new p0(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        return h3.H0(this.h, ((p0) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[8];
        h3.G(o0.a, this.h, iArr);
        return new p0(iArr);
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
        o0.b(this.h, ((p0) gVar).h, iArr);
        return new p0(iArr);
    }

    public g m() {
        int[] iArr = new int[8];
        int[] iArr2 = this.h;
        if (o0.a(iArr2) != 0) {
            int[] iArr3 = o0.a;
            h3.e3(iArr3, iArr3, iArr);
        } else {
            h3.e3(o0.a, iArr2, iArr);
        }
        return new p0(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.X1(iArr) || h3.N1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[16];
        h3.U2(iArr, iArr3);
        o0.c(iArr3, iArr2);
        int[] iArr4 = new int[16];
        h3.x2(iArr2, iArr, iArr4);
        o0.c(iArr4, iArr2);
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[16];
        h3.U2(iArr2, iArr6);
        o0.c(iArr6, iArr5);
        int[] iArr7 = new int[16];
        h3.x2(iArr5, iArr, iArr7);
        o0.c(iArr7, iArr5);
        int[] iArr8 = new int[8];
        o0.f(iArr5, 3, iArr8);
        int[] iArr9 = new int[16];
        h3.x2(iArr8, iArr5, iArr9);
        o0.c(iArr9, iArr8);
        o0.f(iArr8, 3, iArr8);
        int[] iArr10 = new int[16];
        h3.x2(iArr8, iArr5, iArr10);
        o0.c(iArr10, iArr8);
        o0.f(iArr8, 2, iArr8);
        int[] iArr11 = new int[16];
        h3.x2(iArr8, iArr2, iArr11);
        o0.c(iArr11, iArr8);
        int[] iArr12 = new int[8];
        o0.f(iArr8, 11, iArr12);
        int[] iArr13 = new int[16];
        h3.x2(iArr12, iArr8, iArr13);
        o0.c(iArr13, iArr12);
        o0.f(iArr12, 22, iArr8);
        int[] iArr14 = new int[16];
        h3.x2(iArr8, iArr12, iArr14);
        o0.c(iArr14, iArr8);
        int[] iArr15 = new int[8];
        o0.f(iArr8, 44, iArr15);
        int[] iArr16 = new int[16];
        h3.x2(iArr15, iArr8, iArr16);
        o0.c(iArr16, iArr15);
        int[] iArr17 = new int[8];
        o0.f(iArr15, 88, iArr17);
        int[] iArr18 = new int[16];
        h3.x2(iArr17, iArr15, iArr18);
        o0.c(iArr18, iArr17);
        o0.f(iArr17, 44, iArr15);
        int[] iArr19 = new int[16];
        h3.x2(iArr15, iArr8, iArr19);
        o0.c(iArr19, iArr15);
        o0.f(iArr15, 3, iArr8);
        int[] iArr20 = new int[16];
        h3.x2(iArr8, iArr5, iArr20);
        o0.c(iArr20, iArr8);
        o0.f(iArr8, 23, iArr8);
        int[] iArr21 = new int[16];
        h3.x2(iArr8, iArr12, iArr21);
        o0.c(iArr21, iArr8);
        o0.f(iArr8, 6, iArr8);
        int[] iArr22 = new int[16];
        h3.x2(iArr8, iArr2, iArr22);
        o0.c(iArr22, iArr8);
        o0.f(iArr8, 2, iArr8);
        int[] iArr23 = new int[16];
        h3.U2(iArr8, iArr23);
        o0.c(iArr23, iArr2);
        if (h3.H0(iArr, iArr2)) {
            return new p0(iArr8);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[8];
        o0.e(this.h, iArr);
        return new p0(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[8];
        o0.g(this.h, ((p0) gVar).h, iArr);
        return new p0(iArr);
    }

    public boolean s() {
        return h3.Y0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.p3(this.h);
    }
}
