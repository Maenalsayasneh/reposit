package s0.a.b.e0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.g1;
import s0.a.b.k0.y0;

public class e0 implements e {
    public static byte[] a = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, Byte.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, Byte.MAX_VALUE, -63, -83};
    public int[] b;
    public boolean c;

    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (this.b == null) {
            throw new IllegalStateException("RC2 engine not initialised");
        } else if (i + 8 > bArr3.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr4.length) {
            int i3 = 0;
            if (this.c) {
                int i4 = ((bArr3[i + 7] & 255) << 8) + (bArr3[i + 6] & 255);
                int i5 = ((bArr3[i + 5] & 255) << 8) + (bArr3[i + 4] & 255);
                int i6 = ((bArr3[i + 3] & 255) << 8) + (bArr3[i + 2] & 255);
                int i7 = ((bArr3[i + 1] & 255) << 8) + (bArr3[i + 0] & 255);
                for (int i8 = 16; i3 <= i8; i8 = 16) {
                    i7 = d(i7 + ((~i4) & i6) + (i5 & i4) + this.b[i3], 1);
                    i6 = d(i6 + ((~i7) & i5) + (i4 & i7) + this.b[i3 + 1], 2);
                    i5 = d(i5 + ((~i6) & i4) + (i7 & i6) + this.b[i3 + 2], 3);
                    i4 = d(i4 + ((~i5) & i7) + (i6 & i5) + this.b[i3 + 3], 5);
                    i3 += 4;
                }
                int[] iArr = this.b;
                int i9 = i7 + iArr[i4 & 63];
                int i10 = i6 + iArr[i9 & 63];
                int i11 = i5 + iArr[i10 & 63];
                int i12 = i4 + iArr[i11 & 63];
                for (int i13 = 20; i13 <= 40; i13 += 4) {
                    i9 = d(i9 + ((~i12) & i10) + (i11 & i12) + this.b[i13], 1);
                    i10 = d(i10 + ((~i9) & i11) + (i12 & i9) + this.b[i13 + 1], 2);
                    i11 = d(i11 + ((~i10) & i12) + (i9 & i10) + this.b[i13 + 2], 3);
                    i12 = d(i12 + ((~i11) & i9) + (i10 & i11) + this.b[i13 + 3], 5);
                }
                int[] iArr2 = this.b;
                int i14 = i9 + iArr2[i12 & 63];
                int i15 = i10 + iArr2[i14 & 63];
                int i16 = i11 + iArr2[i15 & 63];
                int i17 = i12 + iArr2[i16 & 63];
                for (int i18 = 44; i18 < 64; i18 += 4) {
                    i14 = d(i14 + ((~i17) & i15) + (i16 & i17) + this.b[i18], 1);
                    i15 = d(i15 + ((~i14) & i16) + (i17 & i14) + this.b[i18 + 1], 2);
                    i16 = d(i16 + ((~i15) & i17) + (i14 & i15) + this.b[i18 + 2], 3);
                    i17 = d(i17 + ((~i16) & i14) + (i15 & i16) + this.b[i18 + 3], 5);
                }
                bArr4[i2 + 0] = (byte) i14;
                bArr4[i2 + 1] = (byte) (i14 >> 8);
                bArr4[i2 + 2] = (byte) i15;
                bArr4[i2 + 3] = (byte) (i15 >> 8);
                bArr4[i2 + 4] = (byte) i16;
                bArr4[i2 + 5] = (byte) (i16 >> 8);
                bArr4[i2 + 6] = (byte) i17;
                bArr4[i2 + 7] = (byte) (i17 >> 8);
            } else {
                int i19 = ((bArr3[i + 7] & 255) << 8) + (bArr3[i + 6] & 255);
                int i20 = ((bArr3[i + 5] & 255) << 8) + (bArr3[i + 4] & 255);
                int i21 = ((bArr3[i + 3] & 255) << 8) + (bArr3[i + 2] & 255);
                int i22 = ((bArr3[i + 1] & 255) << 8) + (bArr3[i + 0] & 255);
                for (int i23 = 60; i23 >= 44; i23 -= 4) {
                    i19 = d(i19, 11) - ((((~i20) & i22) + (i21 & i20)) + this.b[i23 + 3]);
                    i20 = d(i20, 13) - ((((~i21) & i19) + (i22 & i21)) + this.b[i23 + 2]);
                    i21 = d(i21, 14) - ((((~i22) & i20) + (i19 & i22)) + this.b[i23 + 1]);
                    i22 = d(i22, 15) - ((((~i19) & i21) + (i20 & i19)) + this.b[i23]);
                }
                int[] iArr3 = this.b;
                int i24 = i19 - iArr3[i20 & 63];
                int i25 = i20 - iArr3[i21 & 63];
                int i26 = i21 - iArr3[i22 & 63];
                int i27 = i22 - iArr3[i24 & 63];
                for (int i28 = 40; i28 >= 20; i28 -= 4) {
                    i24 = d(i24, 11) - ((((~i25) & i27) + (i26 & i25)) + this.b[i28 + 3]);
                    i25 = d(i25, 13) - ((((~i26) & i24) + (i27 & i26)) + this.b[i28 + 2]);
                    i26 = d(i26, 14) - ((((~i27) & i25) + (i24 & i27)) + this.b[i28 + 1]);
                    i27 = d(i27, 15) - ((((~i24) & i26) + (i25 & i24)) + this.b[i28]);
                }
                int[] iArr4 = this.b;
                int i29 = i24 - iArr4[i25 & 63];
                int i30 = i25 - iArr4[i26 & 63];
                int i31 = i26 - iArr4[i27 & 63];
                int i32 = i27 - iArr4[i29 & 63];
                int i33 = i30;
                for (int i34 = 16; i34 >= 0; i34 -= 4) {
                    i29 = d(i29, 11) - ((((~i33) & i32) + (i31 & i33)) + this.b[i34 + 3]);
                    i33 = d(i33, 13) - ((((~i31) & i29) + (i32 & i31)) + this.b[i34 + 2]);
                    i31 = d(i31, 14) - ((((~i32) & i33) + (i29 & i32)) + this.b[i34 + 1]);
                    i32 = d(i32, 15) - ((((~i29) & i31) + (i33 & i29)) + this.b[i34]);
                }
                bArr4[i2 + 0] = (byte) i32;
                bArr4[i2 + 1] = (byte) (i32 >> 8);
                bArr4[i2 + 2] = (byte) i31;
                bArr4[i2 + 3] = (byte) (i31 >> 8);
                bArr4[i2 + 4] = (byte) i33;
                bArr4[i2 + 5] = (byte) (i33 >> 8);
                bArr4[i2 + 6] = (byte) i29;
                bArr4[i2 + 7] = (byte) (i29 >> 8);
            }
            return 8;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public int b() {
        return 8;
    }

    public final int[] c(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = iArr[length - 1];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                i3 = a[(i3 + iArr[i4]) & 255] & 255;
                int i6 = length + 1;
                iArr[length] = i3;
                if (i6 >= 128) {
                    break;
                }
                length = i6;
                i4 = i5;
            }
        }
        int i7 = (i + 7) >> 3;
        int i8 = 128 - i7;
        int i9 = a[(255 >> ((-i) & 7)) & iArr[i8]] & 255;
        iArr[i8] = i9;
        for (int i10 = i8 - 1; i10 >= 0; i10--) {
            i9 = a[i9 ^ iArr[i10 + i7]] & 255;
            iArr[i10] = i9;
        }
        int[] iArr2 = new int[64];
        for (int i11 = 0; i11 != 64; i11++) {
            int i12 = i11 * 2;
            iArr2[i11] = iArr[i12] + (iArr[i12 + 1] << 8);
        }
        return iArr2;
    }

    public final int d(int i, int i2) {
        int i3 = i & 65535;
        return (i3 >> (16 - i2)) | (i3 << i2);
    }

    public String getAlgorithmName() {
        return "RC2";
    }

    public void init(boolean z, i iVar) {
        this.c = z;
        if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.b = c(g1Var.c, g1Var.d);
        } else if (iVar instanceof y0) {
            byte[] bArr = ((y0) iVar).c;
            this.b = c(bArr, bArr.length * 8);
        } else {
            throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to RC2 init - ")));
        }
    }

    public void reset() {
    }
}
