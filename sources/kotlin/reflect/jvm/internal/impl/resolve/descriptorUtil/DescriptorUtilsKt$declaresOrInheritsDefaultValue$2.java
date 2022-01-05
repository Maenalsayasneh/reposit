package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.internal.FunctionReference;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.c.o0;

/* compiled from: DescriptorUtils.kt */
public /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements l<o0, Boolean> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 c = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    public final String getName() {
        return "declaresDefaultValue";
    }

    public final f getOwner() {
        return m.a(o0.class);
    }

    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    public Object invoke(Object obj) {
        o0 o0Var = (o0) obj;
        i.e(o0Var, "p0");
        return Boolean.valueOf(o0Var.s0());
    }
}
