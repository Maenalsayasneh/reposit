package com.clubhouse.android.ui.onboarding.clubs;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.g3.r.z2.h;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: OnboardingClubsViewModel.kt */
public final class OnboardingClubsViewModel$joinClub$2 extends Lambda implements p<h, b<? extends JoinClubResponse>, h> {
    public final /* synthetic */ OnboardingClubsViewModel c;
    public final /* synthetic */ Club d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsViewModel$joinClub$2(OnboardingClubsViewModel onboardingClubsViewModel, Club club) {
        super(2);
        this.c = onboardingClubsViewModel;
        this.d = club;
    }

    public Object invoke(Object obj, Object obj2) {
        h hVar = (h) obj;
        b bVar = (b) obj2;
        i.e(hVar, "$this$execute");
        i.e(bVar, "it");
        if (!(bVar instanceof c)) {
            return hVar;
        }
        OnboardingClubsViewModel onboardingClubsViewModel = this.c;
        onboardingClubsViewModel.o(new d(onboardingClubsViewModel.q.getString(R.string.join_club_error, new Object[]{this.d.getName()})));
        return h.copy$default(hVar, false, (List) null, (String) null, g.T(hVar.d, Integer.valueOf(this.d.getId())), 7, (Object) null);
    }
}
