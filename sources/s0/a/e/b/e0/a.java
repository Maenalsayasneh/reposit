package s0.a.e.b.e0;

import s0.a.b.b0.a0;
import s0.a.b.n;
import s0.a.e.b.b0.c.h3;

public abstract class a {
    public static final byte[] a = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};
    public static final int[] b = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    public static final int[] d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    public static final int[] e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    public static final int[] f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    public static final int[] g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    public static final int[] h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    public static final Object i = new Object();
    public static c[] j = null;
    public static int[] k = null;

    public static class b {
        public int[] a = new int[10];
        public int[] b = new int[10];
        public int[] c = new int[10];
        public int[] d = new int[10];
        public int[] e = new int[10];

        public b(C0303a aVar) {
        }
    }

    public static class c {
        public int[] a = new int[10];
        public int[] b = new int[10];
        public int[] c = new int[10];
        public int[] d = new int[10];

        public c(C0303a aVar) {
        }
    }

    public static boolean a(byte[] bArr) {
        int[] iArr = new int[8];
        d(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !h3.k1(iArr, b);
    }

    public static int b(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        return ((bArr[i3 + 1] & 255) << 16) | (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
    }

    public static int c(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        return (bArr[i4 + 1] << 24) | (bArr[i2] & 255) | ((bArr[i3] & 255) << 8) | ((bArr[i4] & 255) << 16);
    }

    public static void d(byte[] bArr, int i2, int[] iArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            iArr[i3 + i5] = c(bArr, (i5 * 4) + i2);
        }
    }

    public static void e(byte[] bArr, int i2, int[] iArr) {
        d(bArr, i2, iArr, 0, 8);
    }

    public static void f(n nVar, byte b2, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = a;
            int length = bArr2.length;
            int i2 = length + 2;
            int length2 = bArr.length + i2;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b2;
            bArr3[length + 1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, i2, bArr.length);
            nVar.update(bArr3, 0, length2);
        }
    }

    public static void g(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i2 >>> 16);
        bArr[i5 + 1] = (byte) (i2 >>> 24);
    }

    public static void h(long j2, byte[] bArr, int i2) {
        g((int) j2, bArr, i2);
        int i3 = (int) (j2 >>> 32);
        int i4 = i2 + 4;
        bArr[i4] = (byte) i3;
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i3 >>> 8);
        bArr[i5 + 1] = (byte) (i3 >>> 16);
    }

    public static int i(b bVar, byte[] bArr, int i2) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        s0.a.e.b.d0.a.o(bVar.c, iArr2);
        s0.a.e.b.d0.a.s(bVar.a, iArr2, iArr);
        s0.a.e.b.d0.a.s(bVar.b, iArr2, iArr2);
        s0.a.e.b.d0.a.t(iArr);
        s0.a.e.b.d0.a.t(iArr2);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        s0.a.e.b.d0.a.w(iArr, iArr4);
        s0.a.e.b.d0.a.w(iArr2, iArr5);
        s0.a.e.b.d0.a.s(iArr4, iArr5, iArr3);
        s0.a.e.b.d0.a.x(iArr5, iArr4, iArr5);
        s0.a.e.b.d0.a.s(iArr3, f, iArr3);
        iArr3[0] = iArr3[0] + 1;
        s0.a.e.b.d0.a.x(iArr3, iArr5, iArr3);
        s0.a.e.b.d0.a.t(iArr3);
        int p = s0.a.e.b.d0.a.p(iArr3);
        s0.a.e.b.d0.a.l(iArr2, 0, bArr, i2);
        s0.a.e.b.d0.a.l(iArr2, 5, bArr, i2 + 16);
        int i3 = (i2 + 32) - 1;
        bArr[i3] = (byte) (bArr[i3] | ((iArr[0] & 1) << 7));
        return p;
    }

    public static byte[] j(int[] iArr, int i2) {
        int i3;
        int[] iArr2 = new int[16];
        int i4 = 0;
        int i5 = 8;
        int i6 = 16;
        int i7 = 0;
        while (true) {
            i5--;
            if (i5 < 0) {
                break;
            }
            int i8 = iArr[i5];
            int i9 = i6 - 1;
            iArr2[i9] = (i7 << 16) | (i8 >>> 16);
            i6 = i9 - 1;
            iArr2[i6] = i8;
            i7 = i8;
        }
        byte[] bArr = new byte[253];
        int i10 = 1 << i2;
        int i11 = i10 - 1;
        int i12 = i10 >>> 1;
        int i13 = 0;
        int i14 = 0;
        while (i4 < 16) {
            int i15 = iArr2[i4];
            while (i3 < 16) {
                int i16 = i15 >>> i3;
                if ((i16 & 1) == i14) {
                    i3++;
                } else {
                    int i17 = (i16 & i11) + i14;
                    int i18 = i17 & i12;
                    int i19 = i17 - (i18 << 1);
                    i14 = i18 >>> (i2 - 1);
                    bArr[(i4 << 4) + i3] = (byte) i19;
                    i3 += i2;
                }
            }
            i4++;
            i13 = i3 - 16;
        }
        return bArr;
    }

    public static void k(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, byte b2, byte[] bArr4, int i4, int i5, byte[] bArr5, int i6) {
        byte[] bArr6 = bArr3;
        byte b3 = b2;
        byte[] bArr7 = bArr4;
        int i7 = i4;
        int i8 = i5;
        byte[] bArr8 = bArr5;
        int i9 = i6;
        if ((bArr6 == null && b3 == 0) || (bArr6 != null && bArr6.length < 256)) {
            a0 a0Var = new a0();
            byte[] bArr9 = new byte[64];
            byte[] bArr10 = bArr;
            a0Var.update(bArr, i2, 32);
            a0Var.doFinal(bArr9, 0);
            byte[] bArr11 = new byte[32];
            s(bArr9, 0, bArr11);
            f(a0Var, b3, bArr6);
            a0Var.update(bArr9, 32, 32);
            a0Var.update(bArr7, i7, i8);
            a0Var.doFinal(bArr9, 0);
            byte[] t = t(bArr9);
            byte[] bArr12 = new byte[32];
            v(t, bArr12, 0);
            f(a0Var, b3, bArr6);
            a0Var.update(bArr12, 0, 32);
            a0Var.update(bArr2, i3, 32);
            a0Var.update(bArr7, i7, i8);
            a0Var.doFinal(bArr9, 0);
            byte[] t2 = t(bArr9);
            int[] iArr = new int[16];
            e(t, 0, iArr);
            int[] iArr2 = new int[8];
            e(t2, 0, iArr2);
            int[] iArr3 = new int[8];
            e(bArr11, 0, iArr3);
            h3.B2(iArr2, iArr3, iArr);
            byte[] bArr13 = new byte[64];
            for (int i10 = 0; i10 < 16; i10++) {
                g(iArr[i10], bArr13, i10 * 4);
            }
            byte[] t3 = t(bArr13);
            System.arraycopy(bArr12, 0, bArr8, i9, 32);
            System.arraycopy(t3, 0, bArr8, i9 + 32, 32);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    public static void l(boolean z, c cVar, b bVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = bVar.d;
        int[] iArr10 = new int[10];
        int[] iArr11 = new int[10];
        int[] iArr12 = bVar.e;
        if (z) {
            iArr2 = iArr11;
            iArr = iArr7;
            iArr4 = iArr8;
            iArr3 = iArr10;
        } else {
            iArr3 = iArr11;
            iArr4 = iArr7;
            iArr = iArr8;
            iArr2 = iArr10;
        }
        s0.a.e.b.d0.a.b(bVar.b, bVar.a, iArr6, iArr5);
        s0.a.e.b.d0.a.b(cVar.b, cVar.a, iArr, iArr4);
        s0.a.e.b.d0.a.s(iArr5, iArr7, iArr5);
        s0.a.e.b.d0.a.s(iArr6, iArr8, iArr6);
        s0.a.e.b.d0.a.s(bVar.d, bVar.e, iArr7);
        s0.a.e.b.d0.a.s(iArr7, cVar.d, iArr7);
        s0.a.e.b.d0.a.s(iArr7, g, iArr7);
        s0.a.e.b.d0.a.s(bVar.c, cVar.c, iArr8);
        s0.a.e.b.d0.a.a(iArr8, iArr8, iArr8);
        s0.a.e.b.d0.a.b(iArr6, iArr5, iArr12, iArr9);
        s0.a.e.b.d0.a.b(iArr8, iArr7, iArr3, iArr2);
        s0.a.e.b.d0.a.c(iArr3);
        s0.a.e.b.d0.a.s(iArr9, iArr10, bVar.a);
        s0.a.e.b.d0.a.s(iArr11, iArr12, bVar.b);
        s0.a.e.b.d0.a.s(iArr10, iArr11, bVar.c);
    }

    public static void m(boolean z, c cVar, c cVar2, c cVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        c cVar4 = cVar;
        c cVar5 = cVar2;
        c cVar6 = cVar3;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[10];
        int[] iArr10 = new int[10];
        int[] iArr11 = new int[10];
        int[] iArr12 = new int[10];
        if (z) {
            iArr4 = iArr7;
            iArr3 = iArr8;
            iArr2 = iArr10;
            iArr = iArr11;
        } else {
            iArr3 = iArr7;
            iArr4 = iArr8;
            iArr = iArr10;
            iArr2 = iArr11;
        }
        s0.a.e.b.d0.a.b(cVar4.b, cVar4.a, iArr6, iArr5);
        s0.a.e.b.d0.a.b(cVar5.b, cVar5.a, iArr4, iArr3);
        s0.a.e.b.d0.a.s(iArr5, iArr7, iArr5);
        s0.a.e.b.d0.a.s(iArr6, iArr8, iArr6);
        s0.a.e.b.d0.a.s(cVar4.d, cVar5.d, iArr7);
        s0.a.e.b.d0.a.s(iArr7, g, iArr7);
        s0.a.e.b.d0.a.s(cVar4.c, cVar5.c, iArr8);
        s0.a.e.b.d0.a.a(iArr8, iArr8, iArr8);
        s0.a.e.b.d0.a.b(iArr6, iArr5, iArr12, iArr9);
        s0.a.e.b.d0.a.b(iArr8, iArr7, iArr2, iArr);
        s0.a.e.b.d0.a.c(iArr2);
        s0.a.e.b.d0.a.s(iArr9, iArr10, cVar6.a);
        int[] iArr13 = iArr11;
        s0.a.e.b.d0.a.s(iArr13, iArr12, cVar6.b);
        s0.a.e.b.d0.a.s(iArr10, iArr13, cVar6.c);
        s0.a.e.b.d0.a.s(iArr9, iArr12, cVar6.d);
    }

    public static c n(b bVar) {
        c cVar = new c((C0303a) null);
        s0.a.e.b.d0.a.e(bVar.a, 0, cVar.a, 0);
        s0.a.e.b.d0.a.e(bVar.b, 0, cVar.b, 0);
        s0.a.e.b.d0.a.e(bVar.c, 0, cVar.c, 0);
        s0.a.e.b.d0.a.s(bVar.d, bVar.e, cVar.d);
        return cVar;
    }

    public static void o(b bVar) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = bVar.d;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = bVar.e;
        s0.a.e.b.d0.a.w(bVar.a, iArr);
        s0.a.e.b.d0.a.w(bVar.b, iArr2);
        s0.a.e.b.d0.a.w(bVar.c, iArr3);
        s0.a.e.b.d0.a.a(iArr3, iArr3, iArr3);
        s0.a.e.b.d0.a.b(iArr, iArr2, iArr7, iArr6);
        s0.a.e.b.d0.a.a(bVar.a, bVar.b, iArr4);
        s0.a.e.b.d0.a.w(iArr4, iArr4);
        s0.a.e.b.d0.a.x(iArr7, iArr4, iArr4);
        s0.a.e.b.d0.a.a(iArr3, iArr6, iArr5);
        s0.a.e.b.d0.a.c(iArr5);
        s0.a.e.b.d0.a.s(iArr4, iArr5, bVar.a);
        s0.a.e.b.d0.a.s(iArr6, iArr7, bVar.b);
        s0.a.e.b.d0.a.s(iArr5, iArr6, bVar.c);
    }

    public static c[] p(c cVar, int i2) {
        c cVar2 = new c((C0303a) null);
        m(false, cVar, cVar, cVar2);
        c[] cVarArr = new c[i2];
        c cVar3 = new c((C0303a) null);
        s0.a.e.b.d0.a.e(cVar.a, 0, cVar3.a, 0);
        s0.a.e.b.d0.a.e(cVar.b, 0, cVar3.b, 0);
        s0.a.e.b.d0.a.e(cVar.c, 0, cVar3.c, 0);
        s0.a.e.b.d0.a.e(cVar.d, 0, cVar3.d, 0);
        cVarArr[0] = cVar3;
        for (int i3 = 1; i3 < i2; i3++) {
            c cVar4 = cVarArr[i3 - 1];
            c cVar5 = new c((C0303a) null);
            cVarArr[i3] = cVar5;
            m(false, cVar4, cVar2, cVar5);
        }
        return cVarArr;
    }

    public static void q(b bVar) {
        s0.a.e.b.d0.a.y(bVar.a);
        s0.a.e.b.d0.a.u(bVar.b);
        s0.a.e.b.d0.a.u(bVar.c);
        s0.a.e.b.d0.a.y(bVar.d);
        s0.a.e.b.d0.a.u(bVar.e);
    }

    public static void r() {
        int i2;
        synchronized (i) {
            if (k == null) {
                c cVar = new c((C0303a) null);
                int[] iArr = d;
                s0.a.e.b.d0.a.e(iArr, 0, cVar.a, 0);
                int[] iArr2 = e;
                s0.a.e.b.d0.a.e(iArr2, 0, cVar.b, 0);
                s0.a.e.b.d0.a.u(cVar.c);
                s0.a.e.b.d0.a.s(cVar.a, cVar.b, cVar.d);
                j = p(cVar, 32);
                b bVar = new b((C0303a) null);
                s0.a.e.b.d0.a.e(iArr, 0, bVar.a, 0);
                s0.a.e.b.d0.a.e(iArr2, 0, bVar.b, 0);
                s0.a.e.b.d0.a.u(bVar.c);
                s0.a.e.b.d0.a.e(bVar.a, 0, bVar.d, 0);
                s0.a.e.b.d0.a.e(bVar.b, 0, bVar.e, 0);
                k = new int[1920];
                int i3 = 0;
                for (int i4 = 0; i4 < 8; i4++) {
                    c[] cVarArr = new c[4];
                    c cVar2 = new c((C0303a) null);
                    s0.a.e.b.d0.a.y(cVar2.a);
                    s0.a.e.b.d0.a.u(cVar2.b);
                    s0.a.e.b.d0.a.u(cVar2.c);
                    s0.a.e.b.d0.a.y(cVar2.d);
                    int i5 = 0;
                    while (true) {
                        i2 = 1;
                        if (i5 >= 4) {
                            break;
                        }
                        m(true, cVar2, n(bVar), cVar2);
                        o(bVar);
                        cVarArr[i5] = n(bVar);
                        if (i4 + i5 != 10) {
                            while (i2 < 8) {
                                o(bVar);
                                i2++;
                            }
                        }
                        i5++;
                    }
                    c[] cVarArr2 = new c[8];
                    cVarArr2[0] = cVar2;
                    int i6 = 0;
                    int i7 = 1;
                    while (i6 < 3) {
                        int i8 = i2 << i6;
                        int i9 = 0;
                        while (i9 < i8) {
                            c cVar3 = cVarArr2[i7 - i8];
                            c cVar4 = cVarArr[i6];
                            c cVar5 = new c((C0303a) null);
                            cVarArr2[i7] = cVar5;
                            m(false, cVar3, cVar4, cVar5);
                            i9++;
                            i7++;
                        }
                        i6++;
                        i2 = 1;
                    }
                    int[] iArr3 = new int[80];
                    int[] iArr4 = new int[10];
                    s0.a.e.b.d0.a.e(cVarArr2[0].c, 0, iArr4, 0);
                    s0.a.e.b.d0.a.e(iArr4, 0, iArr3, 0);
                    int i10 = 0;
                    while (true) {
                        i10++;
                        if (i10 >= 8) {
                            break;
                        }
                        s0.a.e.b.d0.a.s(iArr4, cVarArr2[i10].c, iArr4);
                        s0.a.e.b.d0.a.e(iArr4, 0, iArr3, i10 * 10);
                    }
                    s0.a.e.b.d0.a.a(iArr4, iArr4, iArr4);
                    int[] iArr5 = new int[10];
                    int[] iArr6 = new int[8];
                    s0.a.e.b.d0.a.e(iArr4, 0, iArr5, 0);
                    s0.a.e.b.d0.a.t(iArr5);
                    s0.a.e.b.d0.a.m(iArr5, 0, iArr6, 0);
                    s0.a.e.b.d0.a.m(iArr5, 5, iArr6, 4);
                    h3.s2(s0.a.e.b.d0.a.a, iArr6, iArr6);
                    s0.a.e.b.d0.a.h(iArr6, 0, iArr4);
                    int i11 = i10 - 1;
                    int[] iArr7 = new int[10];
                    while (i11 > 0) {
                        int i12 = i11 - 1;
                        s0.a.e.b.d0.a.e(iArr3, i12 * 10, iArr7, 0);
                        s0.a.e.b.d0.a.s(iArr7, iArr4, iArr7);
                        s0.a.e.b.d0.a.e(iArr7, 0, iArr3, i11 * 10);
                        s0.a.e.b.d0.a.s(iArr4, cVarArr2[i11].c, iArr4);
                        i11 = i12;
                    }
                    s0.a.e.b.d0.a.e(iArr4, 0, iArr3, 0);
                    for (int i13 = 0; i13 < 8; i13++) {
                        c cVar6 = cVarArr2[i13];
                        int[] iArr8 = new int[10];
                        int[] iArr9 = new int[10];
                        s0.a.e.b.d0.a.e(iArr3, i13 * 10, iArr9, 0);
                        s0.a.e.b.d0.a.s(cVar6.a, iArr9, iArr8);
                        s0.a.e.b.d0.a.s(cVar6.b, iArr9, iArr9);
                        int[] iArr10 = new int[10];
                        int[] iArr11 = new int[10];
                        int[] iArr12 = new int[10];
                        s0.a.e.b.d0.a.b(iArr9, iArr8, iArr10, iArr11);
                        s0.a.e.b.d0.a.s(iArr8, iArr9, iArr12);
                        s0.a.e.b.d0.a.s(iArr12, h, iArr12);
                        s0.a.e.b.d0.a.t(iArr10);
                        s0.a.e.b.d0.a.t(iArr11);
                        s0.a.e.b.d0.a.e(iArr10, 0, k, i3);
                        int i14 = i3 + 10;
                        s0.a.e.b.d0.a.e(iArr11, 0, k, i14);
                        int i15 = i14 + 10;
                        s0.a.e.b.d0.a.e(iArr12, 0, k, i15);
                        i3 = i15 + 10;
                    }
                }
            }
        }
    }

    public static void s(byte[] bArr, int i2, byte[] bArr2) {
        System.arraycopy(bArr, i2, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        bArr2[31] = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = (byte) (bArr2[31] | 64);
    }

    public static byte[] t(byte[] bArr) {
        byte[] bArr2 = bArr;
        long b2 = ((long) (b(bArr2, 4) << 4)) & 4294967295L;
        long c2 = ((long) c(bArr2, 7)) & 4294967295L;
        long b3 = ((long) (b(bArr2, 11) << 4)) & 4294967295L;
        long c3 = ((long) c(bArr2, 14)) & 4294967295L;
        long b4 = ((long) (b(bArr2, 18) << 4)) & 4294967295L;
        long c4 = ((long) c(bArr2, 21)) & 4294967295L;
        long b5 = ((long) (b(bArr2, 25) << 4)) & 4294967295L;
        long c5 = ((long) c(bArr2, 28)) & 4294967295L;
        long c6 = ((long) c(bArr2, 49)) & 4294967295L;
        long b6 = ((long) (b(bArr2, 53) << 4)) & 4294967295L;
        long c7 = ((long) c(bArr2, 56)) & 4294967295L;
        long b7 = ((long) (b(bArr2, 60) << 4)) & 4294967295L;
        long j2 = ((long) bArr2[63]) & 255;
        long b8 = (((long) (b(bArr2, 46) << 4)) & 4294967295L) - (j2 * 5343);
        long j3 = b7 + (c7 >> 28);
        long j4 = c7 & 268435455;
        long j5 = c5 - (j3 * -50998291);
        long b9 = ((((long) (b(bArr2, 32) << 4)) & 4294967295L) - (j2 * -50998291)) - (j3 * 19280294);
        long c8 = ((((long) c(bArr2, 35)) & 4294967295L) - (j2 * 19280294)) - (j3 * 127719000);
        long c9 = ((((long) c(bArr2, 42)) & 4294967295L) - (j2 * -6428113)) - (j3 * 5343);
        long j6 = b5 - (j4 * -50998291);
        long b10 = (((((long) (b(bArr2, 39) << 4)) & 4294967295L) - (j2 * 127719000)) - (j3 * -6428113)) - (j4 * 5343);
        long j7 = b6 + (c6 >> 28);
        long j8 = c6 & 268435455;
        long j9 = (c8 - (j4 * -6428113)) - (j7 * 5343);
        long j10 = ((b9 - (j4 * 127719000)) - (j7 * -6428113)) - (j8 * 5343);
        long j11 = b8 + (c9 >> 28);
        long j12 = (c9 & 268435455) + (b10 >> 28);
        long j13 = b3 - (j12 * -50998291);
        long j14 = (c3 - (j11 * -50998291)) - (j12 * 19280294);
        long j15 = ((b4 - (j8 * -50998291)) - (j11 * 19280294)) - (j12 * 127719000);
        long j16 = (((j6 - (j7 * 19280294)) - (j8 * 127719000)) - (j11 * -6428113)) - (j12 * 5343);
        long j17 = (b10 & 268435455) + (j9 >> 28);
        long j18 = j9 & 268435455;
        long j19 = c2 - (j17 * -50998291);
        long j20 = j13 - (j17 * 19280294);
        long j21 = j14 - (j17 * 127719000);
        long j22 = ((((c4 - (j7 * -50998291)) - (j8 * 19280294)) - (j11 * 127719000)) - (j12 * -6428113)) - (j17 * 5343);
        long j23 = j18 + (j10 >> 28);
        long j24 = j19 - (j23 * 19280294);
        long j25 = j20 - (j23 * 127719000);
        long j26 = j21 - (j23 * -6428113);
        long j27 = (j15 - (j17 * -6428113)) - (j23 * 5343);
        long j28 = ((((j5 - (j4 * 19280294)) - (j7 * 127719000)) - (j8 * -6428113)) - (j11 * 5343)) + (j16 >> 28);
        long j29 = j28 & 268435455;
        long j30 = j29 >>> 27;
        long j31 = (j10 & 268435455) + (j28 >> 28) + j30;
        long c10 = (((long) c(bArr2, 0)) & 4294967295L) - (j31 * -50998291);
        long j32 = ((b2 - (j23 * -50998291)) - (j31 * 19280294)) + (c10 >> 28);
        long j33 = c10 & 268435455;
        long j34 = (j24 - (j31 * 127719000)) + (j32 >> 28);
        long j35 = (j25 - (j31 * -6428113)) + (j34 >> 28);
        long j36 = (j26 - (j31 * 5343)) + (j35 >> 28);
        long j37 = j27 + (j36 >> 28);
        long j38 = j36 & 268435455;
        long j39 = j22 + (j37 >> 28);
        long j40 = (j16 & 268435455) + (j39 >> 28);
        long j41 = j29 + (j40 >> 28);
        long j42 = (j41 >> 28) - j30;
        long j43 = j33 + (j42 & -50998291);
        long j44 = (j32 & 268435455) + (j42 & 19280294) + (j43 >> 28);
        long j45 = (j34 & 268435455) + (j42 & 127719000) + (j44 >> 28);
        long j46 = (j35 & 268435455) + (j42 & -6428113) + (j45 >> 28);
        long j47 = j38 + (j42 & 5343) + (j46 >> 28);
        long j48 = (j37 & 268435455) + (j47 >> 28);
        long j49 = (j39 & 268435455) + (j48 >> 28);
        long j50 = (j40 & 268435455) + (j49 >> 28);
        byte[] bArr3 = new byte[32];
        h((j43 & 268435455) | ((j44 & 268435455) << 28), bArr3, 0);
        h(((j46 & 268435455) << 28) | (j45 & 268435455), bArr3, 7);
        h((j47 & 268435455) | ((j48 & 268435455) << 28), bArr3, 14);
        h((j49 & 268435455) | ((j50 & 268435455) << 28), bArr3, 21);
        g((int) ((j41 & 268435455) + (j50 >> 28)), bArr3, 28);
        return bArr3;
    }

    public static void u(byte[] bArr, b bVar) {
        int i2;
        b bVar2 = bVar;
        r();
        int i3 = 8;
        int[] iArr = new int[8];
        int i4 = 0;
        e(bArr, 0, iArr);
        int i5 = 1;
        h3.E(8, (~iArr[0]) & 1, iArr, c, iArr);
        h3.L2(8, iArr, 1);
        int i6 = 0;
        while (true) {
            i2 = 7;
            if (i6 >= 8) {
                break;
            }
            iArr[i6] = h3.A(h3.A(h3.A(h3.A(iArr[i6], 11141290, 7), 52428, 14), 15728880, 4), 65280, 8);
            i6++;
        }
        int i7 = 10;
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        q(bVar);
        int i8 = 28;
        while (true) {
            int i9 = i4;
            while (i9 < i3) {
                int i10 = iArr[i9] >>> i8;
                int i11 = (i10 >>> 3) & i5;
                int i12 = (i10 ^ (-i11)) & i2;
                int i13 = i9 * 8 * 3 * i7;
                int i14 = i4;
                while (i14 < i3) {
                    int i15 = ((i14 ^ i12) - 1) >> 31;
                    s0.a.e.b.d0.a.d(i15, k, i13, iArr2, i4);
                    int i16 = i13 + i7;
                    s0.a.e.b.d0.a.d(i15, k, i16, iArr3, i4);
                    int i17 = i16 + i7;
                    s0.a.e.b.d0.a.d(i15, k, i17, iArr4, i4);
                    i13 = i17 + i7;
                    i14++;
                    i3 = 8;
                }
                s0.a.e.b.d0.a.f(i11, iArr2, iArr3);
                int i18 = 0 - i11;
                for (int i19 = i4; i19 < i7; i19++) {
                    iArr4[i19] = (iArr4[i19] ^ i18) - i18;
                }
                int[] iArr5 = new int[i7];
                int[] iArr6 = new int[i7];
                int[] iArr7 = new int[i7];
                int[] iArr8 = bVar2.d;
                int[] iArr9 = new int[i7];
                int[] iArr10 = new int[i7];
                int[] iArr11 = bVar2.e;
                s0.a.e.b.d0.a.b(bVar2.b, bVar2.a, iArr6, iArr5);
                s0.a.e.b.d0.a.s(iArr5, iArr3, iArr5);
                s0.a.e.b.d0.a.s(iArr6, iArr2, iArr6);
                s0.a.e.b.d0.a.s(bVar2.d, bVar2.e, iArr7);
                s0.a.e.b.d0.a.s(iArr7, iArr4, iArr7);
                s0.a.e.b.d0.a.b(iArr6, iArr5, iArr11, iArr8);
                s0.a.e.b.d0.a.b(bVar2.c, iArr7, iArr10, iArr9);
                s0.a.e.b.d0.a.c(iArr10);
                s0.a.e.b.d0.a.s(iArr8, iArr9, bVar2.a);
                s0.a.e.b.d0.a.s(iArr10, iArr11, bVar2.b);
                s0.a.e.b.d0.a.s(iArr9, iArr10, bVar2.c);
                i9++;
                i3 = 8;
                i4 = 0;
                i7 = 10;
                i5 = 1;
                i2 = 7;
            }
            i8 -= 4;
            if (i8 >= 0) {
                o(bVar);
                i3 = 8;
                i4 = 0;
                i7 = 10;
                i5 = 1;
                i2 = 7;
            } else {
                return;
            }
        }
    }

    public static void v(byte[] bArr, byte[] bArr2, int i2) {
        b bVar = new b((C0303a) null);
        u(bArr, bVar);
        if (i(bVar, bArr2, i2) == 0) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean w(byte[] r23, int r24, byte[] r25, int r26, byte[] r27, int r28, int r29) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            int r4 = r1 + 32
            byte[] r5 = s0.a.e.b.b0.c.h3.q0(r0, r1, r4)
            r6 = 64
            int r1 = r1 + r6
            byte[] r0 = s0.a.e.b.b0.c.h3.q0(r0, r4, r1)
            boolean r1 = a(r5)
            r4 = 1
            r7 = 0
            if (r1 != 0) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            r1 = 8
            int[] r8 = new int[r1]
            e(r0, r7, r8)
            int[] r9 = c
            boolean r8 = s0.a.e.b.b0.c.h3.k1(r8, r9)
            r8 = r8 ^ r4
            if (r8 != 0) goto L_0x0031
        L_0x002e:
            r4 = r7
            goto L_0x023c
        L_0x0031:
            r8 = 10
            int[] r9 = new int[r8]
            int[] r10 = new int[r8]
            int r11 = r3 + 32
            byte[] r11 = s0.a.e.b.b0.c.h3.q0(r2, r3, r11)
            boolean r12 = a(r11)
            r13 = 7
            if (r12 != 0) goto L_0x0048
            r20 = r10
            goto L_0x0189
        L_0x0048:
            r12 = 31
            byte r15 = r11[r12]
            r15 = r15 & 128(0x80, float:1.794E-43)
            int r15 = r15 >>> r13
            byte r16 = r11[r12]
            r14 = r16 & 127(0x7f, float:1.78E-43)
            byte r14 = (byte) r14
            r11[r12] = r14
            s0.a.e.b.d0.a.g(r11, r7, r10)
            int[] r11 = new int[r8]
            int[] r12 = new int[r8]
            s0.a.e.b.d0.a.w(r10, r11)
            int[] r14 = f
            s0.a.e.b.d0.a.s(r14, r11, r12)
            r14 = r11[r7]
            int r14 = r14 + -1
            r11[r7] = r14
            r14 = r12[r7]
            int r14 = r14 + r4
            r12[r7] = r14
            int[] r14 = new int[r8]
            int[] r13 = new int[r8]
            s0.a.e.b.d0.a.s(r11, r12, r14)
            s0.a.e.b.d0.a.w(r12, r13)
            s0.a.e.b.d0.a.s(r14, r13, r14)
            s0.a.e.b.d0.a.w(r13, r13)
            s0.a.e.b.d0.a.s(r13, r14, r13)
            int[] r1 = new int[r8]
            int[] r6 = new int[r8]
            s0.a.e.b.d0.a.w(r13, r1)
            s0.a.e.b.d0.a.s(r13, r1, r1)
            int[] r4 = new int[r8]
            s0.a.e.b.d0.a.w(r1, r4)
            s0.a.e.b.d0.a.s(r13, r4, r4)
            s0.a.e.b.d0.a.w(r4, r4)
            r18 = 2
            r19 = r18
        L_0x009c:
            int r19 = r19 + -1
            if (r19 <= 0) goto L_0x00a4
            s0.a.e.b.d0.a.w(r4, r4)
            goto L_0x009c
        L_0x00a4:
            s0.a.e.b.d0.a.s(r1, r4, r4)
            int[] r7 = new int[r8]
            s0.a.e.b.d0.a.w(r4, r7)
            r20 = 5
        L_0x00ae:
            int r20 = r20 + -1
            if (r20 <= 0) goto L_0x00b6
            s0.a.e.b.d0.a.w(r7, r7)
            goto L_0x00ae
        L_0x00b6:
            s0.a.e.b.d0.a.s(r4, r7, r7)
            r20 = r10
            int[] r10 = new int[r8]
            s0.a.e.b.d0.a.w(r7, r10)
            r21 = 5
        L_0x00c2:
            int r21 = r21 + -1
            if (r21 <= 0) goto L_0x00ca
            s0.a.e.b.d0.a.w(r10, r10)
            goto L_0x00c2
        L_0x00ca:
            s0.a.e.b.d0.a.s(r4, r10, r10)
            s0.a.e.b.d0.a.w(r10, r4)
            r21 = r8
        L_0x00d2:
            int r21 = r21 + -1
            if (r21 <= 0) goto L_0x00da
            s0.a.e.b.d0.a.w(r4, r4)
            goto L_0x00d2
        L_0x00da:
            s0.a.e.b.d0.a.s(r7, r4, r4)
            s0.a.e.b.d0.a.w(r4, r7)
            r21 = 25
            r22 = r21
        L_0x00e4:
            int r22 = r22 + -1
            if (r22 <= 0) goto L_0x00ec
            s0.a.e.b.d0.a.w(r7, r7)
            goto L_0x00e4
        L_0x00ec:
            s0.a.e.b.d0.a.s(r4, r7, r7)
            s0.a.e.b.d0.a.w(r7, r10)
        L_0x00f2:
            int r21 = r21 + -1
            if (r21 <= 0) goto L_0x00fa
            s0.a.e.b.d0.a.w(r10, r10)
            goto L_0x00f2
        L_0x00fa:
            s0.a.e.b.d0.a.s(r4, r10, r10)
            r21 = 50
            s0.a.e.b.d0.a.w(r10, r4)
        L_0x0102:
            int r21 = r21 + -1
            if (r21 <= 0) goto L_0x010a
            s0.a.e.b.d0.a.w(r4, r4)
            goto L_0x0102
        L_0x010a:
            s0.a.e.b.d0.a.s(r7, r4, r4)
            r10 = 125(0x7d, float:1.75E-43)
            s0.a.e.b.d0.a.w(r4, r7)
        L_0x0112:
            int r10 = r10 + -1
            if (r10 <= 0) goto L_0x011a
            s0.a.e.b.d0.a.w(r7, r7)
            goto L_0x0112
        L_0x011a:
            s0.a.e.b.d0.a.s(r4, r7, r7)
            s0.a.e.b.d0.a.w(r7, r4)
        L_0x0120:
            int r18 = r18 + -1
            if (r18 <= 0) goto L_0x0128
            s0.a.e.b.d0.a.w(r4, r4)
            goto L_0x0120
        L_0x0128:
            s0.a.e.b.d0.a.s(r4, r13, r6)
            s0.a.e.b.d0.a.s(r6, r14, r6)
            int[] r4 = new int[r8]
            s0.a.e.b.d0.a.w(r6, r4)
            s0.a.e.b.d0.a.s(r4, r12, r4)
            s0.a.e.b.d0.a.x(r4, r11, r1)
            s0.a.e.b.d0.a.t(r1)
            boolean r7 = s0.a.e.b.d0.a.q(r1)
            if (r7 == 0) goto L_0x0147
            r7 = 0
            s0.a.e.b.d0.a.e(r6, r7, r9, r7)
            goto L_0x0158
        L_0x0147:
            s0.a.e.b.d0.a.a(r4, r11, r1)
            s0.a.e.b.d0.a.t(r1)
            boolean r1 = s0.a.e.b.d0.a.q(r1)
            if (r1 == 0) goto L_0x015a
            int[] r1 = s0.a.e.b.d0.a.b
            s0.a.e.b.d0.a.s(r6, r1, r9)
        L_0x0158:
            r1 = 1
            goto L_0x015b
        L_0x015a:
            r1 = 0
        L_0x015b:
            if (r1 != 0) goto L_0x015f
            r1 = 1
            goto L_0x016b
        L_0x015f:
            s0.a.e.b.d0.a.t(r9)
            r1 = 1
            if (r15 != r1) goto L_0x016d
            boolean r4 = s0.a.e.b.d0.a.q(r9)
            if (r4 == 0) goto L_0x016d
        L_0x016b:
            r7 = 0
            goto L_0x0189
        L_0x016d:
            r4 = 0
            r6 = r9[r4]
            r4 = r6 & 1
            if (r15 == r4) goto L_0x0177
            r17 = r1
            goto L_0x0179
        L_0x0177:
            r17 = 0
        L_0x0179:
            r4 = r17 ^ 1
            if (r4 == 0) goto L_0x0188
            r1 = 0
        L_0x017e:
            if (r1 >= r8) goto L_0x0188
            r4 = r9[r1]
            int r4 = -r4
            r9[r1] = r4
            int r1 = r1 + 1
            goto L_0x017e
        L_0x0188:
            r7 = 1
        L_0x0189:
            if (r7 != 0) goto L_0x018e
            r4 = 0
            goto L_0x023c
        L_0x018e:
            s0.a.b.b0.a0 r1 = new s0.a.b.b0.a0
            r1.<init>()
            r4 = 64
            byte[] r4 = new byte[r4]
            r6 = 0
            r7 = 0
            f(r1, r7, r6)
            r8 = 32
            r1.update(r5, r7, r8)
            r1.update(r2, r3, r8)
            r2 = r27
            r3 = r28
            r10 = r29
            r1.update(r2, r3, r10)
            r1.doFinal(r4, r7)
            byte[] r1 = t(r4)
            r2 = 8
            int[] r3 = new int[r2]
            e(r0, r7, r3)
            int[] r0 = new int[r2]
            e(r1, r7, r0)
            s0.a.e.b.e0.a$b r1 = new s0.a.e.b.e0.a$b
            r1.<init>(r6)
            r()
            r2 = 7
            byte[] r2 = j(r3, r2)
            r3 = 5
            byte[] r0 = j(r0, r3)
            s0.a.e.b.e0.a$c r3 = new s0.a.e.b.e0.a$c
            r3.<init>(r6)
            int[] r4 = r3.a
            s0.a.e.b.d0.a.e(r9, r7, r4, r7)
            int[] r4 = r3.b
            r6 = r20
            s0.a.e.b.d0.a.e(r6, r7, r4, r7)
            int[] r4 = r3.c
            s0.a.e.b.d0.a.u(r4)
            int[] r4 = r3.a
            int[] r6 = r3.b
            int[] r7 = r3.d
            s0.a.e.b.d0.a.s(r4, r6, r7)
            r4 = 8
            s0.a.e.b.e0.a$c[] r3 = p(r3, r4)
            q(r1)
            r4 = 252(0xfc, float:3.53E-43)
        L_0x01fc:
            byte r6 = r2[r4]
            if (r6 == 0) goto L_0x0211
            int r7 = r6 >> 31
            r6 = r6 ^ r7
            r9 = 1
            int r6 = r6 >>> r9
            if (r7 == 0) goto L_0x0209
            r7 = 1
            goto L_0x020a
        L_0x0209:
            r7 = 0
        L_0x020a:
            s0.a.e.b.e0.a$c[] r9 = j
            r6 = r9[r6]
            l(r7, r6, r1)
        L_0x0211:
            byte r6 = r0[r4]
            if (r6 == 0) goto L_0x0225
            int r7 = r6 >> 31
            r6 = r6 ^ r7
            r9 = 1
            int r6 = r6 >>> r9
            if (r7 == 0) goto L_0x021e
            r7 = r9
            goto L_0x021f
        L_0x021e:
            r7 = 0
        L_0x021f:
            r6 = r3[r6]
            l(r7, r6, r1)
            goto L_0x0226
        L_0x0225:
            r9 = 1
        L_0x0226:
            int r4 = r4 + -1
            if (r4 >= 0) goto L_0x023d
            byte[] r0 = new byte[r8]
            r6 = 0
            int r1 = i(r1, r0, r6)
            if (r1 == 0) goto L_0x023b
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 == 0) goto L_0x023b
            r4 = r9
            goto L_0x023c
        L_0x023b:
            r4 = r6
        L_0x023c:
            return r4
        L_0x023d:
            r6 = 0
            o(r1)
            goto L_0x01fc
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.e0.a.w(byte[], int, byte[], int, byte[], int, int):boolean");
    }
}
