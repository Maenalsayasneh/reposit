package s0.a.f.b.h;

import java.util.Objects;
import s0.a.b.n;
import s0.a.b.z;
import s0.a.e.b.b0.c.h3;

public final class e {
    public final n a;
    public final int b;

    public e(s0.a.a.n nVar, int i) {
        Objects.requireNonNull(nVar, "digest == null");
        this.a = c.a(nVar);
        this.b = i;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.b) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == 32) {
            return b(3, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong address length");
        }
    }

    public final byte[] b(int i, byte[] bArr, byte[] bArr2) {
        byte[] s3 = h3.s3((long) i, this.b);
        this.a.update(s3, 0, s3.length);
        this.a.update(bArr, 0, bArr.length);
        this.a.update(bArr2, 0, bArr2.length);
        int i2 = this.b;
        byte[] bArr3 = new byte[i2];
        n nVar = this.a;
        if (nVar instanceof z) {
            ((z) nVar).b(bArr3, 0, i2);
        } else {
            nVar.doFinal(bArr3, 0);
        }
        return bArr3;
    }
}
