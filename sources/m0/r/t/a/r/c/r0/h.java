package m0.r.t.a.r.c.r0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.g.b;

/* compiled from: Annotations.kt */
public final class h implements f {
    public final f c;
    public final l<b, Boolean> d;

    public h(f fVar, l<? super b, Boolean> lVar) {
        i.e(fVar, "delegate");
        i.e(lVar, "fqNameFilter");
        i.e(fVar, "delegate");
        i.e(lVar, "fqNameFilter");
        this.c = fVar;
        this.d = lVar;
    }

    public final boolean b(c cVar) {
        b d2 = cVar.d();
        return d2 != null && this.d.invoke(d2).booleanValue();
    }

    public c f(b bVar) {
        i.e(bVar, "fqName");
        if (this.d.invoke(bVar).booleanValue()) {
            return this.c.f(bVar);
        }
        return null;
    }

    public boolean isEmpty() {
        f<c> fVar = this.c;
        if ((fVar instanceof Collection) && ((Collection) fVar).isEmpty()) {
            return false;
        }
        for (c b : fVar) {
            if (b(b)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<c> iterator() {
        f fVar = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object next : fVar) {
            if (b((c) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    public boolean n(b bVar) {
        i.e(bVar, "fqName");
        if (this.d.invoke(bVar).booleanValue()) {
            return this.c.n(bVar);
        }
        return false;
    }
}
