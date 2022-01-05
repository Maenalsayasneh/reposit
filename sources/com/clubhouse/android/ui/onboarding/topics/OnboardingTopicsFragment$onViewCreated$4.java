package com.clubhouse.android.ui.onboarding.topics;

import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.g3.r.a3.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.topics.OnboardingTopicsFragment$onViewCreated$4", f = "OnboardingTopicsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: OnboardingTopicsFragment.kt */
public final class OnboardingTopicsFragment$onViewCreated$4 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ OnboardingTopicsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingTopicsFragment$onViewCreated$4(OnboardingTopicsFragment onboardingTopicsFragment, m0.l.c<? super OnboardingTopicsFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = onboardingTopicsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        OnboardingTopicsFragment$onViewCreated$4 onboardingTopicsFragment$onViewCreated$4 = new OnboardingTopicsFragment$onViewCreated$4(this.d, cVar);
        onboardingTopicsFragment$onViewCreated$4.c = obj;
        return onboardingTopicsFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        OnboardingTopicsFragment$onViewCreated$4 onboardingTopicsFragment$onViewCreated$4 = new OnboardingTopicsFragment$onViewCreated$4(this.d, (m0.l.c) obj2);
        onboardingTopicsFragment$onViewCreated$4.c = (b) obj;
        i iVar = i.a;
        onboardingTopicsFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (bVar instanceof d) {
            v.b1(this.d, ((d) bVar).a);
        }
        return i.a;
    }
}
