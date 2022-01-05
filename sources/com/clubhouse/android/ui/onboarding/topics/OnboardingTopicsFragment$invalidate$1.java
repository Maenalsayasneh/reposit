package com.clubhouse.android.ui.onboarding.topics;

import android.widget.Button;
import android.widget.FrameLayout;
import com.clubhouse.app.R;
import i0.e.b.g3.r.a3.f;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: OnboardingTopicsFragment.kt */
public final class OnboardingTopicsFragment$invalidate$1 extends Lambda implements l<f, i> {
    public final /* synthetic */ OnboardingTopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingTopicsFragment$invalidate$1(OnboardingTopicsFragment onboardingTopicsFragment) {
        super(1);
        this.c = onboardingTopicsFragment;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        m0.n.b.i.e(fVar, "state");
        OnboardingTopicsFragment onboardingTopicsFragment = this.c;
        k<Object>[] kVarArr = OnboardingTopicsFragment.Z1;
        FrameLayout frameLayout = onboardingTopicsFragment.N0().c;
        m0.n.b.i.d(frameLayout, "binding.loading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(fVar.a));
        this.c.N0().g.setText(fVar.b);
        Button button = this.c.N0().b;
        m0.n.b.i.d(button, "binding.chooseButton");
        i0.e.b.d3.k.L(button, Boolean.valueOf(!fVar.f));
        this.c.N0().b.setText(this.c.getResources().getString(R.string.onboarding_topics_choose, new Object[]{Integer.valueOf(fVar.e - fVar.d.size())}));
        Button button2 = this.c.N0().d;
        m0.n.b.i.d(button2, "binding.nextButton");
        i0.e.b.d3.k.L(button2, Boolean.valueOf(fVar.f));
        Button button3 = this.c.N0().e;
        m0.n.b.i.d(button3, "binding.skipButton");
        i0.e.b.d3.k.L(button3, Boolean.valueOf(fVar.g));
        this.c.N0().f.g();
        return i.a;
    }
}
