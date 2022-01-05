package com.clubhouse.android.ui.search;

import h0.q.q;
import h0.u.w;
import i0.e.b.b3.b.e.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.e;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;

@c(c = "com.clubhouse.android.ui.search.ExploreV2Fragment$onViewCreated$12", f = "ExploreV2Fragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ExploreV2Fragment.kt */
public final class ExploreV2Fragment$onViewCreated$12 extends SuspendLambda implements p<w<j>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ExploreV2Fragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2Fragment$onViewCreated$12(ExploreV2Fragment exploreV2Fragment, m0.l.c<? super ExploreV2Fragment$onViewCreated$12> cVar) {
        super(2, cVar);
        this.d = exploreV2Fragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ExploreV2Fragment$onViewCreated$12 exploreV2Fragment$onViewCreated$12 = new ExploreV2Fragment$onViewCreated$12(this.d, cVar);
        exploreV2Fragment$onViewCreated$12.c = obj;
        return exploreV2Fragment$onViewCreated$12;
    }

    public Object invoke(Object obj, Object obj2) {
        ExploreV2Fragment$onViewCreated$12 exploreV2Fragment$onViewCreated$12 = new ExploreV2Fragment$onViewCreated$12(this.d, (m0.l.c) obj2);
        exploreV2Fragment$onViewCreated$12.c = (w) obj;
        i iVar = i.a;
        exploreV2Fragment$onViewCreated$12.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        w wVar = (w) this.c;
        if (wVar != null) {
            ExploreV2Fragment exploreV2Fragment = this.d;
            h0.q.p viewLifecycleOwner = exploreV2Fragment.getViewLifecycleOwner();
            m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
            a.E2(q.a(viewLifecycleOwner), (e) null, (CoroutineStart) null, new ExploreV2Fragment$onViewCreated$12$1$1(exploreV2Fragment, wVar, (m0.l.c<? super ExploreV2Fragment$onViewCreated$12$1$1>) null), 3, (Object) null);
        }
        return i.a;
    }
}
