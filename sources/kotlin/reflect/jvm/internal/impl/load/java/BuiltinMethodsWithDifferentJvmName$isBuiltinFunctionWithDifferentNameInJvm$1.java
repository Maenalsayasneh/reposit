package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.e.b.n;
import m0.r.t.a.r.g.d;

/* compiled from: specialBuiltinMembers.kt */
public final class BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1 extends Lambda implements l<CallableMemberDescriptor, Boolean> {
    public final /* synthetic */ g0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1(g0 g0Var) {
        super(1);
        this.c = g0Var;
    }

    public Object invoke(Object obj) {
        i.e((CallableMemberDescriptor) obj, "it");
        SpecialGenericSignatures.a aVar = SpecialGenericSignatures.a;
        Map<String, d> map = SpecialGenericSignatures.j;
        String c2 = n.c(this.c);
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return Boolean.valueOf(map.containsKey(c2));
    }
}
