package s0.a.e.b.e0;

import s0.a.b.b0.c0;
import s0.a.b.b0.l;
import s0.a.b.z;
import s0.a.e.b.b0.c.h3;

public abstract class b {
    public static final byte[] a = {83, 105, 103, 69, 100, 52, 52, 56};
    public static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] c = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final int[] d = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    public static final int[] e = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    public static final Object f = new Object();
    public static C0304b[] g = null;
    public static int[] h = null;

    /* renamed from: s0.a.e.b.e0.b$b  reason: collision with other inner class name */
    public static class C0304b {
        public int[] a = new int[16];
        public int[] b = new int[16];
        public int[] c = new int[16];

        public C0304b(a aVar) {
        }
    }

    public static boolean a(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        int[] iArr = new int[14];
        e(bArr, 0, iArr, 0, 14);
        return !h3.f1(14, iArr, b);
    }

    public static z b() {
        return new c0(256);
    }

    public static int c(byte[] bArr, int i) {
        int i2 = i + 1;
        return ((bArr[i2 + 1] & 255) << 16) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
    }

    public static int d(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static void e(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = d(bArr, (i4 * 4) + i);
        }
    }

    public static void f(byte[] bArr, int i, int[] iArr) {
        e(bArr, i, iArr, 0, 14);
    }

    public static void g(z zVar, byte b2, byte[] bArr) {
        byte[] bArr2 = a;
        int length = bArr2.length;
        int i = length + 2;
        int length2 = bArr.length + i;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b2;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        zVar.update(bArr3, 0, length2);
    }

    public static void h(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void i(long j, byte[] bArr, int i) {
        h((int) j, bArr, i);
        int i2 = (int) (j >>> 32);
        int i3 = i + 4;
        bArr[i3] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i4 + 1] = (byte) (i2 >>> 16);
    }

    public static int j(C0304b bVar, byte[] bArr, int i) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        s0.a.e.b.d0.b.l(bVar.c, iArr2);
        s0.a.e.b.d0.b.o(bVar.a, iArr2, iArr);
        s0.a.e.b.d0.b.o(bVar.b, iArr2, iArr2);
        s0.a.e.b.d0.b.r(iArr, 1);
        s0.a.e.b.d0.b.r(iArr, -1);
        s0.a.e.b.d0.b.r(iArr2, 1);
        s0.a.e.b.d0.b.r(iArr2, -1);
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        s0.a.e.b.d0.b.s(iArr, iArr4);
        s0.a.e.b.d0.b.s(iArr2, iArr5);
        s0.a.e.b.d0.b.o(iArr4, iArr5, iArr3);
        s0.a.e.b.d0.b.a(iArr4, iArr5, iArr4);
        s0.a.e.b.d0.b.n(iArr3, 39081, iArr3);
        int[] iArr6 = new int[16];
        iArr6[0] = 1;
        s0.a.e.b.d0.b.t(iArr3, iArr6, iArr3);
        s0.a.e.b.d0.b.a(iArr3, iArr4, iArr3);
        s0.a.e.b.d0.b.r(iArr3, 1);
        s0.a.e.b.d0.b.r(iArr3, -1);
        int m = s0.a.e.b.d0.b.m(iArr3);
        s0.a.e.b.d0.b.i(iArr2, bArr, i);
        bArr[(i + 57) - 1] = (byte) ((1 & iArr[0]) << 7);
        return m;
    }

    public static byte[] k(int[] iArr, int i) {
        int i2;
        int[] iArr2 = new int[28];
        int i3 = 0;
        int i4 = 14;
        int i5 = 28;
        int i6 = 0;
        while (true) {
            i4--;
            if (i4 < 0) {
                break;
            }
            int i7 = iArr[i4];
            int i8 = i5 - 1;
            iArr2[i8] = (i6 << 16) | (i7 >>> 16);
            i5 = i8 - 1;
            iArr2[i5] = i7;
            i6 = i7;
        }
        byte[] bArr = new byte[447];
        int i9 = 1 << i;
        int i10 = i9 - 1;
        int i11 = i9 >>> 1;
        int i12 = 0;
        int i13 = 0;
        while (i3 < 28) {
            int i14 = iArr2[i3];
            while (i2 < 16) {
                int i15 = i14 >>> i2;
                if ((i15 & 1) == i13) {
                    i2++;
                } else {
                    int i16 = (i15 & i10) + i13;
                    int i17 = i16 & i11;
                    int i18 = i16 - (i17 << 1);
                    i13 = i17 >>> (i - 1);
                    bArr[(i3 << 4) + i2] = (byte) i18;
                    i2 += i;
                }
            }
            i3++;
            i12 = i2 - 16;
        }
        return bArr;
    }

    public static void l(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b2, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        byte[] bArr6 = bArr3;
        byte b3 = b2;
        byte[] bArr7 = bArr4;
        int i6 = i3;
        int i7 = i4;
        byte[] bArr8 = bArr5;
        int i8 = i5;
        if (bArr6 != null && bArr6.length < 256) {
            z b4 = b();
            byte[] bArr9 = new byte[114];
            l lVar = (l) b4;
            lVar.update(bArr, i, 57);
            c0 c0Var = (c0) b4;
            c0Var.b(bArr9, 0, 114);
            byte[] bArr10 = new byte[57];
            s(bArr9, 0, bArr10);
            g(b4, b3, bArr6);
            lVar.update(bArr9, 57, 57);
            lVar.update(bArr7, i6, i7);
            c0Var.b(bArr9, 0, 114);
            byte[] t = t(bArr9);
            byte[] bArr11 = new byte[57];
            v(t, bArr11, 0);
            g(b4, b3, bArr6);
            lVar.update(bArr11, 0, 57);
            lVar.update(bArr2, i2, 57);
            lVar.update(bArr7, i6, i7);
            c0Var.b(bArr9, 0, 114);
            byte[] t2 = t(bArr9);
            int[] iArr = new int[28];
            f(t, 0, iArr);
            int[] iArr2 = new int[14];
            f(t2, 0, iArr2);
            int[] iArr3 = new int[14];
            f(bArr10, 0, iArr3);
            long j = 0;
            for (int i9 = 0; i9 < 14; i9++) {
                int i10 = i9 + 14;
                long C2 = j + (((long) h3.C2(14, iArr2[i9], iArr3, 0, iArr, i9)) & 4294967295L) + (((long) iArr[i10]) & 4294967295L);
                iArr[i10] = (int) C2;
                j = C2 >>> 32;
            }
            byte[] bArr12 = new byte[114];
            for (int i11 = 0; i11 < 28; i11++) {
                h(iArr[i11], bArr12, i11 * 4);
            }
            byte[] t3 = t(bArr12);
            System.arraycopy(bArr11, 0, bArr8, i8, 57);
            System.arraycopy(t3, 0, bArr8, i8 + 57, 57);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    public static void m(boolean z, C0304b bVar, C0304b bVar2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[16];
        int[] iArr10 = new int[16];
        int[] iArr11 = new int[16];
        int[] iArr12 = new int[16];
        if (z) {
            s0.a.e.b.d0.b.t(bVar.b, bVar.a, iArr12);
            iArr2 = iArr6;
            iArr3 = iArr9;
            iArr4 = iArr10;
            iArr = iArr11;
        } else {
            s0.a.e.b.d0.b.a(bVar.b, bVar.a, iArr12);
            iArr3 = iArr6;
            iArr2 = iArr9;
            iArr = iArr10;
            iArr4 = iArr11;
        }
        s0.a.e.b.d0.b.o(bVar.c, bVar2.c, iArr5);
        s0.a.e.b.d0.b.s(iArr5, iArr6);
        s0.a.e.b.d0.b.o(bVar.a, bVar2.a, iArr7);
        s0.a.e.b.d0.b.o(bVar.b, bVar2.b, iArr8);
        s0.a.e.b.d0.b.o(iArr7, iArr8, iArr9);
        s0.a.e.b.d0.b.n(iArr9, 39081, iArr9);
        s0.a.e.b.d0.b.a(iArr6, iArr9, iArr);
        s0.a.e.b.d0.b.t(iArr6, iArr9, iArr4);
        s0.a.e.b.d0.b.a(bVar2.a, bVar2.b, iArr9);
        s0.a.e.b.d0.b.o(iArr12, iArr9, iArr12);
        s0.a.e.b.d0.b.a(iArr8, iArr7, iArr3);
        s0.a.e.b.d0.b.t(iArr8, iArr7, iArr2);
        s0.a.e.b.d0.b.b(iArr3);
        s0.a.e.b.d0.b.t(iArr12, iArr6, iArr12);
        s0.a.e.b.d0.b.o(iArr12, iArr5, iArr12);
        s0.a.e.b.d0.b.o(iArr9, iArr5, iArr9);
        s0.a.e.b.d0.b.o(iArr10, iArr12, bVar2.a);
        s0.a.e.b.d0.b.o(iArr9, iArr11, bVar2.b);
        s0.a.e.b.d0.b.o(iArr10, iArr11, bVar2.c);
    }

    public static C0304b n(C0304b bVar) {
        C0304b bVar2 = new C0304b((a) null);
        s0.a.e.b.d0.b.d(bVar.a, 0, bVar2.a, 0);
        s0.a.e.b.d0.b.d(bVar.b, 0, bVar2.b, 0);
        s0.a.e.b.d0.b.d(bVar.c, 0, bVar2.c, 0);
        return bVar2;
    }

    public static void o(C0304b bVar) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        s0.a.e.b.d0.b.a(bVar.a, bVar.b, iArr);
        s0.a.e.b.d0.b.s(iArr, iArr);
        s0.a.e.b.d0.b.s(bVar.a, iArr2);
        s0.a.e.b.d0.b.s(bVar.b, iArr3);
        s0.a.e.b.d0.b.a(iArr2, iArr3, iArr4);
        s0.a.e.b.d0.b.b(iArr4);
        s0.a.e.b.d0.b.s(bVar.c, iArr5);
        s0.a.e.b.d0.b.a(iArr5, iArr5, iArr5);
        s0.a.e.b.d0.b.b(iArr5);
        s0.a.e.b.d0.b.t(iArr4, iArr5, iArr6);
        s0.a.e.b.d0.b.t(iArr, iArr4, iArr);
        s0.a.e.b.d0.b.t(iArr2, iArr3, iArr2);
        s0.a.e.b.d0.b.o(iArr, iArr6, bVar.a);
        s0.a.e.b.d0.b.o(iArr4, iArr2, bVar.b);
        s0.a.e.b.d0.b.o(iArr4, iArr6, bVar.c);
    }

    public static C0304b[] p(C0304b bVar, int i) {
        C0304b n = n(bVar);
        o(n);
        C0304b[] bVarArr = new C0304b[i];
        bVarArr[0] = n(bVar);
        for (int i2 = 1; i2 < i; i2++) {
            bVarArr[i2] = n(bVarArr[i2 - 1]);
            m(false, n, bVarArr[i2]);
        }
        return bVarArr;
    }

    public static void q(C0304b bVar) {
        int[] iArr = bVar.a;
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
        s0.a.e.b.d0.b.q(bVar.b);
        s0.a.e.b.d0.b.q(bVar.c);
    }

    public static void r() {
        synchronized (f) {
            if (h == null) {
                a aVar = null;
                C0304b bVar = new C0304b((a) null);
                s0.a.e.b.d0.b.d(d, 0, bVar.a, 0);
                s0.a.e.b.d0.b.d(e, 0, bVar.b, 0);
                s0.a.e.b.d0.b.q(bVar.c);
                g = p(bVar, 32);
                h = new int[2560];
                int i = 0;
                int i2 = 0;
                while (i < 5) {
                    C0304b[] bVarArr = new C0304b[5];
                    C0304b bVar2 = new C0304b(aVar);
                    q(bVar2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 5) {
                            break;
                        }
                        m(true, bVar, bVar2);
                        o(bVar);
                        bVarArr[i3] = n(bVar);
                        if (i + i3 != 8) {
                            for (int i4 = 1; i4 < 18; i4++) {
                                o(bVar);
                            }
                        }
                        i3++;
                    }
                    C0304b[] bVarArr2 = new C0304b[16];
                    bVarArr2[0] = bVar2;
                    int i5 = 1;
                    for (int i6 = 0; i6 < 4; i6++) {
                        int i7 = 1 << i6;
                        int i8 = 0;
                        while (i8 < i7) {
                            bVarArr2[i5] = n(bVarArr2[i5 - i7]);
                            m(false, bVarArr[i6], bVarArr2[i5]);
                            i8++;
                            i5++;
                        }
                    }
                    int[] iArr = new int[256];
                    int[] iArr2 = new int[16];
                    s0.a.e.b.d0.b.d(bVarArr2[0].c, 0, iArr2, 0);
                    s0.a.e.b.d0.b.d(iArr2, 0, iArr, 0);
                    int i9 = 0;
                    while (true) {
                        i9++;
                        if (i9 >= 16) {
                            break;
                        }
                        s0.a.e.b.d0.b.o(iArr2, bVarArr2[i9].c, iArr2);
                        s0.a.e.b.d0.b.d(iArr2, 0, iArr, i9 * 16);
                    }
                    int[] iArr3 = new int[16];
                    int[] iArr4 = new int[14];
                    s0.a.e.b.d0.b.d(iArr2, 0, iArr3, 0);
                    s0.a.e.b.d0.b.r(iArr3, 1);
                    s0.a.e.b.d0.b.r(iArr3, -1);
                    s0.a.e.b.d0.b.j(iArr3, 0, iArr4, 0);
                    s0.a.e.b.d0.b.j(iArr3, 8, iArr4, 7);
                    h3.s2(s0.a.e.b.d0.b.a, iArr4, iArr4);
                    s0.a.e.b.d0.b.g(iArr4, 0, iArr2, 0);
                    s0.a.e.b.d0.b.g(iArr4, 7, iArr2, 8);
                    int i10 = i9 - 1;
                    int[] iArr5 = new int[16];
                    while (i10 > 0) {
                        int i11 = i10 - 1;
                        s0.a.e.b.d0.b.d(iArr, i11 * 16, iArr5, 0);
                        s0.a.e.b.d0.b.o(iArr5, iArr2, iArr5);
                        s0.a.e.b.d0.b.d(iArr5, 0, iArr, i10 * 16);
                        s0.a.e.b.d0.b.o(iArr2, bVarArr2[i10].c, iArr2);
                        i10 = i11;
                    }
                    s0.a.e.b.d0.b.d(iArr2, 0, iArr, 0);
                    for (int i12 = 0; i12 < 16; i12++) {
                        C0304b bVar3 = bVarArr2[i12];
                        s0.a.e.b.d0.b.d(iArr, i12 * 16, bVar3.c, 0);
                        int[] iArr6 = bVar3.a;
                        s0.a.e.b.d0.b.o(iArr6, bVar3.c, iArr6);
                        int[] iArr7 = bVar3.b;
                        s0.a.e.b.d0.b.o(iArr7, bVar3.c, iArr7);
                        s0.a.e.b.d0.b.d(bVar3.a, 0, h, i2);
                        int i13 = i2 + 16;
                        s0.a.e.b.d0.b.d(bVar3.b, 0, h, i13);
                        i2 = i13 + 16;
                    }
                    i++;
                    aVar = null;
                }
            }
        }
    }

    public static void s(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    public static byte[] t(byte[] bArr) {
        byte[] bArr2 = bArr;
        long d2 = ((long) d(bArr2, 0)) & 4294967295L;
        long d3 = ((long) d(bArr2, 7)) & 4294967295L;
        long c2 = ((long) (c(bArr2, 11) << 4)) & 4294967295L;
        long d4 = ((long) d(bArr2, 14)) & 4294967295L;
        long c3 = ((long) (c(bArr2, 18) << 4)) & 4294967295L;
        long d5 = ((long) d(bArr2, 21)) & 4294967295L;
        long c4 = ((long) (c(bArr2, 25) << 4)) & 4294967295L;
        long d6 = ((long) d(bArr2, 28)) & 4294967295L;
        long c5 = ((long) (c(bArr2, 32) << 4)) & 4294967295L;
        long d7 = ((long) d(bArr2, 35)) & 4294967295L;
        long c6 = ((long) (c(bArr2, 39) << 4)) & 4294967295L;
        long d8 = ((long) d(bArr2, 42)) & 4294967295L;
        long c7 = ((long) (c(bArr2, 46) << 4)) & 4294967295L;
        long d9 = ((long) d(bArr2, 49)) & 4294967295L;
        long c8 = ((long) (c(bArr2, 53) << 4)) & 4294967295L;
        long c9 = ((long) (c(bArr2, 74) << 4)) & 4294967295L;
        long d10 = ((long) d(bArr2, 77)) & 4294967295L;
        long c10 = ((long) (c(bArr2, 81) << 4)) & 4294967295L;
        long d11 = ((long) d(bArr2, 84)) & 4294967295L;
        long c11 = ((long) (c(bArr2, 88) << 4)) & 4294967295L;
        long d12 = ((long) d(bArr2, 91)) & 4294967295L;
        long c12 = ((long) (c(bArr2, 95) << 4)) & 4294967295L;
        long d13 = ((long) d(bArr2, 98)) & 4294967295L;
        long c13 = ((long) (c(bArr2, 102) << 4)) & 4294967295L;
        long d14 = ((long) d(bArr2, 105)) & 4294967295L;
        int i = (bArr2[113] & 255) << 8;
        long c14 = ((long) (c(bArr2, 109) << 4)) & 4294967295L;
        long j = ((long) (i | (bArr2[112] & 255))) & 4294967295L;
        long j2 = j * 43969588;
        long j3 = j * 30366549;
        long j4 = j * 163752818;
        long j5 = j * 258169998;
        long j6 = j * 96434764;
        long j7 = (j * 550336261) + c10;
        long j8 = c14 + (d14 >>> 28);
        long j9 = d14 & 268435455;
        long j10 = (j8 * 43969588) + c8;
        long d15 = (j8 * 30366549) + j2 + (((long) d(bArr2, 56)) & 4294967295L);
        long c15 = (j8 * 163752818) + j3 + (((long) (c(bArr2, 60) << 4)) & 4294967295L);
        long d16 = (j8 * 258169998) + j4 + (((long) d(bArr2, 63)) & 4294967295L);
        long c16 = (j8 * 96434764) + j5 + (((long) (c(bArr2, 67) << 4)) & 4294967295L);
        long d17 = (j8 * 227822194) + j6 + (((long) d(bArr2, 70)) & 4294967295L);
        long j11 = (j9 * 43969588) + d9;
        long j12 = (j9 * 163752818) + d15;
        long j13 = (j9 * 258169998) + c15;
        long j14 = (j9 * 96434764) + d16;
        long j15 = (j9 * 227822194) + c16;
        long j16 = (j9 * 149865618) + d17;
        long j17 = (j9 * 550336261) + (j8 * 149865618) + (j * 227822194) + c9;
        long j18 = c13 + (d13 >>> 28);
        long j19 = d13 & 268435455;
        long j20 = (j18 * 43969588) + c7;
        long j21 = (j18 * 30366549) + j11;
        long j22 = (j18 * 96434764) + j13;
        long j23 = (j18 * 227822194) + j14;
        long j24 = (j18 * 149865618) + j15;
        long j25 = (j18 * 550336261) + j16;
        long j26 = (j19 * 43969588) + d8;
        long j27 = (j19 * 30366549) + j20;
        long j28 = (j19 * 163752818) + j21;
        long j29 = (j19 * 258169998) + (j18 * 163752818) + (j9 * 30366549) + j10;
        long j30 = (j19 * 149865618) + j23;
        long j31 = (j19 * 550336261) + j24;
        long j32 = c12 + (d12 >>> 28);
        long j33 = d12 & 268435455;
        long j34 = (j32 * 43969588) + c6;
        long j35 = (j32 * 30366549) + j26;
        long j36 = (j32 * 163752818) + j27;
        long j37 = (j32 * 258169998) + j28;
        long j38 = (j33 * 43969588) + d7;
        long j39 = (j33 * 30366549) + j34;
        long j40 = (j33 * 163752818) + j35;
        long j41 = (j33 * 258169998) + j36;
        long j42 = (j33 * 96434764) + j37;
        long j43 = (j33 * 227822194) + (j32 * 96434764) + j29;
        long j44 = j33 * 149865618;
        long j45 = j44 + (j32 * 227822194) + (j19 * 96434764) + (j18 * 258169998) + j12;
        long j46 = (j33 * 550336261) + (j32 * 149865618) + (j19 * 227822194) + j22;
        long j47 = c11 + (d11 >>> 28);
        long j48 = (j47 * 43969588) + c5;
        long j49 = (j47 * 30366549) + j38;
        long j50 = (j47 * 163752818) + j39;
        long j51 = (j47 * 258169998) + j40;
        long j52 = (j47 * 96434764) + j41;
        long j53 = (j47 * 227822194) + j42;
        long j54 = (j47 * 149865618) + j43;
        long j55 = j17 + (j25 >>> 28);
        long j56 = j25 & 268435455;
        long j57 = (j8 * 550336261) + (j * 149865618) + d10 + (j55 >>> 28);
        long j58 = j55 & 268435455;
        long j59 = j7 + (j57 >>> 28);
        long j60 = j57 & 268435455;
        long j61 = (d11 & 268435455) + (j59 >>> 28);
        long j62 = j59 & 268435455;
        long j63 = (j61 * 43969588) + d6;
        long j64 = (j61 * 30366549) + j48;
        long j65 = (j61 * 163752818) + j49;
        long j66 = (j61 * 258169998) + j50;
        long j67 = (j61 * 96434764) + j51;
        long j68 = (j61 * 227822194) + j52;
        long j69 = (j61 * 149865618) + j53;
        long j70 = (j62 * 43969588) + c4;
        long j71 = (j62 * 30366549) + j63;
        long j72 = (j62 * 163752818) + j64;
        long j73 = (j62 * 258169998) + j65;
        long j74 = (j62 * 96434764) + j66;
        long j75 = (j62 * 227822194) + j67;
        long j76 = (j62 * 149865618) + j68;
        long j77 = (j62 * 550336261) + j69;
        long j78 = (j60 * 43969588) + d5;
        long j79 = (j60 * 30366549) + j70;
        long j80 = (j60 * 163752818) + j71;
        long j81 = (j60 * 96434764) + j73;
        long j82 = (j60 * 227822194) + j74;
        long j83 = (j60 * 149865618) + j75;
        long j84 = (j60 * 550336261) + j76;
        long j85 = (j32 * 550336261) + j30 + (j46 >>> 28);
        long j86 = j46 & 268435455;
        long j87 = j31 + (j85 >>> 28);
        long j88 = j85 & 268435455;
        long j89 = j56 + (j87 >>> 28);
        long j90 = j87 & 268435455;
        long j91 = j58 + (j89 >>> 28);
        long j92 = j89 & 268435455;
        long j93 = (j91 * 43969588) + c3;
        long j94 = (j91 * 30366549) + j78;
        long j95 = (j91 * 163752818) + j79;
        long j96 = (j91 * 258169998) + j80;
        long j97 = (j91 * 227822194) + j81;
        long j98 = (j91 * 149865618) + j82;
        long j99 = (j91 * 550336261) + j83;
        long j100 = (j92 * 163752818) + j94;
        long j101 = (j92 * 258169998) + j95;
        long j102 = (j92 * 96434764) + j96;
        long j103 = (j92 * 227822194) + (j91 * 96434764) + (j60 * 258169998) + j72;
        long j104 = (j92 * 149865618) + j97;
        long j105 = (j90 * 43969588) + c2;
        long j106 = (j90 * 30366549) + (j92 * 43969588) + d4;
        long j107 = (j90 * 258169998) + j100;
        long j108 = (j90 * 96434764) + j101;
        long j109 = (j90 * 227822194) + j102;
        long j110 = (j90 * 149865618) + j103;
        long j111 = (j90 * 550336261) + j104;
        long j112 = (j61 * 550336261) + j54 + (j77 >>> 28);
        long j113 = (j47 * 550336261) + j45 + (j112 >>> 28);
        long j114 = j112 & 268435455;
        long j115 = j86 + (j113 >>> 28);
        long j116 = j113 & 268435455;
        long j117 = j88 + (j115 >>> 28);
        long j118 = j115 & 268435455;
        long j119 = (j117 * 43969588) + d3;
        long j120 = (j117 * 30366549) + j105;
        long j121 = (j117 * 163752818) + j106;
        long j122 = (j117 * 258169998) + (j90 * 163752818) + (j92 * 30366549) + j93;
        long j123 = (j117 * 96434764) + j107;
        long j124 = (j117 * 550336261) + j110;
        long j125 = 43969588 * j118;
        long j126 = (258169998 * j118) + j121;
        long j127 = (227822194 * j118) + j123;
        long j128 = 149865618 * j118;
        long j129 = j114 & 67108863;
        long j130 = (j116 * 4) + (j114 >>> 26) + 1;
        long j131 = (j130 * 78101261) + d2;
        long j132 = j130 * 141809365;
        long j133 = j130 * 175155932;
        long j134 = j130 * 64542499;
        long j135 = j130 * 191173276;
        long c17 = j132 + j125 + (((long) (c(bArr2, 4) << 4)) & 4294967295L) + (j131 >>> 28);
        long j136 = j133 + (30366549 * j118) + j119 + (c17 >>> 28);
        long j137 = j134 + (163752818 * j118) + j120 + (j136 >>> 28);
        long j138 = (j130 * 158326419) + j126 + (j137 >>> 28);
        long j139 = j135 + (96434764 * j118) + j122 + (j138 >>> 28);
        long j140 = (j130 * 104575268) + j127 + (j139 >>> 28);
        long j141 = (j130 * 137584065) + j128 + (j117 * 227822194) + j108 + (j140 >>> 28);
        long j142 = (j118 * 550336261) + (j117 * 149865618) + j109 + (j141 >>> 28);
        long j143 = j124 + (j142 >>> 28);
        long j144 = j111 + (j143 >>> 28);
        long j145 = (j92 * 550336261) + j98 + (j144 >>> 28);
        long j146 = j99 + (j145 >>> 28);
        long j147 = j84 + (j146 >>> 28);
        long j148 = (j77 & 268435455) + (j147 >>> 28);
        long j149 = j129 + (j148 >>> 28);
        long j150 = (j149 >>> 26) - 1;
        long j151 = (j131 & 268435455) - (j150 & 78101261);
        long j152 = ((c17 & 268435455) - (j150 & 141809365)) + (j151 >> 28);
        long j153 = ((j136 & 268435455) - (j150 & 175155932)) + (j152 >> 28);
        long j154 = ((j137 & 268435455) - (j150 & 64542499)) + (j153 >> 28);
        long j155 = ((j138 & 268435455) - (j150 & 158326419)) + (j154 >> 28);
        long j156 = ((j139 & 268435455) - (j150 & 191173276)) + (j155 >> 28);
        long j157 = ((j140 & 268435455) - (j150 & 104575268)) + (j156 >> 28);
        long j158 = ((j141 & 268435455) - (j150 & 137584065)) + (j157 >> 28);
        long j159 = (j142 & 268435455) + (j158 >> 28);
        long j160 = (j143 & 268435455) + (j159 >> 28);
        long j161 = (j144 & 268435455) + (j160 >> 28);
        long j162 = (j145 & 268435455) + (j161 >> 28);
        long j163 = (j146 & 268435455) + (j162 >> 28);
        long j164 = (j147 & 268435455) + (j163 >> 28);
        long j165 = (j148 & 268435455) + (j164 >> 28);
        byte[] bArr3 = new byte[57];
        i((j151 & 268435455) | ((j152 & 268435455) << 28), bArr3, 0);
        i(((j154 & 268435455) << 28) | (j153 & 268435455), bArr3, 7);
        i(((j156 & 268435455) << 28) | (j155 & 268435455), bArr3, 14);
        i((j157 & 268435455) | ((j158 & 268435455) << 28), bArr3, 21);
        i((j159 & 268435455) | ((j160 & 268435455) << 28), bArr3, 28);
        i((j161 & 268435455) | ((j162 & 268435455) << 28), bArr3, 35);
        i((j163 & 268435455) | ((j164 & 268435455) << 28), bArr3, 42);
        i((j165 & 268435455) | (((j149 & 67108863) + (j165 >> 28)) << 28), bArr3, 49);
        return bArr3;
    }

    public static void u(byte[] bArr, C0304b bVar) {
        C0304b bVar2 = bVar;
        r();
        int i = 15;
        int[] iArr = new int[15];
        int i2 = 0;
        f(bArr, 0, iArr);
        int i3 = 1;
        iArr[14] = h3.E(14, (~iArr[0]) & 1, iArr, c, iArr) + 4;
        h3.L2(15, iArr, 0);
        int i4 = 16;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        q(bVar);
        int i5 = 17;
        while (true) {
            int i6 = i2;
            int i7 = i5;
            while (i6 < 5) {
                int i8 = i2;
                int i9 = i8;
                while (i8 < 5) {
                    i9 = (i9 & (~(i3 << i8))) ^ ((iArr[i7 >>> 5] >>> (i7 & 31)) << i8);
                    i7 += 18;
                    i8++;
                }
                int i10 = -((i9 >>> 4) & i3);
                int i11 = (i9 ^ i10) & i;
                int i12 = i6 * 16 * 2 * i4;
                for (int i13 = i2; i13 < i4; i13++) {
                    int i14 = ((i13 ^ i11) - 1) >> 31;
                    s0.a.e.b.d0.b.c(i14, h, i12, iArr2, i2);
                    int i15 = i12 + i4;
                    s0.a.e.b.d0.b.c(i14, h, i15, iArr3, i2);
                    i12 = i15 + i4;
                }
                int[] iArr4 = new int[i4];
                s0.a.e.b.d0.b.t(iArr4, iArr2, iArr4);
                s0.a.e.b.d0.b.c(i10, iArr4, i2, iArr2, i2);
                int[] iArr5 = new int[i4];
                int[] iArr6 = new int[i4];
                int[] iArr7 = new int[i4];
                int[] iArr8 = new int[i4];
                int[] iArr9 = new int[i4];
                int[] iArr10 = new int[i4];
                int[] iArr11 = new int[i4];
                s0.a.e.b.d0.b.s(bVar2.c, iArr5);
                s0.a.e.b.d0.b.o(iArr2, bVar2.a, iArr6);
                s0.a.e.b.d0.b.o(iArr3, bVar2.b, iArr7);
                s0.a.e.b.d0.b.o(iArr6, iArr7, iArr8);
                s0.a.e.b.d0.b.n(iArr8, 39081, iArr8);
                s0.a.e.b.d0.b.a(iArr5, iArr8, iArr9);
                s0.a.e.b.d0.b.t(iArr5, iArr8, iArr10);
                s0.a.e.b.d0.b.a(iArr2, iArr3, iArr5);
                s0.a.e.b.d0.b.a(bVar2.a, bVar2.b, iArr8);
                s0.a.e.b.d0.b.o(iArr5, iArr8, iArr11);
                s0.a.e.b.d0.b.a(iArr7, iArr6, iArr5);
                s0.a.e.b.d0.b.t(iArr7, iArr6, iArr8);
                s0.a.e.b.d0.b.b(iArr5);
                s0.a.e.b.d0.b.t(iArr11, iArr5, iArr11);
                s0.a.e.b.d0.b.o(iArr11, bVar2.c, iArr11);
                s0.a.e.b.d0.b.o(iArr8, bVar2.c, iArr8);
                s0.a.e.b.d0.b.o(iArr9, iArr11, bVar2.a);
                s0.a.e.b.d0.b.o(iArr8, iArr10, bVar2.b);
                s0.a.e.b.d0.b.o(iArr9, iArr10, bVar2.c);
                i6++;
                i = 15;
                i2 = 0;
                i4 = 16;
                i3 = 1;
            }
            i5--;
            if (i5 >= 0) {
                o(bVar);
                i = 15;
                i2 = 0;
                i4 = 16;
                i3 = 1;
            } else {
                return;
            }
        }
    }

    public static void v(byte[] bArr, byte[] bArr2, int i) {
        C0304b bVar = new C0304b((a) null);
        u(bArr, bVar);
        if (j(bVar, bArr2, i) == 0) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a0, code lost:
        if ((s0.a.e.b.d0.b.m(r7.a) != 0) != false) goto L_0x01a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean w(byte[] r19, int r20, byte[] r21, int r22, byte[] r23, byte[] r24, int r25, int r26) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0015
            int r7 = r4.length
            r8 = 256(0x100, float:3.59E-43)
            if (r7 >= r8) goto L_0x0015
            r7 = r5
            goto L_0x0016
        L_0x0015:
            r7 = r6
        L_0x0016:
            if (r7 == 0) goto L_0x025f
            int r7 = r1 + 57
            byte[] r8 = s0.a.e.b.b0.c.h3.q0(r0, r1, r7)
            r9 = 114(0x72, float:1.6E-43)
            int r1 = r1 + r9
            byte[] r0 = s0.a.e.b.b0.c.h3.q0(r0, r7, r1)
            boolean r1 = a(r8)
            if (r1 != 0) goto L_0x002d
            goto L_0x0259
        L_0x002d:
            r1 = 56
            byte r7 = r0[r1]
            r10 = 14
            if (r7 == 0) goto L_0x0037
            r7 = r6
            goto L_0x0043
        L_0x0037:
            int[] r7 = new int[r10]
            f(r0, r6, r7)
            int[] r11 = c
            boolean r7 = s0.a.e.b.b0.c.h3.f1(r10, r7, r11)
            r7 = r7 ^ r5
        L_0x0043:
            if (r7 != 0) goto L_0x0047
            goto L_0x0259
        L_0x0047:
            s0.a.e.b.e0.b$b r7 = new s0.a.e.b.e0.b$b
            r11 = 0
            r7.<init>(r11)
            int r12 = r3 + 57
            byte[] r12 = s0.a.e.b.b0.c.h3.q0(r2, r3, r12)
            boolean r13 = a(r12)
            r14 = 7
            if (r13 != 0) goto L_0x005e
            r18 = r0
            goto L_0x01c0
        L_0x005e:
            byte r13 = r12[r1]
            r13 = r13 & 128(0x80, float:1.794E-43)
            int r13 = r13 >>> r14
            byte r15 = r12[r1]
            r15 = r15 & 127(0x7f, float:1.78E-43)
            byte r15 = (byte) r15
            r12[r1] = r15
            int[] r1 = r7.b
            s0.a.e.b.d0.b.f(r12, r6, r1)
            r1 = 16
            int[] r12 = new int[r1]
            int[] r15 = new int[r1]
            int[] r14 = r7.b
            s0.a.e.b.d0.b.s(r14, r12)
            r14 = 39081(0x98a9, float:5.4764E-41)
            s0.a.e.b.d0.b.n(r12, r14, r15)
            int[] r14 = new int[r1]
            s0.a.e.b.d0.b.t(r14, r12, r12)
            r14 = r12[r6]
            int r14 = r14 + r5
            r12[r6] = r14
            r14 = r15[r6]
            int r14 = r14 + r5
            r15[r6] = r14
            int[] r14 = r7.a
            int[] r11 = new int[r1]
            int[] r10 = new int[r1]
            s0.a.e.b.d0.b.s(r12, r11)
            s0.a.e.b.d0.b.o(r11, r15, r11)
            s0.a.e.b.d0.b.s(r11, r10)
            s0.a.e.b.d0.b.o(r11, r12, r11)
            s0.a.e.b.d0.b.o(r10, r12, r10)
            s0.a.e.b.d0.b.o(r10, r15, r10)
            int[] r9 = new int[r1]
            int[] r6 = new int[r1]
            s0.a.e.b.d0.b.s(r10, r6)
            s0.a.e.b.d0.b.o(r10, r6, r6)
            int[] r5 = new int[r1]
            s0.a.e.b.d0.b.s(r6, r5)
            s0.a.e.b.d0.b.o(r10, r5, r5)
            int[] r6 = new int[r1]
            s0.a.e.b.d0.b.s(r5, r6)
            r16 = 3
            r17 = r16
        L_0x00c2:
            r1 = -1
            int r17 = r17 + -1
            if (r17 <= 0) goto L_0x00cb
            s0.a.e.b.d0.b.s(r6, r6)
            goto L_0x00c2
        L_0x00cb:
            s0.a.e.b.d0.b.o(r5, r6, r6)
            r18 = r0
            r1 = 16
            int[] r0 = new int[r1]
            s0.a.e.b.d0.b.s(r6, r0)
            r6 = -1
        L_0x00d8:
            int r16 = r16 + -1
            if (r16 <= 0) goto L_0x00e0
            s0.a.e.b.d0.b.s(r0, r0)
            goto L_0x00d8
        L_0x00e0:
            s0.a.e.b.d0.b.o(r5, r0, r0)
            int[] r5 = new int[r1]
            r16 = 9
            s0.a.e.b.d0.b.s(r0, r5)
        L_0x00ea:
            int r16 = r16 + -1
            if (r16 <= 0) goto L_0x00f3
            s0.a.e.b.d0.b.s(r5, r5)
            r6 = -1
            goto L_0x00ea
        L_0x00f3:
            s0.a.e.b.d0.b.o(r0, r5, r5)
            int[] r0 = new int[r1]
            s0.a.e.b.d0.b.s(r5, r0)
            s0.a.e.b.d0.b.o(r10, r0, r0)
            int[] r6 = new int[r1]
            r16 = 18
            s0.a.e.b.d0.b.s(r0, r6)
            r0 = -1
        L_0x0106:
            int r16 = r16 + -1
            if (r16 <= 0) goto L_0x010e
            s0.a.e.b.d0.b.s(r6, r6)
            goto L_0x0106
        L_0x010e:
            s0.a.e.b.d0.b.o(r5, r6, r6)
            int[] r5 = new int[r1]
            s0.a.e.b.d0.b.s(r6, r5)
            r16 = 37
            r17 = r16
        L_0x011a:
            int r17 = r17 + -1
            if (r17 <= 0) goto L_0x0122
            s0.a.e.b.d0.b.s(r5, r5)
            goto L_0x011a
        L_0x0122:
            s0.a.e.b.d0.b.o(r6, r5, r5)
            int[] r0 = new int[r1]
            s0.a.e.b.d0.b.s(r5, r0)
            r5 = -1
        L_0x012b:
            int r16 = r16 + -1
            if (r16 <= 0) goto L_0x0133
            s0.a.e.b.d0.b.s(r0, r0)
            goto L_0x012b
        L_0x0133:
            s0.a.e.b.d0.b.o(r6, r0, r0)
            int[] r6 = new int[r1]
            r16 = 111(0x6f, float:1.56E-43)
            s0.a.e.b.d0.b.s(r0, r6)
        L_0x013d:
            int r16 = r16 + -1
            if (r16 <= 0) goto L_0x0146
            s0.a.e.b.d0.b.s(r6, r6)
            r5 = -1
            goto L_0x013d
        L_0x0146:
            s0.a.e.b.d0.b.o(r0, r6, r6)
            int[] r0 = new int[r1]
            s0.a.e.b.d0.b.s(r6, r0)
            s0.a.e.b.d0.b.o(r10, r0, r0)
            int[] r5 = new int[r1]
            r10 = 223(0xdf, float:3.12E-43)
            s0.a.e.b.d0.b.s(r0, r5)
            r0 = -1
        L_0x0159:
            int r10 = r10 + r0
            if (r10 <= 0) goto L_0x0160
            s0.a.e.b.d0.b.s(r5, r5)
            goto L_0x0159
        L_0x0160:
            s0.a.e.b.d0.b.o(r5, r6, r9)
            s0.a.e.b.d0.b.o(r9, r11, r9)
            int[] r5 = new int[r1]
            s0.a.e.b.d0.b.s(r9, r5)
            s0.a.e.b.d0.b.o(r5, r15, r5)
            s0.a.e.b.d0.b.t(r12, r5, r5)
            r1 = 1
            s0.a.e.b.d0.b.r(r5, r1)
            s0.a.e.b.d0.b.r(r5, r0)
            int r0 = s0.a.e.b.d0.b.m(r5)
            if (r0 == 0) goto L_0x0180
            r0 = 1
            goto L_0x0181
        L_0x0180:
            r0 = 0
        L_0x0181:
            if (r0 == 0) goto L_0x0189
            r0 = 0
            s0.a.e.b.d0.b.d(r9, r0, r14, r0)
            r0 = 1
            goto L_0x018a
        L_0x0189:
            r0 = 0
        L_0x018a:
            if (r0 != 0) goto L_0x018d
            goto L_0x01a2
        L_0x018d:
            int[] r0 = r7.a
            s0.a.e.b.d0.b.p(r0)
            r0 = 1
            if (r13 != r0) goto L_0x01a4
            int[] r0 = r7.a
            int r0 = s0.a.e.b.d0.b.m(r0)
            if (r0 == 0) goto L_0x019f
            r0 = 1
            goto L_0x01a0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            if (r0 == 0) goto L_0x01a4
        L_0x01a2:
            r6 = 0
            goto L_0x01c0
        L_0x01a4:
            int[] r0 = r7.a
            r1 = 0
            r5 = r0[r1]
            r1 = 1
            r5 = r5 & r1
            if (r13 == r5) goto L_0x01af
            r5 = r1
            goto L_0x01b0
        L_0x01af:
            r5 = 0
        L_0x01b0:
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x01ba
            r1 = 16
            int[] r1 = new int[r1]
            s0.a.e.b.d0.b.t(r1, r0, r0)
        L_0x01ba:
            int[] r0 = r7.c
            s0.a.e.b.d0.b.q(r0)
            r6 = 1
        L_0x01c0:
            if (r6 != 0) goto L_0x01c5
            r6 = 0
            goto L_0x0259
        L_0x01c5:
            s0.a.b.z r0 = b()
            r1 = 114(0x72, float:1.6E-43)
            byte[] r5 = new byte[r1]
            r6 = 0
            g(r0, r6, r4)
            r4 = r0
            s0.a.b.b0.l r4 = (s0.a.b.b0.l) r4
            r9 = 57
            r4.update(r8, r6, r9)
            r4.update(r2, r3, r9)
            r2 = r24
            r3 = r25
            r10 = r26
            r4.update(r2, r3, r10)
            s0.a.b.b0.c0 r0 = (s0.a.b.b0.c0) r0
            r0.b(r5, r6, r1)
            byte[] r0 = t(r5)
            r1 = 14
            int[] r2 = new int[r1]
            r3 = r18
            f(r3, r6, r2)
            int[] r1 = new int[r1]
            f(r0, r6, r1)
            s0.a.e.b.e0.b$b r0 = new s0.a.e.b.e0.b$b
            r3 = 0
            r0.<init>(r3)
            r()
            r3 = 7
            byte[] r2 = k(r2, r3)
            r3 = 5
            byte[] r1 = k(r1, r3)
            r3 = 8
            s0.a.e.b.e0.b$b[] r3 = p(r7, r3)
            q(r0)
            r4 = 446(0x1be, float:6.25E-43)
        L_0x021a:
            byte r5 = r2[r4]
            if (r5 == 0) goto L_0x022f
            int r6 = r5 >> 31
            r5 = r5 ^ r6
            r7 = 1
            int r5 = r5 >>> r7
            if (r6 == 0) goto L_0x0227
            r6 = 1
            goto L_0x0228
        L_0x0227:
            r6 = 0
        L_0x0228:
            s0.a.e.b.e0.b$b[] r7 = g
            r5 = r7[r5]
            m(r6, r5, r0)
        L_0x022f:
            byte r5 = r1[r4]
            if (r5 == 0) goto L_0x0243
            int r6 = r5 >> 31
            r5 = r5 ^ r6
            r7 = 1
            int r5 = r5 >>> r7
            if (r6 == 0) goto L_0x023c
            r6 = r7
            goto L_0x023d
        L_0x023c:
            r6 = 0
        L_0x023d:
            r5 = r3[r5]
            m(r6, r5, r0)
            goto L_0x0244
        L_0x0243:
            r7 = 1
        L_0x0244:
            int r4 = r4 + -1
            if (r4 >= 0) goto L_0x025a
            byte[] r1 = new byte[r9]
            r5 = 0
            int r0 = j(r0, r1, r5)
            if (r0 == 0) goto L_0x0258
            boolean r0 = java.util.Arrays.equals(r1, r8)
            if (r0 == 0) goto L_0x0258
            r5 = r7
        L_0x0258:
            r6 = r5
        L_0x0259:
            return r6
        L_0x025a:
            r5 = 0
            o(r0)
            goto L_0x021a
        L_0x025f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ctx"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.e0.b.w(byte[], int, byte[], int, byte[], byte[], int, int):boolean");
    }
}
