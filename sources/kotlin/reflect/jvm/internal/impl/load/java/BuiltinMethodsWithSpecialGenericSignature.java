package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.b.i;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.g.d;

/* compiled from: specialBuiltinMembers.kt */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {
    public static final BuiltinMethodsWithSpecialGenericSignature m = new BuiltinMethodsWithSpecialGenericSignature();

    public static final r a(r rVar) {
        i.e(rVar, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = m;
        d name = rVar.getName();
        i.d(name, "functionDescriptor.name");
        if (!builtinMethodsWithSpecialGenericSignature.b(name)) {
            return null;
        }
        return (r) DescriptorUtilsKt.c(rVar, false, new BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1(builtinMethodsWithSpecialGenericSignature), 1);
    }

    public final boolean b(d dVar) {
        i.e(dVar, "<this>");
        return SpecialGenericSignatures.f.contains(dVar);
    }
}
