package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.e.a.b;

/* compiled from: specialBuiltinMembers.kt */
public final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 extends Lambda implements l<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 c = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2();

    public SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        i.e(callableMemberDescriptor, "it");
        b bVar = b.m;
        g0 g0Var = (g0) callableMemberDescriptor;
        i.e(g0Var, "functionDescriptor");
        boolean z = true;
        if (!f.A(g0Var) || DescriptorUtilsKt.c(g0Var, false, new BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1(g0Var), 1) == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
