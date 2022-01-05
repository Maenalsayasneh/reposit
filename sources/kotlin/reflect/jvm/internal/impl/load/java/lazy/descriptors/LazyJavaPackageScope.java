package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import m0.n.a.l;
import m0.n.b.f;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.u.g.a;
import m0.r.t.a.r.e.a.u.g.d;
import m0.r.t.a.r.e.a.w.t;
import m0.r.t.a.r.j.u.d;
import m0.r.t.a.r.l.g;
import m0.r.t.a.r.l.i;

/* compiled from: LazyJavaPackageScope.kt */
public final class LazyJavaPackageScope extends d {
    public final t n;
    public final LazyJavaPackageFragment o;
    public final i<Set<String>> p;
    public final g<a, m0.r.t.a.r.c.d> q;

    /* compiled from: LazyJavaPackageScope.kt */
    public static final class a {
        public final m0.r.t.a.r.g.d a;
        public final m0.r.t.a.r.e.a.w.g b;

        public a(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.e.a.w.g gVar) {
            m0.n.b.i.e(dVar, "name");
            this.a = dVar;
            this.b = gVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && m0.n.b.i.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    public static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class a extends b {
            public final m0.r.t.a.r.c.d a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(m0.r.t.a.r.c.d dVar) {
                super((f) null);
                m0.n.b.i.e(dVar, "descriptor");
                this.a = dVar;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$b  reason: collision with other inner class name */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C0238b extends b {
            public static final C0238b a = new C0238b();

            public C0238b() {
                super((f) null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class c extends b {
            public static final c a = new c();

            public c() {
                super((f) null);
            }
        }

        public b(f fVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(c cVar, t tVar, LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(cVar);
        m0.n.b.i.e(cVar, "c");
        m0.n.b.i.e(tVar, "jPackage");
        m0.n.b.i.e(lazyJavaPackageFragment, "ownerDescriptor");
        this.n = tVar;
        this.o = lazyJavaPackageFragment;
        this.p = cVar.a.a.e(new LazyJavaPackageScope$knownClassNamesInPackage$1(cVar, this));
        this.q = cVar.a.a.h(new LazyJavaPackageScope$classes$1(this, cVar));
    }

    public Collection<c0> c(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        return EmptyList.c;
    }

    public m0.r.t.a.r.c.f f(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        return v(dVar, (m0.r.t.a.r.e.a.w.g) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<m0.r.t.a.r.c.i> g(m0.r.t.a.r.j.u.d r5, m0.n.a.l<? super m0.r.t.a.r.g.d, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            m0.n.b.i.e(r5, r0)
            java.lang.String r0 = "nameFilter"
            m0.n.b.i.e(r6, r0)
            m0.r.t.a.r.j.u.d$a r0 = m0.r.t.a.r.j.u.d.a
            int r0 = m0.r.t.a.r.j.u.d.j
            int r1 = m0.r.t.a.r.j.u.d.c
            r0 = r0 | r1
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L_0x001a
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.c
            goto L_0x005d
        L_0x001a:
            m0.r.t.a.r.l.h<java.util.Collection<m0.r.t.a.r.c.i>> r5 = r4.e
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x002b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r5.next()
            r2 = r1
            m0.r.t.a.r.c.i r2 = (m0.r.t.a.r.c.i) r2
            boolean r3 = r2 instanceof m0.r.t.a.r.c.d
            if (r3 == 0) goto L_0x0055
            m0.r.t.a.r.c.d r2 = (m0.r.t.a.r.c.d) r2
            m0.r.t.a.r.g.d r2 = r2.getName()
            java.lang.String r3 = "it.name"
            m0.n.b.i.d(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x002b
            r0.add(r1)
            goto L_0x002b
        L_0x005c:
            r5 = r0
        L_0x005d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.g(m0.r.t.a.r.j.u.d, m0.n.a.l):java.util.Collection");
    }

    public Set<m0.r.t.a.r.g.d> h(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
        m0.n.b.i.e(dVar, "kindFilter");
        d.a aVar = m0.r.t.a.r.j.u.d.a;
        if (!dVar.a(m0.r.t.a.r.j.u.d.c)) {
            return EmptySet.c;
        }
        Set<String> set = (Set) this.p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String g : set) {
                hashSet.add(m0.r.t.a.r.g.d.g(g));
            }
            return hashSet;
        }
        t tVar = this.n;
        l<Object, Boolean> lVar2 = lVar;
        if (lVar == null) {
            lVar2 = FunctionsKt.a;
        }
        Collection<m0.r.t.a.r.e.a.w.g> p2 = tVar.p(lVar2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (m0.r.t.a.r.e.a.w.g gVar : p2) {
            m0.r.t.a.r.g.d name = gVar.H() == LightClassOriginKind.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Set<m0.r.t.a.r.g.d> i(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
        m0.n.b.i.e(dVar, "kindFilter");
        return EmptySet.c;
    }

    public m0.r.t.a.r.e.a.u.g.a k() {
        return a.C0257a.a;
    }

    public void m(Collection<g0> collection, m0.r.t.a.r.g.d dVar) {
        m0.n.b.i.e(collection, "result");
        m0.n.b.i.e(dVar, "name");
    }

    public Set<m0.r.t.a.r.g.d> o(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
        m0.n.b.i.e(dVar, "kindFilter");
        return EmptySet.c;
    }

    public m0.r.t.a.r.c.i q() {
        return this.o;
    }

    public final m0.r.t.a.r.c.d v(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.e.a.w.g gVar) {
        m0.r.t.a.r.g.d dVar2 = m0.r.t.a.r.g.f.a;
        boolean z = true;
        if (dVar != null) {
            if (dVar.b().isEmpty() || dVar.d) {
                z = false;
            }
            if (!z) {
                return null;
            }
            Set set = (Set) this.p.invoke();
            if (gVar != null || set == null || set.contains(dVar.b())) {
                return this.q.invoke(new a(dVar, gVar));
            }
            return null;
        }
        m0.r.t.a.r.g.f.a(1);
        throw null;
    }
}
