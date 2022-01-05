package s0.a.a.c3;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class a extends m {
    public static final n c = new n("1.3.6.1.5.5.7.48.1");
    public n d = null;
    public w q = null;

    static {
        new n("1.3.6.1.5.5.7.48.2");
    }

    public a(s sVar) {
        if (sVar.size() == 2) {
            this.d = n.D(sVar.D(0));
            this.q = w.t(sVar.D(1));
            return;
        }
        throw new IllegalArgumentException("wrong number of elements in sequence");
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.d);
        fVar.a(this.q);
        return new b1(fVar);
    }

    public String toString() {
        return i0.d.a.a.a.y0(i0.d.a.a.a.P0("AccessDescription: Oid("), this.d.d, ")");
    }
}
