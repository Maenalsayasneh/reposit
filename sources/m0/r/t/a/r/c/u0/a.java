package m0.r.t.a.r.c.u0;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import m0.n.b.i;
import m0.r.t.a.r.c.q0;

/* compiled from: JavaVisibilities.kt */
public final class a extends q0 {
    public static final a a = new a();

    public a() {
        super("package", false);
    }

    public Integer compareTo(q0 q0Var) {
        i.e(q0Var, "visibility");
        if (this == q0Var) {
            return 0;
        }
        if (Visibilities.a.a(q0Var)) {
            return 1;
        }
        return -1;
    }

    public String getInternalDisplayName() {
        return "public/*package*/";
    }

    public q0 normalize() {
        return Visibilities.f.a;
    }
}
