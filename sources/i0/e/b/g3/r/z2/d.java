package i0.e.b.g3.r.z2;

import android.view.View;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ OnboardingClubsFragment c;
    public final /* synthetic */ Club d;

    public /* synthetic */ d(OnboardingClubsFragment onboardingClubsFragment, Club club) {
        this.c = onboardingClubsFragment;
        this.d = club;
    }

    public final void onClick(View view) {
        OnboardingClubsFragment onboardingClubsFragment = this.c;
        Club club = this.d;
        i.e(onboardingClubsFragment, "this$0");
        i.e(club, "$club");
        k<Object>[] kVarArr = OnboardingClubsFragment.Z1;
        onboardingClubsFragment.O0().p(new i(club));
    }
}
