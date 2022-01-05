package s0.a.b.b0;

import i0.d.a.a.a;
import s0.a.e.b.b0.c.h3;
import s0.a.g.f;

public class d0 extends h {
    public static final int[] d = new int[64];
    public int[] e = new int[8];
    public int[] f = new int[16];
    public int g;
    public int[] h = new int[68];

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            d[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            d[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public d0() {
        reset();
    }

    public d0(d0 d0Var) {
        super(d0Var);
        i(d0Var);
    }

    public f a() {
        return new d0(this);
    }

    public void c(f fVar) {
        d0 d0Var = (d0) fVar;
        d(d0Var);
        i(d0Var);
    }

    public int doFinal(byte[] bArr, int i) {
        e();
        int[] iArr = this.e;
        for (int B1 : iArr) {
            h3.B1(B1, bArr, i);
            i += 4;
        }
        reset();
        return 32;
    }

    public void f() {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            this.h[i2] = this.f[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.h;
            int i4 = iArr[i3 - 3];
            int i5 = iArr[i3 - 13];
            int i6 = ((i4 >>> 17) | (i4 << 15)) ^ (iArr[i3 - 16] ^ iArr[i3 - 9]);
            iArr[i3] = (((i6 ^ ((i6 << 15) | (i6 >>> 17))) ^ ((i6 << 23) | (i6 >>> 9))) ^ ((i5 >>> 25) | (i5 << 7))) ^ iArr[i3 - 6];
        }
        int[] iArr2 = this.e;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int i9 = iArr2[2];
        int i10 = iArr2[3];
        int i11 = iArr2[4];
        int i12 = iArr2[5];
        int i13 = iArr2[6];
        int i14 = iArr2[7];
        int i15 = 0;
        for (i = 16; i15 < i; i = 16) {
            int i16 = (i7 << 12) | (i7 >>> 20);
            int i17 = i16 + i11 + d[i15];
            int i18 = (i17 << 7) | (i17 >>> 25);
            int[] iArr3 = this.h;
            int i19 = iArr3[i15];
            int X = a.X((i7 ^ i8) ^ i9, i10, i16 ^ i18, iArr3[i15 + 4] ^ i19);
            int X2 = a.X((i11 ^ i12) ^ i13, i14, i18, i19);
            int i20 = (i8 << 9) | (i8 >>> 23);
            int i21 = (i12 << 19) | (i12 >>> 13);
            i15++;
            i10 = i9;
            i12 = i11;
            i11 = (X2 ^ ((X2 << 9) | (X2 >>> 23))) ^ ((X2 << 17) | (X2 >>> 15));
            i9 = i20;
            i14 = i13;
            i13 = i21;
            i8 = i7;
            i7 = X;
        }
        int i22 = i7;
        int i23 = 16;
        int i24 = i14;
        int i25 = i13;
        while (i23 < 64) {
            int i26 = (i22 << 12) | (i22 >>> 20);
            int i27 = i26 + i11 + d[i23];
            int i28 = (i27 >>> 25) | (i27 << 7);
            int[] iArr4 = this.h;
            int i29 = iArr4[i23];
            int X3 = a.X((i22 & i9) | (i22 & i8) | (i8 & i9), i10, i26 ^ i28, iArr4[i23 + 4] ^ i29);
            int X4 = a.X((i12 & i11) | ((~i11) & i25), i24, i28, i29);
            int i30 = (i12 << 19) | (i12 >>> 13);
            i23++;
            i10 = i9;
            i12 = i11;
            i11 = (X4 ^ ((X4 << 9) | (X4 >>> 23))) ^ ((X4 << 17) | (X4 >>> 15));
            i9 = (i8 >>> 23) | (i8 << 9);
            i24 = i25;
            i8 = i22;
            i22 = X3;
            i25 = i30;
        }
        int[] iArr5 = this.e;
        iArr5[0] = i22 ^ iArr5[0];
        iArr5[1] = i8 ^ iArr5[1];
        iArr5[2] = iArr5[2] ^ i9;
        iArr5[3] = iArr5[3] ^ i10;
        iArr5[4] = iArr5[4] ^ i11;
        iArr5[5] = iArr5[5] ^ i12;
        iArr5[6] = i25 ^ iArr5[6];
        iArr5[7] = i24 ^ iArr5[7];
        this.g = 0;
    }

    public void g(long j) {
        int i = this.g;
        if (i > 14) {
            this.f[i] = 0;
            this.g = i + 1;
            f();
        }
        while (true) {
            int i2 = this.g;
            if (i2 < 14) {
                this.f[i2] = 0;
                this.g = i2 + 1;
            } else {
                int[] iArr = this.f;
                int i3 = i2 + 1;
                this.g = i3;
                iArr[i2] = (int) (j >>> 32);
                this.g = i3 + 1;
                iArr[i3] = (int) j;
                return;
            }
        }
    }

    public String getAlgorithmName() {
        return "SM3";
    }

    public int getDigestSize() {
        return 32;
    }

    public void h(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f;
        int i5 = this.g;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.g = i6;
        if (i6 >= 16) {
            f();
        }
    }

    public final void i(d0 d0Var) {
        int[] iArr = d0Var.e;
        int[] iArr2 = this.e;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = d0Var.f;
        int[] iArr4 = this.f;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.g = d0Var.g;
    }

    public void reset() {
        super.reset();
        int[] iArr = this.e;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.g = 0;
    }
}
