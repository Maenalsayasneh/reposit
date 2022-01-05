package s0.a.a.v2;

import java.math.BigInteger;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class a extends m {
    public k c;
    public k d;

    public a(BigInteger bigInteger, BigInteger bigInteger2) {
        this.c = new k(bigInteger);
        this.d = new k(bigInteger2);
    }

    public a(s sVar) {
        Enumeration E = sVar.E();
        this.c = (k) E.nextElement();
        this.d = (k) E.nextElement();
    }

    public static a t(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }

    public BigInteger s() {
        return this.d.D();
    }

    public BigInteger u() {
        return this.c.D();
    }
}
