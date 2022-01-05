package com.clubhouse.android.ui.onboarding.clubs;

import android.widget.Button;
import android.widget.FrameLayout;
import com.clubhouse.app.R;
import i0.e.b.g3.r.z2.h;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: OnboardingClubsFragment.kt */
public final class OnboardingClubsFragment$invalidate$1 extends Lambda implements l<h, i> {
    public final /* synthetic */ OnboardingClubsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsFragment$invalidate$1(OnboardingClubsFragment onboardingClubsFragment) {
        super(1);
        this.c = onboardingClubsFragment;
    }

    public Object invoke(Object obj) {
        h hVar = (h) obj;
        m0.n.b.i.e(hVar, "state");
        OnboardingClubsFragment onboardingClubsFragment = this.c;
        k<Object>[] kVarArr = OnboardingClubsFragment.Z1;
        FrameLayout frameLayout = onboardingClubsFragment.N0().c;
        m0.n.b.i.d(frameLayout, "binding.loading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(hVar.a));
        this.c.N0().g.setText(hVar.c);
        Button button = this.c.N0().b;
        m0.n.b.i.d(button, "binding.chooseButton");
        i0.e.b.d3.k.L(button, Boolean.valueOf(hVar.e));
        this.c.N0().b.setText(this.c.getResources().getString(R.string.onboarding_clubs_join, new Object[]{Integer.valueOf(hVar.d.size())}));
        Button button2 = this.c.N0().d;
        m0.n.b.i.d(button2, "binding.nextButton");
        i0.e.b.d3.k.L(button2, Boolean.valueOf(!hVar.e));
        Button button3 = this.c.N0().e;
        m0.n.b.i.d(button3, "binding.skipButton");
        i0.e.b.d3.k.L(button3, Boolean.valueOf(hVar.f));
        this.c.N0().f.g();
        return i.a;
    }
}
