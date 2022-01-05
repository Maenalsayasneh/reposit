package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.ui.profile.HalfProfileUtil$showVerifyEmailPromptDialog$1;
import com.clubhouse.android.ui.profile.ProfileFragment;
import com.clubhouse.android.ui.profile.ProfileViewModel;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e3 implements View.OnClickListener {
    public final /* synthetic */ ProfileFragment c;
    public final /* synthetic */ UserProfile d;

    public /* synthetic */ e3(ProfileFragment profileFragment, UserProfile userProfile) {
        this.c = profileFragment;
        this.d = userProfile;
    }

    public final void onClick(View view) {
        ProfileFragment profileFragment = this.c;
        UserProfile userProfile = this.d;
        i.e(profileFragment, "this$0");
        ProfileViewModel P0 = profileFragment.P0();
        i.e(profileFragment, "<this>");
        i.e(userProfile, "user");
        i.e(P0, "viewModel");
        ((AmplitudeAnalytics) v.l(profileFragment)).a("CreateClub-Start");
        if (i.a(userProfile.m2, Boolean.FALSE)) {
            i.e(profileFragment, "<this>");
            i.e(P0, "viewModel");
            DialogEditTextBinding inflate = DialogEditTextBinding.inflate(profileFragment.getLayoutInflater());
            i.d(inflate, "inflate(layoutInflater)");
            HalfProfileUtil$showVerifyEmailPromptDialog$1 halfProfileUtil$showVerifyEmailPromptDialog$1 = new HalfProfileUtil$showVerifyEmailPromptDialog$1(inflate, P0);
            i.e(profileFragment, "<this>");
            i.e(halfProfileUtil$showVerifyEmailPromptDialog$1, "f");
            d.a aVar = new d.a(profileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showVerifyEmailPromptDialog$1.invoke(aVar);
            aVar.g();
            return;
        }
        P0.p(g5.a);
    }
}
