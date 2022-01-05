package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.ui.onboarding.ConnectSocialAccountsFragment;
import com.clubhouse.android.ui.onboarding.ConnectSocialAccountsFragment$advance$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ ConnectSocialAccountsFragment c;

    public /* synthetic */ n(ConnectSocialAccountsFragment connectSocialAccountsFragment) {
        this.c = connectSocialAccountsFragment;
    }

    public final void onClick(View view) {
        ConnectSocialAccountsFragment connectSocialAccountsFragment = this.c;
        k<Object>[] kVarArr = ConnectSocialAccountsFragment.Z1;
        i.e(connectSocialAccountsFragment, "this$0");
        ((AmplitudeAnalytics) v.l(connectSocialAccountsFragment)).a("Onboarding-Social-Done");
        v.v2(connectSocialAccountsFragment.O0(), new ConnectSocialAccountsFragment$advance$1(connectSocialAccountsFragment));
    }
}
