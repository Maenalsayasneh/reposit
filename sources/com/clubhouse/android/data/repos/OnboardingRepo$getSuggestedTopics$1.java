package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.OnboardingRepo", f = "OnboardingRepo.kt", l = {222}, m = "getSuggestedTopics")
/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$getSuggestedTopics$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ OnboardingRepo d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$getSuggestedTopics$1(OnboardingRepo onboardingRepo, m0.l.c<? super OnboardingRepo$getSuggestedTopics$1> cVar) {
        super(cVar);
        this.d = onboardingRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
