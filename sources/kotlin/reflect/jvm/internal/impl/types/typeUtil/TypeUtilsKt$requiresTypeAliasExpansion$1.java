package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.m.v0;

/* compiled from: TypeUtils.kt */
public final class TypeUtilsKt$requiresTypeAliasExpansion$1 extends Lambda implements l<v0, Boolean> {
    public static final TypeUtilsKt$requiresTypeAliasExpansion$1 c = new TypeUtilsKt$requiresTypeAliasExpansion$1();

    public TypeUtilsKt$requiresTypeAliasExpansion$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        v0 v0Var = (v0) obj;
        i.e(v0Var, "it");
        f c2 = v0Var.I0().c();
        boolean z = false;
        if (c2 != null && ((c2 instanceof l0) || (c2 instanceof m0))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
