package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.g.k.d;

public class v extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    public int[] h;

    public v() {
        this.h = new int[6];
    }

    public v(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        int[] R0 = h3.R0(bigInteger);
        if (R0[5] == -1) {
            int[] iArr = u.a;
            if (h3.i1(R0, iArr)) {
                h3.i3(iArr, R0);
            }
        }
        this.h = R0;
    }

    public v(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[6];
        if (h3.e(this.h, ((v) gVar).h, iArr) != 0 || (iArr[5] == -1 && h3.i1(iArr, u.a))) {
            h3.h(6, 4553, iArr);
        }
        return new v(iArr);
    }

    public g b() {
        int[] iArr = new int[6];
        if (h3.y1(6, this.h, iArr) != 0 || (iArr[5] == -1 && h3.i1(iArr, u.a))) {
            h3.h(6, 4553, iArr);
        }
        return new v(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[6];
        h3.G(u.a, ((v) gVar).h, iArr);
        u.b(iArr, this.h, iArr);
        return new v(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return h3.F0(this.h, ((v) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[6];
        h3.G(u.a, this.h, iArr);
        return new v(iArr);
    }

    public boolean h() {
        return h3.L1(this.h);
    }

    public int hashCode() {
        return g.hashCode() ^ h3.o1(this.h, 0, 6);
    }

    public boolean i() {
        return h3.V1(this.h);
    }

    public g j(g gVar) {
        int[] iArr = new int[6];
        u.b(this.h, ((v) gVar).h, iArr);
        return new v(iArr);
    }

    public g m() {
        int[] iArr = new int[6];
        int[] iArr2 = this.h;
        if (u.a(iArr2) != 0) {
            int[] iArr3 = u.a;
            h3.b3(iArr3, iArr3, iArr);
        } else {
            h3.b3(u.a, iArr2, iArr);
        }
        return new v(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.V1(iArr) || h3.L1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[12];
        h3.S2(iArr, iArr3);
        u.c(iArr3, iArr2);
        int[] iArr4 = new int[12];
        h3.v2(iArr2, iArr, iArr4);
        u.c(iArr4, iArr2);
        int[] iArr5 = new int[6];
        int[] iArr6 = new int[12];
        h3.S2(iArr2, iArr6);
        u.c(iArr6, iArr5);
        int[] iArr7 = new int[12];
        h3.v2(iArr5, iArr, iArr7);
        u.c(iArr7, iArr5);
        int[] iArr8 = new int[6];
        u.f(iArr5, 3, iArr8);
        int[] iArr9 = new int[12];
        h3.v2(iArr8, iArr5, iArr9);
        u.c(iArr9, iArr8);
        u.f(iArr8, 2, iArr8);
        int[] iArr10 = new int[12];
        h3.v2(iArr8, iArr2, iArr10);
        u.c(iArr10, iArr8);
        u.f(iArr8, 8, iArr2);
        int[] iArr11 = new int[12];
        h3.v2(iArr2, iArr8, iArr11);
        u.c(iArr11, iArr2);
        u.f(iArr2, 3, iArr8);
        int[] iArr12 = new int[12];
        h3.v2(iArr8, iArr5, iArr12);
        u.c(iArr12, iArr8);
        int[] iArr13 = new int[6];
        u.f(iArr8, 16, iArr13);
        int[] iArr14 = new int[12];
        h3.v2(iArr13, iArr2, iArr14);
        u.c(iArr14, iArr13);
        u.f(iArr13, 35, iArr2);
        int[] iArr15 = new int[12];
        h3.v2(iArr2, iArr13, iArr15);
        u.c(iArr15, iArr2);
        u.f(iArr2, 70, iArr13);
        int[] iArr16 = new int[12];
        h3.v2(iArr13, iArr2, iArr16);
        u.c(iArr16, iArr13);
        u.f(iArr13, 19, iArr2);
        int[] iArr17 = new int[12];
        h3.v2(iArr2, iArr8, iArr17);
        u.c(iArr17, iArr2);
        u.f(iArr2, 20, iArr2);
        int[] iArr18 = new int[12];
        h3.v2(iArr2, iArr8, iArr18);
        u.c(iArr18, iArr2);
        u.f(iArr2, 4, iArr2);
        int[] iArr19 = new int[12];
        h3.v2(iArr2, iArr5, iArr19);
        u.c(iArr19, iArr2);
        u.f(iArr2, 6, iArr2);
        int[] iArr20 = new int[12];
        h3.v2(iArr2, iArr5, iArr20);
        u.c(iArr20, iArr2);
        int[] iArr21 = new int[12];
        h3.S2(iArr2, iArr21);
        u.c(iArr21, iArr2);
        int[] iArr22 = new int[12];
        h3.S2(iArr2, iArr22);
        u.c(iArr22, iArr5);
        if (h3.F0(iArr, iArr5)) {
            return new v(iArr2);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[6];
        u.e(this.h, iArr);
        return new v(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[6];
        u.g(this.h, ((v) gVar).h, iArr);
        return new v(iArr);
    }

    public boolean s() {
        return h3.W0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.n3(this.h);
    }
}
