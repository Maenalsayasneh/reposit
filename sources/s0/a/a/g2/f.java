package s0.a.a.g2;

import s0.a.a.b1;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class f extends m {
    public n c;
    public n d;
    public n q;

    public f(n nVar, n nVar2) {
        this.c = nVar;
        this.d = nVar2;
        this.q = null;
    }

    public f(n nVar, n nVar2, n nVar3) {
        this.c = nVar;
        this.d = nVar2;
        this.q = nVar3;
    }

    public f(s sVar) {
        this.c = (n) sVar.D(0);
        this.d = (n) sVar.D(1);
        if (sVar.size() > 2) {
            this.q = (n) sVar.D(2);
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
        s0.a.a.f fVar = new s0.a.a.f(3);
        fVar.a(this.c);
        fVar.a(this.d);
        n nVar = this.q;
        if (nVar != null) {
            fVar.a(nVar);
        }
        return new b1(fVar);
    }
}
