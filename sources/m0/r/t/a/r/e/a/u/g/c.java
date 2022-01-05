package m0.r.t.a.r.e.a.u.g;

import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.o.b;

/* compiled from: LazyJavaStaticClassScope.kt */
public final class c extends b<d, i> {
    public final /* synthetic */ d a;
    public final /* synthetic */ Set<R> b;
    public final /* synthetic */ l<MemberScope, Collection<R>> c;

    public c(d dVar, Set<R> set, l<? super MemberScope, ? extends Collection<? extends R>> lVar) {
        this.a = dVar;
        this.b = set;
        this.c = lVar;
    }

    public Object a() {
        return i.a;
    }

    public boolean c(Object obj) {
        d dVar = (d) obj;
        m0.n.b.i.e(dVar, "current");
        if (dVar == this.a) {
            return true;
        }
        MemberScope Q = dVar.Q();
        m0.n.b.i.d(Q, "current.staticScope");
        if (!(Q instanceof d)) {
            return true;
        }
        this.b.addAll(this.c.invoke(Q));
        return false;
    }
}
