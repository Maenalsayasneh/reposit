package s0.a.b.b0;

import i0.d.a.a.a;
import s0.a.g.f;

public class o extends h {
    public int d;
    public int e;
    public int f;
    public int g;
    public int[] h = new int[16];
    public int i;

    public o() {
        reset();
    }

    public o(o oVar) {
        super(oVar);
        k(oVar);
    }

    public f a() {
        return new o(this);
    }

    public void c(f fVar) {
        k((o) fVar);
    }

    public int doFinal(byte[] bArr, int i2) {
        e();
        m(this.d, bArr, i2);
        m(this.e, bArr, i2 + 4);
        m(this.f, bArr, i2 + 8);
        m(this.g, bArr, i2 + 12);
        reset();
        return 16;
    }

    public void f() {
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.g;
        int l = l(i(i3, i4, i5) + i2 + this.h[0], 3);
        int l2 = l(i(l, i3, i4) + i5 + this.h[1], 7);
        int l3 = l(i(l2, l, i3) + i4 + this.h[2], 11);
        int l4 = l(i(l3, l2, l) + i3 + this.h[3], 19);
        int l5 = l(i(l4, l3, l2) + l + this.h[4], 3);
        int l6 = l(i(l5, l4, l3) + l2 + this.h[5], 7);
        int l7 = l(i(l6, l5, l4) + l3 + this.h[6], 11);
        int l8 = l(i(l7, l6, l5) + l4 + this.h[7], 19);
        int l9 = l(i(l8, l7, l6) + l5 + this.h[8], 3);
        int l10 = l(i(l9, l8, l7) + l6 + this.h[9], 7);
        int l11 = l(i(l10, l9, l8) + l7 + this.h[10], 11);
        int l12 = l(i(l11, l10, l9) + l8 + this.h[11], 19);
        int l13 = l(i(l12, l11, l10) + l9 + this.h[12], 3);
        int l14 = l(i(l13, l12, l11) + l10 + this.h[13], 7);
        int l15 = l(i(l14, l13, l12) + l11 + this.h[14], 11);
        int l16 = l(i(l15, l14, l13) + l12 + this.h[15], 19);
        int i02 = a.i0(j(l16, l15, l14) + l13, this.h[0], 1518500249, this, 3);
        int i03 = a.i0(j(i02, l16, l15) + l14, this.h[4], 1518500249, this, 5);
        int i04 = a.i0(j(i03, i02, l16) + l15, this.h[8], 1518500249, this, 9);
        int i05 = a.i0(j(i04, i03, i02) + l16, this.h[12], 1518500249, this, 13);
        int i06 = a.i0(j(i05, i04, i03) + i02, this.h[1], 1518500249, this, 3);
        int i07 = a.i0(j(i06, i05, i04) + i03, this.h[5], 1518500249, this, 5);
        int i08 = a.i0(j(i07, i06, i05) + i04, this.h[9], 1518500249, this, 9);
        int i09 = a.i0(j(i08, i07, i06) + i05, this.h[13], 1518500249, this, 13);
        int i010 = a.i0(j(i09, i08, i07) + i06, this.h[2], 1518500249, this, 3);
        int i011 = a.i0(j(i010, i09, i08) + i07, this.h[6], 1518500249, this, 5);
        int i012 = a.i0(j(i011, i010, i09) + i08, this.h[10], 1518500249, this, 9);
        int i013 = a.i0(j(i012, i011, i010) + i09, this.h[14], 1518500249, this, 13);
        int i014 = a.i0(j(i013, i012, i011) + i010, this.h[3], 1518500249, this, 3);
        int i015 = a.i0(j(i014, i013, i012) + i011, this.h[7], 1518500249, this, 5);
        int i016 = a.i0(j(i015, i014, i013) + i012, this.h[11], 1518500249, this, 9);
        int i017 = a.i0(j(i016, i015, i014) + i013, this.h[15], 1518500249, this, 13);
        int i018 = a.i0(i014 + ((i017 ^ i016) ^ i015), this.h[0], 1859775393, this, 3);
        int i019 = a.i0(i015 + ((i018 ^ i017) ^ i016), this.h[8], 1859775393, this, 9);
        int i020 = a.i0(i016 + ((i019 ^ i018) ^ i017), this.h[4], 1859775393, this, 11);
        int i021 = a.i0(i017 + ((i020 ^ i019) ^ i018), this.h[12], 1859775393, this, 15);
        int i022 = a.i0(i018 + ((i021 ^ i020) ^ i019), this.h[2], 1859775393, this, 3);
        int i023 = a.i0(i019 + ((i022 ^ i021) ^ i020), this.h[10], 1859775393, this, 9);
        int i024 = a.i0(i020 + ((i023 ^ i022) ^ i021), this.h[6], 1859775393, this, 11);
        int i025 = a.i0(i021 + ((i024 ^ i023) ^ i022), this.h[14], 1859775393, this, 15);
        int i026 = a.i0(i022 + ((i025 ^ i024) ^ i023), this.h[1], 1859775393, this, 3);
        int i027 = a.i0(i023 + ((i026 ^ i025) ^ i024), this.h[9], 1859775393, this, 9);
        int i028 = a.i0(i024 + ((i027 ^ i026) ^ i025), this.h[5], 1859775393, this, 11);
        int i029 = a.i0(i025 + ((i028 ^ i027) ^ i026), this.h[13], 1859775393, this, 15);
        int i030 = a.i0(i026 + ((i029 ^ i028) ^ i027), this.h[3], 1859775393, this, 3);
        int i031 = a.i0(i027 + ((i030 ^ i029) ^ i028), this.h[11], 1859775393, this, 9);
        int i032 = a.i0(i028 + ((i031 ^ i030) ^ i029), this.h[7], 1859775393, this, 11);
        int i033 = a.i0(i029 + ((i032 ^ i031) ^ i030), this.h[15], 1859775393, this, 15);
        this.d += i030;
        this.e += i033;
        this.f += i032;
        this.g += i031;
        this.i = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i6 != iArr.length) {
                iArr[i6] = 0;
                i6++;
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
        return "MD4";
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

    public final int i(int i2, int i3, int i4) {
        return ((~i2) & i4) | (i3 & i2);
    }

    public final int j(int i2, int i3, int i4) {
        return (i2 & i4) | (i2 & i3) | (i3 & i4);
    }

    public final void k(o oVar) {
        d(oVar);
        this.d = oVar.d;
        this.e = oVar.e;
        this.f = oVar.f;
        this.g = oVar.g;
        int[] iArr = oVar.h;
        System.arraycopy(iArr, 0, this.h, 0, iArr.length);
        this.i = oVar.i;
    }

    public final int l(int i2, int i3) {
        return (i2 >>> (32 - i3)) | (i2 << i3);
    }

    public final void m(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
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
}
