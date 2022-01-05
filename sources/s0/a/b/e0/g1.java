package s0.a.b.e0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.x;
import s0.a.g.f;

public class g1 implements x, f {
    public static final byte[] a = {62, 114, 91, 71, -54, -32, 0, 51, 4, -47, 84, -104, 9, -71, 109, -53, 123, 27, -7, 50, -81, -99, 106, -91, -72, 45, -4, 29, 8, 83, 3, -112, 77, 78, -124, -103, -28, -50, -39, -111, -35, -74, -123, 72, -117, 41, 110, -84, -51, -63, -8, 30, 115, 67, 105, -58, -75, -67, -3, 57, 99, 32, -44, 56, 118, 125, -78, -89, -49, -19, 87, -59, -13, 44, -69, 20, 33, 6, 85, -101, -29, -17, 94, 49, 79, Byte.MAX_VALUE, 90, -92, 13, -126, 81, 73, 95, -70, 88, 28, 74, 22, -43, 23, -88, -110, 36, 31, -116, -1, -40, -82, 46, 1, -45, -83, 59, 75, -38, 70, -21, -55, -34, -102, -113, -121, -41, 58, Byte.MIN_VALUE, 111, 47, -56, -79, -76, 55, -9, 10, 34, 19, 40, 124, -52, 60, -119, -57, -61, -106, 86, 7, -65, 126, -16, 11, 43, -105, 82, 53, 65, 121, 97, -90, 76, 16, -2, -68, 38, -107, -120, -118, -80, -93, -5, -64, 24, -108, -14, -31, -27, -23, 93, -48, -36, 17, 102, 100, 92, -20, 89, 66, 117, 18, -11, 116, -100, -86, 35, 14, -122, -85, -66, 42, 2, -25, 103, -26, 68, -94, 108, -62, -109, -97, -15, -10, -6, 54, -46, 80, 104, -98, 98, 113, 21, 61, -42, 64, -60, -30, 15, -114, -125, 119, 107, 37, 5, 63, 12, 48, -22, 112, -73, -95, -24, -87, 101, -115, 39, 26, -37, -127, -77, -96, -12, 69, 122, 25, -33, -18, 120, 52, 96};
    public static final byte[] b = {85, -62, 99, 113, 59, -56, 71, -122, -97, 60, -38, 91, 41, -86, -3, 119, -116, -59, -108, 12, -90, 26, 19, 0, -29, -88, 22, 114, 64, -7, -8, 66, 68, 38, 104, -106, -127, -39, 69, 62, 16, 118, -58, -89, -117, 57, 67, -31, 58, -75, 86, 42, -64, 109, -77, 5, 34, 102, -65, -36, 11, -6, 98, 72, -35, 32, 17, 6, 54, -55, -63, -49, -10, 39, 82, -69, 105, -11, -44, -121, Byte.MAX_VALUE, -124, 76, -46, -100, 87, -92, -68, 79, -102, -33, -2, -42, -115, 122, -21, 43, 83, -40, 92, -95, 20, 23, -5, 35, -43, 125, 48, 103, 115, 8, 9, -18, -73, 112, 63, 97, -78, 25, -114, 78, -27, 75, -109, -113, 93, -37, -87, -83, -15, -82, 46, -53, 13, -4, -12, 45, 70, 110, 29, -105, -24, -47, -23, 77, 55, -91, 117, 94, -125, -98, -85, -126, -99, -71, 28, -32, -51, 73, -119, 1, -74, -67, 88, 36, -94, 95, 56, 120, -103, 21, -112, 80, -72, -107, -28, -48, -111, -57, -50, -19, 15, -76, 111, -96, -52, -16, 2, 74, 121, -61, -34, -93, -17, -22, 81, -26, 107, 24, -20, 27, 44, Byte.MIN_VALUE, -9, 116, -25, -1, 33, 90, 106, 84, 30, 65, 49, -110, 53, -60, 51, 7, 10, -70, 126, 14, 52, -120, -79, -104, 124, -13, 61, 96, 108, 123, -54, -45, 31, 50, 101, 4, 40, 100, -66, -123, -101, 47, 89, -118, -41, -80, 37, -84, -81, 18, 3, -30, -14};
    public static final short[] c = {17623, 9916, 25195, 4958, 22409, 13794, 28981, 2479, 19832, 12051, 27588, 6897, 24102, 15437, 30874, 18348};
    public final int[] d = new int[16];
    public final int[] e = new int[2];
    public final int[] f = new int[4];
    public int g;
    public final byte[] h = new byte[4];
    public int i;
    public g1 j;

    public g1() {
    }

    public g1(g1 g1Var) {
        c(g1Var);
    }

    public static int g(byte b2, short s, byte b3) {
        return ((b2 & 255) << 23) | ((s & 65535) << 8) | (b3 & 255);
    }

    public static int h(byte b2, byte b3, byte b4, byte b5) {
        return ((b2 & 255) << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static int i(int i2, int i3) {
        return ((i2 >>> (31 - i3)) | (i2 << i3)) & Integer.MAX_VALUE;
    }

    public static int j(int i2, int i3) {
        return (i2 >>> (32 - i3)) | (i2 << i3);
    }

    public static void k(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >> 24);
        bArr[i3 + 1] = (byte) (i2 >> 16);
        bArr[i3 + 2] = (byte) (i2 >> 8);
        bArr[i3 + 3] = (byte) i2;
    }

    public f a() {
        return new g1(this);
    }

    public final int b(int i2, int i3) {
        int i4 = i2 + i3;
        return (Integer.MAX_VALUE & i4) + (i4 >>> 31);
    }

    public void c(f fVar) {
        g1 g1Var = (g1) fVar;
        int[] iArr = g1Var.d;
        int[] iArr2 = this.d;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = g1Var.e;
        int[] iArr4 = this.e;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = g1Var.f;
        int[] iArr6 = this.f;
        System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        byte[] bArr = g1Var.h;
        byte[] bArr2 = this.h;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.g = g1Var.g;
        this.i = g1Var.i;
        this.j = g1Var;
    }

    public final void d() {
        int[] iArr = this.f;
        int[] iArr2 = this.d;
        iArr[0] = ((iArr2[15] & 2147450880) << 1) | (iArr2[14] & 65535);
        iArr[1] = ((iArr2[11] & 65535) << 16) | (iArr2[9] >>> 15);
        iArr[2] = ((iArr2[7] & 65535) << 16) | (iArr2[5] >>> 15);
        iArr[3] = (iArr2[0] >>> 15) | ((iArr2[2] & 65535) << 16);
    }

    public int e() {
        int[] iArr = this.f;
        int i2 = iArr[0];
        int[] iArr2 = this.e;
        int i3 = (i2 ^ iArr2[0]) + iArr2[1];
        int i4 = iArr2[0] + iArr[1];
        int i5 = iArr[2] ^ iArr2[1];
        int i6 = (i4 << 16) | (i5 >>> 16);
        int j2 = j(i6, 24) ^ (((j(i6, 2) ^ i6) ^ j(i6, 10)) ^ j(i6, 18));
        int i7 = (i5 << 16) | (i4 >>> 16);
        int j3 = j(i7, 30) ^ (((j(i7, 8) ^ i7) ^ j(i7, 14)) ^ j(i7, 22));
        int[] iArr3 = this.e;
        byte[] bArr = a;
        byte b2 = bArr[j2 >>> 24];
        byte[] bArr2 = b;
        iArr3[0] = h(b2, bArr2[(j2 >>> 16) & 255], bArr[(j2 >>> 8) & 255], bArr2[j2 & 255]);
        this.e[1] = h(bArr[j3 >>> 24], bArr2[(j3 >>> 16) & 255], bArr[(j3 >>> 8) & 255], bArr2[j3 & 255]);
        return i3;
    }

    public final void f() {
        int[] iArr = this.d;
        int b2 = b(b(b(b(b(iArr[0], i(iArr[0], 8)), i(this.d[4], 20)), i(this.d[10], 21)), i(this.d[13], 17)), i(this.d[15], 15));
        int[] iArr2 = this.d;
        iArr2[0] = iArr2[1];
        iArr2[1] = iArr2[2];
        iArr2[2] = iArr2[3];
        iArr2[3] = iArr2[4];
        iArr2[4] = iArr2[5];
        iArr2[5] = iArr2[6];
        iArr2[6] = iArr2[7];
        iArr2[7] = iArr2[8];
        iArr2[8] = iArr2[9];
        iArr2[9] = iArr2[10];
        iArr2[10] = iArr2[11];
        iArr2[11] = iArr2[12];
        iArr2[12] = iArr2[13];
        iArr2[13] = iArr2[14];
        iArr2[14] = iArr2[15];
        iArr2[15] = b2;
    }

    public String getAlgorithmName() {
        return "Zuc-128";
    }

    public void init(boolean z, i iVar) {
        byte[] bArr;
        byte[] bArr2 = null;
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            bArr = c1Var.c;
            iVar = c1Var.d;
        } else {
            bArr = null;
        }
        if (iVar instanceof y0) {
            bArr2 = ((y0) iVar).c;
        }
        this.g = 0;
        this.i = 0;
        n(this.d, bArr2, bArr);
        int[] iArr = this.e;
        iArr[0] = 0;
        iArr[1] = 0;
        int i2 = 32;
        while (true) {
            d();
            if (i2 > 0) {
                int[] iArr2 = this.d;
                int b2 = b(b(b(b(b(b(iArr2[0], i(iArr2[0], 8)), i(this.d[4], 20)), i(this.d[10], 21)), i(this.d[13], 17)), i(this.d[15], 15)), e() >>> 1);
                int[] iArr3 = this.d;
                iArr3[0] = iArr3[1];
                iArr3[1] = iArr3[2];
                iArr3[2] = iArr3[3];
                iArr3[3] = iArr3[4];
                iArr3[4] = iArr3[5];
                iArr3[5] = iArr3[6];
                iArr3[6] = iArr3[7];
                iArr3[7] = iArr3[8];
                iArr3[8] = iArr3[9];
                iArr3[9] = iArr3[10];
                iArr3[10] = iArr3[11];
                iArr3[11] = iArr3[12];
                iArr3[12] = iArr3[13];
                iArr3[13] = iArr3[14];
                iArr3[14] = iArr3[15];
                iArr3[15] = b2;
                i2--;
            } else {
                e();
                f();
                this.j = (g1) a();
                return;
            }
        }
    }

    public int l() {
        return 2047;
    }

    public int m() {
        int i2 = this.i;
        this.i = i2 + 1;
        if (i2 < l()) {
            d();
            int e2 = e() ^ this.f[3];
            f();
            return e2;
        }
        throw new IllegalStateException("Too much data processed by singleKey/IV");
    }

    public void n(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("A key of 16 bytes is needed");
        } else if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("An IV of 16 bytes is needed");
        } else {
            int[] iArr2 = this.d;
            byte b2 = bArr[0];
            short[] sArr = c;
            iArr2[0] = g(b2, sArr[0], bArr2[0]);
            this.d[1] = g(bArr[1], sArr[1], bArr2[1]);
            this.d[2] = g(bArr[2], sArr[2], bArr2[2]);
            this.d[3] = g(bArr[3], sArr[3], bArr2[3]);
            this.d[4] = g(bArr[4], sArr[4], bArr2[4]);
            this.d[5] = g(bArr[5], sArr[5], bArr2[5]);
            this.d[6] = g(bArr[6], sArr[6], bArr2[6]);
            this.d[7] = g(bArr[7], sArr[7], bArr2[7]);
            this.d[8] = g(bArr[8], sArr[8], bArr2[8]);
            this.d[9] = g(bArr[9], sArr[9], bArr2[9]);
            this.d[10] = g(bArr[10], sArr[10], bArr2[10]);
            this.d[11] = g(bArr[11], sArr[11], bArr2[11]);
            this.d[12] = g(bArr[12], sArr[12], bArr2[12]);
            this.d[13] = g(bArr[13], sArr[13], bArr2[13]);
            this.d[14] = g(bArr[14], sArr[14], bArr2[14]);
            this.d[15] = g(bArr[15], sArr[15], bArr2[15]);
        }
    }

    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        if (this.j == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i2 + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i4 + i3 <= bArr2.length) {
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = i5 + i4;
                byte b2 = bArr[i5 + i2];
                if (this.g == 0) {
                    k(m(), this.h, 0);
                }
                byte[] bArr3 = this.h;
                int i7 = this.g;
                this.g = (i7 + 1) % 4;
                bArr2[i6] = (byte) (b2 ^ bArr3[i7]);
            }
            return i3;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
        g1 g1Var = this.j;
        if (g1Var != null) {
            c(g1Var);
        }
    }
}
