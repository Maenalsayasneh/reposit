package s0.a.b.a0;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;
import s0.a.b.d;
import s0.a.b.i;
import s0.a.b.k0.a1;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.b.k0.z0;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.h;
import s0.a.g.g;

public class f implements d {
    public z0 a;

    public int a() {
        return (this.a.c.d.g.l() + 7) / 8;
    }

    public BigInteger b(i iVar) {
        if (!g.b("org.bouncycastle.ec.disable_mqv")) {
            a1 a1Var = (a1) iVar;
            b0 b0Var = this.a.c;
            w wVar = b0Var.d;
            if (wVar.equals(a1Var.c.d)) {
                z0 z0Var = this.a;
                b0 b0Var2 = z0Var.d;
                c0 c0Var = z0Var.q;
                c0 c0Var2 = a1Var.c;
                c0 c0Var3 = a1Var.d;
                BigInteger bigInteger = wVar.j;
                int bitLength = (bigInteger.bitLength() + 1) / 2;
                BigInteger shiftLeft = c.b.shiftLeft(bitLength);
                e eVar = wVar.g;
                h C0 = a.C0(eVar, c0Var.q);
                h C02 = a.C0(eVar, c0Var2.q);
                h C03 = a.C0(eVar, c0Var3.q);
                BigInteger mod = b0Var.q.multiply(C0.d().t().mod(shiftLeft).setBit(bitLength)).add(b0Var2.q).mod(bigInteger);
                BigInteger bit = C03.d().t().mod(shiftLeft).setBit(bitLength);
                BigInteger mod2 = wVar.k.multiply(mod).mod(bigInteger);
                h q = a.M3(C02, bit.multiply(mod2).mod(bigInteger), C03, mod2).q();
                if (!q.m()) {
                    return q.d().t();
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
            }
            throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
        }
        throw new IllegalStateException("ECMQV explicitly disabled");
    }

    public void init(i iVar) {
        this.a = (z0) iVar;
    }
}
