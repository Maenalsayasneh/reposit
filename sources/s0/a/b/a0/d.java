package s0.a.b.a0;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;
import s0.a.b.i;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.e.b.h;

public class d implements s0.a.b.d {
    public b0 a;

    public int a() {
        return (this.a.d.g.l() + 7) / 8;
    }

    public BigInteger b(i iVar) {
        c0 c0Var = (c0) iVar;
        w wVar = this.a.d;
        if (wVar.equals(c0Var.d)) {
            BigInteger mod = wVar.k.multiply(this.a.q).mod(wVar.j);
            h C0 = a.C0(wVar.g, c0Var.q);
            if (!C0.m()) {
                h q = C0.o(mod).q();
                if (!q.m()) {
                    return q.d().t();
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        throw new IllegalStateException("ECDHC public key has wrong domain parameters");
    }

    public void init(i iVar) {
        this.a = (b0) iVar;
    }
}
