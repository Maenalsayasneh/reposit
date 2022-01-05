package m0.r.t.a.r.c.t0;

import java.util.Objects;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.g.b;

/* compiled from: PackageFragmentDescriptorImpl.kt */
public abstract class x extends l implements v {
    public final b y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(u uVar, b bVar) {
        super(uVar, f.a.b, bVar.h(), h0.a);
        i.e(uVar, "module");
        i.e(bVar, "fqName");
        Objects.requireNonNull(f.i);
        this.y = bVar;
    }

    public <R, D> R J(k<R, D> kVar, D d) {
        i.e(kVar, "visitor");
        return kVar.f(this, d);
    }

    public final b d() {
        return this.y;
    }

    public h0 r() {
        h0 h0Var = h0.a;
        i.d(h0Var, "NO_SOURCE");
        return h0Var;
    }

    public String toString() {
        return i.k("package ", this.y);
    }

    public u b() {
        return (u) super.b();
    }
}
