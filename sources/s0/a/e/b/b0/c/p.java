package s0.a.e.b.b0.c;

import java.security.SecureRandom;

public class p {
    public static final int[] a = {-21389, -2, -1, -1, -1};
    public static final int[] b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    public static final int[] c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h3.d(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && h3.h1(iArr3, a))) {
            h3.h(5, 21389, iArr3);
        }
    }

    public static int b(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        h3.u2(iArr, iArr2, iArr4);
        g(iArr4, iArr3);
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h3.y2(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && h3.f1(10, iArr3, b))) {
            int[] iArr4 = c;
            if (h3.q(iArr4.length, iArr4, iArr3) != 0) {
                h3.z1(10, iArr3, iArr4.length);
            }
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        if (b(iArr) != 0) {
            int[] iArr3 = a;
            h3.a3(iArr3, iArr3, iArr2);
            return;
        }
        h3.a3(a, iArr, iArr2);
    }

    public static void f(SecureRandom secureRandom, int[] iArr) {
        do {
            byte[] bArr = new byte[20];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 5);
            } while (h3.f2(5, iArr, a) == 0);
        } while (b(iArr) != 0);
    }

    public static void g(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) 21389) & 4294967295L;
        long j2 = ((long) iArr[5]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j3;
        long j4 = ((long) iArr[6]) & 4294967295L;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr3[1] = (int) j5;
        long j6 = ((long) iArr[7]) & 4294967295L;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & 4294967295L) + (j5 >>> 32);
        iArr3[2] = (int) j7;
        long j8 = ((long) iArr[8]) & 4294967295L;
        long j9 = j;
        long j10 = (j * j8) + j6 + (((long) iArr[3]) & 4294967295L) + (j7 >>> 32);
        iArr3[3] = (int) j10;
        long j11 = ((long) iArr[9]) & 4294967295L;
        long j12 = (j9 * j11) + j8 + (((long) iArr[4]) & 4294967295L) + (j10 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + j11;
        long j14 = j13 & 4294967295L;
        long j15 = (j9 * j14) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j15;
        long j16 = j13 >>> 32;
        long j17 = (j9 * j16) + j14 + (((long) iArr3[1]) & 4294967295L) + (j15 >>> 32);
        iArr3[1] = (int) j17;
        long j18 = j16 + (((long) iArr3[2]) & 4294967295L) + (j17 >>> 32);
        iArr3[2] = (int) j18;
        long j19 = (j18 >>> 32) + (4294967295L & ((long) iArr3[3]));
        iArr3[3] = (int) j19;
        if (((j19 >>> 32) == 0 ? 0 : h3.A1(5, iArr3, 0, 4)) != 0 || (iArr3[4] == -1 && h3.h1(iArr3, a))) {
            h3.h(5, 21389, iArr3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (r14 == 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(int r14, int[] r15) {
        /*
            r0 = 5
            r1 = 21389(0x538d, float:2.9972E-41)
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
            r14 = 4
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0051
            int[] r14 = a
            boolean r14 = s0.a.e.b.b0.c.h3.h1(r15, r14)
            if (r14 == 0) goto L_0x0051
        L_0x004e:
            s0.a.e.b.b0.c.h3.h(r0, r1, r15)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.p.h(int, int[]):void");
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        h3.R2(iArr, iArr3);
        g(iArr3, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        h3.R2(iArr, iArr3);
        while (true) {
            g(iArr3, iArr2);
            i--;
            if (i > 0) {
                h3.R2(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h3.a3(iArr, iArr2, iArr3) != 0) {
            h3.d3(5, 21389, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (h3.M2(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && h3.h1(iArr2, a))) {
            h3.h(5, 21389, iArr2);
        }
    }
}
