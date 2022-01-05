package s0.a.e.b.b0.c;

import com.pubnub.api.builder.PubNubErrorBuilder;
import s0.a.e.d.a;

public class p3 {
    public static final long[] a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void b(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void e(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i = 0; i < 9; i++) {
            h(jArr4, jArr[i], jArr2[i], jArr3, i << 1);
        }
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = j ^ jArr3[2];
        jArr3[1] = j3 ^ j2;
        long j4 = j2 ^ jArr3[3];
        long j5 = j3 ^ jArr3[4];
        jArr3[2] = j5 ^ j4;
        long j6 = j4 ^ jArr3[5];
        long j7 = j5 ^ jArr3[6];
        jArr3[3] = j7 ^ j6;
        long j8 = j6 ^ jArr3[7];
        long j9 = j7 ^ jArr3[8];
        jArr3[4] = j9 ^ j8;
        long j10 = j8 ^ jArr3[9];
        long j11 = j9 ^ jArr3[10];
        jArr3[5] = j11 ^ j10;
        long j12 = j10 ^ jArr3[11];
        long j13 = j11 ^ jArr3[12];
        jArr3[6] = j13 ^ j12;
        long j14 = j12 ^ jArr3[13];
        long j15 = j13 ^ jArr3[14];
        jArr3[7] = j15 ^ j14;
        long j16 = j14 ^ jArr3[15];
        long j17 = j15 ^ jArr3[16];
        jArr3[8] = j17 ^ j16;
        long j18 = j17 ^ (j16 ^ jArr3[17]);
        jArr3[9] = jArr3[0] ^ j18;
        jArr3[10] = jArr3[1] ^ j18;
        jArr3[11] = jArr3[2] ^ j18;
        jArr3[12] = jArr3[3] ^ j18;
        jArr3[13] = jArr3[4] ^ j18;
        jArr3[14] = jArr3[5] ^ j18;
        jArr3[15] = jArr3[6] ^ j18;
        jArr3[16] = jArr3[7] ^ j18;
        jArr3[17] = jArr3[8] ^ j18;
        h(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        h(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        h(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        h(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        h(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        h(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        h(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        h(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        h(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        h(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        h(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        h(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        h(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        h(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        h(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        h(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        h(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        h(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        h(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        h(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        h(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        h(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        h(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        h(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        h(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        h(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        h(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        h(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        h(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        h(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        h(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        h(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        h(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        h(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        h(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        h(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                b(jArr2, (i3 & 15) * 9, jArr2, (((i3 >>> 4) & 15) + 16) * 9, jArr3, i2 - 1);
            }
            h3.P2(16, jArr3, 0, 8, 0);
        }
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 0; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                int i7 = (((i6 >>> 4) & 15) + 16) * 9;
                b(jArr2, (i6 & 15) * 9, jArr2, i7, jArr3, i5);
            }
            if (i4 > 0) {
                h3.P2(18, jArr3, 0, 8, 0);
            }
        }
    }

    public static void h(long[] jArr, long j, long j2, long[] jArr2, int i) {
        long j3 = j;
        jArr[1] = j2;
        for (int i2 = 2; i2 < 16; i2 += 2) {
            jArr[i2] = jArr[i2 >>> 1] << 1;
            jArr[i2 + 1] = jArr[i2] ^ j2;
        }
        int i3 = (int) j3;
        long j4 = 0;
        long j5 = jArr[i3 & 15] ^ (jArr[(i3 >>> 4) & 15] << 4);
        int i4 = 56;
        do {
            int i5 = (int) (j3 >>> i4);
            long j6 = jArr[i5 & 15] ^ (jArr[(i5 >>> 4) & 15] << 4);
            j5 ^= j6 << i4;
            j4 ^= j6 >>> (-i4);
            i4 -= 8;
        } while (i4 > 0);
        for (int i6 = 0; i6 < 7; i6++) {
            j3 = (j3 & -72340172838076674L) >>> 1;
            j4 ^= ((j2 << i6) >> 63) & j3;
        }
        jArr2[i] = jArr2[i] ^ j5;
        int i7 = i + 1;
        jArr2[i7] = jArr2[i7] ^ j4;
    }

    public static void i(long[] jArr, long[] jArr2) {
        a.b(jArr, 0, 9, jArr2, 0);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        f(jArr, jArr2, jArr4);
        n(jArr4, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        f(jArr, jArr2, jArr4);
        d(jArr3, jArr4, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        g(jArr, jArr2, jArr4);
        n(jArr4, jArr3);
    }

    public static long[] m(long[] jArr) {
        long j;
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i = 7;
        int i2 = 0;
        while (true) {
            j = 0;
            if (i <= 0) {
                break;
            }
            i2 += 18;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < 9) {
                long j2 = jArr2[i3 + i4];
                jArr2[i2 + i4] = (j >>> 63) | (j2 << 1);
                i4++;
                j = j2;
            }
            int i5 = i2 + 8;
            long j3 = jArr2[i5];
            long j4 = j3 >>> 59;
            jArr2[i2] = ((j4 << 10) ^ (((j4 << 2) ^ j4) ^ (j4 << 5))) ^ jArr2[i2];
            jArr2[i5] = j3 & 576460752303423487L;
            int i6 = i2 + 9;
            for (int i7 = 0; i7 < 9; i7++) {
                jArr2[i6 + i7] = jArr2[9 + i7] ^ jArr2[i2 + i7];
            }
            i--;
        }
        int i8 = 0;
        while (i8 < 144) {
            long j5 = jArr2[0 + i8];
            jArr2[PubNubErrorBuilder.PNERR_DEVICE_ID_MISSING + i8] = (j >>> -4) | (j5 << 4);
            i8++;
            j = j5;
        }
        return jArr2;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        i(jArr, jArr3);
        n(jArr3, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        i(jArr, jArr3);
        d(jArr2, jArr3, jArr2);
    }

    public static void q(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[18];
        i(jArr, jArr3);
        while (true) {
            n(jArr3, jArr2);
            i--;
            if (i > 0) {
                i(jArr2, jArr3);
            } else {
                return;
            }
        }
    }
}
