package s0.a.b.f0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.b;
import s0.a.b.c;
import s0.a.b.k0.m;
import s0.a.b.k0.p;
import s0.a.b.k0.r;
import s0.a.b.q;
import s0.a.e.b.v;

public class h implements c {
    public static final BigInteger g = BigInteger.valueOf(1);
    public m h;

    public void a(q qVar) {
        this.h = (m) qVar;
    }

    public b b() {
        BigInteger f;
        m mVar = this.h;
        p pVar = mVar.c;
        BigInteger bigInteger = pVar.d;
        SecureRandom secureRandom = mVar.a;
        int bitLength = bigInteger.bitLength() >>> 2;
        do {
            BigInteger bigInteger2 = g;
            f = s0.a.g.b.f(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
        } while (v.c(f) < bitLength);
        return new b(new r(pVar.c.modPow(f, pVar.q), pVar), new s0.a.b.k0.q(f, pVar));
    }
}
