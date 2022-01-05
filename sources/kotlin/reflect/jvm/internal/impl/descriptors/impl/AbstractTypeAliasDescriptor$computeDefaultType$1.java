package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: AbstractTypeAliasDescriptor.kt */
public final class AbstractTypeAliasDescriptor$computeDefaultType$1 extends Lambda implements l<e, a0> {
    public final /* synthetic */ AbstractTypeAliasDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$computeDefaultType$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(1);
        this.c = abstractTypeAliasDescriptor;
    }

    public Object invoke(Object obj) {
        f e = ((e) obj).e(this.c);
        if (e == null) {
            return null;
        }
        return e.q();
    }
}
