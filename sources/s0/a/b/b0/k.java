package s0.a.b.b0;

import s0.a.b.n;

public abstract class k implements n {
    public static final byte[][] a = {new byte[]{99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118}, new byte[]{-54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64}, new byte[]{-73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21}, new byte[]{4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117}, new byte[]{9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124}, new byte[]{83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49}, new byte[]{-48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88}, new byte[]{81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46}, new byte[]{-51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115}, new byte[]{96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37}, new byte[]{-32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121}, new byte[]{-25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8}, new byte[]{-70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118}, new byte[]{112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98}, new byte[]{-31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33}, new byte[]{-116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22}};

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = new byte[bArr3.length];
        bArr4[0] = c(bArr3[0]);
        bArr4[1] = c(bArr3[1]);
        bArr4[2] = c(bArr3[2]);
        bArr4[3] = c(bArr3[3]);
        bArr4[4] = c(bArr3[4]);
        bArr4[5] = c(bArr3[5]);
        bArr4[6] = c(bArr3[6]);
        bArr4[7] = c(bArr3[7]);
        bArr4[8] = c(bArr3[8]);
        bArr4[9] = c(bArr3[9]);
        bArr4[10] = c(bArr3[10]);
        bArr4[11] = c(bArr3[11]);
        bArr4[12] = c(bArr3[12]);
        bArr4[13] = c(bArr3[13]);
        bArr4[14] = c(bArr3[14]);
        bArr4[15] = c(bArr3[15]);
        byte[] bArr5 = {bArr4[0], bArr4[5], bArr4[10], bArr4[15], bArr4[4], bArr4[9], bArr4[14], bArr4[3], bArr4[8], bArr4[13], bArr4[2], bArr4[7], bArr4[12], bArr4[1], bArr4[6], bArr4[11]};
        byte[] bArr6 = new byte[16];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            int i4 = i2 * 4;
            int i5 = i4 + 1;
            int i6 = i4 + 2;
            int i7 = i4 + 3;
            bArr6[i] = (byte) ((((d(bArr5[i4]) ^ d(bArr5[i5])) ^ bArr5[i5]) ^ bArr5[i6]) ^ bArr5[i7]);
            int i8 = i3 + 1;
            bArr6[i3] = (byte) ((((bArr5[i4] ^ d(bArr5[i5])) ^ d(bArr5[i6])) ^ bArr5[i6]) ^ bArr5[i7]);
            int i9 = i8 + 1;
            bArr6[i8] = (byte) ((((bArr5[i4] ^ bArr5[i5]) ^ d(bArr5[i6])) ^ d(bArr5[i7])) ^ bArr5[i7]);
            i = i9 + 1;
            bArr6[i9] = (byte) ((((d(bArr5[i4]) ^ bArr5[i4]) ^ bArr5[i5]) ^ bArr5[i6]) ^ d(bArr5[i7]));
        }
        bArr6[0] = (byte) (bArr6[0] ^ bArr2[15]);
        bArr6[1] = (byte) (bArr6[1] ^ bArr2[14]);
        bArr6[2] = (byte) (bArr6[2] ^ bArr2[13]);
        bArr6[3] = (byte) (bArr6[3] ^ bArr2[12]);
        bArr6[4] = (byte) (bArr6[4] ^ bArr2[11]);
        bArr6[5] = (byte) (bArr6[5] ^ bArr2[10]);
        bArr6[6] = (byte) (bArr6[6] ^ bArr2[9]);
        bArr6[7] = (byte) (bArr6[7] ^ bArr2[8]);
        bArr6[8] = (byte) (bArr2[7] ^ bArr6[8]);
        bArr6[9] = (byte) (bArr2[6] ^ bArr6[9]);
        bArr6[10] = (byte) (bArr6[10] ^ bArr2[5]);
        bArr6[11] = (byte) (bArr6[11] ^ bArr2[4]);
        bArr6[12] = (byte) (bArr2[3] ^ bArr6[12]);
        bArr6[13] = (byte) (bArr6[13] ^ bArr2[2]);
        bArr6[14] = (byte) (bArr6[14] ^ bArr2[1]);
        bArr6[15] = (byte) (bArr6[15] ^ bArr2[0]);
        return bArr6;
    }

    public static byte c(byte b) {
        return a[(b & 255) >>> 4][b & 15];
    }

    public static byte d(byte b) {
        int i = b >>> 7;
        int i2 = b << 1;
        if (i > 0) {
            i2 ^= 27;
        }
        return (byte) (i2 & 255);
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, int i) {
        byte[] bArr3 = new byte[16];
        int i2 = 0;
        while (i2 < 16) {
            bArr3[i2] = (byte) (bArr2[i] ^ bArr[i2]);
            i2++;
            i++;
        }
        return bArr3;
    }

    public int getDigestSize() {
        return 32;
    }
}
