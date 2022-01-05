package m0.r.t.a.r.e.a.u.g;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.w.q;
import m0.r.t.a.r.m.v;

/* compiled from: LazyJavaStaticScope.kt */
public abstract class d extends LazyJavaScope {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(cVar, (LazyJavaScope) null);
        i.e(cVar, "c");
    }

    public void n(m0.r.t.a.r.g.d dVar, Collection<c0> collection) {
        i.e(dVar, "name");
        i.e(collection, "result");
    }

    public f0 p() {
        return null;
    }

    public LazyJavaScope.a s(q qVar, List<? extends m0> list, v vVar, List<? extends o0> list2) {
        i.e(qVar, "method");
        i.e(list, "methodTypeParameters");
        i.e(vVar, "returnType");
        i.e(list2, "valueParameters");
        return new LazyJavaScope.a(vVar, (v) null, list2, list, false, EmptyList.c);
    }
}
