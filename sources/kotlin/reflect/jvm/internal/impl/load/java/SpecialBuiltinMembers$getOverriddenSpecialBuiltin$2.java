package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.a.l;

/* compiled from: specialBuiltinMembers.kt */
public final class SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 extends Lambda implements l<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 c = new SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2();

    public SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2() {
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r4 != null) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r6
            java.lang.String r0 = "it"
            m0.n.b.i.e(r6, r0)
            boolean r0 = m0.r.t.a.r.b.f.A(r6)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005e
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m
            java.lang.String r3 = "<this>"
            m0.n.b.i.e(r6, r3)
            java.util.Set<m0.r.t.a.r.g.d> r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f
            m0.r.t.a.r.g.d r4 = r6.getName()
            boolean r3 = r3.contains(r4)
            r4 = 0
            if (r3 != 0) goto L_0x0024
            goto L_0x005b
        L_0x0024:
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 r3 = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1
            r3.<init>(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.c(r6, r2, r3, r1)
            if (r6 != 0) goto L_0x0031
            r6 = r4
            goto L_0x0035
        L_0x0031:
            java.lang.String r6 = m0.r.t.a.r.e.b.n.c(r6)
        L_0x0035:
            if (r6 != 0) goto L_0x0038
            goto L_0x005b
        L_0x0038:
            java.lang.String r0 = "builtinSignature"
            m0.n.b.i.e(r6, r0)
            java.util.List<java.lang.String> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.c
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0049
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r6 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER
        L_0x0047:
            r4 = r6
            goto L_0x005b
        L_0x0049:
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.e
            java.lang.Object r6 = m0.j.g.A(r0, r6)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r6 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription) r6
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.NULL
            if (r6 != r0) goto L_0x0058
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r6 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC
            goto L_0x0047
        L_0x0058:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r6 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC
            goto L_0x0047
        L_0x005b:
            if (r4 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2.invoke(java.lang.Object):java.lang.Object");
    }
}
