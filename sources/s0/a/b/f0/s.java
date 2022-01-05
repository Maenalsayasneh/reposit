package s0.a.b.f0;

import s0.a.b.b0.p;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.n;
import s0.a.b.t;

public class s extends t {
    public n a = new p();

    public final byte[] a(int i) {
        int digestSize = this.a.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            n nVar = this.a;
            byte[] bArr3 = this.password;
            nVar.update(bArr3, 0, bArr3.length);
            n nVar2 = this.a;
            byte[] bArr4 = this.salt;
            nVar2.update(bArr4, 0, bArr4.length);
            this.a.doFinal(bArr, 0);
            int i3 = i > digestSize ? digestSize : i;
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            i2 += i3;
            i -= i3;
            if (i == 0) {
                return bArr2;
            }
            this.a.reset();
            this.a.update(bArr, 0, digestSize);
        }
    }

    public void b(byte[] bArr, byte[] bArr2) {
        super.init(bArr, bArr2, 1);
    }

    public i generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    public i generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new y0(a(i2), 0, i2);
    }

    public i generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] a2 = a(i3 + i4);
        return new c1(new y0(a2, 0, i3), a2, i3, i4);
    }
}
