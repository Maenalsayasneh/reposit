package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.OnboardingRepo", f = "OnboardingRepo.kt", l = {113, 121}, m = "attestAndBuildValidationRequest")
/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$attestAndBuildValidationRequest$1 extends ContinuationImpl {
    public boolean Y1;
    public /* synthetic */ Object Z1;
    public final /* synthetic */ OnboardingRepo a2;
    public int b2;
    public Object c;
    public Object d;
    public Object q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$attestAndBuildValidationRequest$1(OnboardingRepo onboardingRepo, m0.l.c<? super OnboardingRepo$attestAndBuildValidationRequest$1> cVar) {
        super(cVar);
        this.a2 = onboardingRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.Z1 = obj;
        this.b2 |= Integer.MIN_VALUE;
        return this.a2.a((String) null, (String) null, (String) null, this);
    }
}
