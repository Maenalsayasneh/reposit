package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.g.b;

/* compiled from: PrimitiveType.kt */
public final class PrimitiveType$typeFqName$2 extends Lambda implements a<b> {
    public final /* synthetic */ PrimitiveType c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimitiveType$typeFqName$2(PrimitiveType primitiveType) {
        super(0);
        this.c = primitiveType;
    }

    public Object invoke() {
        b c2 = g.l.c(this.c.getTypeName());
        i.d(c2, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
        return c2;
    }
}
