package com.clubhouse.android.ui.onboarding.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.OnboardingSuggestedClubsResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.e.b.g3.r.z2.h;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: OnboardingClubsViewModel.kt */
public final class OnboardingClubsViewModel$loadSuggestedClubs$2 extends Lambda implements p<h, b<? extends OnboardingSuggestedClubsResponse>, h> {
    public final /* synthetic */ OnboardingClubsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsViewModel$loadSuggestedClubs$2(OnboardingClubsViewModel onboardingClubsViewModel) {
        super(2);
        this.c = onboardingClubsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        List<ClubWithAdmin> list;
        String str;
        h hVar = (h) obj;
        b bVar = (b) obj2;
        i.e(hVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof c) {
            OnboardingClubsViewModel.q(this.c);
        }
        OnboardingSuggestedClubsResponse onboardingSuggestedClubsResponse = (OnboardingSuggestedClubsResponse) bVar.a();
        if (onboardingSuggestedClubsResponse == null) {
            list = null;
        } else {
            list = onboardingSuggestedClubsResponse.a;
        }
        boolean z = bVar instanceof f;
        OnboardingSuggestedClubsResponse onboardingSuggestedClubsResponse2 = (OnboardingSuggestedClubsResponse) bVar.a();
        if (onboardingSuggestedClubsResponse2 == null) {
            str = null;
        } else {
            str = onboardingSuggestedClubsResponse2.b;
        }
        return h.copy$default(hVar, z, list, str, (Set) null, 8, (Object) null);
    }
}
