package s0.a.e.b.b0.c;

public class j0 {
    public static final int[] a = {1, 0, 0, -1, -1, -1, -1};
    public static final int[] b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    public static final int[] c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h3.f(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && h3.j1(iArr3, a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (h3.y1(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && h3.j1(iArr2, a))) {
            c(iArr2);
        }
    }

    public static void c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = (4294967295L & ((long) iArr[3])) + 1 + j2;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            h3.z1(7, iArr, 4);
        }
    }

    public static int d(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        h3.w2(iArr, iArr2, iArr4);
        g(iArr4, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (d(iArr) != 0) {
            int[] iArr3 = a;
            h3.c3(iArr3, iArr3, iArr2);
            return;
        }
        h3.c3(a, iArr, iArr2);
    }

    public static void g(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = j3;
        long j8 = (((long) iArr[9]) & 4294967295L) + j4;
        long j9 = j4;
        long j10 = ((((long) iArr[0]) & 4294967295L) - j5) + 0;
        long j11 = j2;
        long j12 = ((((long) iArr[1]) & 4294967295L) - j6) + (j10 >> 32);
        iArr3[1] = (int) j12;
        long j13 = ((((long) iArr[2]) & 4294967295L) - j8) + (j12 >> 32);
        iArr3[2] = (int) j13;
        long j14 = (((((long) iArr[3]) & 4294967295L) + j5) - j) + (j13 >> 32);
        long j15 = (((((long) iArr[4]) & 4294967295L) + j6) - j11) + (j14 >> 32);
        iArr3[4] = (int) j15;
        long j16 = (((((long) iArr[5]) & 4294967295L) + j8) - j7) + (j15 >> 32);
        iArr3[5] = (int) j16;
        long j17 = (((((long) iArr[6]) & 4294967295L) + j) - j9) + (j16 >> 32);
        iArr3[6] = (int) j17;
        long j18 = (j17 >> 32) + 1;
        long j19 = (j14 & 4294967295L) + j18;
        long j20 = (j10 & 4294967295L) - j18;
        iArr3[0] = (int) j20;
        long j21 = j20 >> 32;
        if (j21 != 0) {
            long j22 = j21 + (((long) iArr3[1]) & 4294967295L);
            iArr3[1] = (int) j22;
            long j23 = (j22 >> 32) + (4294967295L & ((long) iArr3[2]));
            iArr3[2] = (int) j23;
            j19 += j23 >> 32;
        }
        iArr3[3] = (int) j19;
        if (((j19 >> 32) != 0 && h3.z1(7, iArr3, 4) != 0) || (iArr3[6] == -1 && h3.j1(iArr3, a))) {
            c(iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = ((((long) iArr[0]) & 4294967295L) - j2) + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (4294967295L & ((long) iArr[3])) + j2 + j4;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && h3.z1(7, iArr, 4) != 0) || (iArr[6] == -1 && h3.j1(iArr, a))) {
            c(iArr);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        h3.T2(iArr, iArr3);
        g(iArr3, iArr2);
    }

    public static void j(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h3.c3(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = ((4294967295L & ((long) iArr3[3])) - 1) + j2;
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                h3.v0(7, iArr3, 4);
            }
        }
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (h3.M2(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && h3.j1(iArr2, a))) {
            c(iArr2);
        }
    }
}
