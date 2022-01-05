package s0.a.b.a0;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;
import s0.a.b.i;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.f1;
import s0.a.b.k0.w;
import s0.a.b.n;
import s0.a.e.b.h;
import s0.a.g.b;

public class g {
    public final n a;
    public b0 b;
    public BigInteger c;

    public g(n nVar) {
        this.a = nVar;
    }

    public byte[] a(i iVar) {
        c0 c0Var = (c0) iVar;
        w wVar = this.b.d;
        if (wVar.equals(c0Var.d)) {
            BigInteger mod = wVar.k.multiply(this.c).multiply(this.b.q).mod(wVar.j);
            h C0 = a.C0(wVar.g, c0Var.q);
            if (!C0.m()) {
                h q = C0.o(mod).q();
                if (!q.m()) {
                    BigInteger t = q.d().t();
                    BigInteger t2 = q.e().t();
                    int i = t.toByteArray().length > 33 ? 64 : 32;
                    int i2 = i * 2;
                    byte[] bArr = new byte[i2];
                    byte[] b2 = b.b(i, t);
                    byte[] b3 = b.b(i, t2);
                    for (int i3 = 0; i3 != i; i3++) {
                        bArr[i3] = b2[(i - i3) - 1];
                    }
                    for (int i4 = 0; i4 != i; i4++) {
                        bArr[i + i4] = b3[(i - i4) - 1];
                    }
                    this.a.update(bArr, 0, i2);
                    byte[] bArr2 = new byte[this.a.getDigestSize()];
                    this.a.doFinal(bArr2, 0);
                    return bArr2;
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        throw new IllegalStateException("ECVKO public key has wrong domain parameters");
    }

    public void b(i iVar) {
        f1 f1Var = (f1) iVar;
        this.b = (b0) f1Var.d;
        byte[] bArr = f1Var.c;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        this.c = new BigInteger(1, bArr2);
    }
}
