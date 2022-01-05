package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.n.a.a;
import m0.r.t.a.o;

/* compiled from: KPropertyImpl.kt */
public final class KPropertyImplKt$computeCallerForAccessor$1 extends Lambda implements a<Boolean> {
    public final /* synthetic */ KPropertyImpl.a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImplKt$computeCallerForAccessor$1(KPropertyImpl.a aVar) {
        super(0);
        this.c = aVar;
    }

    public final boolean invoke() {
        return this.c.t().p().getAnnotations().n(o.a);
    }
}
