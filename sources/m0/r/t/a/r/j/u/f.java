package m0.r.t.a.r.j.u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.g;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.u.d;

/* compiled from: InnerClassesScopeWrapper.kt */
public final class f extends g {
    public final MemberScope b;

    public f(MemberScope memberScope) {
        i.e(memberScope, "workerScope");
        this.b = memberScope;
    }

    public Set<d> b() {
        return this.b.b();
    }

    public Set<d> d() {
        return this.b.d();
    }

    public Set<d> e() {
        return this.b.e();
    }

    public m0.r.t.a.r.c.f f(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        m0.r.t.a.r.c.f f = this.b.f(dVar, bVar);
        if (f == null) {
            return null;
        }
        m0.r.t.a.r.c.d dVar2 = f instanceof m0.r.t.a.r.c.d ? (m0.r.t.a.r.c.d) f : null;
        if (dVar2 != null) {
            return dVar2;
        }
        if (f instanceof l0) {
            return (l0) f;
        }
        return null;
    }

    public Collection g(d dVar, l lVar) {
        d dVar2;
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        d.a aVar = d.a;
        int i = d.j & dVar.u;
        if (i == 0) {
            dVar2 = null;
        } else {
            dVar2 = new d(i, dVar.t);
        }
        if (dVar2 == null) {
            return EmptyList.c;
        }
        Collection<m0.r.t.a.r.c.i> g = this.b.g(dVar2, lVar);
        ArrayList arrayList = new ArrayList();
        for (T next : g) {
            if (next instanceof g) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String toString() {
        return i.k("Classes from ", this.b);
    }
}
