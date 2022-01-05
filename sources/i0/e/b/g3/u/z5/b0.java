package i0.e.b.g3.u.z5;

import android.view.View;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import com.clubhouse.app.R;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ SettingsFragment c;

    public /* synthetic */ b0(SettingsFragment settingsFragment) {
        this.c = settingsFragment;
    }

    public final void onClick(View view) {
        SettingsFragment settingsFragment = this.c;
        k<Object>[] kVarArr = SettingsFragment.Z1;
        i.e(settingsFragment, "this$0");
        settingsFragment.P0(R.string.clubhouse_contact, R.string.faq);
    }
}
