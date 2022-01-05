package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.j.g;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.w.t;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.m.a1.a;

/* compiled from: JvmPackageScope.kt */
public final class JvmPackageScope implements MemberScope {
    public static final /* synthetic */ k<Object>[] b = {m.c(new PropertyReference1Impl(m.a(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public final c c;
    public final LazyJavaPackageFragment d;
    public final LazyJavaPackageScope e;
    public final h f;

    public JvmPackageScope(c cVar, t tVar, LazyJavaPackageFragment lazyJavaPackageFragment) {
        i.e(cVar, "c");
        i.e(tVar, "jPackage");
        i.e(lazyJavaPackageFragment, "packageFragment");
        this.c = cVar;
        this.d = lazyJavaPackageFragment;
        this.e = new LazyJavaPackageScope(cVar, tVar, lazyJavaPackageFragment);
        this.f = cVar.a.a.d(new JvmPackageScope$kotlinScopes$2(this));
    }

    public Collection<g0> a(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        i(dVar, bVar);
        LazyJavaPackageScope lazyJavaPackageScope = this.e;
        MemberScope[] h = h();
        Collection a = lazyJavaPackageScope.a(dVar, bVar);
        int length = h.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = h[i];
            i++;
            a = a.H0(a, memberScope.a(dVar, bVar));
        }
        return a == null ? EmptySet.c : a;
    }

    public Set<d> b() {
        MemberScope[] h = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope b2 : h) {
            g.b(linkedHashSet, b2.b());
        }
        linkedHashSet.addAll(this.e.b());
        return linkedHashSet;
    }

    public Collection<c0> c(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        i(dVar, bVar);
        LazyJavaPackageScope lazyJavaPackageScope = this.e;
        MemberScope[] h = h();
        Collection c2 = lazyJavaPackageScope.c(dVar, bVar);
        int length = h.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = h[i];
            i++;
            c2 = a.H0(c2, memberScope.c(dVar, bVar));
        }
        return c2 == null ? EmptySet.c : c2;
    }

    public Set<d> d() {
        MemberScope[] h = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope d2 : h) {
            g.b(linkedHashSet, d2.d());
        }
        linkedHashSet.addAll(this.e.d());
        return linkedHashSet;
    }

    public Set<d> e() {
        Set<d> J0 = i0.j.f.p.h.J0(i0.j.f.p.h.v(h()));
        if (J0 == null) {
            return null;
        }
        J0.addAll(this.e.e());
        return J0;
    }

    public f f(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        i(dVar, bVar);
        LazyJavaPackageScope lazyJavaPackageScope = this.e;
        Objects.requireNonNull(lazyJavaPackageScope);
        i.e(dVar, "name");
        i.e(bVar, "location");
        f fVar = null;
        m0.r.t.a.r.c.d v = lazyJavaPackageScope.v(dVar, (m0.r.t.a.r.e.a.w.g) null);
        if (v != null) {
            return v;
        }
        MemberScope[] h = h();
        int i = 0;
        int length = h.length;
        while (i < length) {
            MemberScope memberScope = h[i];
            i++;
            f f2 = memberScope.f(dVar, bVar);
            if (f2 != null) {
                if (!(f2 instanceof m0.r.t.a.r.c.g) || !((m0.r.t.a.r.c.g) f2).K()) {
                    return f2;
                }
                if (fVar == null) {
                    fVar = f2;
                }
            }
        }
        return fVar;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, m0.n.a.l, m0.n.a.l<? super m0.r.t.a.r.g.d, java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<m0.r.t.a.r.c.i> g(m0.r.t.a.r.j.u.d r6, m0.n.a.l<? super m0.r.t.a.r.g.d, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "kindFilter"
            m0.n.b.i.e(r6, r0)
            java.lang.String r0 = "nameFilter"
            m0.n.b.i.e(r7, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope r0 = r5.e
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] r1 = r5.h()
            java.util.Collection r0 = r0.g(r6, r7)
            int r2 = r1.length
            r3 = 0
        L_0x0016:
            if (r3 >= r2) goto L_0x0025
            r4 = r1[r3]
            int r3 = r3 + 1
            java.util.Collection r4 = r4.g(r6, r7)
            java.util.Collection r0 = m0.r.t.a.r.m.a1.a.H0(r0, r4)
            goto L_0x0016
        L_0x0025:
            if (r0 != 0) goto L_0x0029
            kotlin.collections.EmptySet r0 = kotlin.collections.EmptySet.c
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope.g(m0.r.t.a.r.j.u.d, m0.n.a.l):java.util.Collection");
    }

    public final MemberScope[] h() {
        return (MemberScope[]) i0.j.f.p.h.K1(this.f, b[0]);
    }

    public void i(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        i0.j.f.p.h.q3(this.c.a.n, bVar, this.d, dVar);
    }
}
