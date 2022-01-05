package s0.a.b.b0;

import s0.a.g.f;

public class r extends h {
    public int d;
    public int e;
    public int f;
    public int g;
    public int[] h = new int[16];
    public int i;

    public r() {
        reset();
    }

    public r(r rVar) {
        super(rVar);
        r(rVar);
    }

    public f a() {
        return new r(this);
    }

    public void c(f fVar) {
        r((r) fVar);
    }

    public int doFinal(byte[] bArr, int i2) {
        e();
        s(this.d, bArr, i2);
        s(this.e, bArr, i2 + 4);
        s(this.f, bArr, i2 + 8);
        s(this.g, bArr, i2 + 12);
        reset();
        return 16;
    }

    public void f() {
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.g;
        int i6 = i(i2, i3, i4, i5, this.h[0], 11);
        int i7 = i(i5, i6, i3, i4, this.h[1], 14);
        int i8 = i(i4, i7, i6, i3, this.h[2], 15);
        int i9 = i(i3, i8, i7, i6, this.h[3], 12);
        int i10 = i(i6, i9, i8, i7, this.h[4], 5);
        int i11 = i(i7, i10, i9, i8, this.h[5], 8);
        int i12 = i(i8, i11, i10, i9, this.h[6], 7);
        int i13 = i(i9, i12, i11, i10, this.h[7], 9);
        int i14 = i(i10, i13, i12, i11, this.h[8], 11);
        int i15 = i(i11, i14, i13, i12, this.h[9], 13);
        int i16 = i(i12, i15, i14, i13, this.h[10], 14);
        int i17 = i(i13, i16, i15, i14, this.h[11], 15);
        int i18 = i(i14, i17, i16, i15, this.h[12], 6);
        int i19 = i(i15, i18, i17, i16, this.h[13], 7);
        int i20 = i(i16, i19, i18, i17, this.h[14], 9);
        int i21 = i(i17, i20, i19, i18, this.h[15], 8);
        int j = j(i18, i21, i20, i19, this.h[7], 7);
        int j2 = j(i19, j, i21, i20, this.h[4], 6);
        int j3 = j(i20, j2, j, i21, this.h[13], 8);
        int j4 = j(i21, j3, j2, j, this.h[1], 13);
        int j5 = j(j, j4, j3, j2, this.h[10], 11);
        int j6 = j(j2, j5, j4, j3, this.h[6], 9);
        int j7 = j(j3, j6, j5, j4, this.h[15], 7);
        int j8 = j(j4, j7, j6, j5, this.h[3], 15);
        int j9 = j(j5, j8, j7, j6, this.h[12], 7);
        int j10 = j(j6, j9, j8, j7, this.h[0], 12);
        int j11 = j(j7, j10, j9, j8, this.h[9], 15);
        int j12 = j(j8, j11, j10, j9, this.h[5], 9);
        int j13 = j(j9, j12, j11, j10, this.h[2], 11);
        int j14 = j(j10, j13, j12, j11, this.h[14], 7);
        int j15 = j(j11, j14, j13, j12, this.h[11], 13);
        int j16 = j(j12, j15, j14, j13, this.h[8], 12);
        int k = k(j13, j16, j15, j14, this.h[3], 11);
        int k2 = k(j14, k, j16, j15, this.h[10], 13);
        int k3 = k(j15, k2, k, j16, this.h[14], 6);
        int k4 = k(j16, k3, k2, k, this.h[4], 7);
        int k5 = k(k, k4, k3, k2, this.h[9], 14);
        int k6 = k(k2, k5, k4, k3, this.h[15], 9);
        int k7 = k(k3, k6, k5, k4, this.h[8], 13);
        int k8 = k(k4, k7, k6, k5, this.h[1], 15);
        int k9 = k(k5, k8, k7, k6, this.h[2], 14);
        int k10 = k(k6, k9, k8, k7, this.h[7], 8);
        int k11 = k(k7, k10, k9, k8, this.h[0], 13);
        int k12 = k(k8, k11, k10, k9, this.h[6], 6);
        int k13 = k(k9, k12, k11, k10, this.h[13], 5);
        int k14 = k(k10, k13, k12, k11, this.h[11], 12);
        int k15 = k(k11, k14, k13, k12, this.h[5], 7);
        int k16 = k(k12, k15, k14, k13, this.h[12], 5);
        int l = l(k13, k16, k15, k14, this.h[1], 11);
        int l2 = l(k14, l, k16, k15, this.h[9], 12);
        int l3 = l(k15, l2, l, k16, this.h[11], 14);
        int l4 = l(k16, l3, l2, l, this.h[10], 15);
        int l5 = l(l, l4, l3, l2, this.h[0], 14);
        int l6 = l(l2, l5, l4, l3, this.h[8], 15);
        int l7 = l(l3, l6, l5, l4, this.h[12], 9);
        int l8 = l(l4, l7, l6, l5, this.h[4], 8);
        int l9 = l(l5, l8, l7, l6, this.h[13], 9);
        int l10 = l(l6, l9, l8, l7, this.h[3], 14);
        int l11 = l(l7, l10, l9, l8, this.h[7], 5);
        int l12 = l(l8, l11, l10, l9, this.h[15], 6);
        int l13 = l(l9, l12, l11, l10, this.h[14], 8);
        int l14 = l(l10, l13, l12, l11, this.h[5], 6);
        int l15 = l(l11, l14, l13, l12, this.h[6], 5);
        int l16 = l(l12, l15, l14, l13, this.h[2], 12);
        int p = p(i2, i3, i4, i5, this.h[5], 8);
        int p2 = p(i5, p, i3, i4, this.h[14], 9);
        int p3 = p(i4, p2, p, i3, this.h[7], 9);
        int p4 = p(i3, p3, p2, p, this.h[0], 11);
        int p5 = p(p, p4, p3, p2, this.h[9], 13);
        int p6 = p(p2, p5, p4, p3, this.h[2], 15);
        int p7 = p(p3, p6, p5, p4, this.h[11], 15);
        int p8 = p(p4, p7, p6, p5, this.h[4], 5);
        int p9 = p(p5, p8, p7, p6, this.h[13], 7);
        int p10 = p(p6, p9, p8, p7, this.h[6], 7);
        int p11 = p(p7, p10, p9, p8, this.h[15], 8);
        int p12 = p(p8, p11, p10, p9, this.h[8], 11);
        int p13 = p(p9, p12, p11, p10, this.h[1], 14);
        int p14 = p(p10, p13, p12, p11, this.h[10], 14);
        int p15 = p(p11, p14, p13, p12, this.h[3], 12);
        int p16 = p(p12, p15, p14, p13, this.h[12], 6);
        int o = o(p13, p16, p15, p14, this.h[6], 9);
        int o2 = o(p14, o, p16, p15, this.h[11], 13);
        int o3 = o(p15, o2, o, p16, this.h[3], 15);
        int o4 = o(p16, o3, o2, o, this.h[7], 7);
        int o5 = o(o, o4, o3, o2, this.h[0], 12);
        int o6 = o(o2, o5, o4, o3, this.h[13], 8);
        int o7 = o(o3, o6, o5, o4, this.h[5], 9);
        int o8 = o(o4, o7, o6, o5, this.h[10], 11);
        int o9 = o(o5, o8, o7, o6, this.h[14], 7);
        int o10 = o(o6, o9, o8, o7, this.h[15], 7);
        int o11 = o(o7, o10, o9, o8, this.h[8], 12);
        int o12 = o(o8, o11, o10, o9, this.h[12], 7);
        int o13 = o(o9, o12, o11, o10, this.h[4], 6);
        int o14 = o(o10, o13, o12, o11, this.h[9], 15);
        int o15 = o(o11, o14, o13, o12, this.h[1], 13);
        int o16 = o(o12, o15, o14, o13, this.h[2], 11);
        int n = n(o13, o16, o15, o14, this.h[15], 9);
        int n2 = n(o14, n, o16, o15, this.h[5], 7);
        int n3 = n(o15, n2, n, o16, this.h[1], 15);
        int n4 = n(o16, n3, n2, n, this.h[3], 11);
        int n5 = n(n, n4, n3, n2, this.h[7], 8);
        int n6 = n(n2, n5, n4, n3, this.h[14], 6);
        int n7 = n(n3, n6, n5, n4, this.h[6], 6);
        int n8 = n(n4, n7, n6, n5, this.h[9], 14);
        int n9 = n(n5, n8, n7, n6, this.h[11], 12);
        int n10 = n(n6, n9, n8, n7, this.h[8], 13);
        int n11 = n(n7, n10, n9, n8, this.h[12], 5);
        int n12 = n(n8, n11, n10, n9, this.h[2], 14);
        int n13 = n(n9, n12, n11, n10, this.h[10], 13);
        int n14 = n(n10, n13, n12, n11, this.h[0], 13);
        int n15 = n(n11, n14, n13, n12, this.h[4], 7);
        int n16 = n(n12, n15, n14, n13, this.h[13], 5);
        int m = m(n13, n16, n15, n14, this.h[8], 15);
        int m2 = m(n14, m, n16, n15, this.h[6], 5);
        int m3 = m(n15, m2, m, n16, this.h[4], 8);
        int m4 = m(n16, m3, m2, m, this.h[1], 11);
        int m5 = m(m, m4, m3, m2, this.h[3], 14);
        int m6 = m(m2, m5, m4, m3, this.h[11], 14);
        int m7 = m(m3, m6, m5, m4, this.h[15], 6);
        int m8 = m(m4, m7, m6, m5, this.h[0], 14);
        int m9 = m(m5, m8, m7, m6, this.h[5], 6);
        int m10 = m(m6, m9, m8, m7, this.h[12], 9);
        int m11 = m(m7, m10, m9, m8, this.h[2], 12);
        int m12 = m(m8, m11, m10, m9, this.h[13], 9);
        int m13 = m(m9, m12, m11, m10, this.h[9], 12);
        int m14 = m(m10, m13, m12, m11, this.h[7], 5);
        int m15 = m(m11, m14, m13, m12, this.h[10], 15);
        int m16 = m(m12, m15, m14, m13, this.h[14], 8);
        this.e = this.f + l14 + m13;
        this.f = this.g + l13 + m16;
        this.g = this.d + l16 + m15;
        this.d = l15 + this.e + m14;
        this.i = 0;
        int i22 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i22 != iArr.length) {
                iArr[i22] = 0;
                i22++;
            } else {
                return;
            }
        }
    }

    public void g(long j) {
        if (this.i > 14) {
            f();
        }
        int[] iArr = this.h;
        iArr[14] = (int) (-1 & j);
        iArr[15] = (int) (j >>> 32);
    }

    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    public int getDigestSize() {
        return 16;
    }

    public void h(byte[] bArr, int i2) {
        int[] iArr = this.h;
        int i3 = this.i;
        int i4 = i3 + 1;
        this.i = i4;
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

    public final void r(r rVar) {
        d(rVar);
        this.d = rVar.d;
        this.e = rVar.e;
        this.f = rVar.f;
        this.g = rVar.g;
        int[] iArr = rVar.h;
        System.arraycopy(iArr, 0, this.h, 0, iArr.length);
        this.i = rVar.i;
    }

    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.h;
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
