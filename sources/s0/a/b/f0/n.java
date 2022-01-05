package s0.a.b.f0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.b;
import s0.a.b.c;
import s0.a.b.k0.j0;
import s0.a.b.k0.l0;
import s0.a.b.k0.m0;
import s0.a.b.k0.n0;
import s0.a.b.q;
import s0.a.e.b.v;
import s0.a.g.g;

public class n implements c {
    public j0 g;

    public void a(q qVar) {
        this.g = (j0) qVar;
    }

    public b b() {
        BigInteger bigInteger;
        BigInteger f;
        d dVar = d.a;
        l0 l0Var = this.g.c;
        BigInteger bigInteger2 = l0Var.d;
        BigInteger bigInteger3 = l0Var.c;
        int i = l0Var.q;
        int i2 = 160;
        if (i != 0 && i < 160) {
            i2 = i;
        }
        if (i != 0) {
            if (i > bigInteger2.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            } else if (i < i2) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i2 <= bigInteger2.bitLength() || g.b("org.bouncycastle.dh.allow_unsafe_p_value")) {
            SecureRandom secureRandom = this.g.a;
            if (i != 0) {
                int i3 = i >>> 2;
                do {
                    bigInteger = s0.a.g.b.e(i, secureRandom).setBit(i - 1);
                } while (v.c(bigInteger) < i3);
            } else {
                BigInteger bigInteger4 = d.c;
                BigInteger shiftLeft = i2 != 0 ? d.b.shiftLeft(i2 - 1) : bigInteger4;
                BigInteger subtract = bigInteger2.subtract(bigInteger4);
                int bitLength = subtract.bitLength() >>> 2;
                do {
                    f = s0.a.g.b.f(shiftLeft, subtract, secureRandom);
                } while (v.c(f) < bitLength);
                bigInteger = f;
            }
            return new b(new n0(bigInteger3.modPow(bigInteger, bigInteger2), l0Var), new m0(bigInteger, l0Var));
        }
        throw new IllegalArgumentException("unsafe p value so small specific l required");
    }
}
