package s0.a.b.e0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.y0;

public class f1 implements e {
    public int[] a = new int[4];
    public int[] b = new int[32];
    public int[] c = new int[32];
    public boolean d = false;
    public boolean e;

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.d) {
            throw new IllegalStateException("XTEA not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (this.e) {
            int c2 = c(bArr, i);
            int c3 = c(bArr, i + 4);
            for (int i3 = 0; i3 < 32; i3++) {
                c2 += (((c3 << 4) ^ (c3 >>> 5)) + c3) ^ this.b[i3];
                c3 += (((c2 << 4) ^ (c2 >>> 5)) + c2) ^ this.c[i3];
            }
            d(c2, bArr2, i2);
            d(c3, bArr2, i2 + 4);
            return 8;
        } else {
            int c4 = c(bArr, i);
            int c5 = c(bArr, i + 4);
            for (int i4 = 31; i4 >= 0; i4--) {
                c5 -= (((c4 << 4) ^ (c4 >>> 5)) + c4) ^ this.c[i4];
                c4 -= (((c5 << 4) ^ (c5 >>> 5)) + c5) ^ this.b[i4];
            }
            d(c4, bArr2, i2);
            d(c5, bArr2, i2 + 4);
            return 8;
        }
    }

    public int b() {
        return 8;
    }

    public final int c(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b2 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16);
        return (bArr[i3 + 1] & 255) | b2 | ((bArr[i3] & 255) << 8);
    }

    public final void d(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public String getAlgorithmName() {
        return "XTEA";
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof y0) {
            this.e = z;
            this.d = true;
            byte[] bArr = ((y0) iVar).c;
            if (bArr.length == 16) {
                int i = 0;
                int i2 = 0;
                while (i < 4) {
                    this.a[i] = c(bArr, i2);
                    i++;
                    i2 += 4;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < 32; i4++) {
                    int[] iArr = this.b;
                    int[] iArr2 = this.a;
                    iArr[i4] = iArr2[i3 & 3] + i3;
                    i3 -= 1640531527;
                    this.c[i4] = iArr2[(i3 >>> 11) & 3] + i3;
                }
                return;
            }
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to TEA init - ")));
    }

    public void reset() {
    }
}
