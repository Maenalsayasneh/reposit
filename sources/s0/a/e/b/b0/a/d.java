package s0.a.e.b.b0.a;

import java.math.BigInteger;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.g;

public class d extends g.b {
    public static final BigInteger g = h3.p3(c.a);
    public static final int[] h = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    public int[] i;

    public d() {
        this.i = new int[8];
    }

    public d(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        int[] T0 = h3.T0(bigInteger);
        while (true) {
            int[] iArr = c.a;
            if (h3.k1(T0, iArr)) {
                h3.j3(iArr, T0);
            } else {
                this.i = T0;
                return;
            }
        }
    }

    public d(int[] iArr) {
        this.i = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[8];
        h3.i(this.i, ((d) gVar).i, iArr);
        if (h3.k1(iArr, c.a)) {
            c.g(iArr);
        }
        return new d(iArr);
    }

    public g b() {
        int[] iArr = new int[8];
        h3.y1(8, this.i, iArr);
        if (h3.k1(iArr, c.a)) {
            c.g(iArr);
        }
        return new d(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[8];
        h3.G(c.a, ((d) gVar).i, iArr);
        c.b(iArr, this.i, iArr);
        return new d(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return h3.H0(this.i, ((d) obj).i);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[8];
        h3.G(c.a, this.i, iArr);
        return new d(iArr);
    }

    public boolean h() {
        return h3.N1(this.i);
    }

    public int hashCode() {
        return g.hashCode() ^ h3.o1(this.i, 0, 8);
    }

    public boolean i() {
        return h3.X1(this.i);
    }

    public g j(g gVar) {
        int[] iArr = new int[8];
        c.b(this.i, ((d) gVar).i, iArr);
        return new d(iArr);
    }

    public g m() {
        int[] iArr = new int[8];
        int[] iArr2 = this.i;
        if (c.a(iArr2) != 0) {
            int[] iArr3 = c.a;
            h3.e3(iArr3, iArr3, iArr);
        } else {
            h3.e3(c.a, iArr2, iArr);
        }
        return new d(iArr);
    }

    public g n() {
        int[] iArr = this.i;
        if (h3.X1(iArr) || h3.N1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[16];
        h3.U2(iArr, iArr3);
        c.c(iArr3, iArr2);
        int[] iArr4 = new int[16];
        h3.x2(iArr2, iArr, iArr4);
        c.c(iArr4, iArr2);
        int[] iArr5 = new int[16];
        h3.U2(iArr2, iArr5);
        c.c(iArr5, iArr2);
        int[] iArr6 = new int[16];
        h3.x2(iArr2, iArr, iArr6);
        c.c(iArr6, iArr2);
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[16];
        h3.U2(iArr2, iArr8);
        c.c(iArr8, iArr7);
        int[] iArr9 = new int[16];
        h3.x2(iArr7, iArr, iArr9);
        c.c(iArr9, iArr7);
        int[] iArr10 = new int[8];
        c.f(iArr7, 3, iArr10);
        int[] iArr11 = new int[16];
        h3.x2(iArr10, iArr2, iArr11);
        c.c(iArr11, iArr10);
        c.f(iArr10, 4, iArr2);
        int[] iArr12 = new int[16];
        h3.x2(iArr2, iArr7, iArr12);
        c.c(iArr12, iArr2);
        c.f(iArr2, 4, iArr10);
        int[] iArr13 = new int[16];
        h3.x2(iArr10, iArr7, iArr13);
        c.c(iArr13, iArr10);
        c.f(iArr10, 15, iArr7);
        int[] iArr14 = new int[16];
        h3.x2(iArr7, iArr10, iArr14);
        c.c(iArr14, iArr7);
        c.f(iArr7, 30, iArr10);
        int[] iArr15 = new int[16];
        h3.x2(iArr10, iArr7, iArr15);
        c.c(iArr15, iArr10);
        c.f(iArr10, 60, iArr7);
        int[] iArr16 = new int[16];
        h3.x2(iArr7, iArr10, iArr16);
        c.c(iArr16, iArr7);
        c.f(iArr7, 11, iArr10);
        int[] iArr17 = new int[16];
        h3.x2(iArr10, iArr2, iArr17);
        c.c(iArr17, iArr10);
        c.f(iArr10, 120, iArr2);
        int[] iArr18 = new int[16];
        h3.x2(iArr2, iArr7, iArr18);
        c.c(iArr18, iArr2);
        int[] iArr19 = new int[16];
        h3.U2(iArr2, iArr19);
        c.c(iArr19, iArr2);
        int[] iArr20 = new int[16];
        h3.U2(iArr2, iArr20);
        c.c(iArr20, iArr7);
        if (h3.H0(iArr, iArr7)) {
            return new d(iArr2);
        }
        c.b(iArr2, h, iArr2);
        int[] iArr21 = new int[16];
        h3.U2(iArr2, iArr21);
        c.c(iArr21, iArr7);
        if (h3.H0(iArr, iArr7)) {
            return new d(iArr2);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[8];
        c.e(this.i, iArr);
        return new d(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[8];
        c.h(this.i, ((d) gVar).i, iArr);
        return new d(iArr);
    }

    public boolean s() {
        return h3.Y0(this.i, 0) == 1;
    }

    public BigInteger t() {
        return h3.p3(this.i);
    }
}
