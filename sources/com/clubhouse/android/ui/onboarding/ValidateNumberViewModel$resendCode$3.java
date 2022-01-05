package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.ValidateNumberViewModel$resendCode$3", f = "ValidateNumberViewModel.kt", l = {112}, m = "invokeSuspend")
/* compiled from: ValidateNumberViewModel.kt */
public final class ValidateNumberViewModel$resendCode$3 extends SuspendLambda implements l<m0.l.c<? super Boolean>, Object> {
    public int c;
    public final /* synthetic */ ValidateNumberViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberViewModel$resendCode$3(ValidateNumberViewModel validateNumberViewModel, m0.l.c<? super ValidateNumberViewModel$resendCode$3> cVar) {
        super(1, cVar);
        this.d = validateNumberViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ValidateNumberViewModel$resendCode$3(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new ValidateNumberViewModel$resendCode$3(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ValidateNumberViewModel validateNumberViewModel = this.d;
            OnboardingRepo onboardingRepo = validateNumberViewModel.n;
            String str = validateNumberViewModel.p;
            if (str != null) {
                this.c = 1;
                obj = onboardingRepo.k(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                m0.n.b.i.m("phoneNumber");
                throw null;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Boolean.valueOf(((EmptySuccessResponse) obj).a);
    }
}
