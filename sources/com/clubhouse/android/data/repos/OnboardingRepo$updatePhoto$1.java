package com.clubhouse.android.data.repos;

import i0.e.b.b3.b.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.OnboardingRepo", f = "OnboardingRepo.kt", l = {201}, m = "updatePhoto")
/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$updatePhoto$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ OnboardingRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$updatePhoto$1(OnboardingRepo onboardingRepo, m0.l.c<? super OnboardingRepo$updatePhoto$1> cVar) {
        super(cVar);
        this.q = onboardingRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.o((d) null, this);
    }
}
