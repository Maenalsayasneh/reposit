package m0.r.t.a.r.j.u;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.g.d;

/* compiled from: MemberScopeImpl.kt */
public abstract class g implements MemberScope {
    public Collection<? extends g0> a(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return EmptyList.c;
    }

    public Set<d> b() {
        Collection<m0.r.t.a.r.c.i> g = g(d.p, FunctionsKt.a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : g) {
            if (next instanceof g0) {
                d name = ((g0) next).getName();
                i.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Collection<? extends c0> c(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return EmptyList.c;
    }

    public Set<d> d() {
        Collection<m0.r.t.a.r.c.i> g = g(d.q, FunctionsKt.a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : g) {
            if (next instanceof g0) {
                d name = ((g0) next).getName();
                i.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Set<d> e() {
        return null;
    }

    public f f(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return null;
    }

    public Collection<m0.r.t.a.r.c.i> g(d dVar, l<? super d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        return EmptyList.c;
    }
}
