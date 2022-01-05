package i0.e.b.g3.r;

import android.content.Intent;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.ui.onboarding.ConnectSocialAccountsFragment;
import h0.a.f.b;
import h0.b0.v;
import i0.e.b.g3.u.w4;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ ConnectSocialAccountsFragment c;

    public /* synthetic */ l(ConnectSocialAccountsFragment connectSocialAccountsFragment) {
        this.c = connectSocialAccountsFragment;
    }

    public final void onClick(View view) {
        ConnectSocialAccountsFragment connectSocialAccountsFragment = this.c;
        k<Object>[] kVarArr = ConnectSocialAccountsFragment.Z1;
        i.e(connectSocialAccountsFragment, "this$0");
        ((AmplitudeAnalytics) v.l(connectSocialAccountsFragment)).a("Onboarding-Social-Instagram-Tap");
        connectSocialAccountsFragment.O0().p(w4.a);
        b<Intent> bVar = connectSocialAccountsFragment.c2;
        if (bVar != null) {
            bVar.a(connectSocialAccountsFragment.O0().o.a(), (ActivityOptionsCompat) null);
        } else {
            i.m("getInstagramOAuthToken");
            throw null;
        }
    }
}
