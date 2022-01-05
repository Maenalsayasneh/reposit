package com.clubhouse.android.ui.onboarding;

import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.j;
import i0.e.b.b3.b.e.m;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsState$users$1", f = "FollowSuggestionsViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsState$users$1 extends SuspendLambda implements p<j, m0.l.c<? super a<m>>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FollowSuggestionsState d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsState$users$1(FollowSuggestionsState followSuggestionsState, m0.l.c<? super FollowSuggestionsState$users$1> cVar) {
        super(2, cVar);
        this.d = followSuggestionsState;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FollowSuggestionsState$users$1 followSuggestionsState$users$1 = new FollowSuggestionsState$users$1(this.d, cVar);
        followSuggestionsState$users$1.c = obj;
        return followSuggestionsState$users$1;
    }

    public Object invoke(Object obj, Object obj2) {
        FollowSuggestionsState$users$1 followSuggestionsState$users$1 = new FollowSuggestionsState$users$1(this.d, (m0.l.c) obj2);
        followSuggestionsState$users$1.c = (j) obj;
        return followSuggestionsState$users$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        m mVar = (m) ((j) this.c);
        return new a(mVar, this.d.c.contains(mVar.g.getId()));
    }
}
