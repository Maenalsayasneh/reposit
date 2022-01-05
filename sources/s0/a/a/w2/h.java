package s0.a.a.w2;

import s0.a.a.c3.b;
import s0.a.a.e;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class h extends m {
    public b c;

    public h(n nVar, e eVar) {
        this.c = new b(nVar, eVar);
    }

    public h(s sVar) {
        this.c = b.s(sVar);
    }

    public static h s(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(s.B(obj));
        }
        return null;
    }

    public r c() {
        return this.c.c();
    }
}
