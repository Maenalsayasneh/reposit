package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.g.k.d;

public class f0 extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    public static final int[] h = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    public int[] i;

    public f0() {
        this.i = new int[7];
    }

    public f0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        int[] S0 = h3.S0(bigInteger);
        if (S0[6] == -1 && h3.j1(S0, e0.a)) {
            h3.h(7, 6803, S0);
        }
        this.i = S0;
    }

    public f0(int[] iArr) {
        this.i = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[7];
        if (h3.f(this.i, ((f0) gVar).i, iArr) != 0 || (iArr[6] == -1 && h3.j1(iArr, e0.a))) {
            h3.h(7, 6803, iArr);
        }
        return new f0(iArr);
    }

    public g b() {
        int[] iArr = new int[7];
        if (h3.y1(7, this.i, iArr) != 0 || (iArr[6] == -1 && h3.j1(iArr, e0.a))) {
            h3.h(7, 6803, iArr);
        }
        return new f0(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[7];
        h3.G(e0.a, ((f0) gVar).i, iArr);
        e0.b(iArr, this.i, iArr);
        return new f0(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        return h3.G0(this.i, ((f0) obj).i);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[7];
        h3.G(e0.a, this.i, iArr);
        return new f0(iArr);
    }

    public boolean h() {
        return h3.M1(this.i);
    }

    public int hashCode() {
        return g.hashCode() ^ h3.o1(this.i, 0, 7);
    }

    public boolean i() {
        return h3.W1(this.i);
    }

    public g j(g gVar) {
        int[] iArr = new int[7];
        e0.b(this.i, ((f0) gVar).i, iArr);
        return new f0(iArr);
    }

    public g m() {
        int[] iArr = new int[7];
        int[] iArr2 = this.i;
        if (e0.a(iArr2) != 0) {
            int[] iArr3 = e0.a;
            h3.c3(iArr3, iArr3, iArr);
        } else {
            h3.c3(e0.a, iArr2, iArr);
        }
        return new f0(iArr);
    }

    public g n() {
        int[] iArr = this.i;
        if (h3.W1(iArr) || h3.M1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[14];
        h3.T2(iArr, iArr3);
        e0.c(iArr3, iArr2);
        int[] iArr4 = new int[14];
        h3.w2(iArr2, iArr, iArr4);
        e0.c(iArr4, iArr2);
        int[] iArr5 = new int[14];
        h3.T2(iArr2, iArr5);
        e0.c(iArr5, iArr2);
        int[] iArr6 = new int[14];
        h3.w2(iArr2, iArr, iArr6);
        e0.c(iArr6, iArr2);
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[14];
        h3.T2(iArr2, iArr8);
        e0.c(iArr8, iArr7);
        int[] iArr9 = new int[14];
        h3.w2(iArr7, iArr, iArr9);
        e0.c(iArr9, iArr7);
        int[] iArr10 = new int[7];
        e0.f(iArr7, 4, iArr10);
        int[] iArr11 = new int[14];
        h3.w2(iArr10, iArr7, iArr11);
        e0.c(iArr11, iArr10);
        int[] iArr12 = new int[7];
        e0.f(iArr10, 3, iArr12);
        int[] iArr13 = new int[14];
        h3.w2(iArr12, iArr2, iArr13);
        e0.c(iArr13, iArr12);
        e0.f(iArr12, 8, iArr12);
        int[] iArr14 = new int[14];
        h3.w2(iArr12, iArr10, iArr14);
        e0.c(iArr14, iArr12);
        e0.f(iArr12, 4, iArr10);
        int[] iArr15 = new int[14];
        h3.w2(iArr10, iArr7, iArr15);
        e0.c(iArr15, iArr10);
        e0.f(iArr10, 19, iArr7);
        int[] iArr16 = new int[14];
        h3.w2(iArr7, iArr12, iArr16);
        e0.c(iArr16, iArr7);
        int[] iArr17 = new int[7];
        e0.f(iArr7, 42, iArr17);
        int[] iArr18 = new int[14];
        h3.w2(iArr17, iArr7, iArr18);
        e0.c(iArr18, iArr17);
        e0.f(iArr17, 23, iArr7);
        int[] iArr19 = new int[14];
        h3.w2(iArr7, iArr10, iArr19);
        e0.c(iArr19, iArr7);
        e0.f(iArr7, 84, iArr10);
        int[] iArr20 = new int[14];
        h3.w2(iArr10, iArr17, iArr20);
        e0.c(iArr20, iArr10);
        e0.f(iArr10, 20, iArr10);
        int[] iArr21 = new int[14];
        h3.w2(iArr10, iArr12, iArr21);
        e0.c(iArr21, iArr10);
        e0.f(iArr10, 3, iArr10);
        int[] iArr22 = new int[14];
        h3.w2(iArr10, iArr, iArr22);
        e0.c(iArr22, iArr10);
        e0.f(iArr10, 2, iArr10);
        int[] iArr23 = new int[14];
        h3.w2(iArr10, iArr, iArr23);
        e0.c(iArr23, iArr10);
        e0.f(iArr10, 4, iArr10);
        int[] iArr24 = new int[14];
        h3.w2(iArr10, iArr2, iArr24);
        e0.c(iArr24, iArr10);
        int[] iArr25 = new int[14];
        h3.T2(iArr10, iArr25);
        e0.c(iArr25, iArr10);
        int[] iArr26 = new int[14];
        h3.T2(iArr10, iArr26);
        e0.c(iArr26, iArr17);
        if (h3.G0(iArr, iArr17)) {
            return new f0(iArr10);
        }
        e0.b(iArr10, h, iArr10);
        int[] iArr27 = new int[14];
        h3.T2(iArr10, iArr27);
        e0.c(iArr27, iArr17);
        if (h3.G0(iArr, iArr17)) {
            return new f0(iArr10);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[7];
        e0.e(this.i, iArr);
        return new f0(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[7];
        e0.g(this.i, ((f0) gVar).i, iArr);
        return new f0(iArr);
    }

    public boolean s() {
        return h3.X0(this.i, 0) == 1;
    }

    public BigInteger t() {
        return h3.o3(this.i);
    }
}
