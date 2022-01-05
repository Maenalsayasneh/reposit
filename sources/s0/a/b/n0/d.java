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
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.e.b.i;
import s0.a.g.b;

public class d implements k {
    public static final BigInteger g = BigInteger.valueOf(1);
    public z h;
    public SecureRandom i;

    public static BigInteger c(BigInteger bigInteger, g gVar) {
        BigInteger t = gVar.t();
        int bitLength = bigInteger.bitLength() - 1;
        return t.bitLength() > bitLength ? t.mod(g.shiftLeft(bitLength)) : t;
    }

    public static g d(e eVar, byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, h3.J2(bArr));
        int l = eVar.l();
        if (bigInteger.bitLength() > l) {
            bigInteger = bigInteger.mod(g.shiftLeft(l));
        }
        return eVar.k(bigInteger);
    }

    public BigInteger[] a(byte[] bArr) {
        w wVar = this.h.d;
        e eVar = wVar.g;
        g d = d(eVar, bArr);
        if (d.i()) {
            d = eVar.k(g);
        }
        BigInteger bigInteger = wVar.j;
        BigInteger bigInteger2 = ((b0) this.h).q;
        i iVar = new i();
        while (true) {
            BigInteger e = b.e(bigInteger.bitLength() - 1, this.i);
            g d2 = iVar.a(wVar.i, e).q().d();
            if (!d2.i()) {
                BigInteger c = c(bigInteger, d.j(d2));
                if (c.signum() != 0) {
                    BigInteger mod = c.multiply(bigInteger2).add(e).mod(bigInteger);
                    if (mod.signum() != 0) {
                        return new BigInteger[]{c, mod};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        w wVar = this.h.d;
        BigInteger bigInteger3 = wVar.j;
        if (bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
            return false;
        }
        e eVar = wVar.g;
        g d = d(eVar, bArr);
        if (d.i()) {
            d = eVar.k(g);
        }
        h q = a.M3(wVar.i, bigInteger2, ((c0) this.h).q, bigInteger).q();
        if (!q.m() && c(bigInteger3, d.j(q.d())).compareTo(bigInteger) == 0) {
            return true;
        }
        return false;
    }

    public BigInteger getOrder() {
        return this.h.d.j;
    }

    public void init(boolean z, s0.a.b.i iVar) {
        z zVar;
        if (z) {
            if (iVar instanceof d1) {
                d1 d1Var = (d1) iVar;
                this.i = d1Var.c;
                iVar = d1Var.d;
            } else {
                this.i = j.a();
            }
            zVar = (b0) iVar;
        } else {
            zVar = (c0) iVar;
        }
        this.h = zVar;
    }
}
