package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.WelcomeRoomViewModel$rejectWelcomeRoom$2", f = "WelcomeRoomViewModel.kt", l = {107}, m = "invokeSuspend")
/* compiled from: WelcomeRoomViewModel.kt */
public final class WelcomeRoomViewModel$rejectWelcomeRoom$2 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ WelcomeRoomViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeRoomViewModel$rejectWelcomeRoom$2(WelcomeRoomViewModel welcomeRoomViewModel, m0.l.c<? super WelcomeRoomViewModel$rejectWelcomeRoom$2> cVar) {
        super(1, cVar);
        this.d = welcomeRoomViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new WelcomeRoomViewModel$rejectWelcomeRoom$2(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new WelcomeRoomViewModel$rejectWelcomeRoom$2(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            OnboardingRepo onboardingRepo = this.d.m;
            this.c = 1;
            obj = onboardingRepo.j(this);
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
