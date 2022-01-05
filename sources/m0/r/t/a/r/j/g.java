package m0.r.t.a.r.j;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.b.i;

/* compiled from: OverridingStrategy.kt */
public abstract class g extends h {
    public void b(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        i.e(callableMemberDescriptor, "first");
        i.e(callableMemberDescriptor2, "second");
        e(callableMemberDescriptor, callableMemberDescriptor2);
    }

    public void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        i.e(callableMemberDescriptor, "fromSuper");
        i.e(callableMemberDescriptor2, "fromCurrent");
        e(callableMemberDescriptor, callableMemberDescriptor2);
    }

    public abstract void e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);
}
