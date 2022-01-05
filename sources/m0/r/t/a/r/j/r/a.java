package m0.r.t.a.r.j.r;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.r.t.a.r.o.c;

/* compiled from: DescriptorUtils.kt */
public final class a implements c<CallableMemberDescriptor> {
    public final /* synthetic */ boolean a;

    public a(boolean z) {
        this.a = z;
    }

    public Iterable a(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        Collection<? extends CallableMemberDescriptor> collection = null;
        if (this.a) {
            callableMemberDescriptor = callableMemberDescriptor == null ? null : callableMemberDescriptor.a();
        }
        if (callableMemberDescriptor != null) {
            collection = callableMemberDescriptor.e();
        }
        return collection == null ? EmptyList.c : collection;
    }
}
