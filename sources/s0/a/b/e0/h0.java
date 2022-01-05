package s0.a.b.e0;

import i0.d.a.a.a;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.h1;
import s0.a.b.k0.y0;

public class h0 implements e {
    public int a = 12;
    public int[] b = null;
    public boolean c;

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.c) {
            int c2 = c(bArr, i) + this.b[0];
            int c3 = c(bArr, i + 4) + this.b[1];
            for (int i3 = 1; i3 <= this.a; i3++) {
                int i4 = i3 * 2;
                c2 = d(c2 ^ c3, c3) + this.b[i4];
                c3 = d(c3 ^ c2, c2) + this.b[i4 + 1];
            }
            f(c2, bArr2, i2);
            f(c3, bArr2, i2 + 4);
            return 8;
        }
        int c4 = c(bArr, i);
        int c5 = c(bArr, i + 4);
        for (int i5 = this.a; i5 >= 1; i5--) {
            int[] iArr = this.b;
            int i6 = i5 * 2;
            int i7 = c5 - iArr[i6 + 1];
            int i8 = c4 & 31;
            c5 = ((i7 << (32 - i8)) | (i7 >>> i8)) ^ c4;
            int i9 = c4 - iArr[i6];
            int i10 = c5 & 31;
            c4 = ((i9 << (32 - i10)) | (i9 >>> i10)) ^ c5;
        }
        f(c4 - this.b[0], bArr2, i2);
        f(c5 - this.b[1], bArr2, i2 + 4);
        return 8;
    }

    public int b() {
        return 8;
    }

    public final int c(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final int d(int i, int i2) {
        int i3 = i2 & 31;
        return (i >>> (32 - i3)) | (i << i3);
    }

    public final void e(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr2[i2] = iArr2[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        int[] iArr3 = new int[((this.a + 1) * 2)];
        this.b = iArr3;
        iArr3[0] = -1209970333;
        int i3 = 1;
        while (true) {
            iArr = this.b;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = iArr[i3 - 1] - 1640531527;
            i3++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length2; i8++) {
            int[] iArr4 = this.b;
            i5 = d(iArr4[i4] + i5 + i6, 3);
            iArr4[i4] = i5;
            i6 = d(iArr2[i7] + i5 + i6, i6 + i5);
            iArr2[i7] = i6;
            i4 = (i4 + 1) % this.b.length;
            i7 = (i7 + 1) % length;
        }
    }

    public final void f(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    public String getAlgorithmName() {
        return "RC5-32";
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof h1) {
            h1 h1Var = (h1) iVar;
            this.a = h1Var.d;
            e(h1Var.c);
        } else if (iVar instanceof y0) {
            e(((y0) iVar).c);
        } else {
            throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to RC532 init - ")));
        }
        this.c = z;
    }

    public void reset() {
    }
}
