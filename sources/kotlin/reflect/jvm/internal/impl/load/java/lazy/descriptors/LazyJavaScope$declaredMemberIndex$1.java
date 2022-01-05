package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$declaredMemberIndex$1 extends Lambda implements a<m0.r.t.a.r.e.a.u.g.a> {
    public final /* synthetic */ LazyJavaScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredMemberIndex$1(LazyJavaScope lazyJavaScope) {
        super(0);
        this.c = lazyJavaScope;
    }

    public Object invoke() {
        return this.c.k();
    }
}
