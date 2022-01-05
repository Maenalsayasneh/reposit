package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import h0.t.q;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class p0 implements View.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;

    public /* synthetic */ p0(HalfProfileFragment halfProfileFragment) {
        this.c = halfProfileFragment;
    }

    public final void onClick(View view) {
        HalfProfileFragment halfProfileFragment = this.c;
        i.e(halfProfileFragment, "$this_setUpViews");
        ((AmplitudeAnalytics) v.l(halfProfileFragment)).a("Settings-Open");
        v.a1(halfProfileFragment, new a(R.id.action_halfProfileFragment_to_settingsFragment), (q) null, 2);
    }
}
