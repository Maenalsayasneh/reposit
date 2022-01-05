package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 extends Lambda implements l<d, Collection<? extends g0>> {
    public final /* synthetic */ g0 c;
    public final /* synthetic */ LazyJavaClassMemberScope d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1(g0 g0Var, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.c = g0Var;
        this.d = lazyJavaClassMemberScope;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "accessorName");
        if (i.a(this.c.getName(), dVar)) {
            return h.L2(this.c);
        }
        return g.Z(LazyJavaClassMemberScope.v(this.d, dVar), LazyJavaClassMemberScope.w(this.d, dVar));
    }
}
