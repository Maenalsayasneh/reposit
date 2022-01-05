package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.WaitlistViewModel$checkWaitlistStatus$1", f = "WaitlistViewModel.kt", l = {50}, m = "invokeSuspend")
/* compiled from: WaitlistViewModel.kt */
public final class WaitlistViewModel$checkWaitlistStatus$1 extends SuspendLambda implements l<m0.l.c<? super CompletePhoneNumberAuthResponse>, Object> {
    public int c;
    public final /* synthetic */ WaitlistViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaitlistViewModel$checkWaitlistStatus$1(WaitlistViewModel waitlistViewModel, m0.l.c<? super WaitlistViewModel$checkWaitlistStatus$1> cVar) {
        super(1, cVar);
        this.d = waitlistViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new WaitlistViewModel$checkWaitlistStatus$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new WaitlistViewModel$checkWaitlistStatus$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            OnboardingRepo onboardingRepo = this.d.m;
            this.c = 1;
            obj = onboardingRepo.c(this);
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
