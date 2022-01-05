package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.a.l;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$functionNamesLazy$2 extends Lambda implements a<Set<? extends d>> {
    public final /* synthetic */ LazyJavaScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$functionNamesLazy$2(LazyJavaScope lazyJavaScope) {
        super(0);
        this.c = lazyJavaScope;
    }

    public Object invoke() {
        return this.c.i(m0.r.t.a.r.j.u.d.p, (l<? super d, Boolean>) null);
    }
}
