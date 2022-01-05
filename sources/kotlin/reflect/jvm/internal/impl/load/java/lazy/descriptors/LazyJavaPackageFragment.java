package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.x;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.w.t;
import m0.r.t.a.r.e.a.w.y;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.l.h;

/* compiled from: LazyJavaPackageFragment.kt */
public final class LazyJavaPackageFragment extends x {
    public static final /* synthetic */ k<Object>[] Y1;
    public final t Z1;
    public final c a2;
    public final h b2;
    public final JvmPackageScope c2;
    public final h<List<b>> d2;
    public final f e2;

    static {
        Class<LazyJavaPackageFragment> cls = LazyJavaPackageFragment.class;
        Y1 = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), m.c(new PropertyReference1Impl(m.a(cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(c cVar, t tVar) {
        super(cVar.a.o, tVar.d());
        f fVar;
        i.e(cVar, "outerContext");
        i.e(tVar, "jPackage");
        this.Z1 = tVar;
        c F = i0.j.f.p.h.F(cVar, this, (y) null, 0, 6);
        this.a2 = F;
        this.b2 = F.a.a.d(new LazyJavaPackageFragment$binaryClasses$2(this));
        this.c2 = new JvmPackageScope(F, tVar, this);
        this.d2 = F.a.a.c(new LazyJavaPackageFragment$subPackages$1(this), EmptyList.c);
        if (F.a.v.j) {
            Objects.requireNonNull(f.i);
            fVar = f.a.b;
        } else {
            fVar = i0.j.f.p.h.z3(F, tVar);
        }
        this.e2 = fVar;
        F.a.a.d(new LazyJavaPackageFragment$partToFacade$2(this));
    }

    public final Map<String, j> B0() {
        return (Map) i0.j.f.p.h.K1(this.b2, Y1[0]);
    }

    public f getAnnotations() {
        return this.e2;
    }

    public MemberScope o() {
        return this.c2;
    }

    public h0 r() {
        return new m0.r.t.a.r.e.b.k(this);
    }

    public String toString() {
        return i.k("Lazy Java package fragment: ", this.y);
    }
}
