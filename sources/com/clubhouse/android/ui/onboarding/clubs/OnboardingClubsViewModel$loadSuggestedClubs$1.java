package com.clubhouse.android.ui.onboarding.clubs;

import com.clubhouse.android.data.models.remote.response.OnboardingSuggestedClubsResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsViewModel$loadSuggestedClubs$1", f = "OnboardingClubsViewModel.kt", l = {96}, m = "invokeSuspend")
/* compiled from: OnboardingClubsViewModel.kt */
public final class OnboardingClubsViewModel$loadSuggestedClubs$1 extends SuspendLambda implements l<m0.l.c<? super OnboardingSuggestedClubsResponse>, Object> {
    public int c;
    public final /* synthetic */ OnboardingClubsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsViewModel$loadSuggestedClubs$1(OnboardingClubsViewModel onboardingClubsViewModel, m0.l.c<? super OnboardingClubsViewModel$loadSuggestedClubs$1> cVar) {
        super(1, cVar);
        this.d = onboardingClubsViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new OnboardingClubsViewModel$loadSuggestedClubs$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new OnboardingClubsViewModel$loadSuggestedClubs$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            OnboardingRepo onboardingRepo = this.d.o;
            this.c = 1;
            obj = onboardingRepo.e(this);
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
