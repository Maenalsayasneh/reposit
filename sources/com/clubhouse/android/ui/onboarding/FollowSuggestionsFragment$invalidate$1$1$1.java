package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.ui.onboarding.FollowSuggestionsFragment;
import h0.u.w;
import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.m;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsFragment$invalidate$1$1$1", f = "FollowSuggestionsFragment.kt", l = {127}, m = "invokeSuspend")
/* compiled from: FollowSuggestionsFragment.kt */
public final class FollowSuggestionsFragment$invalidate$1$1$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ FollowSuggestionsFragment d;
    public final /* synthetic */ w<a<m>> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsFragment$invalidate$1$1$1(FollowSuggestionsFragment followSuggestionsFragment, w<a<m>> wVar, m0.l.c<? super FollowSuggestionsFragment$invalidate$1$1$1> cVar) {
        super(2, cVar);
        this.d = followSuggestionsFragment;
        this.q = wVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new FollowSuggestionsFragment$invalidate$1$1$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new FollowSuggestionsFragment$invalidate$1$1$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            FollowSuggestionsFragment.PagingItemController pagingItemController = this.d.d2;
            w<a<m>> wVar = this.q;
            this.c = 1;
            if (pagingItemController.submitData(wVar, this) == coroutineSingletons) {
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
