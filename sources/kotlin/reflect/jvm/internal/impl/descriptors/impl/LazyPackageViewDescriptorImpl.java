package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.k;
import m0.r.t.a.r.c.t0.v;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.y;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class LazyPackageViewDescriptorImpl extends k implements y {
    public static final /* synthetic */ m0.r.k<Object>[] q = {m.c(new PropertyReference1Impl(m.a(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;"))};
    public final h Y1;
    public final MemberScope Z1;
    public final v x;
    public final b y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(v vVar, b bVar, l lVar) {
        super(f.a.b, bVar.h());
        i.e(vVar, "module");
        i.e(bVar, "fqName");
        i.e(lVar, "storageManager");
        Objects.requireNonNull(f.i);
        this.x = vVar;
        this.y = bVar;
        this.Y1 = lVar.d(new LazyPackageViewDescriptorImpl$fragments$2(this));
        this.Z1 = new LazyScopeAdapter(lVar, new LazyPackageViewDescriptorImpl$memberScope$1(this));
    }

    public List<m0.r.t.a.r.c.v> F() {
        return (List) i0.j.f.p.h.K1(this.Y1, q[0]);
    }

    public <R, D> R J(m0.r.t.a.r.c.k<R, D> kVar, D d) {
        i.e(kVar, "visitor");
        return kVar.c(this, d);
    }

    public m0.r.t.a.r.c.i b() {
        if (this.y.d()) {
            return null;
        }
        v vVar = this.x;
        b e = this.y.e();
        i.d(e, "fqName.parent()");
        return vVar.M(e);
    }

    public b d() {
        return this.y;
    }

    public boolean equals(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null && i.a(this.y, yVar.d()) && i.a(this.x, yVar.t0())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.y.hashCode() + (this.x.hashCode() * 31);
    }

    public boolean isEmpty() {
        i.e(this, "this");
        return F().isEmpty();
    }

    public MemberScope o() {
        return this.Z1;
    }

    public u t0() {
        return this.x;
    }
}
