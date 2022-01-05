package m0.r.t.a.r.j.s;

import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.r.t.a.r.c.l;
import m0.r.t.a.r.e.a.s.d;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.g.b;

/* compiled from: JavaDescriptorResolver.kt */
public final class a {
    public final LazyJavaPackageFragmentProvider a;
    public final d b;

    public a(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, d dVar) {
        i.e(lazyJavaPackageFragmentProvider, "packageFragmentProvider");
        i.e(dVar, "javaResolverCache");
        this.a = lazyJavaPackageFragmentProvider;
        this.b = dVar;
    }

    public final m0.r.t.a.r.c.d a(g gVar) {
        l lVar;
        i.e(gVar, "javaClass");
        b d = gVar.d();
        if (d == null || gVar.H() != LightClassOriginKind.SOURCE) {
            g j = gVar.j();
            if (j != null) {
                m0.r.t.a.r.c.d a2 = a(j);
                MemberScope w0 = a2 == null ? null : a2.w0();
                if (w0 == null) {
                    lVar = null;
                } else {
                    lVar = w0.f(gVar.getName(), NoLookupLocation.FROM_JAVA_LOADER);
                }
                if (lVar instanceof m0.r.t.a.r.c.d) {
                    return (m0.r.t.a.r.c.d) lVar;
                }
                return null;
            } else if (d == null) {
                return null;
            } else {
                LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = this.a;
                b e = d.e();
                i.d(e, "fqName.parent()");
                Objects.requireNonNull(lazyJavaPackageFragmentProvider);
                i.e(e, "fqName");
                LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) m0.j.g.w(m0.j.g.L(lazyJavaPackageFragmentProvider.c(e)));
                if (lazyJavaPackageFragment == null) {
                    return null;
                }
                i.e(gVar, "jClass");
                LazyJavaPackageScope lazyJavaPackageScope = lazyJavaPackageFragment.c2.e;
                Objects.requireNonNull(lazyJavaPackageScope);
                i.e(gVar, "javaClass");
                return lazyJavaPackageScope.v(gVar.getName(), gVar);
            }
        } else {
            Objects.requireNonNull((d.a) this.b);
            return null;
        }
    }
}
