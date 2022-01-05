package s0.a.b.a0;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;
import s0.a.b.i;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.u;
import s0.a.b.k0.v;
import s0.a.b.k0.w;
import s0.a.e.b.h;
import s0.a.g.b;

public class e {
    public u a;

    public byte[] a(i iVar) {
        v vVar = (v) iVar;
        b0 b0Var = this.a.c;
        c0 c0Var = vVar.c;
        w wVar = b0Var.d;
        if (wVar.equals(c0Var.d)) {
            BigInteger mod = wVar.k.multiply(b0Var.q).mod(wVar.j);
            h C0 = a.C0(wVar.g, c0Var.q);
            if (!C0.m()) {
                h q = C0.o(mod).q();
                if (!q.m()) {
                    BigInteger t = q.d().t();
                    b0 b0Var2 = this.a.d;
                    c0 c0Var2 = vVar.d;
                    w wVar2 = b0Var2.d;
                    if (wVar2.equals(c0Var2.d)) {
                        BigInteger mod2 = wVar2.k.multiply(b0Var2.q).mod(wVar2.j);
                        h C02 = a.C0(wVar2.g, c0Var2.q);
                        if (!C02.m()) {
                            h q2 = C02.o(mod2).q();
                            if (!q2.m()) {
                                BigInteger t2 = q2.d().t();
                                int l = (this.a.c.d.g.l() + 7) / 8;
                                byte[] bArr = new byte[(l * 2)];
                                b.a(t2, bArr, 0, l);
                                b.a(t, bArr, l, l);
                                return bArr;
                            }
                            throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
                        }
                        throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
                    }
                    throw new IllegalStateException("ECDHC public key has wrong domain parameters");
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        throw new IllegalStateException("ECDHC public key has wrong domain parameters");
    }
}
