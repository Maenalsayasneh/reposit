package com.clubhouse.android.ui.onboarding.clubs;

import com.clubhouse.android.data.models.local.club.Club;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.r.z2.d;
import i0.e.b.g3.r.z2.h;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: OnboardingClubsFragment.kt */
public final class OnboardingClubsFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ OnboardingClubsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsFragment$buildModels$1(OnboardingClubsFragment onboardingClubsFragment) {
        super(1);
        this.c = onboardingClubsFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        OnboardingClubsFragment onboardingClubsFragment = this.c;
        k<Object>[] kVarArr = OnboardingClubsFragment.Z1;
        OnboardingClubsViewModel O0 = onboardingClubsFragment.O0();
        final OnboardingClubsFragment onboardingClubsFragment2 = this.c;
        v.v2(O0, new l<h, i>() {
            public Object invoke(Object obj) {
                h hVar = (h) obj;
                m0.n.b.i.e(hVar, "state");
                List<Club> list = hVar.b;
                if (list != null) {
                    o oVar = o.this;
                    OnboardingClubsFragment onboardingClubsFragment = onboardingClubsFragment2;
                    for (Club club : list) {
                        i0.e.b.f3.m.b.h hVar2 = new i0.e.b.f3.m.b.h();
                        hVar2.N(new Number[]{Integer.valueOf(club.getId())});
                        hVar2.M(club);
                        hVar2.O(hVar.d.contains(Integer.valueOf(club.getId())));
                        hVar2.P(true);
                        hVar2.L(new d(onboardingClubsFragment, club));
                        oVar.add(hVar2);
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
