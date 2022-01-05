package i0.e.b.g3.u.z5;

import android.widget.CompoundButton;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class t implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SettingsFragment a;

    public /* synthetic */ t(SettingsFragment settingsFragment) {
        this.a = settingsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SettingsFragment settingsFragment = this.a;
        k<Object>[] kVarArr = SettingsFragment.Z1;
        i.e(settingsFragment, "this$0");
        if (compoundButton.isPressed()) {
            settingsFragment.O0().p(new y1(z));
        }
    }
}
