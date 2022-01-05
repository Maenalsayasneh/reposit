package com.clubhouse.android.ui.search;

import i0.e.b.a3.d.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.search.ExploreFragment$onViewCreated$5", f = "ExploreFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ExploreFragment.kt */
public final class ExploreFragment$onViewCreated$5 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ExploreFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreFragment$onViewCreated$5(ExploreFragment exploreFragment, m0.l.c<? super ExploreFragment$onViewCreated$5> cVar) {
        super(2, cVar);
        this.d = exploreFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ExploreFragment$onViewCreated$5 exploreFragment$onViewCreated$5 = new ExploreFragment$onViewCreated$5(this.d, cVar);
        exploreFragment$onViewCreated$5.c = obj;
        return exploreFragment$onViewCreated$5;
    }

    public Object invoke(Object obj, Object obj2) {
        ExploreFragment$onViewCreated$5 exploreFragment$onViewCreated$5 = new ExploreFragment$onViewCreated$5(this.d, (m0.l.c) obj2);
        exploreFragment$onViewCreated$5.c = (String) obj;
        i iVar = i.a;
        exploreFragment$onViewCreated$5.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ExploreFragment exploreFragment = this.d;
        k<Object>[] kVarArr = ExploreFragment.Z1;
        exploreFragment.O0().p(new b((String) this.c));
        return i.a;
    }
}
