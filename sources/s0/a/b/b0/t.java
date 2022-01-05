package s0.a.b.b0;

import s0.a.g.f;

public class t extends h {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int[] l = new int[16];
    public int m;

    public t() {
        reset();
    }

    public t(t tVar) {
        super(tVar);
        r(tVar);
    }

    public f a() {
        return new t(this);
    }

    public void c(f fVar) {
        r((t) fVar);
    }

    public int doFinal(byte[] bArr, int i2) {
        e();
        s(this.d, bArr, i2);
        s(this.e, bArr, i2 + 4);
        s(this.f, bArr, i2 + 8);
        s(this.g, bArr, i2 + 12);
        s(this.h, bArr, i2 + 16);
        s(this.i, bArr, i2 + 20);
        s(this.j, bArr, i2 + 24);
        s(this.k, bArr, i2 + 28);
        reset();
        return 32;
    }

    public void f() {
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.g;
        int i6 = this.h;
        int i7 = this.i;
        int i8 = this.j;
        int i9 = this.k;
        int i10 = i(i2, i3, i4, i5, this.l[0], 11);
        int i11 = i(i5, i10, i3, i4, this.l[1], 14);
        int i12 = i(i4, i11, i10, i3, this.l[2], 15);
        int i13 = i(i3, i12, i11, i10, this.l[3], 12);
        int i14 = i(i10, i13, i12, i11, this.l[4], 5);
        int i15 = i(i11, i14, i13, i12, this.l[5], 8);
        int i16 = i(i12, i15, i14, i13, this.l[6], 7);
        int i17 = i(i13, i16, i15, i14, this.l[7], 9);
        int i18 = i(i14, i17, i16, i15, this.l[8], 11);
        int i19 = i(i15, i18, i17, i16, this.l[9], 13);
        int i20 = i(i16, i19, i18, i17, this.l[10], 14);
        int i21 = i(i17, i20, i19, i18, this.l[11], 15);
        int i22 = i(i18, i21, i20, i19, this.l[12], 6);
        int i23 = i(i19, i22, i21, i20, this.l[13], 7);
        int i24 = i(i20, i23, i22, i21, this.l[14], 9);
        int i25 = i(i21, i24, i23, i22, this.l[15], 8);
        int p = p(i6, i7, i8, i9, this.l[5], 8);
        int p2 = p(i9, p, i7, i8, this.l[14], 9);
        int p3 = p(i8, p2, p, i7, this.l[7], 9);
        int p4 = p(i7, p3, p2, p, this.l[0], 11);
        int p5 = p(p, p4, p3, p2, this.l[9], 13);
        int p6 = p(p2, p5, p4, p3, this.l[2], 15);
        int p7 = p(p3, p6, p5, p4, this.l[11], 15);
        int p8 = p(p4, p7, p6, p5, this.l[4], 5);
        int p9 = p(p5, p8, p7, p6, this.l[13], 7);
        int p10 = p(p6, p9, p8, p7, this.l[6], 7);
        int p11 = p(p7, p10, p9, p8, this.l[15], 8);
        int p12 = p(p8, p11, p10, p9, this.l[8], 11);
        int p13 = p(p9, p12, p11, p10, this.l[1], 14);
        int p14 = p(p10, p13, p12, p11, this.l[10], 14);
        int p15 = p(p11, p14, p13, p12, this.l[3], 12);
        int p16 = p(p12, p15, p14, p13, this.l[12], 6);
        int j2 = j(p13, i25, i24, i23, this.l[7], 7);
        int j3 = j(i23, j2, i25, i24, this.l[4], 6);
        int j4 = j(i24, j3, j2, i25, this.l[13], 8);
        int j5 = j(i25, j4, j3, j2, this.l[1], 13);
        int j6 = j(j2, j5, j4, j3, this.l[10], 11);
        int j7 = j(j3, j6, j5, j4, this.l[6], 9);
        int j8 = j(j4, j7, j6, j5, this.l[15], 7);
        int j9 = j(j5, j8, j7, j6, this.l[3], 15);
        int j10 = j(j6, j9, j8, j7, this.l[12], 7);
        int j11 = j(j7, j10, j9, j8, this.l[0], 12);
        int j12 = j(j8, j11, j10, j9, this.l[9], 15);
        int j13 = j(j9, j12, j11, j10, this.l[5], 9);
        int j14 = j(j10, j13, j12, j11, this.l[2], 11);
        int j15 = j(j11, j14, j13, j12, this.l[14], 7);
        int j16 = j(j12, j15, j14, j13, this.l[11], 13);
        int j17 = j(j13, j16, j15, j14, this.l[8], 12);
        int o = o(i22, p16, p15, p14, this.l[6], 9);
        int o2 = o(p14, o, p16, p15, this.l[11], 13);
        int o3 = o(p15, o2, o, p16, this.l[3], 15);
        int o4 = o(p16, o3, o2, o, this.l[7], 7);
        int o5 = o(o, o4, o3, o2, this.l[0], 12);
        int o6 = o(o2, o5, o4, o3, this.l[13], 8);
        int o7 = o(o3, o6, o5, o4, this.l[5], 9);
        int o8 = o(o4, o7, o6, o5, this.l[10], 11);
        int o9 = o(o5, o8, o7, o6, this.l[14], 7);
        int o10 = o(o6, o9, o8, o7, this.l[15], 7);
        int o11 = o(o7, o10, o9, o8, this.l[8], 12);
        int o12 = o(o8, o11, o10, o9, this.l[12], 7);
        int o13 = o(o9, o12, o11, o10, this.l[4], 6);
        int o14 = o(o10, o13, o12, o11, this.l[9], 15);
        int o15 = o(o11, o14, o13, o12, this.l[1], 13);
        int o16 = o(o12, o15, o14, o13, this.l[2], 11);
        int k2 = k(j14, o16, j16, j15, this.l[3], 11);
        int k3 = k(j15, k2, o16, j16, this.l[10], 13);
        int k4 = k(j16, k3, k2, o16, this.l[14], 6);
        int k5 = k(o16, k4, k3, k2, this.l[4], 7);
        int k6 = k(k2, k5, k4, k3, this.l[9], 14);
        int k7 = k(k3, k6, k5, k4, this.l[15], 9);
        int k8 = k(k4, k7, k6, k5, this.l[8], 13);
        int k9 = k(k5, k8, k7, k6, this.l[1], 15);
        int k10 = k(k6, k9, k8, k7, this.l[2], 14);
        int k11 = k(k7, k10, k9, k8, this.l[7], 8);
        int k12 = k(k8, k11, k10, k9, this.l[0], 13);
        int k13 = k(k9, k12, k11, k10, this.l[6], 6);
        int k14 = k(k10, k13, k12, k11, this.l[13], 5);
        int k15 = k(k11, k14, k13, k12, this.l[11], 12);
        int k16 = k(k12, k15, k14, k13, this.l[5], 7);
        int k17 = k(k13, k16, k15, k14, this.l[12], 5);
        int n = n(o13, j17, o15, o14, this.l[15], 9);
        int n2 = n(o14, n, j17, o15, this.l[5], 7);
        int n3 = n(o15, n2, n, j17, this.l[1], 15);
        int n4 = n(j17, n3, n2, n, this.l[3], 11);
        int n5 = n(n, n4, n3, n2, this.l[7], 8);
        int n6 = n(n2, n5, n4, n3, this.l[14], 6);
        int n7 = n(n3, n6, n5, n4, this.l[6], 6);
        int n8 = n(n4, n7, n6, n5, this.l[9], 14);
        int n9 = n(n5, n8, n7, n6, this.l[11], 12);
        int n10 = n(n6, n9, n8, n7, this.l[8], 13);
        int n11 = n(n7, n10, n9, n8, this.l[12], 5);
        int n12 = n(n8, n11, n10, n9, this.l[2], 14);
        int n13 = n(n9, n12, n11, n10, this.l[10], 13);
        int n14 = n(n10, n13, n12, n11, this.l[0], 13);
        int n15 = n(n11, n14, n13, n12, this.l[4], 7);
        int n16 = n(n12, n15, n14, n13, this.l[13], 5);
        int l2 = l(k14, k17, n15, k15, this.l[1], 11);
        int l3 = l(k15, l2, k17, n15, this.l[9], 12);
        int l4 = l(n15, l3, l2, k17, this.l[11], 14);
        int l5 = l(k17, l4, l3, l2, this.l[10], 15);
        int l6 = l(l2, l5, l4, l3, this.l[0], 14);
        int l7 = l(l3, l6, l5, l4, this.l[8], 15);
        int l8 = l(l4, l7, l6, l5, this.l[12], 9);
        int l9 = l(l5, l8, l7, l6, this.l[4], 8);
        int l10 = l(l6, l9, l8, l7, this.l[13], 9);
        int l11 = l(l7, l10, l9, l8, this.l[3], 14);
        int l12 = l(l8, l11, l10, l9, this.l[7], 5);
        int l13 = l(l9, l12, l11, l10, this.l[15], 6);
        int l14 = l(l10, l13, l12, l11, this.l[14], 8);
        int l15 = l(l11, l14, l13, l12, this.l[5], 6);
        int l16 = l(l12, l15, l14, l13, this.l[6], 5);
        int l17 = l(l13, l16, l15, l14, this.l[2], 12);
        int m2 = m(n13, n16, k16, n14, this.l[8], 15);
        int m3 = m(n14, m2, n16, k16, this.l[6], 5);
        int m4 = m(k16, m3, m2, n16, this.l[4], 8);
        int m5 = m(n16, m4, m3, m2, this.l[1], 11);
        int m6 = m(m2, m5, m4, m3, this.l[3], 14);
        int m7 = m(m3, m6, m5, m4, this.l[11], 14);
        int m8 = m(m4, m7, m6, m5, this.l[15], 6);
        int m9 = m(m5, m8, m7, m6, this.l[0], 14);
        int m10 = m(m6, m9, m8, m7, this.l[5], 6);
        int m11 = m(m7, m10, m9, m8, this.l[12], 9);
        int m12 = m(m8, m11, m10, m9, this.l[2], 12);
        int m13 = m(m9, m12, m11, m10, this.l[13], 9);
        int m14 = m(m10, m13, m12, m11, this.l[9], 12);
        int m15 = m(m11, m14, m13, m12, this.l[7], 5);
        int m16 = m(m12, m15, m14, m13, this.l[10], 15);
        int m17 = m(m13, m16, m15, m14, this.l[14], 8);
        this.d += l14;
        this.e += l17;
        this.f += l16;
        this.g += m15;
        this.h += m14;
        this.i += m17;
        this.j += m16;
        this.k += l15;
        this.m = 0;
        int i26 = 0;
        while (true) {
            int[] iArr = this.l;
            if (i26 != iArr.length) {
                iArr[i26] = 0;
                i26++;
            } else {
                return;
            }
        }
    }

    public void g(long j2) {
        if (this.m > 14) {
            f();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (-1 & j2);
        iArr[15] = (int) (j2 >>> 32);
    }

    public String getAlgorithmName() {
        return "RIPEMD256";
    }

    public int getDigestSize() {
        return 32;
    }

    public void h(byte[] bArr, int i2) {
        int[] iArr = this.l;
        int i3 = this.m;
        int i4 = i3 + 1;
        this.m = i4;
        iArr[i3] = ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        if (i4 == 16) {
            f();
        }
    }

    public final int i(int i2, int i3, int i4, int i5, int i6, int i7) {
        return q(i2 + ((i3 ^ i4) ^ i5) + i6, i7);
    }

    public final int j(int i2, int i3, int i4, int i5, int i6, int i7) {
        return q(i2 + (((~i3) & i5) | (i4 & i3)) + i6 + 1518500249, i7);
    }

    public final int k(int i2, int i3, int i4, int i5, int i6, int i7) {
        return q(i2 + ((i3 | (~i4)) ^ i5) + i6 + 1859775393, i7);
    }

    public final int l(int i2, int i3, int i4, int i5, int i6, int i7) {
        return q(((i2 + ((i3 & i5) | (i4 & (~i5)))) + i6) - 1894007588, i7);
    }

    public final int m(int i2, int i3, int i4, int i5, int i6, int i7) {
        return q(i2 + ((i3 ^ i4) ^ i5) + i6, i7);
    }

    public final int n(int i2, int i3, int i4, int i5, int i6, int i7) {
        return q(i2 + (((~i3) & i5) | (i4 & i3)) + i6 + 1836072691, i7);
    }

    public final int o(int i2, int i3, int i4, int i5, int i6, int i7) {
        return q(i2 + ((i3 | (~i4)) ^ i5) + i6 + 1548603684, i7);
    }

    public final int p(int i2, int i3, int i4, int i5, int i6, int i7) {
        return q(i2 + ((i3 & i5) | (i4 & (~i5))) + i6 + 1352829926, i7);
    }

    public final int q(int i2, int i3) {
        return (i2 >>> (32 - i3)) | (i2 << i3);
    }

    public final void r(t tVar) {
        d(tVar);
        this.d = tVar.d;
        this.e = tVar.e;
        this.f = tVar.f;
        this.g = tVar.g;
        this.h = tVar.h;
        this.i = tVar.i;
        this.j = tVar.j;
        this.k = tVar.k;
        int[] iArr = tVar.l;
        System.arraycopy(iArr, 0, this.l, 0, iArr.length);
        this.m = tVar.m;
    }

    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = 1985229328;
        this.i = -19088744;
        this.j = -1985229329;
        this.k = 19088743;
        this.m = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.l;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }

    public final void s(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }
}
