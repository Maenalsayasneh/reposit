package s0.a.e.b.b0.c;

public class e0 {
    public static final int[] a = {-6803, -2, -1, -1, -1, -1, -1};
    public static final int[] b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    public static final int[] c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static int a(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        h3.w2(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void c(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) 6803) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j3;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr3[1] = (int) j5;
        long j6 = ((long) iArr[9]) & 4294967295L;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & 4294967295L) + (j5 >>> 32);
        iArr3[2] = (int) j7;
        long j8 = ((long) iArr[10]) & 4294967295L;
        long j9 = j;
        long j10 = (j * j8) + j6 + (((long) iArr[3]) & 4294967295L) + (j7 >>> 32);
        iArr3[3] = (int) j10;
        long j11 = ((long) iArr[11]) & 4294967295L;
        long j12 = (j9 * j11) + j8 + (((long) iArr[4]) & 4294967295L) + (j10 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = ((long) iArr[12]) & 4294967295L;
        long j14 = (j9 * j13) + j11 + (((long) iArr[5]) & 4294967295L) + (j12 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = ((long) iArr[13]) & 4294967295L;
        long j16 = (j9 * j15) + j13 + (((long) iArr[6]) & 4294967295L) + (j14 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + j15;
        long j18 = j17 & 4294967295L;
        long j19 = (j9 * j18) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j19;
        long j20 = j17 >>> 32;
        long j21 = (j9 * j20) + j18 + (((long) iArr3[1]) & 4294967295L) + (j19 >>> 32);
        iArr3[1] = (int) j21;
        long j22 = j20 + (((long) iArr3[2]) & 4294967295L) + (j21 >>> 32);
        iArr3[2] = (int) j22;
        long j23 = (j22 >>> 32) + (4294967295L & ((long) iArr3[3]));
        iArr3[3] = (int) j23;
        if (((j23 >>> 32) == 0 ? 0 : h3.A1(7, iArr3, 0, 4)) != 0 || (iArr3[6] == -1 && h3.j1(iArr3, a))) {
            h3.h(7, 6803, iArr3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (r14 == 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(int r14, int[] r15) {
        /*
            r0 = 7
            r1 = 6803(0x1a93, float:9.533E-42)
            if (r14 == 0) goto L_0x0040
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r14
            long r6 = r6 & r4
            long r2 = r2 * r6
            r14 = 0
            r8 = r15[r14]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            r8 = 0
            long r2 = r2 + r8
            int r10 = (int) r2
            r15[r14] = r10
            r10 = 32
            long r2 = r2 >>> r10
            r11 = 1
            r12 = r15[r11]
            long r12 = (long) r12
            long r12 = r12 & r4
            long r6 = r6 + r12
            long r6 = r6 + r2
            int r2 = (int) r6
            r15[r11] = r2
            long r2 = r6 >>> r10
            r6 = 2
            r7 = r15[r6]
            long r11 = (long) r7
            long r4 = r4 & r11
            long r2 = r2 + r4
            int r4 = (int) r2
            r15[r6] = r4
            long r2 = r2 >>> r10
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            r2 = 3
            int r14 = s0.a.e.b.b0.c.h3.A1(r0, r15, r14, r2)
        L_0x003e:
            if (r14 != 0) goto L_0x004e
        L_0x0040:
            r14 = 6
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0051
            int[] r14 = a
            boolean r14 = s0.a.e.b.b0.c.h3.j1(r15, r14)
            if (r14 == 0) goto L_0x0051
        L_0x004e:
            s0.a.e.b.b0.c.h3.h(r0, r1, r15)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.e0.d(int, int[]):void");
    }

    public static void e(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        h3.T2(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void f(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[14];
        h3.T2(iArr, iArr3);
        while (true) {
            c(iArr3, iArr2);
            i--;
            if (i > 0) {
                h3.T2(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h3.c3(iArr, iArr2, iArr3) != 0) {
            h3.d3(7, 6803, iArr3);
        }
    }
}
