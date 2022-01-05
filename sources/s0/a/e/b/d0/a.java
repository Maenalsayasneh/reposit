package s0.a.e.b.d0;

import s0.a.e.b.b0.c.h3;

public abstract class a {
    public static final int[] a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] b = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static void c(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = i3 + (i2 >> 26);
        int i11 = i5 + (i4 >> 26);
        int i12 = i8 + (i7 >> 26);
        int i13 = iArr[9] + (i9 >> 26);
        int i14 = (i4 & 67108863) + (i10 >> 25);
        int i15 = i6 + (i11 >> 25);
        int i16 = (i9 & 67108863) + (i12 >> 25);
        int i17 = ((i13 >> 25) * 38) + i;
        int i18 = (i2 & 67108863) + (i17 >> 26);
        int i19 = (i7 & 67108863) + (i15 >> 26);
        iArr[0] = i17 & 67108863;
        iArr[1] = i18 & 67108863;
        iArr[2] = (i10 & 33554431) + (i18 >> 26);
        iArr[3] = i14 & 67108863;
        iArr[4] = (i11 & 33554431) + (i14 >> 26);
        iArr[5] = i15 & 67108863;
        iArr[6] = i19 & 67108863;
        iArr[7] = (i12 & 33554431) + (i19 >> 26);
        iArr[8] = i16 & 67108863;
        iArr[9] = (i13 & 33554431) + (i16 >> 26);
    }

    public static void d(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = i3 + i4;
            int i6 = iArr2[i5];
            iArr2[i5] = i6 ^ ((iArr[i2 + i4] ^ i6) & i);
        }
    }

    public static void e(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void f(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void g(byte[] bArr, int i, int[] iArr) {
        i(bArr, i, iArr, 0);
        i(bArr, i + 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    public static void h(int[] iArr, int i, int[] iArr2) {
        j(iArr, i, iArr2, 0);
        j(iArr, i + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & 16777215;
    }

    public static void i(byte[] bArr, int i, int[] iArr, int i2) {
        int k = k(bArr, i + 0);
        int k2 = k(bArr, i + 4);
        int k3 = k(bArr, i + 8);
        int k4 = k(bArr, i + 12);
        iArr[i2 + 0] = k & 67108863;
        iArr[i2 + 1] = ((k >>> 26) | (k2 << 6)) & 67108863;
        iArr[i2 + 2] = ((k3 << 12) | (k2 >>> 20)) & 33554431;
        iArr[i2 + 3] = ((k4 << 19) | (k3 >>> 13)) & 67108863;
        iArr[i2 + 4] = k4 >>> 7;
    }

    public static void j(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i + 0];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2 + 0] = i3 & 67108863;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & 67108863;
        iArr2[i2 + 2] = ((i5 << 12) | (i4 >>> 20)) & 33554431;
        iArr2[i2 + 3] = ((i6 << 19) | (i5 >>> 13)) & 67108863;
        iArr2[i2 + 4] = i6 >>> 7;
    }

    public static int k(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static void l(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i + 0];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        n((i4 << 26) | i3, bArr, i2 + 0);
        n((i4 >>> 6) | (i5 << 20), bArr, i2 + 4);
        n((i5 >>> 12) | (i6 << 13), bArr, i2 + 8);
        n((i7 << 7) | (i6 >>> 19), bArr, i2 + 12);
    }

    public static void m(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i + 0];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2 + 0] = i3 | (i4 << 26);
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    public static void n(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void o(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[8];
        e(iArr, 0, iArr3, 0);
        t(iArr3);
        m(iArr3, 0, iArr4, 0);
        m(iArr3, 5, iArr4, 4);
        h3.r2(a, iArr4, iArr4);
        h(iArr4, 0, iArr2);
    }

    public static int p(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean q(int[] iArr) {
        return p(iArr) != 0;
    }

    public static void r(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        long j = (long) i;
        long j2 = ((long) i4) * j;
        long j3 = ((long) i6) * j;
        long j4 = ((long) i9) * j;
        long j5 = ((long) iArr[9]) * j;
        int i11 = ((int) j5) & 33554431;
        long j6 = (((long) i2) * j) + ((j5 >> 25) * 38);
        iArr2[0] = ((int) j6) & 67108863;
        long j7 = j4 >> 25;
        long j8 = (((long) i7) * j) + (j3 >> 25);
        iArr2[5] = ((int) j8) & 67108863;
        long j9 = j8 >> 26;
        long j10 = (((long) i3) * j) + (j6 >> 26);
        iArr2[1] = ((int) j10) & 67108863;
        long j11 = j10 >> 26;
        long j12 = (((long) i5) * j) + (j2 >> 25);
        iArr2[3] = ((int) j12) & 67108863;
        long j13 = j12 >> 26;
        long j14 = (((long) i8) * j) + j9;
        iArr2[6] = ((int) j14) & 67108863;
        long j15 = j14 >> 26;
        long j16 = (((long) i10) * j) + j7;
        iArr2[8] = 67108863 & ((int) j16);
        iArr2[2] = (((int) j2) & 33554431) + ((int) j11);
        iArr2[4] = (((int) j3) & 33554431) + ((int) j13);
        iArr2[7] = (((int) j4) & 33554431) + ((int) j15);
        iArr2[9] = i11 + ((int) (j16 >> 26));
    }

    public static void s(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = i16;
        long j = (long) i;
        int i21 = i14;
        int i22 = iArr2[9];
        long j2 = (long) i2;
        long j3 = j * j2;
        int i23 = i2;
        long j4 = (long) i4;
        int i24 = i12;
        int i25 = i11;
        long j5 = (long) i3;
        long j6 = (j5 * j2) + (j * j4);
        int i26 = i4;
        long j7 = (long) i6;
        int i27 = i10;
        int i28 = i9;
        long j8 = (long) i5;
        long j9 = (j8 * j2) + (j5 * j4) + (j * j7);
        long j10 = ((j8 * j4) + (j5 * j7)) << 1;
        int i29 = i6;
        long j11 = (long) i8;
        long j12 = j4;
        long j13 = (long) i7;
        long J = i0.d.a.a.a.J(j13, j2, j * j11, j10);
        long j14 = (j8 * j7) << 1;
        long j15 = j7;
        int i30 = i8;
        long j16 = (long) i27;
        long j17 = (long) i28;
        long J2 = i0.d.a.a.a.J(j2, j17, (j13 * j12) + (j5 * j11) + (j * j16), j14);
        long j18 = (j13 * j15) + (j8 * j11) + (j5 * j16);
        long j19 = (j13 * j11) + (((j17 * j15) + (j8 * j16)) << 1);
        long j20 = (j11 * j17) + (j13 * j16);
        long j21 = (j17 * j16) << 1;
        long j22 = (long) i25;
        long j23 = (long) i24;
        int i31 = i21;
        long j24 = (long) i31;
        long j25 = j21;
        int i32 = i7;
        int i33 = i13;
        long j26 = (long) i33;
        long j27 = (j26 * j23) + (j22 * j24);
        long j28 = j20;
        int i34 = i31;
        long j29 = (long) i20;
        long j30 = j22 * j23;
        int i35 = i15;
        long j31 = (long) i35;
        long j32 = (j31 * j23) + (j26 * j24) + (j22 * j29);
        int i36 = i35;
        int i37 = i33;
        long j33 = (long) i18;
        long j34 = j24;
        long j35 = (long) i17;
        long j36 = j35;
        long j37 = j23;
        long J3 = i0.d.a.a.a.J(j36, j37, j22 * j33, ((j31 * j24) + (j26 * j29)) << 1);
        long j38 = (j31 * j29) << 1;
        long j39 = j29;
        int i38 = i22;
        long j40 = (long) i38;
        long j41 = (j35 * j34) + (j26 * j33) + (j22 * j40);
        int i39 = i19;
        long j42 = j35;
        long j43 = (long) i39;
        long j44 = (j31 * j33) + (j26 * j40);
        long j45 = j42;
        long j46 = (j43 * j34) + (j45 * j39) + j44;
        long j47 = j3 - (j46 * 76);
        long j48 = j6 - (((j45 * j33) + (((j43 * j39) + (j31 * j40)) << 1)) * 38);
        long j49 = j9 - (((j33 * j43) + (j45 * j40)) * 38);
        long j50 = J - ((j43 * j40) * 76);
        long j51 = j19 - j27;
        long j52 = j28 - j32;
        int i40 = i32 + i17;
        int i41 = i30 + i18;
        int i42 = i28 + i39;
        long j53 = (((j17 * j12) + j18) << 1) - j30;
        long j54 = (long) (i + i25);
        long j55 = (long) (i23 + i24);
        long j56 = j54 * j55;
        long J4 = i0.d.a.a.a.J(j23, j43, j41, j38);
        long j57 = (long) (i26 + i34);
        long j58 = j25 - J3;
        long j59 = (long) (i3 + i37);
        long j60 = (j59 * j55) + (j54 * j57);
        long j61 = (long) (i29 + i20);
        long j62 = (long) (i5 + i36);
        long j63 = (j62 * j55) + (j59 * j57) + (j54 * j61);
        long j64 = j62 * j57;
        long j65 = (long) i41;
        long j66 = j57;
        long j67 = (long) i40;
        long j68 = j67;
        long j69 = j55;
        long J5 = i0.d.a.a.a.J(j68, j69, j54 * j65, (j64 + (j59 * j61)) << 1);
        long j70 = (j62 * j61) << 1;
        long j71 = j61;
        long j72 = (long) (i27 + i38);
        long j73 = (j67 * j66) + (j59 * j65) + (j54 * j72);
        long j74 = (long) i42;
        long j75 = j66 * j74;
        long j76 = (j75 + ((j67 * j71) + ((j62 * j65) + (j59 * j72)))) << 1;
        long j77 = (j65 * j74) + (j67 * j72);
        long j78 = (J5 - j50) + j58;
        long J6 = ((i0.d.a.a.a.J(j55, j74, j73, j70) - J2) - J4) + (j78 >> 26);
        long j79 = ((((J6 >> 25) + j76) - j53) * 38) + j47;
        iArr3[0] = ((int) j79) & 67108863;
        long j80 = ((((j67 * j65) + (((j74 * j71) + (j62 * j72)) << 1)) - j51) * 38) + j48 + (j79 >> 26);
        iArr3[1] = ((int) j80) & 67108863;
        long j81 = j52;
        long j82 = ((j77 - j81) * 38) + j49 + (j80 >> 26);
        iArr3[2] = ((int) j82) & 33554431;
        long j83 = ((((j74 * j72) << 1) - j58) * 38) + j50 + (j82 >> 25);
        iArr3[3] = ((int) j83) & 67108863;
        long J7 = i0.d.a.a.a.J(J4, 38, J2, j83 >> 26);
        iArr3[4] = ((int) J7) & 33554431;
        long j84 = (j56 - j47) + j53 + (J7 >> 25);
        iArr3[5] = ((int) j84) & 67108863;
        long j85 = (j60 - j48) + j51 + (j84 >> 26);
        iArr3[6] = ((int) j85) & 67108863;
        long j86 = (j63 - j49) + j81 + (j85 >> 26);
        iArr3[7] = ((int) j86) & 33554431;
        long j87 = (j86 >> 25) + ((long) (((int) j78) & 67108863));
        iArr3[8] = ((int) j87) & 67108863;
        iArr3[9] = (((int) J6) & 33554431) + ((int) (j87 >> 26));
    }

    public static void t(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        v(iArr, i);
        v(iArr, -i);
    }

    public static void u(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void v(int[] iArr, int i) {
        int i2 = iArr[9];
        long j = ((long) (((i2 >> 24) + i) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j) & 67108863;
        long j2 = (j >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j3) & 33554431;
        long j4 = (j3 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j4) & 67108863;
        long j5 = (j4 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j5) & 33554431;
        long j6 = (j5 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j6) & 67108863;
        long j7 = (j6 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + ((long) iArr[7]);
        iArr[7] = 33554431 & ((int) j8);
        long j9 = (j8 >> 25) + ((long) iArr[8]);
        iArr[8] = 67108863 & ((int) j9);
        iArr[9] = (16777215 & i2) + ((int) (j9 >> 26));
    }

    public static void w(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j = (long) i;
        long j2 = j * j;
        int i11 = i9;
        long j3 = (long) (i2 * 2);
        long j4 = j * j3;
        long j5 = (long) (i3 * 2);
        int i12 = i6;
        int i13 = i7;
        long j6 = (long) i2;
        long j7 = (j6 * j6) + (j * j5);
        int i14 = i;
        long j8 = (long) (i4 * 2);
        long j9 = (j * j8) + (j3 * j5);
        int i15 = i5;
        int i16 = i4;
        long j10 = (long) (i5 * 2);
        long j11 = j6 * j8;
        long j12 = j11 + (j * j10) + (((long) i3) * j5);
        long j13 = (j8 * j5) + (j3 * j10);
        int i17 = i16;
        long j14 = (long) i17;
        long j15 = (j14 * j14) + (j5 * j10);
        int i18 = i3;
        int i19 = i12;
        int i20 = i17;
        long j16 = (long) i19;
        long j17 = j16 * j16;
        long j18 = ((long) i15) * j10;
        long j19 = (long) (i13 * 2);
        long j20 = j16 * j19;
        long j21 = (long) (i8 * 2);
        long j22 = j14 * j10;
        int i21 = i19;
        int i22 = i13;
        long j23 = (long) i22;
        long j24 = (j23 * j23) + (j16 * j21);
        long j25 = j15;
        long j26 = (long) (i11 * 2);
        long j27 = (j16 * j26) + (j19 * j21);
        long j28 = j13;
        long j29 = (long) (i10 * 2);
        long j30 = j23 * j26;
        long j31 = j30 + (j16 * j29) + (((long) i8) * j21);
        long j32 = (j26 * j21) + (j19 * j29);
        int i23 = i11;
        long j33 = (long) i23;
        int i24 = i10;
        long j34 = j2 - (j32 * 38);
        long j35 = j4 - (((j33 * j33) + (j21 * j29)) * 38);
        long j36 = j7 - ((j33 * j29) * 38);
        long j37 = j9 - ((((long) i24) * j29) * 38);
        long j38 = j18 - j27;
        int i25 = i14 + i21;
        int i26 = i2 + i22;
        int i27 = i18 + i8;
        int i28 = i20 + i23;
        int i29 = i15 + i24;
        long j39 = j22 - j24;
        long j40 = j25 - j20;
        long j41 = j28 - j17;
        long j42 = (long) i25;
        long j43 = j42 * j42;
        long j44 = (long) (i26 * 2);
        long j45 = j42 * j44;
        long j46 = (long) (i27 * 2);
        long j47 = j31;
        long j48 = (long) i26;
        long j49 = (j48 * j48) + (j42 * j46);
        long j50 = j38;
        long j51 = (long) (i28 * 2);
        long j52 = j46;
        long j53 = (long) (i29 * 2);
        long j54 = j48 * j51;
        long j55 = (long) i28;
        long j56 = j55 * j55;
        long j57 = (((j42 * j51) + (j44 * j46)) - j37) + j50;
        long j58 = (((j54 + ((j42 * j53) + (((long) i27) * j46))) - j12) - j47) + (j57 >> 26);
        long j59 = j58 >> 25;
        long j60 = (((j59 + ((j51 * j52) + (j44 * j53))) - j41) * 38) + j34;
        iArr2[0] = ((int) j60) & 67108863;
        long j61 = (((j56 + (j52 * j53)) - j40) * 38) + j35 + (j60 >> 26);
        iArr2[1] = ((int) j61) & 67108863;
        long j62 = (((j55 * j53) - j39) * 38) + j36 + (j61 >> 26);
        iArr2[2] = ((int) j62) & 33554431;
        long j63 = (((((long) i29) * j53) - j50) * 38) + j37 + (j62 >> 25);
        iArr2[3] = ((int) j63) & 67108863;
        long J = i0.d.a.a.a.J(j47, 38, j12, j63 >> 26);
        iArr2[4] = ((int) J) & 33554431;
        long j64 = (j43 - j34) + j41 + (J >> 25);
        iArr2[5] = ((int) j64) & 67108863;
        long j65 = (j45 - j35) + j40 + (j64 >> 26);
        iArr2[6] = ((int) j65) & 67108863;
        long j66 = (j49 - j36) + j39 + (j65 >> 26);
        iArr2[7] = ((int) j66) & 33554431;
        long j67 = (j66 >> 25) + ((long) (((int) j57) & 67108863));
        iArr2[8] = ((int) j67) & 67108863;
        iArr2[9] = (((int) j58) & 33554431) + ((int) (j67 >> 26));
    }

    public static void x(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void y(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }
}
