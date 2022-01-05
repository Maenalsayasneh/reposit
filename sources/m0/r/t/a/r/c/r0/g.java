package m0.r.t.a.r.c.r0;

import i0.j.f.p.h;
import java.util.Iterator;
import java.util.List;
import m0.n.b.i;
import m0.r.t.a.r.g.b;

/* compiled from: AnnotationsImpl.kt */
public final class g implements f {
    public final List<c> c;

    public g(List<? extends c> list) {
        i.e(list, "annotations");
        this.c = list;
    }

    public c f(b bVar) {
        return h.A0(this, bVar);
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public Iterator<c> iterator() {
        return this.c.iterator();
    }

    public boolean n(b bVar) {
        return h.O1(this, bVar);
    }

    public String toString() {
        return this.c.toString();
    }
}
