package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.g.k.d;

public class q extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    public int[] h;

    public q() {
        this.h = new int[5];
    }

    public q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        int[] Q0 = h3.Q0(bigInteger);
        if (Q0[4] == -1) {
            int[] iArr = p.a;
            if (h3.h1(Q0, iArr)) {
                h3.h3(iArr, Q0);
            }
        }
        this.h = Q0;
    }

    public q(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[5];
        p.a(this.h, ((q) gVar).h, iArr);
        return new q(iArr);
    }

    public g b() {
        int[] iArr = new int[5];
        if (h3.y1(5, this.h, iArr) != 0 || (iArr[4] == -1 && h3.h1(iArr, p.a))) {
            h3.h(5, 21389, iArr);
        }
        return new q(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[5];
        h3.G(p.a, ((q) gVar).h, iArr);
        p.c(iArr, this.h, iArr);
        return new q(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return h3.E0(this.h, ((q) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[5];
        h3.G(p.a, this.h, iArr);
        return new q(iArr);
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
        p.c(this.h, ((q) gVar).h, iArr);
        return new q(iArr);
    }

    public g m() {
        int[] iArr = new int[5];
        p.e(this.h, iArr);
        return new q(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.U1(iArr) || h3.K1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[10];
        h3.R2(iArr, iArr3);
        p.g(iArr3, iArr2);
        int[] iArr4 = new int[10];
        h3.u2(iArr2, iArr, iArr4);
        p.g(iArr4, iArr2);
        int[] iArr5 = new int[5];
        int[] iArr6 = new int[10];
        h3.R2(iArr2, iArr6);
        p.g(iArr6, iArr5);
        int[] iArr7 = new int[10];
        h3.u2(iArr5, iArr, iArr7);
        p.g(iArr7, iArr5);
        int[] iArr8 = new int[5];
        int[] iArr9 = new int[10];
        h3.R2(iArr5, iArr9);
        p.g(iArr9, iArr8);
        int[] iArr10 = new int[10];
        h3.u2(iArr8, iArr, iArr10);
        p.g(iArr10, iArr8);
        int[] iArr11 = new int[5];
        p.j(iArr8, 3, iArr11);
        int[] iArr12 = new int[10];
        h3.u2(iArr11, iArr5, iArr12);
        p.g(iArr12, iArr11);
        p.j(iArr11, 7, iArr8);
        int[] iArr13 = new int[10];
        h3.u2(iArr8, iArr11, iArr13);
        p.g(iArr13, iArr8);
        p.j(iArr8, 3, iArr11);
        int[] iArr14 = new int[10];
        h3.u2(iArr11, iArr5, iArr14);
        p.g(iArr14, iArr11);
        int[] iArr15 = new int[5];
        p.j(iArr11, 14, iArr15);
        int[] iArr16 = new int[10];
        h3.u2(iArr15, iArr8, iArr16);
        p.g(iArr16, iArr15);
        p.j(iArr15, 31, iArr8);
        int[] iArr17 = new int[10];
        h3.u2(iArr8, iArr15, iArr17);
        p.g(iArr17, iArr8);
        p.j(iArr8, 62, iArr15);
        int[] iArr18 = new int[10];
        h3.u2(iArr15, iArr8, iArr18);
        p.g(iArr18, iArr15);
        p.j(iArr15, 3, iArr8);
        int[] iArr19 = new int[10];
        h3.u2(iArr8, iArr5, iArr19);
        p.g(iArr19, iArr8);
        p.j(iArr8, 18, iArr8);
        int[] iArr20 = new int[10];
        h3.u2(iArr8, iArr11, iArr20);
        p.g(iArr20, iArr8);
        p.j(iArr8, 2, iArr8);
        int[] iArr21 = new int[10];
        h3.u2(iArr8, iArr, iArr21);
        p.g(iArr21, iArr8);
        p.j(iArr8, 3, iArr8);
        int[] iArr22 = new int[10];
        h3.u2(iArr8, iArr2, iArr22);
        p.g(iArr22, iArr8);
        p.j(iArr8, 6, iArr8);
        int[] iArr23 = new int[10];
        h3.u2(iArr8, iArr5, iArr23);
        p.g(iArr23, iArr8);
        p.j(iArr8, 2, iArr8);
        int[] iArr24 = new int[10];
        h3.u2(iArr8, iArr, iArr24);
        p.g(iArr24, iArr8);
        int[] iArr25 = new int[10];
        h3.R2(iArr8, iArr25);
        p.g(iArr25, iArr2);
        if (h3.E0(iArr, iArr2)) {
            return new q(iArr8);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[5];
        p.i(this.h, iArr);
        return new q(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[5];
        p.k(this.h, ((q) gVar).h, iArr);
        return new q(iArr);
    }

    public boolean s() {
        return h3.V0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.m3(this.h);
    }
}
