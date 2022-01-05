package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;

/* compiled from: modifierChecks.kt */
public final class OperatorChecks$checks$1 extends Lambda implements l<r, String> {
    public static final OperatorChecks$checks$1 c = new OperatorChecks$checks$1();

    public OperatorChecks$checks$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        Boolean bool;
        r rVar = (r) obj;
        i.e(rVar, "<this>");
        List<o0> h = rVar.h();
        i.d(h, "valueParameters");
        o0 o0Var = (o0) g.I(h);
        if (o0Var == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(!DescriptorUtilsKt.a(o0Var) && o0Var.k0() == null);
        }
        boolean a = i.a(bool, Boolean.TRUE);
        OperatorChecks operatorChecks = OperatorChecks.a;
        if (!a) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
