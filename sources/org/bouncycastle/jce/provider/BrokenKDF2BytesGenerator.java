package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.k0.x0;
import s0.a.b.l;
import s0.a.b.m;
import s0.a.b.n;

public class BrokenKDF2BytesGenerator implements l {
    private n digest;
    private byte[] iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(n nVar) {
        this.digest = nVar;
    }

    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i2 >= i) {
            long j = ((long) i2) * 8;
            if (j <= ((long) this.digest.getDigestSize()) * 8 * 2147483648L) {
                int digestSize = (int) (j / ((long) this.digest.getDigestSize()));
                int digestSize2 = this.digest.getDigestSize();
                byte[] bArr2 = new byte[digestSize2];
                for (int i3 = 1; i3 <= digestSize; i3++) {
                    n nVar = this.digest;
                    byte[] bArr3 = this.shared;
                    nVar.update(bArr3, 0, bArr3.length);
                    this.digest.update((byte) (i3 & 255));
                    this.digest.update((byte) ((i3 >> 8) & 255));
                    this.digest.update((byte) ((i3 >> 16) & 255));
                    this.digest.update((byte) ((i3 >> 24) & 255));
                    n nVar2 = this.digest;
                    byte[] bArr4 = this.iv;
                    nVar2.update(bArr4, 0, bArr4.length);
                    this.digest.doFinal(bArr2, 0);
                    int i4 = i2 - i;
                    if (i4 > digestSize2) {
                        System.arraycopy(bArr2, 0, bArr, i, digestSize2);
                        i += digestSize2;
                    } else {
                        System.arraycopy(bArr2, 0, bArr, i, i4);
                    }
                }
                this.digest.reset();
                return i2;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }

    public n getDigest() {
        return this.digest;
    }

    public void init(m mVar) {
        if (mVar instanceof x0) {
            x0 x0Var = (x0) mVar;
            this.shared = x0Var.b;
            this.iv = x0Var.a;
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }
}
