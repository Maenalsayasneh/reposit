package s0.a.a.w2;

import java.math.BigInteger;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class d extends m {
    public k c;
    public k d;
    public k q;

    public d(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.c = new k(bigInteger);
        this.d = new k(bigInteger2);
        this.q = i != 0 ? new k((long) i) : null;
    }

    public d(s sVar) {
        Enumeration E = sVar.E();
        this.c = k.B(E.nextElement());
        this.d = k.B(E.nextElement());
        this.q = E.hasMoreElements() ? (k) E.nextElement() : null;
    }

    public static d t(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(this.c);
        fVar.a(this.d);
        if (u() != null) {
            fVar.a(this.q);
        }
        return new b1(fVar);
    }

    public BigInteger s() {
        return this.d.D();
    }

    public BigInteger u() {
        k kVar = this.q;
        if (kVar == null) {
            return null;
        }
        return kVar.D();
    }

    public BigInteger v() {
        return this.c.D();
    }
}
