package s0.a.a.w2;

import i0.d.a.a.a;
import java.math.BigInteger;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class t extends m {
    public BigInteger c;
    public BigInteger d;

    public t(BigInteger bigInteger, BigInteger bigInteger2) {
        this.c = bigInteger;
        this.d = bigInteger2;
    }

    public t(s sVar) {
        if (sVar.size() == 2) {
            Enumeration E = sVar.E();
            this.c = k.B(E.nextElement()).D();
            this.d = k.B(E.nextElement()).D();
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public static t s(Object obj) {
        if (obj instanceof t) {
            return (t) obj;
        }
        if (obj != null) {
            return new t(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(new k(this.c));
        fVar.a(new k(this.d));
        return new b1(fVar);
    }
}
