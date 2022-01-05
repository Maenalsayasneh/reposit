package m0.r.t.a.r.j.r;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: DescriptorUtils.kt */
public final class b extends m0.r.t.a.r.o.b<CallableMemberDescriptor, CallableMemberDescriptor> {
    public final /* synthetic */ Ref$ObjectRef<CallableMemberDescriptor> a;
    public final /* synthetic */ l<CallableMemberDescriptor, Boolean> b;

    public b(Ref$ObjectRef<CallableMemberDescriptor> ref$ObjectRef, l<? super CallableMemberDescriptor, Boolean> lVar) {
        this.a = ref$ObjectRef;
        this.b = lVar;
    }

    public Object a() {
        return (CallableMemberDescriptor) this.a.c;
    }

    public void b(Object obj) {
        T t = (CallableMemberDescriptor) obj;
        i.e(t, "current");
        if (this.a.c == null && this.b.invoke(t).booleanValue()) {
            this.a.c = t;
        }
    }

    public boolean c(Object obj) {
        i.e((CallableMemberDescriptor) obj, "current");
        return this.a.c == null;
    }
}
