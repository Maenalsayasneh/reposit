package s0.a.b.e0;

import java.util.Objects;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.h0.f;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.d1;
import s0.a.b.k0.f1;
import s0.a.b.y;
import s0.a.e.b.b0.c.h3;

public class v implements y {
    public u a = new u();
    public f b = new f();

    public byte[] a(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        Objects.requireNonNull(this.b);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        this.a.a(bArr, i, bArr2, 0);
        this.a.a(bArr, i + 8, bArr2, 8);
        this.a.a(bArr, i + 16, bArr2, 16);
        this.a.a(bArr, i + 24, bArr2, 24);
        Objects.requireNonNull(this.b);
        byte[] bArr3 = new byte[4];
        this.b.update(bArr2, 0, i3);
        this.b.doFinal(bArr3, 0);
        Objects.requireNonNull(this.b);
        byte[] bArr4 = new byte[4];
        Objects.requireNonNull(this.b);
        System.arraycopy(bArr, (i + i2) - 4, bArr4, 0, 4);
        if (h3.U(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException("mac mismatch");
    }

    public byte[] b(byte[] bArr, int i, int i2) {
        this.b.update(bArr, i, i2);
        Objects.requireNonNull(this.b);
        byte[] bArr2 = new byte[(i2 + 4)];
        this.a.a(bArr, i, bArr2, 0);
        this.a.a(bArr, i + 8, bArr2, 8);
        this.a.a(bArr, i + 16, bArr2, 16);
        this.a.a(bArr, i + 24, bArr2, 24);
        this.b.doFinal(bArr2, i2);
        return bArr2;
    }

    public String getAlgorithmName() {
        return "GOST28147Wrap";
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof d1) {
            iVar = ((d1) iVar).d;
        }
        f1 f1Var = (f1) iVar;
        this.a.init(z, f1Var.d);
        this.b.init(new c1(f1Var.d, f1Var.c));
    }
}
