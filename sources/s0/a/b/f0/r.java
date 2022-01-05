package s0.a.b.f0;

import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.k0.w0;
import s0.a.b.k0.x0;
import s0.a.b.l;
import s0.a.b.m;
import s0.a.b.n;
import s0.a.e.b.b0.c.h3;

public class r implements l {
    public int a = 1;
    public n b;
    public byte[] c;
    public byte[] d;

    public r(n nVar) {
        this.b = nVar;
    }

    public int generateBytes(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i2;
        int i4 = i;
        if (bArr2.length - i3 >= i4) {
            long j = (long) i3;
            int digestSize = this.b.getDigestSize();
            if (j <= 8589934591L) {
                long j2 = (long) digestSize;
                int i5 = (int) (((j + j2) - 1) / j2);
                byte[] bArr3 = new byte[this.b.getDigestSize()];
                byte[] bArr4 = new byte[4];
                h3.B1(this.a, bArr4, 0);
                int i6 = this.a & -256;
                for (int i7 = 0; i7 < i5; i7++) {
                    n nVar = this.b;
                    byte[] bArr5 = this.c;
                    nVar.update(bArr5, 0, bArr5.length);
                    this.b.update(bArr4, 0, 4);
                    byte[] bArr6 = this.d;
                    if (bArr6 != null) {
                        this.b.update(bArr6, 0, bArr6.length);
                    }
                    this.b.doFinal(bArr3, 0);
                    if (i3 > digestSize) {
                        System.arraycopy(bArr3, 0, bArr2, i4, digestSize);
                        i4 += digestSize;
                        i3 -= digestSize;
                    } else {
                        System.arraycopy(bArr3, 0, bArr2, i4, i3);
                    }
                    byte b2 = (byte) (bArr4[3] + 1);
                    bArr4[3] = b2;
                    if (b2 == 0) {
                        i6 += 256;
                        h3.B1(i6, bArr4, 0);
                    }
                }
                this.b.reset();
                return (int) j;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }

    public void init(m mVar) {
        if (mVar instanceof x0) {
            x0 x0Var = (x0) mVar;
            this.c = x0Var.b;
            this.d = x0Var.a;
        } else if (mVar instanceof w0) {
            w0 w0Var = (w0) mVar;
            this.c = null;
            this.d = null;
        } else {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
    }
}
