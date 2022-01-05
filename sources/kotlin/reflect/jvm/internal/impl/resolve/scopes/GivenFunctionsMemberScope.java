package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.j.u.g;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;

/* compiled from: GivenFunctionsMemberScope.kt */
public abstract class GivenFunctionsMemberScope extends g {
    public static final /* synthetic */ k<Object>[] b = {m.c(new PropertyReference1Impl(m.a(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    public final d c;
    public final h d;

    public GivenFunctionsMemberScope(l lVar, d dVar) {
        i.e(lVar, "storageManager");
        i.e(dVar, "containingClass");
        this.c = dVar;
        this.d = lVar.d(new GivenFunctionsMemberScope$allDescriptors$2(this));
    }

    public Collection<g0> a(m0.r.t.a.r.g.d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        List<m0.r.t.a.r.c.i> i = i();
        m0.r.t.a.r.o.i iVar = new m0.r.t.a.r.o.i();
        for (T next : i) {
            if ((next instanceof g0) && i.a(((g0) next).getName(), dVar)) {
                iVar.add(next);
            }
        }
        return iVar;
    }

    public Collection<c0> c(m0.r.t.a.r.g.d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        List<m0.r.t.a.r.c.i> i = i();
        m0.r.t.a.r.o.i iVar = new m0.r.t.a.r.o.i();
        for (T next : i) {
            if ((next instanceof c0) && i.a(((c0) next).getName(), dVar)) {
                iVar.add(next);
            }
        }
        return iVar;
    }

    public Collection<m0.r.t.a.r.c.i> g(m0.r.t.a.r.j.u.d dVar, m0.n.a.l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        if (!dVar.a(m0.r.t.a.r.j.u.d.n.u)) {
            return EmptyList.c;
        }
        return i();
    }

    public abstract List<r> h();

    public final List<m0.r.t.a.r.c.i> i() {
        return (List) i0.j.f.p.h.K1(this.d, b[0]);
    }
}
