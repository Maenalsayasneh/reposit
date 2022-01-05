package s0.a.a.w2;

import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class k extends m implements n {
    public h c;
    public g d;

    public k(s sVar) {
        Enumeration E = sVar.E();
        s B = s.B(((e) E.nextElement()).c());
        e D = B.D(0);
        n nVar = n.P;
        if (D.equals(nVar)) {
            this.c = new h(nVar, l.s(B.D(1)));
        } else {
            this.c = h.s(B);
        }
        Object nextElement = E.nextElement();
        this.d = nextElement instanceof g ? (g) nextElement : nextElement != null ? new g(s.B(nextElement)) : null;
    }

    public k(h hVar, g gVar) {
        this.c = hVar;
        this.d = gVar;
    }

    public static k s(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
