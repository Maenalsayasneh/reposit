package com.clubhouse.android.ui.clubs.invites;

import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import g0.a.b.b.a;
import h0.u.w;
import i0.e.b.b3.b.e.j;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.x2.t;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.clubs.invites.GrowClubFragment$invalidate$1$1$1$1", f = "GrowClubFragment.kt", l = {144}, m = "invokeSuspend")
/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$invalidate$1$1$1$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ GrowClubFragment d;
    public final /* synthetic */ w<j> q;
    public final /* synthetic */ v1 x;
    public final /* synthetic */ t y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$invalidate$1$1$1$1(GrowClubFragment growClubFragment, w<j> wVar, v1 v1Var, t tVar, m0.l.c<? super GrowClubFragment$invalidate$1$1$1$1> cVar) {
        super(2, cVar);
        this.d = growClubFragment;
        this.q = wVar;
        this.x = v1Var;
        this.y = tVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new GrowClubFragment$invalidate$1$1$1$1(this.d, this.q, this.x, this.y, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new GrowClubFragment$invalidate$1$1$1$1(this.d, this.q, this.x, this.y, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            GrowClubFragment.RecommendationPagingController recommendationPagingController = this.d.d2;
            w<j> B = a.B(this.q, new GrowClubFragment$filterMembers$1(this.x.j, this.y.f, (m0.l.c<? super GrowClubFragment$filterMembers$1>) null));
            this.c = 1;
            if (recommendationPagingController.submitData(B, this) == coroutineSingletons) {
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
