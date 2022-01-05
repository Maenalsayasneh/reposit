package com.clubhouse.android.ui.search;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.search.ExploreV2Fragment$onViewCreated$10", f = "ExploreV2Fragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ExploreV2Fragment.kt */
public final class ExploreV2Fragment$onViewCreated$10 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ExploreV2Fragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2Fragment$onViewCreated$10(ExploreV2Fragment exploreV2Fragment, m0.l.c<? super ExploreV2Fragment$onViewCreated$10> cVar) {
        super(2, cVar);
        this.d = exploreV2Fragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ExploreV2Fragment$onViewCreated$10 exploreV2Fragment$onViewCreated$10 = new ExploreV2Fragment$onViewCreated$10(this.d, cVar);
        exploreV2Fragment$onViewCreated$10.c = obj;
        return exploreV2Fragment$onViewCreated$10;
    }

    public Object invoke(Object obj, Object obj2) {
        ExploreV2Fragment$onViewCreated$10 exploreV2Fragment$onViewCreated$10 = new ExploreV2Fragment$onViewCreated$10(this.d, (m0.l.c) obj2);
        exploreV2Fragment$onViewCreated$10.c = (String) obj;
        i iVar = i.a;
        exploreV2Fragment$onViewCreated$10.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (((String) this.c).length() == 0) {
            ExploreV2Fragment exploreV2Fragment = this.d;
            k<Object>[] kVarArr = ExploreV2Fragment.Z1;
            exploreV2Fragment.O0().f.setController(this.d.f2);
        } else {
            ExploreV2Fragment exploreV2Fragment2 = this.d;
            k<Object>[] kVarArr2 = ExploreV2Fragment.Z1;
            exploreV2Fragment2.O0().f.setController(this.d.e2);
        }
        return i.a;
    }
}
