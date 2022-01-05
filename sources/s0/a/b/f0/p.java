package s0.a.b.f0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.b;
import s0.a.b.c;
import s0.a.b.k0.o0;
import s0.a.b.k0.q0;
import s0.a.b.k0.r0;
import s0.a.b.k0.s0;
import s0.a.b.q;
import s0.a.e.b.v;

public class p implements c {
    public o0 g;

    public void a(q qVar) {
        this.g = (o0) qVar;
    }

    public b b() {
        o0 o0Var = this.g;
        q0 q0Var = o0Var.c;
        SecureRandom secureRandom = o0Var.a;
        BigInteger bigInteger = q0Var.d;
        BigInteger bigInteger2 = q0Var.c;
        BigInteger bigInteger3 = q0Var.q;
        while (true) {
            BigInteger e = s0.a.g.b.e(256, secureRandom);
            if (e.signum() >= 1 && e.compareTo(bigInteger) < 0 && v.c(e) >= 64) {
                return new b(new s0(bigInteger3.modPow(e, bigInteger2), q0Var), new r0(e, q0Var));
            }
        }
    }
}
