package s0.a.e.b.b0.b;

import java.math.BigInteger;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.g;

public class d extends g.b {
    public static final BigInteger g = new BigInteger(1, s0.a.g.k.d.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    public int[] h;

    public d() {
        this.h = new int[8];
    }

    public d(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        int[] T0 = h3.T0(bigInteger);
        if ((T0[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = c.a;
            if (h3.k1(T0, iArr)) {
                h3.j3(iArr, T0);
            }
        }
        this.h = T0;
    }

    public d(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[8];
        c.a(this.h, ((d) gVar).h, iArr);
        return new d(iArr);
    }

    public g b() {
        int[] iArr = new int[8];
        if (h3.y1(8, this.h, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && h3.k1(iArr, c.a))) {
            c.b(iArr);
        }
        return new d(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[8];
        h3.G(c.a, ((d) gVar).h, iArr);
        c.d(iArr, this.h, iArr);
        return new d(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return h3.H0(this.h, ((d) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[8];
        h3.G(c.a, this.h, iArr);
        return new d(iArr);
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
        c.d(this.h, ((d) gVar).h, iArr);
        return new d(iArr);
    }

    public g m() {
        int[] iArr = new int[8];
        int[] iArr2 = this.h;
        if (c.c(iArr2) != 0) {
            int[] iArr3 = c.a;
            h3.e3(iArr3, iArr3, iArr);
        } else {
            h3.e3(c.a, iArr2, iArr);
        }
        return new d(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.X1(iArr) || h3.N1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[16];
        h3.U2(iArr, iArr3);
        c.e(iArr3, iArr2);
        int[] iArr4 = new int[16];
        h3.x2(iArr2, iArr, iArr4);
        c.e(iArr4, iArr2);
        int[] iArr5 = new int[8];
        c.h(iArr2, 2, iArr5);
        int[] iArr6 = new int[16];
        h3.x2(iArr5, iArr2, iArr6);
        c.e(iArr6, iArr5);
        int[] iArr7 = new int[8];
        c.h(iArr5, 2, iArr7);
        int[] iArr8 = new int[16];
        h3.x2(iArr7, iArr2, iArr8);
        c.e(iArr8, iArr7);
        c.h(iArr7, 6, iArr2);
        int[] iArr9 = new int[16];
        h3.x2(iArr2, iArr7, iArr9);
        c.e(iArr9, iArr2);
        int[] iArr10 = new int[8];
        c.h(iArr2, 12, iArr10);
        int[] iArr11 = new int[16];
        h3.x2(iArr10, iArr2, iArr11);
        c.e(iArr11, iArr10);
        c.h(iArr10, 6, iArr2);
        int[] iArr12 = new int[16];
        h3.x2(iArr2, iArr7, iArr12);
        c.e(iArr12, iArr2);
        int[] iArr13 = new int[16];
        h3.U2(iArr2, iArr13);
        c.e(iArr13, iArr7);
        int[] iArr14 = new int[16];
        h3.x2(iArr7, iArr, iArr14);
        c.e(iArr14, iArr7);
        c.h(iArr7, 31, iArr10);
        int[] iArr15 = new int[16];
        h3.x2(iArr10, iArr7, iArr15);
        c.e(iArr15, iArr2);
        c.h(iArr10, 32, iArr10);
        int[] iArr16 = new int[16];
        h3.x2(iArr10, iArr2, iArr16);
        c.e(iArr16, iArr10);
        c.h(iArr10, 62, iArr10);
        int[] iArr17 = new int[16];
        h3.x2(iArr10, iArr2, iArr17);
        c.e(iArr17, iArr10);
        c.h(iArr10, 4, iArr10);
        int[] iArr18 = new int[16];
        h3.x2(iArr10, iArr5, iArr18);
        c.e(iArr18, iArr10);
        c.h(iArr10, 32, iArr10);
        int[] iArr19 = new int[16];
        h3.x2(iArr10, iArr, iArr19);
        c.e(iArr19, iArr10);
        c.h(iArr10, 62, iArr10);
        int[] iArr20 = new int[16];
        h3.U2(iArr10, iArr20);
        c.e(iArr20, iArr5);
        if (h3.H0(iArr, iArr5)) {
            return new d(iArr10);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[8];
        c.g(this.h, iArr);
        return new d(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[8];
        c.i(this.h, ((d) gVar).h, iArr);
        return new d(iArr);
    }

    public boolean s() {
        return h3.Y0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.p3(this.h);
    }
}
