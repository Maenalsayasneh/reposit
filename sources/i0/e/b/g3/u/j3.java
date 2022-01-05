package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.ui.profile.ProfileFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class j3 implements View.OnClickListener {
    public final /* synthetic */ ProfileFragment c;

    public /* synthetic */ j3(ProfileFragment profileFragment) {
        this.c = profileFragment;
    }

    public final void onClick(View view) {
        ProfileFragment profileFragment = this.c;
        k<Object>[] kVarArr = ProfileFragment.Z1;
        i.e(profileFragment, "this$0");
        ((AmplitudeAnalytics) v.l(profileFragment)).a("Settings-Open");
        v.a1(profileFragment, new a(R.id.action_profileFragment_to_settingsFragment), (q) null, 2);
    }
}
