package i0.e.b.g3.u.z5;

import android.view.View;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class l0 implements View.OnClickListener {
    public final /* synthetic */ SettingsFragment c;

    public /* synthetic */ l0(SettingsFragment settingsFragment) {
        this.c = settingsFragment;
    }

    public final void onClick(View view) {
        SettingsFragment settingsFragment = this.c;
        k<Object>[] kVarArr = SettingsFragment.Z1;
        i.e(settingsFragment, "this$0");
        v.a1(settingsFragment, new a(R.id.action_settingsFragment_to_accountFragment), (q) null, 2);
    }
}
