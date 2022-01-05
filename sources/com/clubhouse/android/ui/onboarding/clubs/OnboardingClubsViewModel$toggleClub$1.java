package com.clubhouse.android.ui.onboarding.clubs;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.club.Club;
import i0.e.b.g3.r.z2.h;
import i0.e.b.g3.r.z2.j;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: OnboardingClubsViewModel.kt */
public final class OnboardingClubsViewModel$toggleClub$1 extends Lambda implements l<h, i> {
    public final /* synthetic */ Club c;
    public final /* synthetic */ OnboardingClubsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsViewModel$toggleClub$1(Club club, OnboardingClubsViewModel onboardingClubsViewModel) {
        super(1);
        this.c = club;
        this.d = onboardingClubsViewModel;
    }

    public Object invoke(Object obj) {
        h hVar = (h) obj;
        m0.n.b.i.e(hVar, "state");
        if (hVar.d.contains(Integer.valueOf(this.c.getId()))) {
            OnboardingClubsViewModel onboardingClubsViewModel = this.d;
            Club club = this.c;
            Objects.requireNonNull(onboardingClubsViewModel);
            MavericksViewModel.f(onboardingClubsViewModel, new OnboardingClubsViewModel$leaveClub$1(onboardingClubsViewModel, club, (c<? super OnboardingClubsViewModel$leaveClub$1>) null), (d0) null, (m) null, new OnboardingClubsViewModel$leaveClub$2(onboardingClubsViewModel, club), 3, (Object) null);
        } else if (this.c.b0().isEmpty()) {
            OnboardingClubsViewModel onboardingClubsViewModel2 = this.d;
            Club club2 = this.c;
            Objects.requireNonNull(onboardingClubsViewModel2);
            MavericksViewModel.f(onboardingClubsViewModel2, new OnboardingClubsViewModel$joinClub$1(onboardingClubsViewModel2, club2, (c<? super OnboardingClubsViewModel$joinClub$1>) null), (d0) null, (m) null, new OnboardingClubsViewModel$joinClub$2(onboardingClubsViewModel2, club2), 3, (Object) null);
        } else {
            this.d.o(new j(this.c));
        }
        return i.a;
    }
}
