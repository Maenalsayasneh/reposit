package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.OnboardingDestination;
import h0.b0.v;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsFragment$onCreate$3", f = "FollowSuggestionsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: FollowSuggestionsFragment.kt */
public final class FollowSuggestionsFragment$onCreate$3 extends SuspendLambda implements p<OnboardingDestination, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FollowSuggestionsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsFragment$onCreate$3(FollowSuggestionsFragment followSuggestionsFragment, m0.l.c<? super FollowSuggestionsFragment$onCreate$3> cVar) {
        super(2, cVar);
        this.d = followSuggestionsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FollowSuggestionsFragment$onCreate$3 followSuggestionsFragment$onCreate$3 = new FollowSuggestionsFragment$onCreate$3(this.d, cVar);
        followSuggestionsFragment$onCreate$3.c = obj;
        return followSuggestionsFragment$onCreate$3;
    }

    public Object invoke(Object obj, Object obj2) {
        FollowSuggestionsFragment$onCreate$3 followSuggestionsFragment$onCreate$3 = new FollowSuggestionsFragment$onCreate$3(this.d, (m0.l.c) obj2);
        followSuggestionsFragment$onCreate$3.c = (OnboardingDestination) obj;
        i iVar = i.a;
        followSuggestionsFragment$onCreate$3.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ((AmplitudeAnalytics) v.l(this.d)).a("Onboarding-Follows-Done");
        v.b1(this.d, (OnboardingDestination) this.c);
        return i.a;
    }
}
