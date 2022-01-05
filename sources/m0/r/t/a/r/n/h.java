package m0.r.t.a.r.n;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.b.i;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.m.a1.a;

/* compiled from: modifierChecks.kt */
public final class h implements b {
    public static final h a = new h();

    public String a(r rVar) {
        return a.o2(this, rVar);
    }

    public boolean b(r rVar) {
        boolean z;
        i.e(rVar, "functionDescriptor");
        List<o0> h = rVar.h();
        i.d(h, "functionDescriptor.valueParameters");
        if (!h.isEmpty()) {
            for (o0 o0Var : h) {
                i.d(o0Var, "it");
                if (DescriptorUtilsKt.a(o0Var) || o0Var.k0() != null) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
