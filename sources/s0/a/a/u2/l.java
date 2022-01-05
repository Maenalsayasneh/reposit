package s0.a.a.u2;

import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.g;
import s0.a.a.i;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class l extends m {
    public i c;
    public s0.a.a.c3.m d;

    public l(s sVar) {
        this.c = i.E(sVar.D(0));
        if (sVar.size() > 1) {
            this.d = s0.a.a.c3.m.s(g.C(((z) sVar.D(1)).C()));
        }
    }

    public static l s(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        s0.a.a.c3.m mVar = this.d;
        if (mVar != null) {
            fVar.a(new e1(true, 0, mVar));
        }
        return new b1(fVar);
    }
}
