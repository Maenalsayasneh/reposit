package s0.a.b.e0;

public final class i extends h {
    public int[] n = new int[48];
    public int[] o = new int[48];
    public int[] p = new int[192];
    public int[] q = new int[192];
    public int[] r = new int[8];

    public int b() {
        return 16;
    }

    public String getAlgorithmName() {
        return "CAST6";
    }

    public int j(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int i4 = i2;
        int[] iArr = new int[4];
        int e = e(bArr, i);
        int e2 = e(bArr3, i + 4);
        int e3 = e(bArr3, i + 8);
        int e4 = e(bArr3, i + 12);
        int i5 = 0;
        while (true) {
            if (i5 >= 6) {
                break;
            }
            int i6 = (11 - i5) * 4;
            e3 ^= f(e4, this.o[i6], this.n[i6]);
            int i7 = i6 + 1;
            e2 ^= g(e3, this.o[i7], this.n[i7]);
            int i8 = i6 + 2;
            e ^= h(e2, this.o[i8], this.n[i8]);
            int i9 = i6 + 3;
            e4 ^= f(e, this.o[i9], this.n[i9]);
            i5++;
        }
        for (i3 = 6; i3 < 12; i3++) {
            int i10 = (11 - i3) * 4;
            int i11 = i10 + 3;
            e4 ^= f(e, this.o[i11], this.n[i11]);
            int i12 = i10 + 2;
            e ^= h(e2, this.o[i12], this.n[i12]);
            int i13 = i10 + 1;
            e2 ^= g(e3, this.o[i13], this.n[i13]);
            e3 ^= f(e4, this.o[i10], this.n[i10]);
        }
        iArr[0] = e;
        iArr[1] = e2;
        iArr[2] = e3;
        iArr[3] = e4;
        c(iArr[0], bArr4, i4);
        c(iArr[1], bArr4, i4 + 4);
        c(iArr[2], bArr4, i4 + 8);
        c(iArr[3], bArr4, i4 + 12);
        return 16;
    }

    public int k(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3;
        int[] iArr = new int[4];
        int e = e(bArr, i);
        int e2 = e(bArr, i + 4);
        int e3 = e(bArr, i + 8);
        int e4 = e(bArr, i + 12);
        int i4 = 0;
        while (true) {
            if (i4 >= 6) {
                break;
            }
            int i5 = i4 * 4;
            e3 ^= f(e4, this.o[i5], this.n[i5]);
            int i6 = i5 + 1;
            e2 ^= g(e3, this.o[i6], this.n[i6]);
            int i7 = i5 + 2;
            e ^= h(e2, this.o[i7], this.n[i7]);
            int i8 = i5 + 3;
            e4 ^= f(e, this.o[i8], this.n[i8]);
            i4++;
        }
        for (i3 = 6; i3 < 12; i3++) {
            int i9 = i3 * 4;
            int i10 = i9 + 3;
            e4 ^= f(e, this.o[i10], this.n[i10]);
            int i11 = i9 + 2;
            e ^= h(e2, this.o[i11], this.n[i11]);
            int i12 = i9 + 1;
            e2 ^= g(e3, this.o[i12], this.n[i12]);
            e3 ^= f(e4, this.o[i9], this.n[i9]);
        }
        iArr[0] = e;
        iArr[1] = e2;
        iArr[2] = e3;
        iArr[3] = e4;
        c(iArr[0], bArr2, i2);
        c(iArr[1], bArr2, i2 + 4);
        c(iArr[2], bArr2, i2 + 8);
        c(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    public void l(byte[] bArr) {
        byte[] bArr2 = bArr;
        int i = 1518500249;
        int i2 = 19;
        for (int i3 = 0; i3 < 24; i3++) {
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = (i3 * 8) + i4;
                this.q[i5] = i;
                i += 1859775393;
                this.p[i5] = i2;
                i2 = (i2 + 17) & 31;
            }
        }
        byte[] bArr3 = new byte[64];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        for (int i6 = 0; i6 < 8; i6++) {
            this.r[i6] = e(bArr3, i6 * 4);
        }
        for (int i7 = 0; i7 < 12; i7++) {
            int i8 = i7 * 2;
            int i9 = i8 * 8;
            int[] iArr = this.r;
            iArr[6] = iArr[6] ^ f(iArr[7], this.q[i9], this.p[i9]);
            int[] iArr2 = this.r;
            int i10 = i9 + 1;
            iArr2[5] = iArr2[5] ^ g(iArr2[6], this.q[i10], this.p[i10]);
            int[] iArr3 = this.r;
            int i11 = i9 + 2;
            iArr3[4] = iArr3[4] ^ h(iArr3[5], this.q[i11], this.p[i11]);
            int[] iArr4 = this.r;
            int i12 = i9 + 3;
            iArr4[3] = f(iArr4[4], this.q[i12], this.p[i12]) ^ iArr4[3];
            int[] iArr5 = this.r;
            int i13 = i9 + 4;
            iArr5[2] = g(iArr5[3], this.q[i13], this.p[i13]) ^ iArr5[2];
            int[] iArr6 = this.r;
            int i14 = i9 + 5;
            iArr6[1] = h(iArr6[2], this.q[i14], this.p[i14]) ^ iArr6[1];
            int[] iArr7 = this.r;
            int i15 = i9 + 6;
            iArr7[0] = iArr7[0] ^ f(iArr7[1], this.q[i15], this.p[i15]);
            int[] iArr8 = this.r;
            int i16 = i9 + 7;
            iArr8[7] = g(iArr8[0], this.q[i16], this.p[i16]) ^ iArr8[7];
            int i17 = (i8 + 1) * 8;
            int[] iArr9 = this.r;
            iArr9[6] = iArr9[6] ^ f(iArr9[7], this.q[i17], this.p[i17]);
            int[] iArr10 = this.r;
            int i18 = i17 + 1;
            iArr10[5] = iArr10[5] ^ g(iArr10[6], this.q[i18], this.p[i18]);
            int[] iArr11 = this.r;
            int i19 = i17 + 2;
            iArr11[4] = iArr11[4] ^ h(iArr11[5], this.q[i19], this.p[i19]);
            int[] iArr12 = this.r;
            int i20 = i17 + 3;
            iArr12[3] = f(iArr12[4], this.q[i20], this.p[i20]) ^ iArr12[3];
            int[] iArr13 = this.r;
            int i21 = i17 + 4;
            iArr13[2] = g(iArr13[3], this.q[i21], this.p[i21]) ^ iArr13[2];
            int[] iArr14 = this.r;
            int i22 = i17 + 5;
            iArr14[1] = h(iArr14[2], this.q[i22], this.p[i22]) ^ iArr14[1];
            int[] iArr15 = this.r;
            int i23 = i17 + 6;
            iArr15[0] = iArr15[0] ^ f(iArr15[1], this.q[i23], this.p[i23]);
            int[] iArr16 = this.r;
            int i24 = i17 + 7;
            iArr16[7] = g(iArr16[0], this.q[i24], this.p[i24]) ^ iArr16[7];
            int[] iArr17 = this.n;
            int i25 = i7 * 4;
            int[] iArr18 = this.r;
            iArr17[i25] = iArr18[0] & 31;
            int i26 = i25 + 1;
            iArr17[i26] = iArr18[2] & 31;
            int i27 = i25 + 2;
            iArr17[i27] = iArr18[4] & 31;
            int i28 = i25 + 3;
            iArr17[i28] = iArr18[6] & 31;
            int[] iArr19 = this.o;
            iArr19[i25] = iArr18[7];
            iArr19[i26] = iArr18[5];
            iArr19[i27] = iArr18[3];
            iArr19[i28] = iArr18[1];
        }
    }

    public void reset() {
    }
}
