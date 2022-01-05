package s0.a.e.d;

import s0.a.e.b.b0.c.h3;

public class a {
    public static long a(int i) {
        int A = h3.A(h3.A(h3.A(h3.A(i, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1);
        return ((((long) (A >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) A));
    }

    public static void b(long[] jArr, int i, int i2, long[] jArr2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            long B = h3.B(h3.B(h3.B(h3.B(h3.B(jArr[i + i4], 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
            jArr2[i3] = B & 6148914691236517205L;
            jArr2[i3 + 1] = (B >>> 1) & 6148914691236517205L;
            i3 += 2;
        }
    }

    public static void c(long j, long[] jArr, int i) {
        long B = h3.B(h3.B(h3.B(h3.B(h3.B(j, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = B & -6148914691236517206L;
        jArr[i + 1] = (B << 1) & -6148914691236517206L;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr3;
        h3.v2(iArr, iArr2, iArr3);
        long j = ((long) iArr2[6]) & 4294967295L;
        long j2 = ((long) iArr2[7]) & 4294967295L;
        long j3 = ((long) iArr2[8]) & 4294967295L;
        long j4 = ((long) iArr2[9]) & 4294967295L;
        long j5 = ((long) iArr2[10]) & 4294967295L;
        long j6 = ((long) iArr2[11]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = (j7 * j) + 0;
        long j9 = j;
        int i = 12;
        iArr4[12] = (int) j8;
        long j10 = (j7 * j2) + (j8 >>> 32);
        iArr4[13] = (int) j10;
        long j11 = (j7 * j3) + (j10 >>> 32);
        iArr4[14] = (int) j11;
        long j12 = (j7 * j4) + (j11 >>> 32);
        iArr4[15] = (int) j12;
        long j13 = (j7 * j5) + (j12 >>> 32);
        iArr4[16] = (int) j13;
        long j14 = (j7 * j6) + (j13 >>> 32);
        iArr4[17] = (int) j14;
        iArr4[18] = (int) (j14 >>> 32);
        int i2 = 1;
        int i3 = 12;
        int i4 = 1;
        while (i4 < 6) {
            i3 += i2;
            long j15 = ((long) iArr[6 + i4]) & 4294967295L;
            int i5 = i3 + 0;
            long j16 = (j15 * j9) + (((long) iArr4[i5]) & 4294967295L) + 0;
            iArr4[i5] = (int) j16;
            int i6 = i3 + 1;
            long j17 = (j15 * j2) + (((long) iArr4[i6]) & 4294967295L) + (j16 >>> 32);
            iArr4[i6] = (int) j17;
            int i7 = i3 + 2;
            long j18 = (j15 * j3) + (((long) iArr4[i7]) & 4294967295L) + (j17 >>> 32);
            iArr4[i7] = (int) j18;
            int i8 = i3 + 3;
            long j19 = (j15 * j4) + (((long) iArr4[i8]) & 4294967295L) + (j18 >>> 32);
            iArr4[i8] = (int) j19;
            int i9 = i3 + 4;
            long j20 = (j15 * j5) + (((long) iArr4[i9]) & 4294967295L) + (j19 >>> 32);
            iArr4[i9] = (int) j20;
            int i10 = i3 + 5;
            long j21 = (j15 * j6) + (((long) iArr4[i10]) & 4294967295L) + (j20 >>> 32);
            iArr4[i10] = (int) j21;
            iArr4[i3 + 6] = (int) (j21 >>> 32);
            i4++;
            j2 = j2;
            i = 12;
            i2 = 1;
        }
        int i11 = i;
        int t = h3.t(iArr4, 6, iArr4, i11);
        int r = h3.r(iArr4, 18, iArr4, i11, h3.r(iArr4, 0, iArr4, 6, 0) + t) + t;
        int[] iArr5 = new int[6];
        int[] iArr6 = new int[6];
        int i12 = i11;
        boolean z = h3.z0(iArr, 6, iArr, 0, iArr5, 0) != h3.z0(iArr2, 6, iArr2, 0, iArr6, 0);
        int[] iArr7 = new int[i12];
        h3.v2(iArr5, iArr6, iArr7);
        h3.v(24, r + (z ? h3.p(i12, iArr7, 0, iArr4, 6) : h3.f3(i12, iArr7, 0, iArr4, 6)), iArr4, 18);
    }

    public static void e(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        h3.S2(iArr, iArr2);
        int i = 6;
        long j = ((long) iArr[6]) & 4294967295L;
        int i2 = 12;
        int i3 = 0;
        int i4 = 5;
        int i5 = 12;
        while (true) {
            int i6 = i4 - 1;
            long j2 = ((long) iArr[i4 + i]) & 4294967295L;
            long j3 = j2 * j2;
            int i7 = i2 - 1;
            iArr3[i5 + i7] = (i3 << 31) | ((int) (j3 >>> 33));
            i2 = i7 - 1;
            iArr3[i5 + i2] = (int) (j3 >>> 1);
            int i8 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                iArr3[12] = (int) j4;
                long j5 = ((long) iArr[7]) & 4294967295L;
                long j6 = (j5 * j) + ((((long) (i8 << 31)) & 4294967295L) | (j4 >>> 33));
                int i9 = (int) j6;
                iArr3[13] = (1 & ((int) (j4 >>> 32))) | (i9 << 1);
                int i10 = i9 >>> 31;
                long j7 = (((long) iArr3[14]) & 4294967295L) + (j6 >>> 32);
                long j8 = ((long) iArr[8]) & 4294967295L;
                long j9 = ((long) iArr3[15]) & 4294967295L;
                long j10 = 4294967295L & ((long) iArr3[16]);
                long j11 = (j8 * j) + j7;
                int i11 = (int) j11;
                iArr3[14] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long J = i0.d.a.a.a.J(j8, j5, j11 >>> 32, j9);
                long j12 = j10 + (J >>> 32);
                long j13 = ((long) iArr[9]) & 4294967295L;
                int[] iArr4 = iArr2;
                long j14 = (((long) iArr4[17]) & 4294967295L) + (j12 >>> 32);
                long j15 = j8;
                long j16 = j14 & 4294967295L;
                long j17 = (j13 * j) + (J & 4294967295L);
                int i13 = (int) j17;
                iArr4[15] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                int[] iArr5 = iArr4;
                long J2 = i0.d.a.a.a.J(j13, j5, j17 >>> 32, j12 & 4294967295L);
                long J3 = i0.d.a.a.a.J(j13, j15, J2 >>> 32, j16);
                long j18 = (((long) iArr4[18]) & 4294967295L) + (j14 >>> 32) + (J3 >>> 32);
                long j19 = J3 & 4294967295L;
                long j20 = ((long) iArr[10]) & 4294967295L;
                long j21 = (((long) iArr5[19]) & 4294967295L) + (j18 >>> 32);
                long j22 = j18 & 4294967295L;
                long j23 = (((long) iArr5[20]) & 4294967295L) + (j21 >>> 32);
                long j24 = j21 & 4294967295L;
                long j25 = (j20 * j) + (J2 & 4294967295L);
                int i15 = (int) j25;
                iArr5[16] = i14 | (i15 << 1);
                long J4 = i0.d.a.a.a.J(j20, j5, j25 >>> 32, j19);
                long J5 = i0.d.a.a.a.J(j20, j15, J4 >>> 32, j22);
                long j26 = j13;
                long J6 = i0.d.a.a.a.J(j20, j26, J5 >>> 32, j24);
                long j27 = J5 & 4294967295L;
                long j28 = j23 + (J6 >>> 32);
                long j29 = ((long) iArr[11]) & 4294967295L;
                long j30 = (((long) iArr5[21]) & 4294967295L) + (j28 >>> 32);
                long j31 = j28 & 4294967295L;
                long j32 = (((long) iArr5[22]) & 4294967295L) + (j30 >>> 32);
                long j33 = j30 & 4294967295L;
                long j34 = (j * j29) + (J4 & 4294967295L);
                int i16 = (int) j34;
                iArr5[17] = (i15 >>> 31) | (i16 << 1);
                int i17 = i16 >>> 31;
                long J7 = i0.d.a.a.a.J(j29, j5, j34 >>> 32, j27);
                long J8 = i0.d.a.a.a.J(j29, j15, J7 >>> 32, J6 & 4294967295L);
                long J9 = i0.d.a.a.a.J(j29, j26, J8 >>> 32, j31);
                long J10 = i0.d.a.a.a.J(j29, j20, J9 >>> 32, j33);
                long j35 = j32 + (J10 >>> 32);
                int i18 = (int) J7;
                iArr5[18] = (i18 << 1) | i17;
                int i19 = (int) J8;
                iArr5[19] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) J9;
                iArr5[20] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) J10;
                iArr5[21] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j35;
                iArr5[22] = i24 | (i25 << 1);
                iArr5[23] = (i25 >>> 31) | ((iArr5[23] + ((int) (j35 >>> 32))) << 1);
                int t = h3.t(iArr5, 6, iArr5, 12);
                int r = h3.r(iArr5, 18, iArr5, 12, h3.r(iArr5, 0, iArr5, 6, 0) + t) + t;
                int[] iArr6 = new int[6];
                int[] iArr7 = iArr5;
                h3.z0(iArr, 6, iArr, 0, iArr6, 0);
                int[] iArr8 = new int[12];
                h3.S2(iArr6, iArr8);
                h3.v(24, h3.f3(12, iArr8, 0, iArr7, 6) + r, iArr7, 18);
                return;
            }
            i = 6;
            i3 = i8;
            i5 = 12;
            iArr3 = iArr3;
            i4 = i6;
        }
    }

    public static long f(long j) {
        return h3.B(h3.B(h3.B(h3.B(h3.B(j, 2459565876494606882L, 1), 868082074056920076L, 2), 67555025218437360L, 4), 280375465148160L, 8), 4294901760L, 16);
    }
}
