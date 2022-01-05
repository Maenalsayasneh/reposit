package s0.a.b.e0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;

public class y0 implements e {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e = false;
    public boolean f;

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.e) {
            throw new IllegalStateException("TEA not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr2.length) {
            int i3 = 0;
            if (this.f) {
                int c2 = c(bArr, i);
                int c3 = c(bArr, i + 4);
                int i4 = 0;
                while (i3 != 32) {
                    i4 -= 1640531527;
                    c2 += (((c3 << 4) + this.a) ^ (c3 + i4)) ^ ((c3 >>> 5) + this.b);
                    c3 += (((c2 << 4) + this.c) ^ (c2 + i4)) ^ ((c2 >>> 5) + this.d);
                    i3++;
                }
                d(c2, bArr2, i2);
                d(c3, bArr2, i2 + 4);
                return 8;
            }
            int c4 = c(bArr, i);
            int c5 = c(bArr, i + 4);
            int i5 = -957401312;
            while (i3 != 32) {
                c5 -= (((c4 << 4) + this.c) ^ (c4 + i5)) ^ ((c4 >>> 5) + this.d);
                c4 -= (((c5 << 4) + this.a) ^ (c5 + i5)) ^ ((c5 >>> 5) + this.b);
                i5 += 1640531527;
                i3++;
            }
            d(c4, bArr2, i2);
            d(c5, bArr2, i2 + 4);
            return 8;
        } else {
            throw new OutputLengthException("output buffer too short");
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
        return "TEA";
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof s0.a.b.k0.y0) {
            this.f = z;
            this.e = true;
            byte[] bArr = ((s0.a.b.k0.y0) iVar).c;
            if (bArr.length == 16) {
                this.a = c(bArr, 0);
                this.b = c(bArr, 4);
                this.c = c(bArr, 8);
                this.d = c(bArr, 12);
                return;
            }
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to TEA init - ")));
    }

    public void reset() {
    }
}
