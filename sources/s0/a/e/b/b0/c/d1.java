package s0.a.e.b.b0.c;

import androidx.core.app.FrameMetricsAggregator;
import i0.d.a.a.a;

public class d1 {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, FrameMetricsAggregator.EVERY_DURATION};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int c = h3.c(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (c > 511 || (c == 511 && h3.C0(16, iArr3, a))) {
            c = (h3.x1(16, iArr3) + c) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr3[16] = c;
    }

    public static void b(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        h3.U2(iArr, iArr2);
        int i = 8;
        long j = ((long) iArr[8]) & 4294967295L;
        int i2 = 16;
        int i3 = 0;
        int i4 = 7;
        int i5 = 16;
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
                iArr3[16] = (int) j4;
                long j5 = ((long) iArr[9]) & 4294967295L;
                long j6 = (j5 * j) + ((((long) (i8 << 31)) & 4294967295L) | (j4 >>> 33));
                int i9 = (int) j6;
                iArr3[17] = (1 & ((int) (j4 >>> 32))) | (i9 << 1);
                int i10 = i9 >>> 31;
                long j7 = (((long) iArr3[18]) & 4294967295L) + (j6 >>> 32);
                long j8 = ((long) iArr[10]) & 4294967295L;
                long j9 = ((long) iArr3[19]) & 4294967295L;
                long j10 = ((long) iArr3[20]) & 4294967295L;
                long j11 = (j8 * j) + j7;
                int i11 = (int) j11;
                iArr3[18] = i10 | (i11 << 1);
                long J = a.J(j8, j5, j11 >>> 32, j9);
                long j12 = j10 + (J >>> 32);
                long j13 = ((long) iArr[11]) & 4294967295L;
                long j14 = (((long) iArr3[21]) & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = j8;
                long j17 = (((long) iArr3[22]) & 4294967295L) + (j14 >>> 32);
                long j18 = j14 & 4294967295L;
                long j19 = (j13 * j) + (J & 4294967295L);
                int i12 = (int) j19;
                iArr3[19] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long J2 = a.J(j13, j5, j19 >>> 32, j15);
                long J3 = a.J(j13, j16, J2 >>> 32, j18);
                long j20 = j17 + (J3 >>> 32);
                long j21 = J3 & 4294967295L;
                long j22 = ((long) iArr[12]) & 4294967295L;
                long j23 = (((long) iArr3[23]) & 4294967295L) + (j20 >>> 32);
                long j24 = j20 & 4294967295L;
                long j25 = (((long) iArr3[24]) & 4294967295L) + (j23 >>> 32);
                long j26 = (j22 * j) + (J2 & 4294967295L);
                int i14 = (int) j26;
                iArr3[20] = i13 | (i14 << 1);
                long J4 = a.J(j22, j5, j26 >>> 32, j21);
                long J5 = a.J(j22, j16, J4 >>> 32, j24);
                long j27 = j13;
                long J6 = a.J(j22, j27, J5 >>> 32, j23 & 4294967295L);
                long j28 = J5 & 4294967295L;
                long j29 = j25 + (J6 >>> 32);
                long j30 = ((long) iArr[13]) & 4294967295L;
                long j31 = (((long) iArr3[25]) & 4294967295L) + (j29 >>> 32);
                long j32 = j29 & 4294967295L;
                long j33 = (((long) iArr3[26]) & 4294967295L) + (j31 >>> 32);
                long j34 = j31 & 4294967295L;
                long j35 = (j30 * j) + (J4 & 4294967295L);
                int i15 = (int) j35;
                iArr3[21] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                long J7 = a.J(j30, j5, j35 >>> 32, j28);
                long J8 = a.J(j30, j16, J7 >>> 32, J6 & 4294967295L);
                long J9 = a.J(j30, j27, J8 >>> 32, j32);
                long j36 = J8 & 4294967295L;
                long J10 = a.J(j30, j22, J9 >>> 32, j34);
                long j37 = j33 + (J10 >>> 32);
                long j38 = J10 & 4294967295L;
                long j39 = ((long) iArr[14]) & 4294967295L;
                long j40 = (((long) iArr3[27]) & 4294967295L) + (j37 >>> 32);
                long j41 = j37 & 4294967295L;
                long j42 = (((long) iArr3[28]) & 4294967295L) + (j40 >>> 32);
                long j43 = j40 & 4294967295L;
                long j44 = (j39 * j) + (J7 & 4294967295L);
                int i17 = (int) j44;
                iArr3[22] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                long J11 = a.J(j39, j5, j44 >>> 32, j36);
                long J12 = a.J(j39, j16, J11 >>> 32, J9 & 4294967295L);
                long J13 = a.J(j39, j13, J12 >>> 32, j38);
                long j45 = J12 & 4294967295L;
                long J14 = a.J(j39, j22, J13 >>> 32, j41);
                long j46 = J13 & 4294967295L;
                long J15 = a.J(j39, j30, J14 >>> 32, j43);
                long j47 = J14 & 4294967295L;
                long j48 = j42 + (J15 >>> 32);
                long j49 = ((long) iArr[15]) & 4294967295L;
                long j50 = (((long) iArr3[29]) & 4294967295L) + (j48 >>> 32);
                long j51 = j48 & 4294967295L;
                long j52 = (((long) iArr3[30]) & 4294967295L) + (j50 >>> 32);
                long j53 = j50 & 4294967295L;
                long j54 = (j * j49) + (J11 & 4294967295L);
                int i19 = (int) j54;
                iArr3[23] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                long J16 = a.J(j49, j5, j54 >>> 32, j45);
                long J17 = a.J(j49, j16, J16 >>> 32, j46);
                long J18 = a.J(j49, j13, J17 >>> 32, j47);
                long J19 = a.J(j49, j22, J18 >>> 32, J15 & 4294967295L);
                long J20 = a.J(j49, j30, J19 >>> 32, j51);
                long j55 = J20;
                long J21 = a.J(j49, j39, J20 >>> 32, j53);
                long j56 = j52 + (J21 >>> 32);
                int i21 = (int) J16;
                iArr3[24] = i20 | (i21 << 1);
                int i22 = (int) J17;
                iArr3[25] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) J18;
                iArr3[26] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) J19;
                iArr3[27] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j55;
                iArr3[28] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) J21;
                iArr3[29] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) j56;
                iArr3[30] = i31 | (i32 << 1);
                iArr3[31] = (i32 >>> 31) | ((iArr3[31] + ((int) (j56 >>> 32))) << 1);
                int u = h3.u(iArr3, 8, iArr3, 16);
                int s = h3.s(iArr3, 24, iArr3, 16, h3.s(iArr3, 0, iArr3, 8, 0) + u) + u;
                int[] iArr4 = new int[8];
                h3.A0(iArr, 8, iArr, 0, iArr4, 0);
                int[] iArr5 = new int[16];
                h3.U2(iArr4, iArr5);
                h3.v(32, h3.f3(16, iArr5, 0, iArr3, 8) + s, iArr3, 24);
                int i33 = iArr[16];
                iArr3[32] = (i33 * i33) + h3.C2(16, i33 << 1, iArr, 0, iArr2, 16);
                return;
            }
            i3 = i8;
            i5 = 16;
            i = 8;
            i4 = i6;
        }
    }

    public static int c(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 17; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int[] iArr6 = new int[33];
        h3.x2(iArr4, iArr5, iArr6);
        long j = ((long) iArr5[8]) & 4294967295L;
        long j2 = ((long) iArr5[9]) & 4294967295L;
        long j3 = ((long) iArr5[10]) & 4294967295L;
        long j4 = ((long) iArr5[11]) & 4294967295L;
        long j5 = ((long) iArr5[12]) & 4294967295L;
        long j6 = ((long) iArr5[13]) & 4294967295L;
        long j7 = ((long) iArr5[14]) & 4294967295L;
        long j8 = ((long) iArr5[15]) & 4294967295L;
        long j9 = ((long) iArr4[8]) & 4294967295L;
        long j10 = 0;
        long j11 = (j9 * j) + 0;
        long j12 = j;
        iArr6[16] = (int) j11;
        char c = ' ';
        long j13 = (j9 * j2) + (j11 >>> 32);
        iArr6[17] = (int) j13;
        long j14 = (j9 * j3) + (j13 >>> 32);
        iArr6[18] = (int) j14;
        long j15 = (j9 * j4) + (j14 >>> 32);
        iArr6[19] = (int) j15;
        long j16 = (j9 * j5) + (j15 >>> 32);
        iArr6[20] = (int) j16;
        long j17 = (j9 * j6) + (j16 >>> 32);
        iArr6[21] = (int) j17;
        long j18 = (j9 * j7) + (j17 >>> 32);
        iArr6[22] = (int) j18;
        long j19 = (j9 * j8) + (j18 >>> 32);
        iArr6[23] = (int) j19;
        iArr6[24] = (int) (j19 >>> 32);
        int i = 1;
        int i2 = 1;
        int i3 = 16;
        while (i2 < 8) {
            int i4 = i3 + i;
            long j20 = ((long) iArr[i2 + 8]) & 4294967295L;
            int i5 = i4 + 0;
            long j21 = (j20 * j12) + (((long) iArr6[i5]) & 4294967295L) + 0;
            int i6 = i2;
            iArr6[i5] = (int) j21;
            int i7 = i4 + 1;
            long j22 = j2;
            long j23 = (j20 * j2) + (((long) iArr6[i7]) & 4294967295L) + (j21 >>> c);
            iArr6[i7] = (int) j23;
            int i8 = i4 + 2;
            long j24 = j3;
            long j25 = (j20 * j3) + (((long) iArr6[i8]) & 4294967295L) + (j23 >>> 32);
            iArr6[i8] = (int) j25;
            long j26 = j25 >>> 32;
            int i9 = i4 + 3;
            int i10 = i4;
            long j27 = (j20 * j4) + (((long) iArr6[i9]) & 4294967295L) + j26;
            iArr6[i9] = (int) j27;
            int i11 = i10 + 4;
            long j28 = (j20 * j5) + (((long) iArr6[i11]) & 4294967295L) + (j27 >>> 32);
            iArr6[i11] = (int) j28;
            int i12 = i10 + 5;
            long j29 = (j20 * j6) + (((long) iArr6[i12]) & 4294967295L) + (j28 >>> 32);
            iArr6[i12] = (int) j29;
            int i13 = i10 + 6;
            long j30 = (j20 * j7) + (((long) iArr6[i13]) & 4294967295L) + (j29 >>> 32);
            iArr6[i13] = (int) j30;
            long j31 = j30 >>> 32;
            int i14 = i10 + 7;
            long j32 = (j20 * j8) + (((long) iArr6[i14]) & 4294967295L) + j31;
            iArr6[i14] = (int) j32;
            iArr6[i10 + 8] = (int) (j32 >>> 32);
            i2 = i6 + 1;
            i3 = i10;
            j3 = j24;
            j2 = j22;
            i = 1;
            c = ' ';
        }
        int u = h3.u(iArr6, 8, iArr6, 16);
        int i15 = 0;
        int s = h3.s(iArr6, 24, iArr6, 16, h3.s(iArr6, 0, iArr6, 8, 0) + u) + u;
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean z = h3.A0(iArr, 8, iArr, 0, iArr7, 0) != h3.A0(iArr2, 8, iArr2, 0, iArr8, 0);
        int[] iArr9 = new int[16];
        h3.x2(iArr7, iArr8, iArr9);
        h3.v(32, s + (z ? h3.p(16, iArr9, 0, iArr6, 8) : h3.f3(16, iArr9, 0, iArr6, 8)), iArr6, 24);
        int i16 = iArr[16];
        int i17 = iArr2[16];
        long j33 = ((long) i16) & 4294967295L;
        long j34 = ((long) i17) & 4294967295L;
        while (true) {
            int i18 = 16 + i15;
            int[] iArr10 = iArr6;
            long j35 = ((((long) iArr[i15]) & 4294967295L) * j34) + ((((long) iArr2[i15]) & 4294967295L) * j33) + (((long) iArr6[i18]) & 4294967295L) + j10;
            iArr10[i18] = (int) j35;
            long j36 = j35 >>> 32;
            i15++;
            if (i15 >= 16) {
                iArr10[32] = (i16 * i17) + ((int) j36);
                e(iArr10, iArr3);
                return;
            }
            int[] iArr11 = iArr3;
            j10 = j36;
            iArr6 = iArr10;
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int i2 = i;
        int i3 = 16;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i4 = iArr[16 + i3];
            iArr2[i3 + 0] = (i2 << -9) | (i4 >>> 9);
            i2 = i4;
        }
        int q = h3.q(16, iArr, iArr2) + ((i2 << -9) >>> 23) + (i >>> 9);
        if (q > 511 || (q == 511 && h3.C0(16, iArr2, a))) {
            q = (h3.x1(16, iArr2) + q) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr2[16] = q;
    }

    public static void f(int[] iArr) {
        int i = iArr[16];
        int w = h3.w(16, i >>> 9, iArr) + (i & FrameMetricsAggregator.EVERY_DURATION);
        if (w > 511 || (w == 511 && h3.C0(16, iArr, a))) {
            w = (h3.x1(16, iArr) + w) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr[16] = w;
    }

    public static void g(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        b(iArr, iArr3);
        e(iArr3, iArr2);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        int W2 = (h3.W2(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (W2 < 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    i = -1;
                    break;
                }
                int i3 = iArr3[i2] - 1;
                iArr3[i2] = i3;
                if (i3 != -1) {
                    break;
                }
                i2++;
            }
            W2 = (W2 + i) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr3[16] = W2;
    }
}
