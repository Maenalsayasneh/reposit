package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.g.k.d;

public class a0 extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));
    public int[] h;

    public a0() {
        this.h = new int[6];
    }

    public a0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        int[] R0 = h3.R0(bigInteger);
        if (R0[5] == -1) {
            int[] iArr = z.a;
            if (h3.i1(R0, iArr)) {
                h3.i3(iArr, R0);
            }
        }
        this.h = R0;
    }

    public a0(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[6];
        z.a(this.h, ((a0) gVar).h, iArr);
        return new a0(iArr);
    }

    public g b() {
        int[] iArr = new int[6];
        if (h3.y1(6, this.h, iArr) != 0 || (iArr[5] == -1 && h3.i1(iArr, z.a))) {
            z.b(iArr);
        }
        return new a0(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[6];
        h3.G(z.a, ((a0) gVar).h, iArr);
        z.d(iArr, this.h, iArr);
        return new a0(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        return h3.F0(this.h, ((a0) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[6];
        h3.G(z.a, this.h, iArr);
        return new a0(iArr);
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
        z.d(this.h, ((a0) gVar).h, iArr);
        return new a0(iArr);
    }

    public g m() {
        int[] iArr = new int[6];
        int[] iArr2 = this.h;
        if (z.c(iArr2) != 0) {
            int[] iArr3 = z.a;
            h3.b3(iArr3, iArr3, iArr);
        } else {
            h3.b3(z.a, iArr2, iArr);
        }
        return new a0(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.V1(iArr) || h3.L1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        int[] iArr4 = new int[12];
        h3.S2(iArr, iArr4);
        z.e(iArr4, iArr2);
        int[] iArr5 = new int[12];
        h3.v2(iArr2, iArr, iArr5);
        z.e(iArr5, iArr2);
        z.h(iArr2, 2, iArr3);
        int[] iArr6 = new int[12];
        h3.v2(iArr3, iArr2, iArr6);
        z.e(iArr6, iArr3);
        z.h(iArr3, 4, iArr2);
        int[] iArr7 = new int[12];
        h3.v2(iArr2, iArr3, iArr7);
        z.e(iArr7, iArr2);
        z.h(iArr2, 8, iArr3);
        int[] iArr8 = new int[12];
        h3.v2(iArr3, iArr2, iArr8);
        z.e(iArr8, iArr3);
        z.h(iArr3, 16, iArr2);
        int[] iArr9 = new int[12];
        h3.v2(iArr2, iArr3, iArr9);
        z.e(iArr9, iArr2);
        z.h(iArr2, 32, iArr3);
        int[] iArr10 = new int[12];
        h3.v2(iArr3, iArr2, iArr10);
        z.e(iArr10, iArr3);
        z.h(iArr3, 64, iArr2);
        int[] iArr11 = new int[12];
        h3.v2(iArr2, iArr3, iArr11);
        z.e(iArr11, iArr2);
        z.h(iArr2, 62, iArr2);
        int[] iArr12 = new int[12];
        h3.S2(iArr2, iArr12);
        z.e(iArr12, iArr3);
        if (h3.F0(iArr, iArr3)) {
            return new a0(iArr2);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[6];
        z.g(this.h, iArr);
        return new a0(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[6];
        z.i(this.h, ((a0) gVar).h, iArr);
        return new a0(iArr);
    }

    public boolean s() {
        return h3.W0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.n3(this.h);
    }
}
