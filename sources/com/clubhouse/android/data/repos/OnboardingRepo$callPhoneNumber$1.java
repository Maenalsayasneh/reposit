package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.OnboardingRepo", f = "OnboardingRepo.kt", l = {241}, m = "callPhoneNumber")
/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$callPhoneNumber$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ OnboardingRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$callPhoneNumber$1(OnboardingRepo onboardingRepo, m0.l.c<? super OnboardingRepo$callPhoneNumber$1> cVar) {
        super(cVar);
        this.q = onboardingRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.b((String) null, this);
    }
}
