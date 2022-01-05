package m0.r.t.a.r.j;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.a.l;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.o;

/* compiled from: OverridingUtil */
public final class i implements l<CallableMemberDescriptor, Boolean> {
    public final /* synthetic */ d c;

    public i(d dVar) {
        this.c = dVar;
    }

    public Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        return Boolean.valueOf(!o.e(callableMemberDescriptor.getVisibility()) && o.f(callableMemberDescriptor, this.c));
    }
}
