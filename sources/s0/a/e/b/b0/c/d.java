package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.g;

public class d extends g.b {
    public static final BigInteger g = new BigInteger(1, s0.a.g.k.d.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    public int[] h;

    public d() {
        this.h = new int[4];
    }

    public d(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        } else if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        } else {
            int[] iArr = new int[4];
            for (int i = 0; i < 4; i++) {
                iArr[i] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
            }
            if ((iArr[3] >>> 1) >= 2147483646) {
                int[] iArr2 = c.a;
                if (h3.g1(iArr, iArr2)) {
                    long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
                    iArr[0] = (int) j;
                    long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
                    iArr[1] = (int) j2;
                    long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
                    iArr[2] = (int) j3;
                    iArr[3] = (int) (((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32));
                }
            }
            this.h = iArr;
        }
    }

    public d(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[4];
        c.a(this.h, ((d) gVar).h, iArr);
        return new d(iArr);
    }

    public g b() {
        int[] iArr = new int[4];
        if (h3.y1(4, this.h, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && h3.g1(iArr, c.a))) {
            c.b(iArr);
        }
        return new d(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[4];
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
        return h3.D0(this.h, ((d) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[4];
        h3.G(c.a, this.h, iArr);
        return new d(iArr);
    }

    public boolean h() {
        return h3.J1(this.h);
    }

    public int hashCode() {
        return g.hashCode() ^ h3.o1(this.h, 0, 4);
    }

    public boolean i() {
        return h3.T1(this.h);
    }

    public g j(g gVar) {
        int[] iArr = new int[4];
        c.d(this.h, ((d) gVar).h, iArr);
        return new d(iArr);
    }

    public g m() {
        int[] iArr = new int[4];
        int[] iArr2 = this.h;
        if (c.c(iArr2) != 0) {
            int[] iArr3 = c.a;
            h3.Y2(iArr3, iArr3, iArr);
        } else {
            h3.Y2(c.a, iArr2, iArr);
        }
        return new d(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.T1(iArr) || h3.J1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[8];
        h3.Q2(iArr, iArr3);
        c.e(iArr3, iArr2);
        int[] iArr4 = new int[8];
        h3.t2(iArr2, iArr, iArr4);
        c.e(iArr4, iArr2);
        int[] iArr5 = new int[4];
        c.h(iArr2, 2, iArr5);
        int[] iArr6 = new int[8];
        h3.t2(iArr5, iArr2, iArr6);
        c.e(iArr6, iArr5);
        int[] iArr7 = new int[4];
        c.h(iArr5, 4, iArr7);
        int[] iArr8 = new int[8];
        h3.t2(iArr7, iArr5, iArr8);
        c.e(iArr8, iArr7);
        c.h(iArr7, 2, iArr5);
        int[] iArr9 = new int[8];
        h3.t2(iArr5, iArr2, iArr9);
        c.e(iArr9, iArr5);
        c.h(iArr5, 10, iArr2);
        int[] iArr10 = new int[8];
        h3.t2(iArr2, iArr5, iArr10);
        c.e(iArr10, iArr2);
        c.h(iArr2, 10, iArr7);
        int[] iArr11 = new int[8];
        h3.t2(iArr7, iArr5, iArr11);
        c.e(iArr11, iArr7);
        int[] iArr12 = new int[8];
        h3.Q2(iArr7, iArr12);
        c.e(iArr12, iArr5);
        int[] iArr13 = new int[8];
        h3.t2(iArr5, iArr, iArr13);
        c.e(iArr13, iArr5);
        c.h(iArr5, 95, iArr5);
        int[] iArr14 = new int[8];
        h3.Q2(iArr5, iArr14);
        c.e(iArr14, iArr7);
        if (h3.D0(iArr, iArr7)) {
            return new d(iArr5);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[4];
        c.g(this.h, iArr);
        return new d(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[4];
        c.i(this.h, ((d) gVar).h, iArr);
        return new d(iArr);
    }

    public boolean s() {
        return (this.h[0] & 1) == 1;
    }

    public BigInteger t() {
        int[] iArr = this.h;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h3.B1(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
