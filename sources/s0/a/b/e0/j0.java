package s0.a.b.e0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.y0;

public class j0 implements e {
    public int[] a = null;
    public boolean b;

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int i3 = i2;
        if (this.a == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        } else if (i + 16 > bArr3.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + 16 <= bArr4.length) {
            int i4 = 5;
            int i5 = 20;
            if (this.b) {
                int c = c(bArr, i);
                int c2 = c(bArr3, i + 4);
                int c3 = c(bArr3, i + 8);
                int c4 = c(bArr3, i + 12);
                int[] iArr = this.a;
                int i6 = c2 + iArr[0];
                int i7 = c4 + iArr[1];
                int i8 = 1;
                while (i8 <= 20) {
                    int d = d(((i6 * 2) + 1) * i6, 5);
                    int d2 = d(((i7 * 2) + 1) * i7, 5);
                    int i9 = i8 * 2;
                    i8++;
                    int d3 = d(c3 ^ d2, d) + this.a[i9 + 1];
                    c3 = i7;
                    i7 = d(c ^ d, d2) + this.a[i9];
                    c = i6;
                    i6 = d3;
                }
                int[] iArr2 = this.a;
                e(c + iArr2[42], bArr4, i3);
                e(i6, bArr4, i3 + 4);
                e(c3 + iArr2[43], bArr4, i3 + 8);
                e(i7, bArr4, i3 + 12);
                return 16;
            }
            int c5 = c(bArr, i);
            int c6 = c(bArr3, i + 4);
            int c7 = c(bArr3, i + 8);
            int c8 = c(bArr3, i + 12);
            int[] iArr3 = this.a;
            int i10 = c7 - iArr3[43];
            int i11 = c5 - iArr3[42];
            while (i5 >= 1) {
                int d4 = d(((i11 * 2) + 1) * i11, i4);
                int d5 = d(((i10 * 2) + 1) * i10, i4);
                int[] iArr4 = this.a;
                int i12 = i5 * 2;
                int i13 = c6 - iArr4[i12 + 1];
                int i14 = ((i13 << (-d4)) | (i13 >>> d4)) ^ d5;
                int i15 = c8 - iArr4[i12];
                i5--;
                c6 = i11;
                i11 = ((i15 << (-d5)) | (i15 >>> d5)) ^ d4;
                c8 = i10;
                i10 = i14;
                i4 = 5;
            }
            int[] iArr5 = this.a;
            e(i11, bArr4, i3);
            e(c6 - iArr5[0], bArr4, i3 + 4);
            e(i10, bArr4, i3 + 8);
            e(c8 - iArr5[1], bArr4, i3 + 12);
            return 16;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public int b() {
        return 16;
    }

    public final int c(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    public final int d(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public final void e(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + i2] = (byte) i;
            i >>>= 8;
        }
    }

    public String getAlgorithmName() {
        return "RC6";
    }

    public void init(boolean z, i iVar) {
        int[] iArr;
        if (iVar instanceof y0) {
            this.b = z;
            byte[] bArr = ((y0) iVar).c;
            int length = (bArr.length + 3) / 4;
            int length2 = ((bArr.length + 4) - 1) / 4;
            int[] iArr2 = new int[length2];
            for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
                int i = length3 / 4;
                iArr2[i] = (iArr2[i] << 8) + (bArr[length3] & 255);
            }
            int[] iArr3 = new int[44];
            this.a = iArr3;
            iArr3[0] = -1209970333;
            int i2 = 1;
            while (true) {
                iArr = this.a;
                if (i2 >= iArr.length) {
                    break;
                }
                iArr[i2] = iArr[i2 - 1] - 1640531527;
                i2++;
            }
            int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length4; i7++) {
                int[] iArr4 = this.a;
                i4 = d(iArr4[i3] + i4 + i5, 3);
                iArr4[i3] = i4;
                i5 = d(iArr2[i6] + i4 + i5, i5 + i4);
                iArr2[i6] = i5;
                i3 = (i3 + 1) % this.a.length;
                i6 = (i6 + 1) % length2;
            }
            return;
        }
        throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to RC6 init - ")));
    }

    public void reset() {
    }
}
