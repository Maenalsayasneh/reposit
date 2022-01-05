package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i0.j.f.p.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import m0.c;
import m0.n.a.l;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.j0;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.a1.a;
import m0.r.t.a.r.m.p0;

/* compiled from: SubstitutingScope.kt */
public final class SubstitutingScope implements MemberScope {
    public final MemberScope b;
    public final TypeSubstitutor c;
    public Map<i, i> d;
    public final c e = h.H2(new SubstitutingScope$_allDescriptors$2(this));

    public SubstitutingScope(MemberScope memberScope, TypeSubstitutor typeSubstitutor) {
        m0.n.b.i.e(memberScope, "workerScope");
        m0.n.b.i.e(typeSubstitutor, "givenSubstitutor");
        this.b = memberScope;
        p0 g = typeSubstitutor.g();
        m0.n.b.i.d(g, "givenSubstitutor.substitution");
        this.c = h.H4(g, false, 1).c();
    }

    public Collection<? extends g0> a(d dVar, b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        return h(this.b.a(dVar, bVar));
    }

    public Set<d> b() {
        return this.b.b();
    }

    public Collection<? extends c0> c(d dVar, b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        return h(this.b.c(dVar, bVar));
    }

    public Set<d> d() {
        return this.b.d();
    }

    public Set<d> e() {
        return this.b.e();
    }

    public f f(d dVar, b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        f f = this.b.f(dVar, bVar);
        if (f == null) {
            return null;
        }
        return (f) i(f);
    }

    public Collection<i> g(m0.r.t.a.r.j.u.d dVar, l<? super d, Boolean> lVar) {
        m0.n.b.i.e(dVar, "kindFilter");
        m0.n.b.i.e(lVar, "nameFilter");
        return (Collection) this.e.getValue();
    }

    public final <D extends i> Collection<D> h(Collection<? extends D> collection) {
        if (this.c.h() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(a.s0(collection.size()));
        Iterator<? extends D> it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((i) it.next()));
        }
        return linkedHashSet;
    }

    public final <D extends i> D i(D d2) {
        if (this.c.h()) {
            return d2;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        Map<i, i> map = this.d;
        m0.n.b.i.c(map);
        D d3 = map.get(d2);
        if (d3 == null) {
            if (d2 instanceof j0) {
                d3 = ((j0) d2).c(this.c);
                if (d3 != null) {
                    map.put(d2, d3);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d2 + " substitution fails");
                }
            } else {
                throw new IllegalStateException(m0.n.b.i.k("Unknown descriptor in scope: ", d2).toString());
            }
        }
        return (i) d3;
    }
}
