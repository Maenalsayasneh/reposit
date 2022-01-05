package s0.a.a.u2;

import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.g;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class f extends m {
    public g c;
    public j d;

    public f(s sVar) {
        e D = sVar.D(0);
        this.c = D instanceof g ? (g) D : D != null ? new g(g.C(D)) : null;
        if (sVar.size() == 2) {
            this.d = j.s(s.C((z) sVar.D(1), true));
        }
    }

    public static f s(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(s.B(obj));
        }
        return null;
    }

    public r c() {
        s0.a.a.f fVar = new s0.a.a.f(2);
        fVar.a(this.c);
        j jVar = this.d;
        if (jVar != null) {
            fVar.a(new e1(true, 0, jVar));
        }
        return new b1(fVar);
    }
}
