package s0.a.b.f0;

import i0.d.a.a.a;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.n;
import s0.a.b.t;

public class u extends t {
    public n a;

    public u(n nVar) {
        this.a = nVar;
    }

    public final byte[] a() {
        int digestSize = this.a.getDigestSize();
        byte[] bArr = new byte[digestSize];
        n nVar = this.a;
        byte[] bArr2 = this.password;
        nVar.update(bArr2, 0, bArr2.length);
        n nVar2 = this.a;
        byte[] bArr3 = this.salt;
        nVar2.update(bArr3, 0, bArr3.length);
        this.a.doFinal(bArr, 0);
        for (int i = 1; i < this.iterationCount; i++) {
            this.a.update(bArr, 0, digestSize);
            this.a.doFinal(bArr, 0);
        }
        return bArr;
    }

    public i generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    public i generateDerivedParameters(int i) {
        int i2 = i / 8;
        if (i2 <= this.a.getDigestSize()) {
            return new y0(a(), 0, i2);
        }
        throw new IllegalArgumentException(a.g0("Can't generate a derived key ", i2, " bytes long."));
    }

    public i generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        if (i5 <= this.a.getDigestSize()) {
            byte[] a2 = a();
            return new c1(new y0(a2, 0, i3), a2, i3, i4);
        }
        throw new IllegalArgumentException(a.g0("Can't generate a derived key ", i5, " bytes long."));
    }
}
