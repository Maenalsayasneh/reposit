package s0.a.e.b;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;

public abstract class b {
    public h a(h hVar, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || hVar.m()) {
            return hVar.b.m();
        }
        h b = b(hVar, bigInteger.abs());
        if (signum <= 0) {
            b = b.p();
        }
        a.e2(b);
        return b;
    }

    public abstract h b(h hVar, BigInteger bigInteger);
}
