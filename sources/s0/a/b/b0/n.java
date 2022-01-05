package s0.a.b.b0;

import s0.a.b.o;
import s0.a.g.f;

public class n implements o, f {
    public static final byte[] a = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, Byte.MIN_VALUE, Byte.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};
    public byte[] b = new byte[48];
    public int c;
    public byte[] d = new byte[16];
    public int e;
    public byte[] f = new byte[16];
    public int g;

    public n() {
        reset();
    }

    public n(n nVar) {
        d(nVar);
    }

    public f a() {
        return new n(this);
    }

    public void c(f fVar) {
        d((n) fVar);
    }

    public final void d(n nVar) {
        byte[] bArr = nVar.b;
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
        this.c = nVar.c;
        byte[] bArr2 = nVar.d;
        System.arraycopy(bArr2, 0, this.d, 0, bArr2.length);
        this.e = nVar.e;
        byte[] bArr3 = nVar.f;
        System.arraycopy(bArr3, 0, this.f, 0, bArr3.length);
        this.g = nVar.g;
    }

    public int doFinal(byte[] bArr, int i) {
        int length = this.d.length;
        int i2 = this.e;
        byte b2 = (byte) (length - i2);
        while (true) {
            byte[] bArr2 = this.d;
            if (i2 < bArr2.length) {
                bArr2[i2] = b2;
                i2++;
            } else {
                f(bArr2);
                e(this.d);
                e(this.f);
                System.arraycopy(this.b, this.c, bArr, i, 16);
                reset();
                return 16;
            }
        }
    }

    public void e(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.b;
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr3 = this.b;
                byte b2 = (byte) (a[i2] ^ bArr3[i4]);
                bArr3[i4] = b2;
                i2 = b2 & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    public void f(byte[] bArr) {
        byte b2 = this.f[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.f;
            bArr2[i] = (byte) (a[(b2 ^ bArr[i]) & 255] ^ bArr2[i]);
            b2 = bArr2[i];
        }
    }

    public String getAlgorithmName() {
        return "MD2";
    }

    public int getByteLength() {
        return 16;
    }

    public int getDigestSize() {
        return 16;
    }

    public void reset() {
        this.c = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.e = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.d;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        this.g = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.f;
            if (i3 != bArr3.length) {
                bArr3[i3] = 0;
                i3++;
            } else {
                return;
            }
        }
    }

    public void update(byte b2) {
        byte[] bArr = this.d;
        int i = this.e;
        int i2 = i + 1;
        this.e = i2;
        bArr[i] = b2;
        if (i2 == 16) {
            f(bArr);
            e(this.d);
            this.e = 0;
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        while (this.e != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > 16) {
            System.arraycopy(bArr, i, this.d, 0, 16);
            f(this.d);
            e(this.d);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
