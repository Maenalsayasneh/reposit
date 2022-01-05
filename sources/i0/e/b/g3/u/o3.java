package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.ui.profile.ProfileFragment;
import com.clubhouse.android.ui.profile.ProfileFragment$showMenu$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class o3 implements View.OnClickListener {
    public final /* synthetic */ ProfileFragment c;

    public /* synthetic */ o3(ProfileFragment profileFragment) {
        this.c = profileFragment;
    }

    public final void onClick(View view) {
        ProfileFragment profileFragment = this.c;
        k<Object>[] kVarArr = ProfileFragment.Z1;
        i.e(profileFragment, "this$0");
        i.d(view, "it");
        i.e(view, "anchor");
        ((AmplitudeAnalytics) v.l(profileFragment)).a("ProfileOptions-Open");
        v.v2(profileFragment.P0(), new ProfileFragment$showMenu$1(profileFragment, view));
    }
}
