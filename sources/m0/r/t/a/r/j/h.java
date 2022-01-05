package m0.r.t.a.r.j;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.b.i;

/* compiled from: OverridingStrategy.kt */
public abstract class h {
    public abstract void a(CallableMemberDescriptor callableMemberDescriptor);

    public abstract void b(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public void d(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
        i.e(callableMemberDescriptor, "member");
        i.e(collection, "overridden");
        callableMemberDescriptor.v0(collection);
    }
}
