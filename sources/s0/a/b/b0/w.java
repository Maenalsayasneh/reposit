package s0.a.b.b0;

import s0.a.e.b.b0.c.h3;
import s0.a.g.f;

public class w extends h {
    public static final int[] d = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int[] m = new int[64];
    public int n;

    public w() {
        reset();
    }

    public w(w wVar) {
        super(wVar);
        m(wVar);
    }

    public f a() {
        return new w(this);
    }

    public void c(f fVar) {
        m((w) fVar);
    }

    public int doFinal(byte[] bArr, int i2) {
        e();
        h3.B1(this.e, bArr, i2);
        h3.B1(this.f, bArr, i2 + 4);
        h3.B1(this.g, bArr, i2 + 8);
        h3.B1(this.h, bArr, i2 + 12);
        h3.B1(this.i, bArr, i2 + 16);
        h3.B1(this.j, bArr, i2 + 20);
        h3.B1(this.k, bArr, i2 + 24);
        reset();
        return 28;
    }

    public void f() {
        for (int i2 = 16; i2 <= 63; i2++) {
            int[] iArr = this.m;
            int i3 = iArr[i2 - 2];
            int i4 = ((i3 >>> 10) ^ (((i3 >>> 17) | (i3 << 15)) ^ ((i3 >>> 19) | (i3 << 13)))) + iArr[i2 - 7];
            int i5 = iArr[i2 - 15];
            iArr[i2] = i4 + ((i5 >>> 3) ^ (((i5 >>> 7) | (i5 << 25)) ^ ((i5 >>> 18) | (i5 << 14)))) + iArr[i2 - 16];
        }
        int i6 = this.e;
        int i7 = this.f;
        int i8 = this.g;
        int i9 = this.h;
        int i10 = this.i;
        int i11 = this.j;
        int i12 = this.k;
        int i13 = this.l;
        int i14 = 0;
        int i15 = 0;
        while (i14 < 8) {
            int i16 = i(i10, i11, i12) + l(i10);
            int[] iArr2 = d;
            int i17 = i16 + iArr2[i15] + this.m[i15] + i13;
            int i18 = i9 + i17;
            int j2 = j(i6, i7, i8) + k(i6) + i17;
            int i19 = i15 + 1;
            int i20 = i(i18, i10, i11) + l(i18) + iArr2[i19] + this.m[i19] + i12;
            int i21 = i8 + i20;
            int j3 = j(j2, i6, i7) + k(j2) + i20;
            int i22 = i19 + 1;
            int i23 = i(i21, i18, i10) + l(i21) + iArr2[i22] + this.m[i22] + i11;
            int i24 = i7 + i23;
            int j4 = j(j3, j2, i6) + k(j3) + i23;
            int i25 = i22 + 1;
            int i26 = i(i24, i21, i18) + l(i24) + iArr2[i25] + this.m[i25] + i10;
            int i27 = i6 + i26;
            int j5 = j(j4, j3, j2) + k(j4) + i26;
            int i28 = i25 + 1;
            int i29 = i(i27, i24, i21) + l(i27) + iArr2[i28] + this.m[i28] + i18;
            int i30 = j2 + i29;
            int j6 = j(j5, j4, j3) + k(j5) + i29;
            int i31 = i28 + 1;
            int i32 = i(i30, i27, i24) + l(i30) + iArr2[i31] + this.m[i31] + i21;
            int i33 = j3 + i32;
            int j7 = j(j6, j5, j4) + k(j6) + i32;
            int i34 = i31 + 1;
            int i35 = i(i33, i30, i27) + l(i33) + iArr2[i34] + this.m[i34] + i24;
            int i36 = j4 + i35;
            int j8 = j(j7, j6, j5) + k(j7) + i35;
            int i37 = i34 + 1;
            int i38 = i(i36, i33, i30) + l(i36) + iArr2[i37] + this.m[i37] + i27;
            i15 = i37 + 1;
            i14++;
            int i39 = j6;
            i10 = j5 + i38;
            i6 = j(j8, j7, j6) + k(j8) + i38;
            i11 = i36;
            i7 = j8;
            i12 = i33;
            i8 = j7;
            i13 = i30;
            i9 = i39;
        }
        this.e += i6;
        this.f += i7;
        this.g += i8;
        this.h += i9;
        this.i += i10;
        this.j += i11;
        this.k += i12;
        this.l += i13;
        this.n = 0;
        for (int i40 = 0; i40 < 16; i40++) {
            this.m[i40] = 0;
        }
    }

    public void g(long j2) {
        if (this.n > 14) {
            f();
        }
        int[] iArr = this.m;
        iArr[14] = (int) (j2 >>> 32);
        iArr[15] = (int) (j2 & -1);
    }

    public String getAlgorithmName() {
        return "SHA-224";
    }

    public int getDigestSize() {
        return 28;
    }

    public void h(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (bArr[i4 + 1] & 255) | (bArr[i2] << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8);
        int[] iArr = this.m;
        int i6 = this.n;
        iArr[i6] = i5;
        int i7 = i6 + 1;
        this.n = i7;
        if (i7 == 16) {
            f();
        }
    }

    public final int i(int i2, int i3, int i4) {
        return ((~i2) & i4) ^ (i3 & i2);
    }

    public final int j(int i2, int i3, int i4) {
        return ((i2 & i4) ^ (i2 & i3)) ^ (i3 & i4);
    }

    public final int k(int i2) {
        return ((i2 << 10) | (i2 >>> 22)) ^ (((i2 >>> 2) | (i2 << 30)) ^ ((i2 >>> 13) | (i2 << 19)));
    }

    public final int l(int i2) {
        return ((i2 << 7) | (i2 >>> 25)) ^ (((i2 >>> 6) | (i2 << 26)) ^ ((i2 >>> 11) | (i2 << 21)));
    }

    public final void m(w wVar) {
        d(wVar);
        this.e = wVar.e;
        this.f = wVar.f;
        this.g = wVar.g;
        this.h = wVar.h;
        this.i = wVar.i;
        this.j = wVar.j;
        this.k = wVar.k;
        this.l = wVar.l;
        int[] iArr = wVar.m;
        System.arraycopy(iArr, 0, this.m, 0, iArr.length);
        this.n = wVar.n;
    }

    public void reset() {
        super.reset();
        this.e = -1056596264;
        this.f = 914150663;
        this.g = 812702999;
        this.h = -150054599;
        this.i = -4191439;
        this.j = 1750603025;
        this.k = 1694076839;
        this.l = -1090891868;
        this.n = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.m;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
