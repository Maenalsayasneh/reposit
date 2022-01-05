package m0.r.t.a.r.j.o.a;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: CapturedTypeConstructor.kt */
public final class c implements b {
    public final m0 a;
    public NewCapturedTypeConstructor b;

    public c(m0 m0Var) {
        i.e(m0Var, "projection");
        this.a = m0Var;
        Variance b2 = m0Var.b();
        Variance variance = Variance.INVARIANT;
    }

    public j0 a(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        m0 a2 = this.a.a(eVar);
        i.d(a2, "projection.refine(kotlinTypeRefiner)");
        return new c(a2);
    }

    public Collection<v> b() {
        Object obj;
        if (this.a.b() == Variance.OUT_VARIANCE) {
            obj = this.a.getType();
        } else {
            obj = m().p();
        }
        i.d(obj, "if (projection.projectionKind == Variance.OUT_VARIANCE)\n            projection.type\n        else\n            builtIns.nullableAnyType");
        return h.L2(obj);
    }

    public /* bridge */ /* synthetic */ f c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public m0 e() {
        return this.a;
    }

    public List<m0.r.t.a.r.c.m0> getParameters() {
        return EmptyList.c;
    }

    public m0.r.t.a.r.b.f m() {
        m0.r.t.a.r.b.f m = this.a.getType().I0().m();
        i.d(m, "projection.type.constructor.builtIns");
        return m;
    }

    public String toString() {
        StringBuilder P0 = a.P0("CapturedTypeConstructor(");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
