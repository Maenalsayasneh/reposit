package s0.a.b.a0;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;
import s0.a.b.d;
import s0.a.b.i;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.e.b.h;
import s0.a.g.b;

public class c implements d {
    public b0 a;

    public int a() {
        return (this.a.d.g.l() + 7) / 8;
    }

    public BigInteger b(i iVar) {
        BigInteger bigInteger;
        c0 c0Var = (c0) iVar;
        w wVar = this.a.d;
        if (wVar.equals(c0Var.d)) {
            BigInteger bigInteger2 = this.a.q;
            h C0 = a.C0(wVar.g, c0Var.q);
            if (!C0.m()) {
                BigInteger bigInteger3 = wVar.k;
                if (!bigInteger3.equals(s0.a.e.b.c.b)) {
                    synchronized (wVar) {
                        if (wVar.l == null) {
                            wVar.l = b.k(wVar.j, wVar.k);
                        }
                        bigInteger = wVar.l;
                    }
                    bigInteger2 = bigInteger.multiply(bigInteger2).mod(wVar.j);
                    C0 = a.f3(C0, bigInteger3);
                }
                h q = C0.o(bigInteger2).q();
                if (!q.m()) {
                    return q.d().t();
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDH");
        }
        throw new IllegalStateException("ECDH public key has wrong domain parameters");
    }

    public void init(i iVar) {
        this.a = (b0) iVar;
    }
}
