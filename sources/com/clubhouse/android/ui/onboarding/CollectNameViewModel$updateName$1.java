package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.CollectNameViewModel$updateName$1", f = "CollectNameViewModel.kt", l = {57}, m = "invokeSuspend")
/* compiled from: CollectNameViewModel.kt */
public final class CollectNameViewModel$updateName$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ CollectNameViewModel d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectNameViewModel$updateName$1(CollectNameViewModel collectNameViewModel, String str, m0.l.c<? super CollectNameViewModel$updateName$1> cVar) {
        super(1, cVar);
        this.d = collectNameViewModel;
        this.q = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new CollectNameViewModel$updateName$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new CollectNameViewModel$updateName$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            OnboardingRepo onboardingRepo = this.d.n;
            String str = this.q;
            this.c = 1;
            obj = onboardingRepo.n(str, this);
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
