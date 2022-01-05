package s0.a.b.n0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.i;
import s0.a.b.j;
import s0.a.b.k0.d1;
import s0.a.b.k0.p0;
import s0.a.b.k0.q0;
import s0.a.b.k0.r0;
import s0.a.b.k0.s0;
import s0.a.e.b.b0.c.h3;
import s0.a.g.b;

public class k implements s0.a.b.k {
    public p0 g;
    public SecureRandom h;

    public BigInteger[] a(byte[] bArr) {
        BigInteger e;
        BigInteger bigInteger = new BigInteger(1, h3.J2(bArr));
        q0 q0Var = this.g.d;
        do {
            e = b.e(q0Var.d.bitLength(), this.h);
        } while (e.compareTo(q0Var.d) >= 0);
        BigInteger mod = q0Var.q.modPow(e, q0Var.c).mod(q0Var.d);
        return new BigInteger[]{mod, e.multiply(bigInteger).add(((r0) this.g).q.multiply(mod)).mod(q0Var.d)};
    }

    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, h3.J2(bArr));
        q0 q0Var = this.g.d;
        BigInteger valueOf = BigInteger.valueOf(0);
        if (valueOf.compareTo(bigInteger) >= 0 || q0Var.d.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || q0Var.d.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modPow = bigInteger3.modPow(q0Var.d.subtract(new BigInteger("2")), q0Var.d);
        return q0Var.q.modPow(bigInteger2.multiply(modPow).mod(q0Var.d), q0Var.c).multiply(((s0) this.g).q.modPow(q0Var.d.subtract(bigInteger).multiply(modPow).mod(q0Var.d), q0Var.c)).mod(q0Var.c).mod(q0Var.d).equals(bigInteger);
    }

    public BigInteger getOrder() {
        return this.g.d.d;
    }

    public void init(boolean z, i iVar) {
        p0 p0Var;
        if (!z) {
            p0Var = (s0) iVar;
        } else if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            this.h = d1Var.c;
            this.g = (r0) d1Var.d;
            return;
        } else {
            this.h = j.a();
            p0Var = (r0) iVar;
        }
        this.g = p0Var;
    }
}
