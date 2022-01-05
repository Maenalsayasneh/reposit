package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import m0.n.b.i;
import m0.r.t.a.r.j.u.a;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;

/* compiled from: LazyScopeAdapter.kt */
public final class LazyScopeAdapter extends a {
    public final h<MemberScope> b;

    public LazyScopeAdapter(l lVar, m0.n.a.a<? extends MemberScope> aVar) {
        i.e(lVar, "storageManager");
        i.e(aVar, "getScope");
        this.b = lVar.d(new LazyScopeAdapter$lazyScope$1(aVar));
    }

    public MemberScope i() {
        return (MemberScope) this.b.invoke();
    }
}
