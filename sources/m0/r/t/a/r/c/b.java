package m0.r.t.a.r.c;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;

/* compiled from: typeParameterUtils.kt */
public final class b implements m0 {
    public final m0 c;
    public final i d;
    public final int q;

    public b(m0 m0Var, i iVar, int i) {
        i.e(m0Var, "originalDescriptor");
        i.e(iVar, "declarationDescriptor");
        this.c = m0Var;
        this.d = iVar;
        this.q = i;
    }

    public boolean B() {
        return this.c.B();
    }

    public <R, D> R J(k<R, D> kVar, D d2) {
        return this.c.J(kVar, d2);
    }

    public i b() {
        return this.d;
    }

    public int g() {
        return this.c.g() + this.q;
    }

    public l g0() {
        return this.c.g0();
    }

    public f getAnnotations() {
        return this.c.getAnnotations();
    }

    public d getName() {
        return this.c.getName();
    }

    public List<v> getUpperBounds() {
        return this.c.getUpperBounds();
    }

    public j0 i() {
        return this.c.i();
    }

    public Variance l() {
        return this.c.l();
    }

    public boolean n0() {
        return true;
    }

    public a0 q() {
        return this.c.q();
    }

    public h0 r() {
        return this.c.r();
    }

    public String toString() {
        return this.c + "[inner-copy]";
    }

    public m0 a() {
        m0 a = this.c.a();
        i.d(a, "originalDescriptor.original");
        return a;
    }
}
