package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.d;

/* compiled from: modifierChecks.kt */
public final class OperatorChecks$checks$3 extends Lambda implements l<r, String> {
    public static final OperatorChecks$checks$3 c = new OperatorChecks$checks$3();

    public OperatorChecks$checks$3() {
        super(1);
    }

    public Object invoke(Object obj) {
        boolean z;
        r rVar = (r) obj;
        i.e(rVar, "<this>");
        f0 e0 = rVar.e0();
        if (e0 == null) {
            e0 = rVar.l0();
        }
        OperatorChecks operatorChecks = OperatorChecks.a;
        boolean z2 = false;
        if (e0 != null) {
            v returnType = rVar.getReturnType();
            if (returnType == null) {
                z = false;
            } else {
                v type = e0.getType();
                i.d(type, "receiver.type");
                i.e(returnType, "<this>");
                i.e(type, "superType");
                z = d.a.d(returnType, type);
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            return "receiver must be a supertype of the return type";
        }
        return null;
    }
}
