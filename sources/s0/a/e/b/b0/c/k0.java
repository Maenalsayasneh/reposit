package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.util.Random;
import s0.a.e.b.g;
import s0.a.g.k.d;

public class k0 extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    public int[] h;

    public k0() {
        this.h = new int[7];
    }

    public k0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        int[] S0 = h3.S0(bigInteger);
        if (S0[6] == -1) {
            int[] iArr = j0.a;
            if (h3.j1(S0, iArr)) {
                long j = ((((long) S0[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
                S0[0] = (int) j;
                long j2 = ((((long) S0[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
                S0[1] = (int) j2;
                long j3 = ((((long) S0[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
                S0[2] = (int) j3;
                long j4 = ((((long) S0[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
                S0[3] = (int) j4;
                long j5 = ((((long) S0[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
                S0[4] = (int) j5;
                long j6 = ((((long) S0[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
                S0[5] = (int) j6;
                S0[6] = (int) (((((long) S0[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32));
            }
        }
        this.h = S0;
    }

    public k0(int[] iArr) {
        this.h = iArr;
    }

    public static void u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[14];
        h3.w2(iArr2, iArr, iArr5);
        j0.g(iArr5, iArr2);
        j0.k(iArr2, iArr2);
        int[] iArr6 = new int[14];
        h3.T2(iArr, iArr6);
        j0.g(iArr6, iArr4);
        j0.a(iArr3, iArr4, iArr);
        int[] iArr7 = new int[14];
        h3.w2(iArr3, iArr4, iArr7);
        j0.g(iArr7, iArr3);
        j0.h(h3.N2(7, iArr3, 2, 0), iArr3);
    }

    public g a(g gVar) {
        int[] iArr = new int[7];
        j0.a(this.h, ((k0) gVar).h, iArr);
        return new k0(iArr);
    }

    public g b() {
        int[] iArr = new int[7];
        j0.b(this.h, iArr);
        return new k0(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[7];
        h3.G(j0.a, ((k0) gVar).h, iArr);
        j0.e(iArr, this.h, iArr);
        return new k0(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        return h3.G0(this.h, ((k0) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[7];
        h3.G(j0.a, this.h, iArr);
        return new k0(iArr);
    }

    public boolean h() {
        return h3.M1(this.h);
    }

    public int hashCode() {
        return g.hashCode() ^ h3.o1(this.h, 0, 7);
    }

    public boolean i() {
        return h3.W1(this.h);
    }

    public g j(g gVar) {
        int[] iArr = new int[7];
        j0.e(this.h, ((k0) gVar).h, iArr);
        return new k0(iArr);
    }

    public g m() {
        int[] iArr = new int[7];
        j0.f(this.h, iArr);
        return new k0(iArr);
    }

    public g n() {
        boolean z;
        int[] iArr = this.h;
        if (h3.W1(iArr) || h3.M1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        j0.f(iArr, iArr2);
        int[] iArr3 = j0.a;
        int length = iArr3.length;
        Random random = new Random();
        int[] iArr4 = new int[length];
        int i = length - 1;
        int i2 = iArr3[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != length; i8++) {
                iArr4[i8] = random.nextInt();
            }
            iArr4[i] = iArr4[i] & i7;
        } while (h3.f1(length, iArr4, iArr3));
        int[] iArr5 = new int[7];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        h3.c0(iArr, iArr6);
        for (int i9 = 0; i9 < 7; i9++) {
            h3.c0(iArr6, iArr7);
            int i10 = 1 << i9;
            int[] iArr8 = new int[14];
            do {
                h3.T2(iArr6, iArr8);
                j0.g(iArr8, iArr6);
                i10--;
            } while (i10 > 0);
            int[] iArr9 = new int[14];
            h3.w2(iArr6, iArr7, iArr9);
            j0.g(iArr9, iArr6);
        }
        int i11 = 95;
        int[] iArr10 = new int[14];
        do {
            h3.T2(iArr6, iArr10);
            j0.g(iArr10, iArr6);
            i11--;
        } while (i11 > 0);
        if (!h3.M1(iArr6)) {
            return null;
        }
        while (true) {
            int[] iArr11 = new int[7];
            h3.c0(iArr4, iArr11);
            int[] iArr12 = new int[7];
            iArr12[0] = 1;
            int[] iArr13 = new int[7];
            h3.c0(iArr2, iArr13);
            int[] iArr14 = new int[7];
            int[] iArr15 = new int[7];
            for (int i12 = 0; i12 < 7; i12++) {
                h3.c0(iArr11, iArr14);
                h3.c0(iArr12, iArr15);
                int i13 = 1 << i12;
                while (true) {
                    i13--;
                    if (i13 < 0) {
                        break;
                    }
                    u(iArr11, iArr12, iArr13, iArr5);
                }
                int[] iArr16 = new int[14];
                h3.w2(iArr12, iArr15, iArr16);
                j0.g(iArr16, iArr5);
                int[] iArr17 = new int[14];
                h3.w2(iArr5, iArr2, iArr17);
                j0.g(iArr17, iArr5);
                int[] iArr18 = new int[14];
                h3.w2(iArr11, iArr14, iArr18);
                j0.g(iArr18, iArr13);
                j0.a(iArr13, iArr5, iArr13);
                int[] iArr19 = new int[14];
                h3.w2(iArr11, iArr15, iArr19);
                j0.g(iArr19, iArr5);
                h3.c0(iArr13, iArr11);
                int[] iArr20 = new int[14];
                h3.w2(iArr12, iArr14, iArr20);
                j0.g(iArr20, iArr12);
                j0.a(iArr12, iArr5, iArr12);
                int[] iArr21 = new int[14];
                h3.T2(iArr12, iArr21);
                j0.g(iArr21, iArr13);
                int[] iArr22 = new int[14];
                h3.w2(iArr13, iArr2, iArr22);
                j0.g(iArr22, iArr13);
            }
            int[] iArr23 = new int[7];
            int[] iArr24 = new int[7];
            int i14 = 1;
            while (true) {
                if (i14 >= 96) {
                    z = false;
                    break;
                }
                h3.c0(iArr11, iArr23);
                h3.c0(iArr12, iArr24);
                u(iArr11, iArr12, iArr13, iArr5);
                if (h3.W1(iArr11)) {
                    h3.G(j0.a, iArr24, iArr5);
                    int[] iArr25 = new int[14];
                    h3.w2(iArr5, iArr23, iArr25);
                    j0.g(iArr25, iArr5);
                    z = true;
                    break;
                }
                i14++;
            }
            if (z) {
                break;
            }
            j0.b(iArr4, iArr4);
        }
        int[] iArr26 = new int[14];
        h3.T2(iArr5, iArr26);
        j0.g(iArr26, iArr4);
        if (h3.G0(iArr, iArr4)) {
            return new k0(iArr5);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[7];
        j0.i(this.h, iArr);
        return new k0(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[7];
        j0.j(this.h, ((k0) gVar).h, iArr);
        return new k0(iArr);
    }

    public boolean s() {
        return h3.X0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.o3(this.h);
    }
}
