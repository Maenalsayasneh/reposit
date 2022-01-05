package s0.a.e.b.b0.c;

public class o0 {
    public static final int[] a = {-977, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    public static final int[] c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

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
        long j = ((long) 977) & 4294967295L;
        long j2 = ((long) iArr[8]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j3;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr3[1] = (int) j5;
        long j6 = ((long) iArr[10]) & 4294967295L;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & 4294967295L) + (j5 >>> 32);
        iArr3[2] = (int) j7;
        long j8 = ((long) iArr[11]) & 4294967295L;
        long j9 = j;
        long j10 = (j * j8) + j6 + (((long) iArr[3]) & 4294967295L) + (j7 >>> 32);
        iArr3[3] = (int) j10;
        long j11 = ((long) iArr[12]) & 4294967295L;
        long j12 = (j9 * j11) + j8 + (((long) iArr[4]) & 4294967295L) + (j10 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = ((long) iArr[13]) & 4294967295L;
        long j14 = (j9 * j13) + j11 + (((long) iArr[5]) & 4294967295L) + (j12 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = ((long) iArr[14]) & 4294967295L;
        long j16 = (j9 * j15) + j13 + (((long) iArr[6]) & 4294967295L) + (j14 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = j16 >>> 32;
        long j18 = ((long) iArr[15]) & 4294967295L;
        long j19 = (j9 * j18) + j15 + (((long) iArr[7]) & 4294967295L) + j17;
        iArr3[7] = (int) j19;
        long j20 = (j19 >>> 32) + j18;
        long j21 = j20 & 4294967295L;
        long j22 = (j9 * j21) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j22;
        long j23 = j20 >>> 32;
        long j24 = (j9 * j23) + j21 + (((long) iArr3[1]) & 4294967295L) + (j22 >>> 32);
        iArr3[1] = (int) j24;
        long j25 = j23 + (((long) iArr3[2]) & 4294967295L) + (j24 >>> 32);
        iArr3[2] = (int) j25;
        long j26 = (j25 >>> 32) + (4294967295L & ((long) iArr3[3]));
        iArr3[3] = (int) j26;
        if (((j26 >>> 32) == 0 ? 0 : h3.A1(8, iArr3, 0, 4)) != 0 || (iArr3[7] == -1 && h3.k1(iArr3, a))) {
            h3.h(8, 977, iArr3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003f, code lost:
        if (r14 == 0) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(int r14, int[] r15) {
        /*
            r0 = 8
            r1 = 977(0x3d1, float:1.369E-42)
            if (r14 == 0) goto L_0x0041
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
            if (r2 != 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r2 = 3
            int r14 = s0.a.e.b.b0.c.h3.A1(r0, r15, r14, r2)
        L_0x003f:
            if (r14 != 0) goto L_0x004f
        L_0x0041:
            r14 = 7
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0052
            int[] r14 = a
            boolean r14 = s0.a.e.b.b0.c.h3.k1(r15, r14)
            if (r14 == 0) goto L_0x0052
        L_0x004f:
            s0.a.e.b.b0.c.h3.h(r0, r1, r15)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.o0.d(int, int[]):void");
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

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h3.e3(iArr, iArr2, iArr3) != 0) {
            h3.d3(8, 977, iArr3);
        }
    }
}
