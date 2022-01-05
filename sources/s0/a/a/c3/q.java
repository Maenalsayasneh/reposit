package s0.a.a.c3;

import i0.d.a.a.a;
import java.math.BigInteger;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class q extends m {
    public k c;
    public k d;
    public k q;

    public q(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.c = new k(bigInteger);
        this.d = new k(bigInteger2);
        this.q = new k(bigInteger3);
    }

    public q(s sVar) {
        if (sVar.size() == 3) {
            Enumeration E = sVar.E();
            this.c = k.B(E.nextElement());
            this.d = k.B(E.nextElement());
            this.q = k.B(E.nextElement());
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public static q t(Object obj) {
        if (obj instanceof q) {
            return (q) obj;
        }
        if (obj != null) {
            return new q(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        return new b1(fVar);
    }

    public BigInteger s() {
        return this.q.D();
    }

    public BigInteger u() {
        return this.c.D();
    }

    public BigInteger v() {
        return this.d.D();
    }
}
