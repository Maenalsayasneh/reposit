package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.w;
import m0.r.t.a.r.m.x0.e;

/* compiled from: SpecialTypes.kt */
public final class LazyWrappedType$refine$1 extends Lambda implements a<v> {
    public final /* synthetic */ e c;
    public final /* synthetic */ w d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyWrappedType$refine$1(e eVar, w wVar) {
        super(0);
        this.c = eVar;
        this.d = wVar;
    }

    public Object invoke() {
        return this.c.g(this.d.q.invoke());
    }
}
