package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: ConstantValueFactory.kt */
public final class ConstantValueFactory$createArrayValue$3 extends Lambda implements l<u, v> {
    public final /* synthetic */ PrimitiveType c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstantValueFactory$createArrayValue$3(PrimitiveType primitiveType) {
        super(1);
        this.c = primitiveType;
    }

    public Object invoke(Object obj) {
        u uVar = (u) obj;
        i.e(uVar, "module");
        a0 r = uVar.m().r(this.c);
        i.d(r, "module.builtIns.getPrimitiveArrayKotlinType(componentType)");
        return r;
    }
}
