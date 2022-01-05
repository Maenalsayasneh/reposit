package s0.a.a.d3;

import i0.d.a.a.a;
import s0.a.a.d;
import s0.a.a.l;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;

public class f extends m implements d {
    public r c = null;

    public f(h hVar) {
        this.c = hVar.c();
    }

    public f(l lVar) {
        this.c = lVar;
    }

    public f(n nVar) {
        this.c = nVar;
    }

    public f(r rVar) {
        this.c = rVar;
    }

    public static f s(Object obj) {
        if (obj == null || (obj instanceof f)) {
            return (f) obj;
        }
        if (obj instanceof r) {
            return new f((r) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return new f(r.x((byte[]) obj));
            } catch (Exception e) {
                throw new IllegalArgumentException(a.a0(e, a.P0("unable to parse encoded data: ")));
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
    }

    public r c() {
        return this.c;
    }
}
