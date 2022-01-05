package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.CollectPhoneNumberViewModel$validatePhoneNumber$2", f = "CollectPhoneNumberViewModel.kt", l = {61}, m = "invokeSuspend")
/* compiled from: CollectPhoneNumberViewModel.kt */
public final class CollectPhoneNumberViewModel$validatePhoneNumber$2 extends SuspendLambda implements l<m0.l.c<? super StartPhoneNumberAuthResponse>, Object> {
    public int c;
    public final /* synthetic */ CollectPhoneNumberViewModel d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectPhoneNumberViewModel$validatePhoneNumber$2(CollectPhoneNumberViewModel collectPhoneNumberViewModel, String str, m0.l.c<? super CollectPhoneNumberViewModel$validatePhoneNumber$2> cVar) {
        super(1, cVar);
        this.d = collectPhoneNumberViewModel;
        this.q = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new CollectPhoneNumberViewModel$validatePhoneNumber$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new CollectPhoneNumberViewModel$validatePhoneNumber$2(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            OnboardingRepo onboardingRepo = this.d.n;
            String str = this.q;
            this.c = 1;
            obj = onboardingRepo.l(str, Boolean.FALSE, this);
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
