package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.e.b.n;

/* compiled from: specialBuiltinMembers.kt */
public final class BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 extends Lambda implements l<CallableMemberDescriptor, Boolean> {
    public BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1(BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature) {
        super(1);
    }

    public Object invoke(Object obj) {
        boolean z;
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        i.e(callableMemberDescriptor, "it");
        if (callableMemberDescriptor instanceof r) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.m;
            if (g.f(SpecialGenericSignatures.g, n.c(callableMemberDescriptor))) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
