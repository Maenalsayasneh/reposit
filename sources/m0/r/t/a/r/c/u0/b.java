package m0.r.t.a.r.c.u0;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import m0.n.b.i;
import m0.r.t.a.r.c.q0;

/* compiled from: JavaVisibilities.kt */
public final class b extends q0 {
    public static final b a = new b();

    public b() {
        super("protected_and_package", true);
    }

    public Integer compareTo(q0 q0Var) {
        i.e(q0Var, "visibility");
        if (i.a(this, q0Var)) {
            return 0;
        }
        if (q0Var == Visibilities.Internal.INSTANCE) {
            return null;
        }
        return Integer.valueOf(Visibilities.a.a(q0Var) ? 1 : -1);
    }

    public String getInternalDisplayName() {
        return "protected/*protected and package*/";
    }

    public q0 normalize() {
        return Visibilities.f.a;
    }
}
