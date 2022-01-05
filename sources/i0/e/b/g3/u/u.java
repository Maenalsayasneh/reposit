package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.android.ui.profile.HalfProfileUtil$showVerifyEmailPromptDialog$1;
import com.clubhouse.android.ui.profile.HalfProfileViewModel;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ UserProfile d;

    public /* synthetic */ u(HalfProfileFragment halfProfileFragment, UserProfile userProfile) {
        this.c = halfProfileFragment;
        this.d = userProfile;
    }

    public final void onClick(View view) {
        HalfProfileFragment halfProfileFragment = this.c;
        UserProfile userProfile = this.d;
        i.e(halfProfileFragment, "this$0");
        HalfProfileViewModel U0 = halfProfileFragment.U0();
        i.e(halfProfileFragment, "<this>");
        i.e(userProfile, "user");
        i.e(U0, "viewModel");
        ((AmplitudeAnalytics) v.l(halfProfileFragment)).a("CreateClub-Start");
        if (i.a(userProfile.m2, Boolean.FALSE)) {
            i.e(halfProfileFragment, "<this>");
            i.e(U0, "viewModel");
            DialogEditTextBinding inflate = DialogEditTextBinding.inflate(halfProfileFragment.getLayoutInflater());
            i.d(inflate, "inflate(layoutInflater)");
            HalfProfileUtil$showVerifyEmailPromptDialog$1 halfProfileUtil$showVerifyEmailPromptDialog$1 = new HalfProfileUtil$showVerifyEmailPromptDialog$1(inflate, U0);
            i.e(halfProfileFragment, "<this>");
            i.e(halfProfileUtil$showVerifyEmailPromptDialog$1, "f");
            d.a aVar = new d.a(halfProfileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showVerifyEmailPromptDialog$1.invoke(aVar);
            aVar.g();
            return;
        }
        U0.p(g5.a);
    }
}
