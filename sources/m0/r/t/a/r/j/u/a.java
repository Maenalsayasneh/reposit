package m0.r.t.a.r.j.u;

import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.g.d;

/* compiled from: AbstractScopeAdapter.kt */
public abstract class a implements MemberScope {
    public Collection<g0> a(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return i().a(dVar, bVar);
    }

    public Set<d> b() {
        return i().b();
    }

    public Collection<c0> c(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return i().c(dVar, bVar);
    }

    public Set<d> d() {
        return i().d();
    }

    public Set<d> e() {
        return i().e();
    }

    public f f(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return i().f(dVar, bVar);
    }

    public Collection<m0.r.t.a.r.c.i> g(d dVar, l<? super d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        return i().g(dVar, lVar);
    }

    public final MemberScope h() {
        if (i() instanceof a) {
            return ((a) i()).h();
        }
        return i();
    }

    public abstract MemberScope i();
}
