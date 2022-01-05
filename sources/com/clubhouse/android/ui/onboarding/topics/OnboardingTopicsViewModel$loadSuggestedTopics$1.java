package com.clubhouse.android.ui.onboarding.topics;

import com.clubhouse.android.data.models.remote.response.OnboardingSuggestedTopicsResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.topics.OnboardingTopicsViewModel$loadSuggestedTopics$1", f = "OnboardingTopicsViewModel.kt", l = {70}, m = "invokeSuspend")
/* compiled from: OnboardingTopicsViewModel.kt */
public final class OnboardingTopicsViewModel$loadSuggestedTopics$1 extends SuspendLambda implements l<m0.l.c<? super OnboardingSuggestedTopicsResponse>, Object> {
    public int c;
    public final /* synthetic */ OnboardingTopicsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingTopicsViewModel$loadSuggestedTopics$1(OnboardingTopicsViewModel onboardingTopicsViewModel, m0.l.c<? super OnboardingTopicsViewModel$loadSuggestedTopics$1> cVar) {
        super(1, cVar);
        this.d = onboardingTopicsViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new OnboardingTopicsViewModel$loadSuggestedTopics$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new OnboardingTopicsViewModel$loadSuggestedTopics$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            OnboardingRepo onboardingRepo = this.d.o;
            this.c = 1;
            obj = onboardingRepo.f(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
