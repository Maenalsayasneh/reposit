package m0.r.t.a.r.c.t0;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.c.w;
import m0.r.t.a.r.c.x;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: CompositePackageFragmentProvider.kt */
public final class j implements x {
    public final List<w> a;

    public j(List<? extends w> list) {
        i.e(list, "providers");
        this.a = list;
        int size = list.size();
        int size2 = g.D0(list).size();
    }

    public List<v> a(b bVar) {
        i.e(bVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (w J : this.a) {
            h.J(J, bVar, arrayList);
        }
        return g.v0(arrayList);
    }

    public void b(b bVar, Collection<v> collection) {
        i.e(bVar, "fqName");
        i.e(collection, "packageFragments");
        for (w J : this.a) {
            h.J(J, bVar, collection);
        }
    }

    public Collection<b> n(b bVar, l<? super d, Boolean> lVar) {
        i.e(bVar, "fqName");
        i.e(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (w n : this.a) {
            hashSet.addAll(n.n(bVar, lVar));
        }
        return hashSet;
    }
}
