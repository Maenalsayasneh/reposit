package s0.a.b.e0;

import i0.d.a.a.a;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.h1;

public class i0 implements e {
    public int a = 12;
    public long[] b = null;
    public boolean c;

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int i3 = i2;
        if (this.c) {
            long c2 = c(bArr, i) + this.b[0];
            long c3 = c(bArr3, i + 8) + this.b[1];
            for (int i4 = 1; i4 <= this.a; i4++) {
                int i5 = i4 * 2;
                c2 = d(c2 ^ c3, c3) + this.b[i5];
                c3 = d(c3 ^ c2, c2) + this.b[i5 + 1];
            }
            e(c2, bArr4, i3);
            e(c3, bArr4, i3 + 8);
            return 16;
        }
        long c4 = c(bArr, i);
        long c5 = c(bArr3, i + 8);
        int i6 = this.a;
        for (int i7 = 1; i6 >= i7; i7 = 1) {
            long[] jArr = this.b;
            int i8 = i6 * 2;
            long j = c5 - jArr[i8 + 1];
            long j2 = c4 & 63;
            c5 = ((j << ((int) (64 - j2))) | (j >>> ((int) j2))) ^ c4;
            long j3 = c4 - jArr[i8];
            long j4 = c5 & 63;
            c4 = ((j3 << ((int) (64 - j4))) | (j3 >>> ((int) j4))) ^ c5;
            i6--;
        }
        e(c4 - this.b[0], bArr4, i3);
        e(c5 - this.b[1], bArr4, i3 + 8);
        return 16;
    }

    public int b() {
        return 16;
    }

    public final long c(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + ((long) (bArr[i2 + i] & 255));
        }
        return j;
    }

    public final long d(long j, long j2) {
        long j3 = j2 & 63;
        return (j >>> ((int) (64 - j3))) | (j << ((int) j3));
    }

    public final void e(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) ((int) j);
            j >>>= 8;
        }
    }

    public String getAlgorithmName() {
        return "RC5-64";
    }

    public void init(boolean z, i iVar) {
        long[] jArr;
        if (iVar instanceof h1) {
            h1 h1Var = (h1) iVar;
            this.c = z;
            this.a = h1Var.d;
            byte[] bArr = h1Var.c;
            int length = (bArr.length + 7) / 8;
            long[] jArr2 = new long[length];
            for (int i = 0; i != bArr.length; i++) {
                int i2 = i / 8;
                jArr2[i2] = jArr2[i2] + (((long) (bArr[i] & 255)) << ((i % 8) * 8));
            }
            long[] jArr3 = new long[((this.a + 1) * 2)];
            this.b = jArr3;
            jArr3[0] = -5196783011329398165L;
            int i3 = 1;
            while (true) {
                jArr = this.b;
                if (i3 >= jArr.length) {
                    break;
                }
                jArr[i3] = jArr[i3 - 1] - 7046029254386353131L;
                i3++;
            }
            int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
            long j = 0;
            long j2 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < length2; i6++) {
                long[] jArr4 = this.b;
                j = d(jArr4[i4] + j + j2, 3);
                jArr4[i4] = j;
                j2 = d(jArr2[i5] + j + j2, j2 + j);
                jArr2[i5] = j2;
                i4 = (i4 + 1) % this.b.length;
                i5 = (i5 + 1) % length;
            }
            return;
        }
        throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to RC564 init - ")));
    }

    public void reset() {
    }
}
