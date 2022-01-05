package com.clubhouse.android.ui.onboarding.topics;

import com.clubhouse.android.data.models.local.Topic;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.k;

/* compiled from: OnboardingTopicsFragment.kt */
public final class OnboardingTopicsFragment$buildModels$1$1$1$1$1 extends Lambda implements a<Boolean> {
    public final /* synthetic */ OnboardingTopicsFragment c;
    public final /* synthetic */ Topic d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingTopicsFragment$buildModels$1$1$1$1$1(OnboardingTopicsFragment onboardingTopicsFragment, Topic topic) {
        super(0);
        this.c = onboardingTopicsFragment;
        this.d = topic;
    }

    public Object invoke() {
        OnboardingTopicsFragment onboardingTopicsFragment = this.c;
        k<Object>[] kVarArr = OnboardingTopicsFragment.Z1;
        onboardingTopicsFragment.O0().p(new i0.e.b.g3.m.g.a(this.d));
        return Boolean.TRUE;
    }
}
