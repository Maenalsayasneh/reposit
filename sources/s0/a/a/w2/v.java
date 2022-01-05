package s0.a.a.w2;

import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o1;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.s1;
import s0.a.a.z;

public class v extends m {
    public n c;
    public e d;
    public s0.a.a.v q;

    public v(n nVar, e eVar, s0.a.a.v vVar) {
        this.c = nVar;
        this.d = eVar;
        this.q = vVar;
    }

    public v(s sVar) {
        this.c = (n) sVar.D(0);
        this.d = ((z) sVar.D(1)).C();
        if (sVar.size() == 3) {
            this.q = (s0.a.a.v) sVar.D(2);
        }
    }

    public static v s(Object obj) {
        if (obj instanceof v) {
            return (v) obj;
        }
        if (obj != null) {
            return new v(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(this.c);
        fVar.a(new s1(true, 0, this.d));
        s0.a.a.v vVar = this.q;
        if (vVar != null) {
            fVar.a(vVar);
        }
        return new o1(fVar);
    }
}
