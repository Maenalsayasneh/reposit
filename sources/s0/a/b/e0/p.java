package s0.a.b.e0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.i;
import s0.a.b.k0.y0;

public class p extends o {
    public int[] o = null;
    public int[] p = null;
    public int[] q = null;
    public boolean r;

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.o;
        if (iArr == null) {
            throw new IllegalStateException("DESede engine not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr2.length) {
            byte[] bArr3 = new byte[8];
            if (this.r) {
                byte[] bArr4 = bArr3;
                c(iArr, bArr, i, bArr4, 0);
                byte[] bArr5 = bArr3;
                c(this.p, bArr5, 0, bArr4, 0);
                c(this.q, bArr5, 0, bArr2, i2);
            } else {
                byte[] bArr6 = bArr3;
                c(this.q, bArr, i, bArr6, 0);
                byte[] bArr7 = bArr3;
                c(this.p, bArr7, 0, bArr6, 0);
                c(this.o, bArr7, 0, bArr2, i2);
            }
            return 8;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public int b() {
        return 8;
    }

    public String getAlgorithmName() {
        return "DESede";
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof y0) {
            byte[] bArr = ((y0) iVar).c;
            if (bArr.length == 24 || bArr.length == 16) {
                this.r = z;
                byte[] bArr2 = new byte[8];
                System.arraycopy(bArr, 0, bArr2, 0, 8);
                this.o = d(z, bArr2);
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 8, bArr3, 0, 8);
                this.p = d(!z, bArr3);
                if (bArr.length == 24) {
                    byte[] bArr4 = new byte[8];
                    System.arraycopy(bArr, 16, bArr4, 0, 8);
                    this.q = d(z, bArr4);
                    return;
                }
                this.q = this.o;
                return;
            }
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to DESede init - ")));
    }

    public void reset() {
    }
}
