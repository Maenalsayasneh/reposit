package m0.r.t.a.r.e.a.t;

import java.util.Objects;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.b.i;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.r0.f;

/* compiled from: JavaForKotlinOverridePropertyDescriptor.kt */
public final class e extends f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, g0 g0Var, g0 g0Var2, c0 c0Var) {
        super(dVar, f.a.b, g0Var.j(), g0Var.getVisibility(), g0Var2 != null, c0Var.getName(), g0Var.r(), (c0) null, CallableMemberDescriptor.Kind.DECLARATION, false, (Pair<a.C0250a<?>, ?>) null);
        d dVar2 = dVar;
        i.e(dVar, "ownerDescriptor");
        g0 g0Var3 = g0Var;
        i.e(g0Var, "getterMethod");
        i.e(c0Var, "overriddenProperty");
        Objects.requireNonNull(f.i);
    }
}
