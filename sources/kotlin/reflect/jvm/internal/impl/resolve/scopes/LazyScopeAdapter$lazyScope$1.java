package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: LazyScopeAdapter.kt */
public final class LazyScopeAdapter$lazyScope$1 extends Lambda implements a<MemberScope> {
    public final /* synthetic */ a<MemberScope> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyScopeAdapter$lazyScope$1(a<? extends MemberScope> aVar) {
        super(0);
        this.c = aVar;
    }

    public Object invoke() {
        MemberScope invoke = this.c.invoke();
        return invoke instanceof m0.r.t.a.r.j.u.a ? ((m0.r.t.a.r.j.u.a) invoke).h() : invoke;
    }
}
