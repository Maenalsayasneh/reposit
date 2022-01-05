package s0.a.e.b.b0.a;

import s0.a.e.b.b0.c.h3;

public class c {
    public static final int[] a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static int a(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        h3.x2(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void c(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        int i = iArr[7];
        int i2 = i;
        int i3 = 0;
        while (i3 < 8) {
            int i4 = iArr[i3 + 8];
            iArr3[0 + i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        long j = ((long) 19) & 4294967295L;
        long j2 = ((((long) iArr3[0]) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j2;
        long j3 = ((((long) iArr3[1]) & 4294967295L) * j) + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        int i5 = i;
        long j4 = ((((long) iArr3[2]) & 4294967295L) * j) + (((long) iArr[2]) & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = ((((long) iArr3[3]) & 4294967295L) * j) + (((long) iArr[3]) & 4294967295L) + (j4 >>> 32);
        iArr3[3] = (int) j5;
        long j6 = ((((long) iArr3[4]) & 4294967295L) * j) + (((long) iArr[4]) & 4294967295L) + (j5 >>> 32);
        iArr3[4] = (int) j6;
        long j7 = ((((long) iArr3[5]) & 4294967295L) * j) + (((long) iArr[5]) & 4294967295L) + (j6 >>> 32);
        iArr3[5] = (int) j7;
        long j8 = ((((long) iArr3[6]) & 4294967295L) * j) + (((long) iArr[6]) & 4294967295L) + (j7 >>> 32);
        iArr3[6] = (int) j8;
        long j9 = (j * (((long) iArr3[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7])) + (j8 >>> 32);
        iArr3[7] = (int) j9;
        int i6 = iArr3[7];
        iArr3[7] = h3.w(7, (((i6 >>> 31) - (i5 >>> 31)) + (((int) (j9 >>> 32)) << 1)) * 19, iArr3) + (Integer.MAX_VALUE & i6);
        if (h3.k1(iArr3, a)) {
            g(iArr2);
        }
    }

    public static void d(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = h3.w(7, ((i << 1) | (i2 >>> 31)) * 19, iArr) + (i2 & Integer.MAX_VALUE);
        if (h3.k1(iArr, a)) {
            g(iArr);
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        h3.U2(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void f(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        h3.U2(iArr, iArr3);
        while (true) {
            c(iArr3, iArr2);
            i--;
            if (i > 0) {
                h3.U2(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static int g(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) h3.z1(7, iArr, 1);
        }
        long j3 = ((4294967295L & ((long) iArr[7])) - 2147483648L) + j2;
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h3.e3(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                j2 = (long) h3.v0(7, iArr3, 1);
            }
            iArr3[7] = (int) ((4294967295L & ((long) iArr3[7])) + 2147483648L + j2);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        h3.M2(8, iArr, 0, iArr2);
        if (h3.k1(iArr2, a)) {
            g(iArr2);
        }
    }
}
