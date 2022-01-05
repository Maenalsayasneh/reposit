package m0.r.t.a.r.j;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.i;
import m0.n.a.l;

/* compiled from: OverridingUtil */
public final class k implements l<CallableMemberDescriptor, i> {
    public final /* synthetic */ h c;
    public final /* synthetic */ CallableMemberDescriptor d;

    public k(h hVar, CallableMemberDescriptor callableMemberDescriptor) {
        this.c = hVar;
        this.d = callableMemberDescriptor;
    }

    public Object invoke(Object obj) {
        this.c.b(this.d, (CallableMemberDescriptor) obj);
        return i.a;
    }
}
