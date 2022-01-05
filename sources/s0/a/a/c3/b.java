package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class b extends m {
    public n c;
    public e d;

    public b(n nVar) {
        this.c = nVar;
    }

    public b(n nVar, e eVar) {
        this.c = nVar;
        this.d = eVar;
    }

    public b(s sVar) {
        if (sVar.size() < 1 || sVar.size() > 2) {
            throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
        }
        this.c = n.D(sVar.D(0));
        this.d = sVar.size() == 2 ? sVar.D(1) : null;
    }

    public static b s(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        e eVar = this.d;
        if (eVar != null) {
            fVar.a(eVar);
        }
        return new b1(fVar);
    }
}
