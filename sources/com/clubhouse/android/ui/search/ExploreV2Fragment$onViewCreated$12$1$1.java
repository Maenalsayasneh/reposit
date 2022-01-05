package com.clubhouse.android.ui.search;

import com.clubhouse.android.ui.search.ExploreV2Fragment;
import h0.u.w;
import i0.e.b.b3.b.e.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.search.ExploreV2Fragment$onViewCreated$12$1$1", f = "ExploreV2Fragment.kt", l = {135}, m = "invokeSuspend")
/* compiled from: ExploreV2Fragment.kt */
public final class ExploreV2Fragment$onViewCreated$12$1$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ExploreV2Fragment d;
    public final /* synthetic */ w<j> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2Fragment$onViewCreated$12$1$1(ExploreV2Fragment exploreV2Fragment, w<j> wVar, m0.l.c<? super ExploreV2Fragment$onViewCreated$12$1$1> cVar) {
        super(2, cVar);
        this.d = exploreV2Fragment;
        this.q = wVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ExploreV2Fragment$onViewCreated$12$1$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ExploreV2Fragment$onViewCreated$12$1$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ExploreV2Fragment.PagingController pagingController = this.d.e2;
            w<j> wVar = this.q;
            this.c = 1;
            if (pagingController.submitData(wVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
