package m0.r.t.a.r.j.u;

import i0.j.f.p.h;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.a1.a;

/* compiled from: ChainedMemberScope.kt */
public final class b implements MemberScope {
    public final String b;
    public final MemberScope[] c;

    public b(String str, MemberScope[] memberScopeArr, f fVar) {
        this.b = str;
        this.c = memberScopeArr;
    }

    public static final MemberScope h(String str, Iterable<? extends MemberScope> iterable) {
        i.e(str, "debugName");
        i.e(iterable, "scopes");
        m0.r.t.a.r.o.i iVar = new m0.r.t.a.r.o.i();
        for (MemberScope memberScope : iterable) {
            if (memberScope != MemberScope.a.b) {
                if (memberScope instanceof b) {
                    MemberScope[] memberScopeArr = ((b) memberScope).c;
                    i.e(iVar, "$this$addAll");
                    i.e(memberScopeArr, "elements");
                    iVar.addAll(g.d(memberScopeArr));
                } else {
                    iVar.add(memberScope);
                }
            }
        }
        return i(str, iVar);
    }

    public static final MemberScope i(String str, List<? extends MemberScope> list) {
        i.e(str, "debugName");
        i.e(list, "scopes");
        m0.r.t.a.r.o.i iVar = (m0.r.t.a.r.o.i) list;
        int i = iVar.c;
        if (i == 0) {
            return MemberScope.a.b;
        }
        if (i == 1) {
            return (MemberScope) iVar.get(0);
        }
        Object[] array = iVar.toArray(new MemberScope[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new b(str, (MemberScope[]) array, (f) null);
    }

    public Collection<g0> a(d dVar, m0.r.t.a.r.d.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.c;
        }
        int i = 0;
        if (length == 1) {
            return memberScopeArr[0].a(dVar, bVar);
        }
        Collection<g0> collection = null;
        int length2 = memberScopeArr.length;
        while (i < length2) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            collection = a.H0(collection, memberScope.a(dVar, bVar));
        }
        if (collection == null) {
            return EmptySet.c;
        }
        return collection;
    }

    public Set<d> b() {
        MemberScope[] memberScopeArr = this.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope b2 : memberScopeArr) {
            g.b(linkedHashSet, b2.b());
        }
        return linkedHashSet;
    }

    public Collection<c0> c(d dVar, m0.r.t.a.r.d.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.c;
        }
        int i = 0;
        if (length == 1) {
            return memberScopeArr[0].c(dVar, bVar);
        }
        Collection<c0> collection = null;
        int length2 = memberScopeArr.length;
        while (i < length2) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            collection = a.H0(collection, memberScope.c(dVar, bVar));
        }
        if (collection == null) {
            return EmptySet.c;
        }
        return collection;
    }

    public Set<d> d() {
        MemberScope[] memberScopeArr = this.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope d : memberScopeArr) {
            g.b(linkedHashSet, d.d());
        }
        return linkedHashSet;
    }

    public Set<d> e() {
        return h.J0(h.v(this.c));
    }

    public m0.r.t.a.r.c.f f(d dVar, m0.r.t.a.r.d.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        m0.r.t.a.r.c.f fVar = null;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            m0.r.t.a.r.c.f f = memberScope.f(dVar, bVar);
            if (f != null) {
                if (!(f instanceof m0.r.t.a.r.c.g) || !((m0.r.t.a.r.c.g) f).K()) {
                    return f;
                }
                if (fVar == null) {
                    fVar = f;
                }
            }
        }
        return fVar;
    }

    public Collection<m0.r.t.a.r.c.i> g(d dVar, l<? super d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.c;
        }
        int i = 0;
        if (length == 1) {
            return memberScopeArr[0].g(dVar, lVar);
        }
        Collection<m0.r.t.a.r.c.i> collection = null;
        int length2 = memberScopeArr.length;
        while (i < length2) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            collection = a.H0(collection, memberScope.g(dVar, lVar));
        }
        if (collection == null) {
            return EmptySet.c;
        }
        return collection;
    }

    public String toString() {
        return this.b;
    }
}
