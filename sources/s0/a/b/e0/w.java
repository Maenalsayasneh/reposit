package s0.a.b.e0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.y0;
import s0.a.e.b.b0.c.h3;

public class w implements e {
    public static final byte[] a = {-4, -18, -35, 17, -49, 110, 49, 22, -5, -60, -6, -38, 35, -59, 4, 77, -23, 119, -16, -37, -109, 46, -103, -70, 23, 54, -15, -69, 20, -51, 95, -63, -7, 24, 101, 90, -30, 92, -17, 33, -127, 28, 60, 66, -117, 1, -114, 79, 5, -124, 2, -82, -29, 106, -113, -96, 6, 11, -19, -104, Byte.MAX_VALUE, -44, -45, 31, -21, 52, 44, 81, -22, -56, 72, -85, -14, 42, 104, -94, -3, 58, -50, -52, -75, 112, 14, 86, 8, 12, 118, 18, -65, 114, 19, 71, -100, -73, 93, -121, 21, -95, -106, 41, 16, 123, -102, -57, -13, -111, 120, 111, -99, -98, -78, -79, 50, 117, 25, 61, -1, 53, -118, 126, 109, 84, -58, Byte.MIN_VALUE, -61, -67, 13, 87, -33, -11, 36, -87, 62, -88, 67, -55, -41, 121, -42, -10, 124, 34, -71, 3, -32, 15, -20, -34, 122, -108, -80, -68, -36, -24, 40, 80, 78, 51, 10, 74, -89, -105, 96, 115, 30, 0, 98, 68, 26, -72, 56, -126, 100, -97, 38, 65, -83, 69, 70, -110, 39, 94, 85, 47, -116, -93, -91, 125, 105, -43, -107, 59, 7, 88, -77, 64, -122, -84, 29, -9, 48, 55, 107, -28, -120, -39, -25, -119, -31, 27, -125, 73, 76, 63, -8, -2, -115, 83, -86, -112, -54, -40, -123, 97, 32, 113, 103, -92, 45, 43, 9, 91, -53, -101, 37, -48, -66, -27, 108, 82, 89, -90, 116, -46, -26, -12, -76, -64, -47, 102, -81, -62, 57, 75, 99, -74};
    public static final byte[] b = {-91, 45, 50, -113, 14, 48, 56, -64, 84, -26, -98, 57, 85, 126, 82, -111, 100, 3, 87, 90, 28, 96, 7, 24, 33, 114, -88, -47, 41, -58, -92, 63, -32, 39, -115, 12, -126, -22, -82, -76, -102, 99, 73, -27, 66, -28, 21, -73, -56, 6, 112, -99, 65, 117, 25, -55, -86, -4, 77, -65, 42, 115, -124, -43, -61, -81, 43, -122, -89, -79, -78, 91, 70, -45, -97, -3, -44, 15, -100, 47, -101, 67, -17, -39, 121, -74, 83, Byte.MAX_VALUE, -63, -16, 35, -25, 37, 94, -75, 30, -94, -33, -90, -2, -84, 34, -7, -30, 74, -68, 53, -54, -18, 120, 5, 107, 81, -31, 89, -93, -14, 113, 86, 17, 106, -119, -108, 101, -116, -69, 119, 60, 123, 40, -85, -46, 49, -34, -60, 95, -52, -49, 118, 44, -72, -40, 46, 54, -37, 105, -77, 20, -107, -66, 98, -95, 59, 22, 102, -23, 92, 108, 109, -83, 55, 97, 75, -71, -29, -70, -15, -96, -123, -125, -38, 71, -59, -80, 51, -6, -106, 111, 110, -62, -10, 80, -1, 93, -87, -114, 23, 27, -105, 125, -20, 88, -9, 31, -5, 124, 9, 13, 122, 103, 69, -121, -36, -24, 79, 29, 78, 4, -21, -8, -13, 62, 61, -67, -118, -120, -35, -51, 11, 19, -104, 2, -109, Byte.MIN_VALUE, -112, -48, 36, 52, -53, -19, -12, -50, -103, 16, 68, 64, -110, 58, 1, 38, 18, 26, 72, 104, -11, -127, -117, -57, -42, 32, 10, 8, 0, 76, -41, 116};
    public final byte[] c = {-108, 32, -123, 16, -62, -64, 1, -5, 1, -64, -62, 16, -123, 32, -108, 1};
    public int d = 16;
    public byte[][] e = null;
    public boolean f;
    public byte[][] g;

    public w() {
        byte[][] bArr = new byte[256][];
        for (int i = 0; i < 256; i++) {
            bArr[i] = new byte[256];
            for (int i2 = 0; i2 < 256; i2++) {
                byte[] bArr2 = bArr[i];
                byte b2 = (byte) i;
                byte b3 = (byte) i2;
                byte b4 = 0;
                for (byte b5 = 0; b5 < 8 && b2 != 0 && b3 != 0; b5 = (byte) (b5 + 1)) {
                    b4 = (b3 & 1) != 0 ? (byte) (b4 ^ b2) : b4;
                    byte b6 = (byte) (b2 & 128);
                    b2 = (byte) (b2 << 1);
                    if (b6 != 0) {
                        b2 = (byte) (b2 ^ 195);
                    }
                    b3 = (byte) (b3 >> 1);
                }
                bArr2[i2] = b4;
            }
        }
        this.g = bArr;
    }

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        byte[][] bArr3;
        if (this.e == null) {
            throw new IllegalStateException("GOST3412_2015 engine not initialised");
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 <= bArr2.length) {
            byte[] bArr4 = new byte[16];
            System.arraycopy(bArr, i, bArr4, 0, 16);
            int i3 = 9;
            if (this.f) {
                for (int i4 = 0; i4 < 9; i4++) {
                    bArr4 = h3.p0(d(this.e[i4], bArr4), 16);
                }
                e(bArr4, this.e[9]);
            } else {
                while (true) {
                    bArr3 = this.e;
                    if (i3 <= 0) {
                        break;
                    }
                    byte[] bArr5 = bArr3[i3];
                    byte[] p02 = h3.p0(bArr5, bArr5.length);
                    e(p02, bArr4);
                    for (int i5 = 0; i5 < 16; i5++) {
                        byte[] bArr6 = new byte[16];
                        System.arraycopy(p02, 1, bArr6, 0, 15);
                        bArr6[15] = p02[0];
                        byte f2 = f(bArr6);
                        System.arraycopy(p02, 1, p02, 0, 15);
                        p02[15] = f2;
                    }
                    for (int i6 = 0; i6 < p02.length; i6++) {
                        p02[i6] = b[p02[i6] & 255];
                    }
                    bArr4 = h3.p0(p02, 16);
                    i3--;
                }
                e(bArr4, bArr3[0]);
            }
            System.arraycopy(bArr4, 0, bArr2, i2, 16);
            return 16;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public int b() {
        return 16;
    }

    public final void c(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte f2 = f(bArr);
            System.arraycopy(bArr, 0, bArr, 1, 15);
            bArr[0] = f2;
        }
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        byte[] p02 = h3.p0(bArr, bArr.length);
        e(p02, bArr2);
        for (int i = 0; i < p02.length; i++) {
            p02[i] = a[p02[i] & 255];
        }
        c(p02);
        return p02;
    }

    public final void e(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    public final byte f(byte[] bArr) {
        byte b2 = bArr[15];
        for (int i = 14; i >= 0; i--) {
            b2 = (byte) (b2 ^ this.g[bArr[i] & 255][this.c[i] & 255]);
        }
        return b2;
    }

    public String getAlgorithmName() {
        return "GOST3412_2015";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        int i;
        if (iVar instanceof y0) {
            this.f = z;
            byte[] bArr = ((y0) iVar).c;
            if (bArr.length == 32) {
                this.e = new byte[10][];
                for (int i2 = 0; i2 < 10; i2++) {
                    this.e[i2] = new byte[this.d];
                }
                int i3 = this.d;
                byte[] bArr2 = new byte[i3];
                byte[] bArr3 = new byte[i3];
                int i4 = 0;
                while (true) {
                    i = this.d;
                    if (i4 >= i) {
                        break;
                    }
                    byte[][] bArr4 = this.e;
                    byte[] bArr5 = bArr4[0];
                    byte b2 = bArr[i4];
                    bArr2[i4] = b2;
                    bArr5[i4] = b2;
                    byte[] bArr6 = bArr4[1];
                    byte b3 = bArr[i + i4];
                    bArr3[i4] = b3;
                    bArr6[i4] = b3;
                    i4++;
                }
                byte[] bArr7 = new byte[i];
                for (int i5 = 1; i5 < 5; i5++) {
                    for (int i6 = 1; i6 <= 8; i6++) {
                        h3.H(bArr7);
                        bArr7[15] = (byte) (((i5 - 1) * 8) + i6);
                        c(bArr7);
                        byte[] d2 = d(bArr7, bArr2);
                        e(d2, bArr3);
                        System.arraycopy(bArr2, 0, bArr3, 0, this.d);
                        System.arraycopy(d2, 0, bArr2, 0, this.d);
                    }
                    int i7 = i5 * 2;
                    System.arraycopy(bArr2, 0, this.e[i7], 0, this.d);
                    System.arraycopy(bArr3, 0, this.e[i7 + 1], 0, this.d);
                }
                return;
            }
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        } else if (iVar != null) {
            throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to GOST3412_2015 init - ")));
        }
    }

    public void reset() {
    }
}
