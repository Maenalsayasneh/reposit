package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.t0.z;
import m0.r.t.a.r.e.a.w.n;
import m0.r.t.a.r.j.p.g;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$resolveProperty$1 extends Lambda implements a<g<?>> {
    public final /* synthetic */ LazyJavaScope c;
    public final /* synthetic */ n d;
    public final /* synthetic */ z q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$resolveProperty$1(LazyJavaScope lazyJavaScope, n nVar, z zVar) {
        super(0);
        this.c = lazyJavaScope;
        this.d = nVar;
        this.q = zVar;
    }

    public Object invoke() {
        return this.c.c.a.h.a(this.d, this.q);
    }
}
