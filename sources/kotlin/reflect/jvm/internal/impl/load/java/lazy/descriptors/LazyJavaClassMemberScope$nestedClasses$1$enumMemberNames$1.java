package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1 extends Lambda implements a<Set<? extends d>> {
    public final /* synthetic */ LazyJavaClassMemberScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.c = lazyJavaClassMemberScope;
    }

    public Object invoke() {
        return g.d0(this.c.b(), this.c.d());
    }
}
