package s0.a.b.e0;

import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.settings.SettingsManager;
import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.y0;

public final class b1 implements e {
    public static final byte[][] a = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, Byte.MIN_VALUE, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, Byte.MAX_VALUE, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, -68, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 109, -63, -79, 14, Byte.MIN_VALUE, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, Byte.MAX_VALUE, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};
    public boolean b = false;
    public int[] c = new int[256];
    public int[] d = new int[256];
    public int[] e = new int[256];
    public int[] f = new int[256];
    public int[] g;
    public int[] h;
    public int i = 0;
    public byte[] j = null;

    public b1() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        for (int i2 = 0; i2 < 256; i2++) {
            byte[][] bArr = a;
            int i3 = bArr[0][i2] & 255;
            iArr[0] = i3;
            iArr2[0] = (h(i3) ^ i3) & 255;
            iArr3[0] = i(i3) & 255;
            int i4 = bArr[1][i2] & 255;
            iArr[1] = i4;
            iArr2[1] = (h(i4) ^ i4) & 255;
            iArr3[1] = i(i4) & 255;
            this.c[i2] = iArr[1] | (iArr2[1] << 8) | (iArr3[1] << 16) | (iArr3[1] << 24);
            this.d[i2] = iArr3[0] | (iArr3[0] << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            this.e[i2] = (iArr3[1] << 24) | iArr2[1] | (iArr3[1] << 8) | (iArr[1] << 16);
            this.f[i2] = iArr2[0] | (iArr[0] << 8) | (iArr3[0] << 16) | (iArr2[0] << 24);
        }
    }

    public int a(byte[] bArr, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int i4 = i3;
        if (this.j == null) {
            throw new IllegalStateException("Twofish not initialised");
        } else if (i2 + 16 > bArr3.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i4 + 16 <= bArr4.length) {
            int i5 = 0;
            if (this.b) {
                int d2 = d(bArr, i2) ^ this.g[0];
                int d3 = this.g[1] ^ d(bArr3, i2 + 4);
                int d4 = d(bArr3, i2 + 8) ^ this.g[2];
                int d5 = d(bArr3, i2 + 12) ^ this.g[3];
                int i6 = 8;
                for (int i7 = 16; i5 < i7; i7 = 16) {
                    int f2 = f(d2);
                    int g2 = g(d3);
                    int[] iArr = this.g;
                    int i8 = i6 + 1;
                    int i9 = d4 ^ ((f2 + g2) + iArr[i6]);
                    d4 = (i9 >>> 1) | (i9 << 31);
                    int i10 = i8 + 1;
                    d5 = ((d5 >>> 31) | (d5 << 1)) ^ (((g2 * 2) + f2) + iArr[i8]);
                    int f3 = f(d4);
                    int g3 = g(d5);
                    int[] iArr2 = this.g;
                    int i11 = i10 + 1;
                    int i12 = d2 ^ ((f3 + g3) + iArr2[i10]);
                    d2 = (i12 << 31) | (i12 >>> 1);
                    d3 = ((d3 << 1) | (d3 >>> 31)) ^ (((g3 * 2) + f3) + iArr2[i11]);
                    i5 += 2;
                    i6 = i11 + 1;
                }
                c(this.g[4] ^ d4, bArr4, i4);
                c(d5 ^ this.g[5], bArr4, i4 + 4);
                c(this.g[6] ^ d2, bArr4, i4 + 8);
                c(this.g[7] ^ d3, bArr4, i4 + 12);
                return 16;
            }
            int d6 = d(bArr, i2) ^ this.g[4];
            int d7 = d(bArr3, i2 + 4) ^ this.g[5];
            int d8 = this.g[6] ^ d(bArr3, i2 + 8);
            int d9 = d(bArr3, i2 + 12) ^ this.g[7];
            int i13 = 39;
            for (int i14 = 0; i14 < 16; i14 += 2) {
                int f4 = f(d6);
                int g4 = g(d7);
                int[] iArr3 = this.g;
                int i15 = i13 - 1;
                int i16 = d9 ^ (((g4 * 2) + f4) + iArr3[i13]);
                int i17 = i15 - 1;
                d8 = ((d8 >>> 31) | (d8 << 1)) ^ ((f4 + g4) + iArr3[i15]);
                d9 = (i16 << 31) | (i16 >>> 1);
                int f5 = f(d8);
                int g5 = g(d9);
                int[] iArr4 = this.g;
                int i18 = i17 - 1;
                int i19 = d7 ^ (((g5 * 2) + f5) + iArr4[i17]);
                i13 = i18 - 1;
                d6 = ((d6 >>> 31) | (d6 << 1)) ^ ((f5 + g5) + iArr4[i18]);
                d7 = (i19 << 31) | (i19 >>> 1);
            }
            c(this.g[0] ^ d8, bArr4, i4);
            c(d9 ^ this.g[1], bArr4, i4 + 4);
            c(this.g[2] ^ d6, bArr4, i4 + 8);
            c(this.g[3] ^ d7, bArr4, i4 + 12);
            return 16;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public int b() {
        return 16;
    }

    public final void c(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) (i2 >> 16);
        bArr[i3 + 3] = (byte) (i2 >> 24);
    }

    public final int d(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final int e(int i2, int[] iArr) {
        int i3;
        int i4;
        byte b2 = i2 & 255;
        byte b3 = (i2 >>> 8) & 255;
        byte b4 = (i2 >>> 16) & 255;
        byte b5 = (i2 >>> 24) & 255;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = this.i & 3;
        if (i9 == 0) {
            byte[][] bArr = a;
            b2 = (bArr[1][b2] & 255) ^ (i8 & 255);
            b3 = (bArr[0][b3] & 255) ^ ((i8 >>> 8) & 255);
            b4 = (bArr[0][b4] & 255) ^ ((i8 >>> 16) & 255);
            b5 = (bArr[1][b5] & 255) ^ ((i8 >>> 24) & 255);
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return 0;
                }
            }
            int[] iArr2 = this.c;
            byte[][] bArr2 = a;
            i3 = (iArr2[(bArr2[0][(bArr2[0][b2] & 255) ^ (i6 & 255)] & 255) ^ (i5 & 255)] ^ this.d[(bArr2[0][(bArr2[1][b3] & 255) ^ ((i6 >>> 8) & 255)] & 255) ^ ((i5 >>> 8) & 255)]) ^ this.e[(bArr2[1][(bArr2[0][b4] & 255) ^ ((i6 >>> 16) & 255)] & 255) ^ ((i5 >>> 16) & 255)];
            i4 = this.f[(bArr2[1][(bArr2[1][b5] & 255) ^ ((i6 >>> 24) & 255)] & 255) ^ ((i5 >>> 24) & 255)];
            return i3 ^ i4;
        } else {
            int[] iArr3 = this.c;
            byte[][] bArr3 = a;
            i3 = (iArr3[(bArr3[0][b2] & 255) ^ (i5 & 255)] ^ this.d[(bArr3[0][b3] & 255) ^ ((i5 >>> 8) & 255)]) ^ this.e[(bArr3[1][b4] & 255) ^ ((i5 >>> 16) & 255)];
            i4 = this.f[(bArr3[1][b5] & 255) ^ ((i5 >>> 24) & 255)];
            return i3 ^ i4;
        }
        byte[][] bArr4 = a;
        b2 = (bArr4[1][b2] & 255) ^ (i7 & 255);
        b3 = (bArr4[1][b3] & 255) ^ ((i7 >>> 8) & 255);
        b4 = (bArr4[0][b4] & 255) ^ ((i7 >>> 16) & 255);
        b5 = (bArr4[0][b5] & 255) ^ ((i7 >>> 24) & 255);
        int[] iArr22 = this.c;
        byte[][] bArr22 = a;
        i3 = (iArr22[(bArr22[0][(bArr22[0][b2] & 255) ^ (i6 & 255)] & 255) ^ (i5 & 255)] ^ this.d[(bArr22[0][(bArr22[1][b3] & 255) ^ ((i6 >>> 8) & 255)] & 255) ^ ((i5 >>> 8) & 255)]) ^ this.e[(bArr22[1][(bArr22[0][b4] & 255) ^ ((i6 >>> 16) & 255)] & 255) ^ ((i5 >>> 16) & 255)];
        i4 = this.f[(bArr22[1][(bArr22[1][b5] & 255) ^ ((i6 >>> 24) & 255)] & 255) ^ ((i5 >>> 24) & 255)];
        return i3 ^ i4;
    }

    public final int f(int i2) {
        int[] iArr = this.h;
        return iArr[(((i2 >>> 24) & 255) * 2) + 513] ^ ((iArr[((i2 & 255) * 2) + 0] ^ iArr[(((i2 >>> 8) & 255) * 2) + 1]) ^ iArr[(((i2 >>> 16) & 255) * 2) + 512]);
    }

    public final int g(int i2) {
        int[] iArr = this.h;
        return iArr[(((i2 >>> 16) & 255) * 2) + 513] ^ ((iArr[(((i2 >>> 24) & 255) * 2) + 0] ^ iArr[((i2 & 255) * 2) + 1]) ^ iArr[(((i2 >>> 8) & 255) * 2) + 512]);
    }

    public String getAlgorithmName() {
        return "Twofish";
    }

    public final int h(int i2) {
        int i3 = 0;
        int i4 = (i2 >> 2) ^ ((i2 & 2) != 0 ? SettingsManager.MAX_ASR_DURATION_IN_SECONDS : 0);
        if ((i2 & 1) != 0) {
            i3 = 90;
        }
        return i4 ^ i3;
    }

    public final int i(int i2) {
        return h(i2) ^ (((i2 >> 1) ^ ((i2 & 1) != 0 ? SettingsManager.MAX_ASR_DURATION_IN_SECONDS : 0)) ^ i2);
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof y0) {
            this.b = z;
            byte[] bArr = ((y0) iVar).c;
            this.j = bArr;
            this.i = bArr.length / 8;
            k(bArr);
            return;
        }
        throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to Twofish init - ")));
    }

    public final int j(int i2) {
        int i3 = (i2 >>> 24) & 255;
        int i4 = 0;
        int i5 = ((i3 << 1) ^ ((i3 & 128) != 0 ? 333 : 0)) & 255;
        int i6 = i3 >>> 1;
        if ((i3 & 1) != 0) {
            i4 = PubNubErrorBuilder.PNERR_PAGINATION_PREV_OUT_OF_BOUNDS;
        }
        int i7 = (i6 ^ i4) ^ i5;
        return ((((i2 << 8) ^ (i7 << 24)) ^ (i5 << 16)) ^ (i7 << 8)) ^ i3;
    }

    public final void k(byte[] bArr) {
        char c2;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        byte b9;
        byte[] bArr2 = bArr;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.g = new int[40];
        int i2 = this.i;
        if (i2 < 1) {
            throw new IllegalArgumentException("Key size less than 64 bits");
        } else if (i2 <= 4) {
            char c3 = 0;
            for (int i3 = 0; i3 < this.i; i3++) {
                int i4 = i3 * 8;
                iArr[i3] = d(bArr2, i4);
                iArr2[i3] = d(bArr2, i4 + 4);
                int i5 = (this.i - 1) - i3;
                int i6 = iArr[i3];
                int i7 = iArr2[i3];
                for (int i8 = 0; i8 < 4; i8++) {
                    i7 = j(i7);
                }
                int i9 = i6 ^ i7;
                for (int i10 = 0; i10 < 4; i10++) {
                    i9 = j(i9);
                }
                iArr3[i5] = i9;
            }
            for (int i11 = 0; i11 < 20; i11++) {
                int i12 = 33686018 * i11;
                int e2 = e(i12, iArr);
                int e3 = e(i12 + 16843009, iArr2);
                int i13 = (e3 >>> 24) | (e3 << 8);
                int i14 = e2 + i13;
                int[] iArr4 = this.g;
                int i15 = i11 * 2;
                iArr4[i15] = i14;
                int i16 = i14 + i13;
                iArr4[i15 + 1] = (i16 << 9) | (i16 >>> 23);
            }
            int i17 = iArr3[0];
            int i18 = iArr3[1];
            int i19 = 2;
            int i20 = iArr3[2];
            int i21 = 3;
            int i22 = iArr3[3];
            this.h = new int[RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE];
            int i23 = 0;
            while (i23 < 256) {
                int i24 = this.i & i21;
                if (i24 != 0) {
                    if (i24 == 1) {
                        int[] iArr5 = this.h;
                        int i25 = i23 * 2;
                        int[] iArr6 = this.c;
                        byte[][] bArr3 = a;
                        iArr5[i25] = iArr6[(bArr3[c3][i23] & 255) ^ (i17 & 255)];
                        iArr5[i25 + 1] = this.d[((i17 >>> 8) & 255) ^ (bArr3[c3][i23] & 255)];
                        iArr5[i25 + 512] = this.e[(bArr3[1][i23] & 255) ^ ((i17 >>> 16) & 255)];
                        iArr5[i25 + 513] = this.f[(bArr3[1][i23] & 255) ^ ((i17 >>> 24) & 255)];
                    } else if (i24 == i19) {
                        b5 = i23;
                        b4 = b5;
                        b3 = b4;
                        b2 = b3;
                        int[] iArr7 = this.h;
                        int i26 = i23 * 2;
                        int[] iArr8 = this.c;
                        byte[][] bArr4 = a;
                        iArr7[i26] = iArr8[(bArr4[c3][(i18 & 255) ^ (bArr4[c3][b4] & 255)] & 255) ^ (i17 & 255)];
                        iArr7[i26 + 1] = this.d[(bArr4[c3][((i18 >>> 8) & 255) ^ (bArr4[1][b3] & 255)] & 255) ^ ((i17 >>> 8) & 255)];
                        c2 = 0;
                        iArr7[i26 + 512] = this.e[(bArr4[1][(bArr4[0][b2] & 255) ^ ((i18 >>> 16) & 255)] & 255) ^ ((i17 >>> 16) & 255)];
                        iArr7[i26 + 513] = this.f[(bArr4[1][(bArr4[1][b5] & 255) ^ ((i18 >>> 24) & 255)] & 255) ^ ((i17 >>> 24) & 255)];
                        i23++;
                        c3 = c2;
                        i19 = 2;
                        i21 = 3;
                    } else if (i24 == i21) {
                        b9 = i23;
                        b8 = b9;
                        b7 = b8;
                        b6 = b7;
                    }
                    c2 = c3;
                    i23++;
                    c3 = c2;
                    i19 = 2;
                    i21 = 3;
                } else {
                    byte[][] bArr5 = a;
                    b8 = (bArr5[1][i23] & 255) ^ (i22 & 255);
                    b7 = (bArr5[c3][i23] & 255) ^ ((i22 >>> 8) & 255);
                    b6 = (bArr5[c3][i23] & 255) ^ ((i22 >>> 16) & 255);
                    b9 = (bArr5[1][i23] & 255) ^ ((i22 >>> 24) & 255);
                }
                byte[][] bArr6 = a;
                b4 = (bArr6[1][b8] & 255) ^ (i20 & 255);
                b3 = (bArr6[1][b7] & 255) ^ ((i20 >>> 8) & 255);
                b2 = (bArr6[c3][b6] & 255) ^ ((i20 >>> 16) & 255);
                b5 = (bArr6[c3][b9] & 255) ^ ((i20 >>> 24) & 255);
                int[] iArr72 = this.h;
                int i262 = i23 * 2;
                int[] iArr82 = this.c;
                byte[][] bArr42 = a;
                iArr72[i262] = iArr82[(bArr42[c3][(i18 & 255) ^ (bArr42[c3][b4] & 255)] & 255) ^ (i17 & 255)];
                iArr72[i262 + 1] = this.d[(bArr42[c3][((i18 >>> 8) & 255) ^ (bArr42[1][b3] & 255)] & 255) ^ ((i17 >>> 8) & 255)];
                c2 = 0;
                iArr72[i262 + 512] = this.e[(bArr42[1][(bArr42[0][b2] & 255) ^ ((i18 >>> 16) & 255)] & 255) ^ ((i17 >>> 16) & 255)];
                iArr72[i262 + 513] = this.f[(bArr42[1][(bArr42[1][b5] & 255) ^ ((i18 >>> 24) & 255)] & 255) ^ ((i17 >>> 24) & 255)];
                i23++;
                c3 = c2;
                i19 = 2;
                i21 = 3;
            }
        } else {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
    }

    public void reset() {
        byte[] bArr = this.j;
        if (bArr != null) {
            k(bArr);
        }
    }
}
