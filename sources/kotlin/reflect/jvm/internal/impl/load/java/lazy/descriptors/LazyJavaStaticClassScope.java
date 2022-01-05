package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.u.g.a;
import m0.r.t.a.r.e.a.u.g.d;
import m0.r.t.a.r.e.a.w.g;

/* compiled from: LazyJavaStaticClassScope.kt */
public final class LazyJavaStaticClassScope extends d {
    public final g n;
    public final LazyJavaClassDescriptor o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(c cVar, g gVar, LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(cVar);
        i.e(cVar, "c");
        i.e(gVar, "jClass");
        i.e(lazyJavaClassDescriptor, "ownerDescriptor");
        this.n = gVar;
        this.o = lazyJavaClassDescriptor;
    }

    public f f(m0.r.t.a.r.g.d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return null;
    }

    public Set<m0.r.t.a.r.g.d> h(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        return EmptySet.c;
    }

    public Set<m0.r.t.a.r.g.d> i(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        Set<m0.r.t.a.r.g.d> C0 = m0.j.g.C0(((a) this.f.invoke()).a());
        LazyJavaStaticClassScope z1 = h.z1(this.o);
        Collection b = z1 == null ? null : z1.b();
        if (b == null) {
            b = EmptySet.c;
        }
        C0.addAll(b);
        if (this.n.z()) {
            C0.addAll(m0.j.g.K(m0.r.t.a.r.b.g.c, m0.r.t.a.r.b.g.b));
        }
        return C0;
    }

    public a k() {
        return new ClassDeclaredMemberIndex(this.n, LazyJavaStaticClassScope$computeMemberIndex$1.c);
    }

    public void m(Collection<g0> collection, m0.r.t.a.r.g.d dVar) {
        Set<T> set;
        i.e(collection, "result");
        i.e(dVar, "name");
        LazyJavaStaticClassScope z1 = h.z1(this.o);
        if (z1 == null) {
            set = EmptySet.c;
        } else {
            set = m0.j.g.D0(z1.a(dVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        Set<T> set2 = set;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        m0.r.t.a.r.e.a.u.a aVar = this.c.a;
        Collection<D> D3 = h.D3(dVar, set2, collection, lazyJavaClassDescriptor, aVar.f, aVar.u.a());
        i.d(D3, "resolveOverridesForStaticMembers(\n            name,\n            functionsFromSupertypes,\n            result,\n            ownerDescriptor,\n            c.components.errorReporter,\n            c.components.kotlinTypeChecker.overridingUtil\n        )");
        collection.addAll(D3);
        if (!this.n.z()) {
            return;
        }
        if (i.a(dVar, m0.r.t.a.r.b.g.c)) {
            g0 i02 = h.i0(this.o);
            i.d(i02, "createEnumValueOfMethod(ownerDescriptor)");
            collection.add(i02);
        } else if (i.a(dVar, m0.r.t.a.r.b.g.b)) {
            g0 j02 = h.j0(this.o);
            i.d(j02, "createEnumValuesMethod(ownerDescriptor)");
            collection.add(j02);
        }
    }

    public void n(m0.r.t.a.r.g.d dVar, Collection<c0> collection) {
        i.e(dVar, "name");
        i.e(collection, "result");
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m0.r.t.a.r.m.a1.a.e1(h.L2(lazyJavaClassDescriptor), m0.r.t.a.r.e.a.u.g.b.a, new m0.r.t.a.r.e.a.u.g.c(lazyJavaClassDescriptor, linkedHashSet, new LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1(dVar)));
        if (!collection.isEmpty()) {
            LazyJavaClassDescriptor lazyJavaClassDescriptor2 = this.o;
            m0.r.t.a.r.e.a.u.a aVar = this.c.a;
            Collection<D> D3 = h.D3(dVar, linkedHashSet, collection, lazyJavaClassDescriptor2, aVar.f, aVar.u.a());
            i.d(D3, "resolveOverridesForStaticMembers(\n                    name,\n                    propertiesFromSupertypes,\n                    result,\n                    ownerDescriptor,\n                    c.components.errorReporter,\n                    c.components.kotlinTypeChecker.overridingUtil\n                )");
            collection.addAll(D3);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : linkedHashSet) {
            c0 v = v((c0) next);
            Object obj = linkedHashMap.get(v);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(v, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : linkedHashMap.entrySet()) {
            LazyJavaClassDescriptor lazyJavaClassDescriptor3 = this.o;
            m0.r.t.a.r.e.a.u.a aVar2 = this.c.a;
            Collection<D> D32 = h.D3(dVar, (Collection) value.getValue(), collection, lazyJavaClassDescriptor3, aVar2.f, aVar2.u.a());
            i.d(D32, "resolveOverridesForStaticMembers(\n                    name, it.value, result, ownerDescriptor, c.components.errorReporter,\n                    c.components.kotlinTypeChecker.overridingUtil\n                )");
            m0.j.g.b(arrayList, D32);
        }
        collection.addAll(arrayList);
    }

    public Set<m0.r.t.a.r.g.d> o(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        Set<m0.r.t.a.r.g.d> C0 = m0.j.g.C0(((a) this.f.invoke()).e());
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        m0.r.t.a.r.m.a1.a.e1(h.L2(lazyJavaClassDescriptor), m0.r.t.a.r.e.a.u.g.b.a, new m0.r.t.a.r.e.a.u.g.c(lazyJavaClassDescriptor, C0, LazyJavaStaticClassScope$computePropertyNames$1$1.c));
        return C0;
    }

    public m0.r.t.a.r.c.i q() {
        return this.o;
    }

    public final c0 v(c0 c0Var) {
        if (c0Var.f().isReal()) {
            return c0Var;
        }
        Collection<? extends c0> e = c0Var.e();
        i.d(e, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(h.K(e, 10));
        for (c0 c0Var2 : e) {
            i.d(c0Var2, "it");
            arrayList.add(v(c0Var2));
        }
        i.e(arrayList, "$this$distinct");
        return (c0) m0.j.g.j0(m0.j.g.v0(m0.j.g.C0(arrayList)));
    }
}
