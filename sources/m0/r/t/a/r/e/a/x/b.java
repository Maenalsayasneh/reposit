package m0.r.t.a.r.e.a.x;

import i0.j.f.p.h;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.r0.f;

/* compiled from: typeEnhancement.kt */
public final class b implements f {
    public final m0.r.t.a.r.g.b c;

    public b(m0.r.t.a.r.g.b bVar) {
        i.e(bVar, "fqNameToMatch");
        this.c = bVar;
    }

    public c f(m0.r.t.a.r.g.b bVar) {
        i.e(bVar, "fqName");
        if (i.a(bVar, this.c)) {
            return a.a;
        }
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<c> iterator() {
        return EmptyList.c.iterator();
    }

    public boolean n(m0.r.t.a.r.g.b bVar) {
        return h.O1(this, bVar);
    }
}
