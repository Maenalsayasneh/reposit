package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$computeNonDeclaredProperties$2 extends Lambda implements l<d, Collection<? extends g0>> {
    public final /* synthetic */ LazyJavaClassMemberScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$computeNonDeclaredProperties$2(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.c = lazyJavaClassMemberScope;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "it");
        return LazyJavaClassMemberScope.w(this.c, dVar);
    }
}
