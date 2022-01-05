package s0.a.b.e0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.y0;

public class b0 implements e {
    public int[] a = null;

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.a;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr2.length) {
            int d = d(bArr, i);
            int d2 = d(bArr, i + 2);
            int d3 = d(bArr, i + 4);
            int d4 = d(bArr, i + 6);
            int i3 = 0;
            int i4 = d3;
            int i5 = d2;
            int i6 = d;
            int i7 = 0;
            while (i3 < 8) {
                int i8 = i7 + 1;
                int f = f(i6, iArr[i7]);
                int i9 = i8 + 1;
                int i10 = (i5 + iArr[i8]) & 65535;
                int i11 = i9 + 1;
                int i12 = (i4 + iArr[i9]) & 65535;
                int i13 = i11 + 1;
                int f2 = f(d4, iArr[i11]);
                int i14 = i13 + 1;
                int f3 = f(i12 ^ f, iArr[i13]);
                int f4 = f(((i10 ^ f2) + f3) & 65535, iArr[i14]);
                int i15 = (f3 + f4) & 65535;
                d4 = f2 ^ i15;
                i4 = i15 ^ i10;
                i3++;
                i5 = i12 ^ f4;
                i6 = f ^ f4;
                i7 = i14 + 1;
            }
            int i16 = i7 + 1;
            int f5 = f(i6, iArr[i7]);
            bArr2[i2] = (byte) (f5 >>> 8);
            bArr2[i2 + 1] = (byte) f5;
            int i17 = i16 + 1;
            h(i4 + iArr[i16], bArr2, i2 + 2);
            h(i5 + iArr[i17], bArr2, i2 + 4);
            h(f(d4, iArr[i17 + 1]), bArr2, i2 + 6);
            return 8;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public int b() {
        return 8;
    }

    public int c(int i) {
        return (0 - i) & 65535;
    }

    public final int d(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    public final int[] e(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i2 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i2 >= 8) {
                break;
            }
            iArr[i2] = d(bArr, i2 * 2);
            i2++;
        }
        for (i = 8; i < 52; i++) {
            int i3 = i & 7;
            if (i3 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i3 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    public final int f(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 65537 - i2;
        } else if (i2 == 0) {
            i3 = 65537 - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 - i6) + (i5 < i6 ? 1 : 0);
        }
        return i3 & 65535;
    }

    public final int g(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = 65537 / i;
        int i3 = 65537 % i;
        int i4 = 1;
        while (i3 != 1) {
            int i5 = i / i3;
            i %= i3;
            i4 = ((i5 * i2) + i4) & 65535;
            if (i == 1) {
                return i4;
            }
            int i6 = i3 / i;
            i3 %= i;
            i2 = ((i6 * i4) + i2) & 65535;
        }
        return (1 - i2) & 65535;
    }

    public String getAlgorithmName() {
        return "IDEA";
    }

    public final void h(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public void init(boolean z, i iVar) {
        int[] iArr;
        if (iVar instanceof y0) {
            byte[] bArr = ((y0) iVar).c;
            if (z) {
                iArr = e(bArr);
            } else {
                int[] e = e(bArr);
                int[] iArr2 = new int[52];
                int g = g(e[0]);
                int i = 1;
                int c = c(e[1]);
                int c2 = c(e[2]);
                iArr2[51] = g(e[3]);
                iArr2[50] = c2;
                iArr2[49] = c;
                int i2 = 48;
                iArr2[48] = g;
                int i3 = 4;
                while (i < 8) {
                    int i4 = i3 + 1;
                    int i5 = e[i3];
                    int i6 = i4 + 1;
                    int i7 = i2 - 1;
                    iArr2[i7] = e[i4];
                    int i8 = i7 - 1;
                    iArr2[i8] = i5;
                    int i9 = i6 + 1;
                    int g2 = g(e[i6]);
                    int i10 = i9 + 1;
                    int c3 = c(e[i9]);
                    int i11 = i10 + 1;
                    int c4 = c(e[i10]);
                    int i12 = i8 - 1;
                    iArr2[i12] = g(e[i11]);
                    int i13 = i12 - 1;
                    iArr2[i13] = c3;
                    int i14 = i13 - 1;
                    iArr2[i14] = c4;
                    i2 = i14 - 1;
                    iArr2[i2] = g2;
                    i++;
                    i3 = i11 + 1;
                }
                int i15 = i3 + 1;
                int i16 = e[i3];
                int i17 = i15 + 1;
                int i18 = i2 - 1;
                iArr2[i18] = e[i15];
                int i19 = i18 - 1;
                iArr2[i19] = i16;
                int i20 = i17 + 1;
                int g3 = g(e[i17]);
                int i21 = i20 + 1;
                int c5 = c(e[i20]);
                int i22 = i21 + 1;
                int c6 = c(e[i21]);
                int i23 = i19 - 1;
                iArr2[i23] = g(e[i22]);
                int i24 = i23 - 1;
                iArr2[i24] = c6;
                int i25 = i24 - 1;
                iArr2[i25] = c5;
                iArr2[i25 - 1] = g3;
                iArr = iArr2;
            }
            this.a = iArr;
            return;
        }
        throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to IDEA init - ")));
    }

    public void reset() {
    }
}
