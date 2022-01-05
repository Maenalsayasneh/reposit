package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.OnboardingRepo", f = "OnboardingRepo.kt", l = {91, 94}, m = "validatePhoneNumberWithSinch")
/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$validatePhoneNumberWithSinch$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ OnboardingRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$validatePhoneNumberWithSinch$1(OnboardingRepo onboardingRepo, m0.l.c<? super OnboardingRepo$validatePhoneNumberWithSinch$1> cVar) {
        super(cVar);
        this.q = onboardingRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.r((String) null, (String) null, this);
    }
}
