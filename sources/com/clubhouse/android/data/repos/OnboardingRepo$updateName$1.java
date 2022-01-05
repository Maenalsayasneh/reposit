package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.OnboardingRepo", f = "OnboardingRepo.kt", l = {157}, m = "updateName")
/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$updateName$1 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ OnboardingRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$updateName$1(OnboardingRepo onboardingRepo, m0.l.c<? super OnboardingRepo$updateName$1> cVar) {
        super(cVar);
        this.x = onboardingRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.n((String) null, this);
    }
}
