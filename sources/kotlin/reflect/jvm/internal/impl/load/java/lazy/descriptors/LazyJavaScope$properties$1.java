package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.a1.a;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$properties$1 extends Lambda implements l<d, List<? extends c0>> {
    public final /* synthetic */ LazyJavaScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$properties$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.c = lazyJavaScope;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "name");
        ArrayList arrayList = new ArrayList();
        a.N(arrayList, this.c.h.invoke(dVar));
        this.c.n(dVar, arrayList);
        if (m0.r.t.a.r.j.d.m(this.c.q())) {
            return g.v0(arrayList);
        }
        c cVar = this.c.c;
        return g.v0(cVar.a.r.a(cVar, arrayList));
    }
}
