package s0.a.b.n0;

import java.math.BigInteger;
import java.security.SecureRandom;
import m0.r.t.a.r.m.a1.a;
import s0.a.b.j;
import s0.a.b.k;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.d1;
import s0.a.b.k0.w;
import s0.a.b.k0.z;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.c;
import s0.a.e.b.h;
import s0.a.e.b.i;
import s0.a.g.b;

public class g implements k {
    public z g;
    public SecureRandom h;

    public BigInteger[] a(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, h3.J2(bArr));
        z zVar = this.g;
        w wVar = zVar.d;
        BigInteger bigInteger2 = wVar.j;
        BigInteger bigInteger3 = ((b0) zVar).q;
        i iVar = new i();
        while (true) {
            BigInteger e = b.e(bigInteger2.bitLength(), this.h);
            BigInteger bigInteger4 = c.a;
            if (!e.equals(bigInteger4)) {
                BigInteger mod = iVar.a(wVar.i, e).q().d().t().mod(bigInteger2);
                if (!mod.equals(bigInteger4)) {
                    BigInteger mod2 = e.multiply(bigInteger).add(bigInteger3.multiply(mod)).mod(bigInteger2);
                    if (!mod2.equals(bigInteger4)) {
                        return new BigInteger[]{mod, mod2};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, h3.J2(bArr));
        BigInteger bigInteger4 = this.g.d.j;
        BigInteger bigInteger5 = c.b;
        if (bigInteger.compareTo(bigInteger5) < 0 || bigInteger.compareTo(bigInteger4) >= 0 || bigInteger2.compareTo(bigInteger5) < 0 || bigInteger2.compareTo(bigInteger4) >= 0) {
            return false;
        }
        BigInteger k = b.k(bigInteger4, bigInteger3);
        BigInteger mod = bigInteger2.multiply(k).mod(bigInteger4);
        BigInteger mod2 = bigInteger4.subtract(bigInteger).multiply(k).mod(bigInteger4);
        z zVar = this.g;
        h q = a.M3(zVar.d.i, mod, ((c0) zVar).q, mod2).q();
        if (q.m()) {
            return false;
        }
        return q.d().t().mod(bigInteger4).equals(bigInteger);
    }

    public BigInteger getOrder() {
        return this.g.d.j;
    }

    public void init(boolean z, s0.a.b.i iVar) {
        z zVar;
        if (!z) {
            zVar = (c0) iVar;
        } else if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            this.h = d1Var.c;
            this.g = (b0) d1Var.d;
            return;
        } else {
            this.h = j.a();
            zVar = (b0) iVar;
        }
        this.g = zVar;
    }
}
