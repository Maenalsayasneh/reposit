package s0.a.b.b0;

import i0.d.a.a.a;
import s0.a.e.b.b0.c.h3;
import s0.a.g.f;

public class v extends h {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int[] i = new int[80];
    public int j;

    public v() {
        reset();
    }

    public v(v vVar) {
        super(vVar);
        i(vVar);
    }

    public f a() {
        return new v(this);
    }

    public void c(f fVar) {
        v vVar = (v) fVar;
        d(vVar);
        i(vVar);
    }

    public int doFinal(byte[] bArr, int i2) {
        e();
        h3.B1(this.d, bArr, i2);
        h3.B1(this.e, bArr, i2 + 4);
        h3.B1(this.f, bArr, i2 + 8);
        h3.B1(this.g, bArr, i2 + 12);
        h3.B1(this.h, bArr, i2 + 16);
        reset();
        return 20;
    }

    public void f() {
        for (int i2 = 16; i2 < 80; i2++) {
            int[] iArr = this.i;
            int i3 = ((iArr[i2 - 3] ^ iArr[i2 - 8]) ^ iArr[i2 - 14]) ^ iArr[i2 - 16];
            iArr[i2] = (i3 >>> 31) | (i3 << 1);
        }
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = 0;
        int i10 = 0;
        while (i9 < 4) {
            int i11 = i10 + 1;
            int X = a.X(j(i5, i6, i7) + ((i4 << 5) | (i4 >>> 27)), this.i[i10], 1518500249, i8);
            int i12 = (i5 >>> 2) | (i5 << 30);
            int i13 = i11 + 1;
            int X2 = a.X(j(i4, i12, i6) + ((X << 5) | (X >>> 27)), this.i[i11], 1518500249, i7);
            int i14 = (i4 >>> 2) | (i4 << 30);
            int i15 = i13 + 1;
            int X3 = a.X(j(X, i14, i12) + ((X2 << 5) | (X2 >>> 27)), this.i[i13], 1518500249, i6);
            i8 = (X >>> 2) | (X << 30);
            int i16 = i15 + 1;
            i5 = a.X(j(X2, i8, i14) + ((X3 << 5) | (X3 >>> 27)), this.i[i15], 1518500249, i12);
            i7 = (X2 >>> 2) | (X2 << 30);
            i4 = a.X(j(X3, i7, i8) + ((i5 << 5) | (i5 >>> 27)), this.i[i16], 1518500249, i14);
            i6 = (X3 >>> 2) | (X3 << 30);
            i9++;
            i10 = i16 + 1;
        }
        int i17 = 0;
        while (i17 < 4) {
            int[] iArr2 = this.i;
            int i18 = i10 + 1;
            int X4 = a.X(((i4 << 5) | (i4 >>> 27)) + ((i5 ^ i6) ^ i7), iArr2[i10], 1859775393, i8);
            int i19 = (i5 >>> 2) | (i5 << 30);
            int i20 = i18 + 1;
            int X5 = a.X(((X4 << 5) | (X4 >>> 27)) + ((i4 ^ i19) ^ i6), iArr2[i18], 1859775393, i7);
            int i21 = (i4 >>> 2) | (i4 << 30);
            int i22 = i20 + 1;
            int X6 = a.X(((X5 << 5) | (X5 >>> 27)) + ((X4 ^ i21) ^ i19), iArr2[i20], 1859775393, i6);
            i8 = (X4 >>> 2) | (X4 << 30);
            int i23 = i22 + 1;
            i5 = a.X(((X6 << 5) | (X6 >>> 27)) + ((X5 ^ i8) ^ i21), iArr2[i22], 1859775393, i19);
            i7 = (X5 >>> 2) | (X5 << 30);
            i4 = a.X(((i5 << 5) | (i5 >>> 27)) + ((X6 ^ i7) ^ i8), iArr2[i23], 1859775393, i21);
            i6 = (X6 >>> 2) | (X6 << 30);
            i17++;
            i10 = i23 + 1;
        }
        int i24 = 0;
        while (i24 < 4) {
            int i25 = i10 + 1;
            int X7 = a.X(k(i5, i6, i7) + ((i4 << 5) | (i4 >>> 27)), this.i[i10], -1894007588, i8);
            int i26 = (i5 >>> 2) | (i5 << 30);
            int i27 = i25 + 1;
            int X8 = a.X(k(i4, i26, i6) + ((X7 << 5) | (X7 >>> 27)), this.i[i25], -1894007588, i7);
            int i28 = (i4 >>> 2) | (i4 << 30);
            int i29 = i27 + 1;
            int X9 = a.X(k(X7, i28, i26) + ((X8 << 5) | (X8 >>> 27)), this.i[i27], -1894007588, i6);
            i8 = (X7 >>> 2) | (X7 << 30);
            int i30 = i29 + 1;
            i5 = a.X(k(X8, i8, i28) + ((X9 << 5) | (X9 >>> 27)), this.i[i29], -1894007588, i26);
            i7 = (X8 >>> 2) | (X8 << 30);
            i4 = a.X(k(X9, i7, i8) + ((i5 << 5) | (i5 >>> 27)), this.i[i30], -1894007588, i28);
            i6 = (X9 >>> 2) | (X9 << 30);
            i24++;
            i10 = i30 + 1;
        }
        int i31 = 0;
        while (i31 <= 3) {
            int[] iArr3 = this.i;
            int i32 = i10 + 1;
            int X10 = a.X(((i4 << 5) | (i4 >>> 27)) + ((i5 ^ i6) ^ i7), iArr3[i10], -899497514, i8);
            int i33 = (i5 >>> 2) | (i5 << 30);
            int i34 = i32 + 1;
            int X11 = a.X(((X10 << 5) | (X10 >>> 27)) + ((i4 ^ i33) ^ i6), iArr3[i32], -899497514, i7);
            int i35 = (i4 >>> 2) | (i4 << 30);
            int i36 = i34 + 1;
            int X12 = a.X(((X11 << 5) | (X11 >>> 27)) + ((X10 ^ i35) ^ i33), iArr3[i34], -899497514, i6);
            i8 = (X10 >>> 2) | (X10 << 30);
            int i37 = i36 + 1;
            i5 = a.X(((X12 << 5) | (X12 >>> 27)) + ((X11 ^ i8) ^ i35), iArr3[i36], -899497514, i33);
            i7 = (X11 >>> 2) | (X11 << 30);
            i4 = a.X(((i5 << 5) | (i5 >>> 27)) + ((X12 ^ i7) ^ i8), iArr3[i37], -899497514, i35);
            i6 = (X12 >>> 2) | (X12 << 30);
            i31++;
            i10 = i37 + 1;
        }
        this.d += i4;
        this.e += i5;
        this.f += i6;
        this.g += i7;
        this.h += i8;
        this.j = 0;
        for (int i38 = 0; i38 < 16; i38++) {
            this.i[i38] = 0;
        }
    }

    public void g(long j2) {
        if (this.j > 14) {
            f();
        }
        int[] iArr = this.i;
        iArr[14] = (int) (j2 >>> 32);
        iArr[15] = (int) j2;
    }

    public String getAlgorithmName() {
        return "SHA-1";
    }

    public int getDigestSize() {
        return 20;
    }

    public void h(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (bArr[i4 + 1] & 255) | (bArr[i2] << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8);
        int[] iArr = this.i;
        int i6 = this.j;
        iArr[i6] = i5;
        int i7 = i6 + 1;
        this.j = i7;
        if (i7 == 16) {
            f();
        }
    }

    public final void i(v vVar) {
        this.d = vVar.d;
        this.e = vVar.e;
        this.f = vVar.f;
        this.g = vVar.g;
        this.h = vVar.h;
        int[] iArr = vVar.i;
        System.arraycopy(iArr, 0, this.i, 0, iArr.length);
        this.j = vVar.j;
    }

    public final int j(int i2, int i3, int i4) {
        return ((~i2) & i4) | (i3 & i2);
    }

    public final int k(int i2, int i3, int i4) {
        return (i2 & i4) | (i2 & i3) | (i3 & i4);
    }

    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.j = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.i;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
