package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import h0.b0.v;
import i0.e.b.g3.r.p2;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.ValidateNumberViewModel$validateCode$1", f = "ValidateNumberViewModel.kt", l = {72}, m = "invokeSuspend")
/* compiled from: ValidateNumberViewModel.kt */
public final class ValidateNumberViewModel$validateCode$1 extends SuspendLambda implements l<m0.l.c<? super p2>, Object> {
    public Object c;
    public int d;
    public final /* synthetic */ ValidateNumberViewModel q;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberViewModel$validateCode$1(ValidateNumberViewModel validateNumberViewModel, String str, m0.l.c<? super ValidateNumberViewModel$validateCode$1> cVar) {
        super(1, cVar);
        this.q = validateNumberViewModel;
        this.x = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ValidateNumberViewModel$validateCode$1(this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ValidateNumberViewModel$validateCode$1(this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        ValidateNumberViewModel validateNumberViewModel;
        boolean z;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.d;
        String str = null;
        if (i2 == 0) {
            h.d4(obj);
            ValidateNumberViewModel validateNumberViewModel2 = this.q;
            OnboardingRepo onboardingRepo = validateNumberViewModel2.n;
            String str2 = this.x;
            String str3 = validateNumberViewModel2.p;
            if (str3 != null) {
                this.c = validateNumberViewModel2;
                this.d = 1;
                Object q2 = onboardingRepo.q(str2, str3, this);
                if (q2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                validateNumberViewModel = validateNumberViewModel2;
                obj = q2;
            } else {
                m0.n.b.i.m("phoneNumber");
                throw null;
            }
        } else if (i2 == 1) {
            validateNumberViewModel = (ValidateNumberViewModel) this.c;
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CompletePhoneNumberAuthResponse completePhoneNumberAuthResponse = (CompletePhoneNumberAuthResponse) obj;
        int i3 = ValidateNumberViewModel.m;
        Objects.requireNonNull(validateNumberViewModel);
        Boolean bool = completePhoneNumberAuthResponse.h;
        boolean z2 = false;
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        Boolean bool2 = completePhoneNumberAuthResponse.b;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        }
        boolean z3 = z2;
        BasicUser basicUser = completePhoneNumberAuthResponse.d;
        if (basicUser != null) {
            str = basicUser.q;
        }
        String str4 = str;
        Integer num = completePhoneNumberAuthResponse.c;
        if (num == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = num.intValue();
        }
        return new p2(z, z3, str4, i, v.l0(validateNumberViewModel.o, completePhoneNumberAuthResponse, Boolean.FALSE));
    }
}
