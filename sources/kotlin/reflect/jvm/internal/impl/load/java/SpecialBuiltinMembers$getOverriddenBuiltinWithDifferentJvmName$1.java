package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: specialBuiltinMembers.kt */
public final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 extends Lambda implements l<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 c = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1();

    public SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        i.e(callableMemberDescriptor, "it");
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.a.b(DescriptorUtilsKt.m(callableMemberDescriptor)));
    }
}
