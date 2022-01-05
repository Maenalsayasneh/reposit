package com.clubhouse.android.ui.onboarding.clubs;

import com.clubhouse.android.data.models.local.club.Club;
import i0.e.b.g3.r.z2.e;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: OnboardingClubsFragment.kt */
public final class OnboardingClubsFragment$showClubRules$1 extends Lambda implements l<Boolean, i> {
    public final /* synthetic */ OnboardingClubsFragment c;
    public final /* synthetic */ Club d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsFragment$showClubRules$1(OnboardingClubsFragment onboardingClubsFragment, Club club) {
        super(1);
        this.c = onboardingClubsFragment;
        this.d = club;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            OnboardingClubsFragment onboardingClubsFragment = this.c;
            k<Object>[] kVarArr = OnboardingClubsFragment.Z1;
            onboardingClubsFragment.O0().p(new e(this.d));
        }
        return i.a;
    }
}
