package s0.a.a.w2;

import java.util.Enumeration;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.g0;
import s0.a.a.k0;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o1;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class c extends m implements n {
    public n c;
    public e d;
    public boolean q = true;

    public c(n nVar, e eVar) {
        this.c = nVar;
        this.d = eVar;
    }

    public c(s sVar) {
        Enumeration E = sVar.E();
        this.c = (n) E.nextElement();
        if (E.hasMoreElements()) {
            this.d = ((z) E.nextElement()).C();
        }
        this.q = sVar instanceof g0;
    }

    public static c s(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        e eVar = this.d;
        if (eVar != null) {
            fVar.a(new k0(true, 0, eVar));
        }
        return this.q ? new g0(fVar) : new o1(fVar);
    }
}
