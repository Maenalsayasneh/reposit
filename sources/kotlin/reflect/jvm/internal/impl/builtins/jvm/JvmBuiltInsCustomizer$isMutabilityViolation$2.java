package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.a.l;
import m0.r.t.a.r.c.d;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$isMutabilityViolation$2 extends Lambda implements l<CallableMemberDescriptor, Boolean> {
    public final /* synthetic */ JvmBuiltInsCustomizer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$isMutabilityViolation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.c = jvmBuiltInsCustomizer;
    }

    public Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        return Boolean.valueOf(callableMemberDescriptor.f() == CallableMemberDescriptor.Kind.DECLARATION && this.c.c.b((d) callableMemberDescriptor.b()));
    }
}
