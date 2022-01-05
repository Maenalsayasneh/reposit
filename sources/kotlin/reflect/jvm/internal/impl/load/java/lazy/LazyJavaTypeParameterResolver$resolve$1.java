package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.u.g.e;
import m0.r.t.a.r.e.a.w.x;

/* compiled from: resolvers.kt */
public final class LazyJavaTypeParameterResolver$resolve$1 extends Lambda implements l<x, e> {
    public final /* synthetic */ LazyJavaTypeParameterResolver c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterResolver$resolve$1(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver) {
        super(1);
        this.c = lazyJavaTypeParameterResolver;
    }

    public Object invoke(Object obj) {
        x xVar = (x) obj;
        i.e(xVar, "typeParameter");
        Integer num = this.c.d.get(xVar);
        if (num == null) {
            return null;
        }
        LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.c;
        int intValue = num.intValue();
        c cVar = lazyJavaTypeParameterResolver.a;
        i.e(cVar, "<this>");
        i.e(lazyJavaTypeParameterResolver, "typeParameterResolver");
        return new e(h.a0(new c(cVar.a, lazyJavaTypeParameterResolver, cVar.c), lazyJavaTypeParameterResolver.b.getAnnotations()), xVar, lazyJavaTypeParameterResolver.c + intValue, lazyJavaTypeParameterResolver.b);
    }
}
