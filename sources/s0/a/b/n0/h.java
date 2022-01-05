package s0.a.b.n0;

import java.math.BigInteger;
import java.security.SecureRandom;
import m0.r.t.a.r.m.a1.a;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.b;
import s0.a.b.i;
import s0.a.b.j;
import s0.a.b.k;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.d1;
import s0.a.b.k0.y;
import s0.a.b.k0.z;
import s0.a.e.b.c;

public class h implements k {
    public boolean g;
    public z h;
    public SecureRandom i;

    public BigInteger[] a(byte[] bArr) {
        b b;
        BigInteger mod;
        if (this.g) {
            BigInteger order = getOrder();
            BigInteger bigInteger = new BigInteger(1, bArr);
            b0 b0Var = (b0) this.h;
            if (bigInteger.compareTo(order) < 0) {
                do {
                    s0.a.b.f0.k kVar = new s0.a.b.f0.k();
                    kVar.a(new y(b0Var.d, this.i));
                    b = kVar.b();
                    mod = ((c0) b.a).q.d().t().add(bigInteger).mod(order);
                } while (mod.equals(c.a));
                return new BigInteger[]{mod, ((b0) b.b).q.subtract(mod.multiply(b0Var.q)).mod(order)};
            }
            throw new DataLengthException("input too large for ECNR key");
        }
        throw new IllegalStateException("not initialised for signing");
    }

    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (!this.g) {
            c0 c0Var = (c0) this.h;
            BigInteger bigInteger3 = c0Var.d.j;
            int bitLength = bigInteger3.bitLength();
            BigInteger bigInteger4 = new BigInteger(1, bArr);
            if (bigInteger4.bitLength() <= bitLength) {
                BigInteger bigInteger5 = c0Var.d.j;
                BigInteger bigInteger6 = null;
                if (bigInteger.compareTo(c.b) >= 0 && bigInteger.compareTo(bigInteger5) < 0 && bigInteger2.compareTo(c.a) >= 0 && bigInteger2.compareTo(bigInteger5) < 0) {
                    s0.a.e.b.h q = a.M3(c0Var.d.i, bigInteger2, c0Var.q, bigInteger).q();
                    if (!q.m()) {
                        bigInteger6 = bigInteger.subtract(q.d().t()).mod(bigInteger5);
                    }
                }
                if (bigInteger6 == null || !bigInteger6.equals(bigInteger4.mod(bigInteger3))) {
                    return false;
                }
                return true;
            }
            throw new DataLengthException("input too large for ECNR key.");
        }
        throw new IllegalStateException("not initialised for verifying");
    }

    public BigInteger getOrder() {
        return this.h.d.j;
    }

    public void init(boolean z, i iVar) {
        z zVar;
        this.g = z;
        if (!z) {
            zVar = (c0) iVar;
        } else if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            this.i = d1Var.c;
            this.h = (b0) d1Var.d;
            return;
        } else {
            this.i = j.a();
            zVar = (b0) iVar;
        }
        this.h = zVar;
    }
}
