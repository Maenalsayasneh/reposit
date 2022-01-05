package m0.r.t.a.r.e.a;

import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import m0.n.b.i;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;

/* compiled from: FieldOverridabilityCondition.kt */
public final class h implements ExternalOverridabilityCondition {
    public ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }

    public ExternalOverridabilityCondition.Result b(a aVar, a aVar2, d dVar) {
        i.e(aVar, "superDescriptor");
        i.e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof c0) || !(aVar instanceof c0)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        c0 c0Var = (c0) aVar2;
        c0 c0Var2 = (c0) aVar;
        if (!i.a(c0Var.getName(), c0Var2.getName())) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        if (i0.j.f.p.h.n2(c0Var) && i0.j.f.p.h.n2(c0Var2)) {
            return ExternalOverridabilityCondition.Result.OVERRIDABLE;
        }
        if (i0.j.f.p.h.n2(c0Var) || i0.j.f.p.h.n2(c0Var2)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
