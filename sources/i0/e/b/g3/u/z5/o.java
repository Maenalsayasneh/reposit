package i0.e.b.g3.u.z5;

import android.widget.CompoundButton;
import com.clubhouse.android.ui.profile.settings.NotificationSettingsFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class o implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ NotificationSettingsFragment a;

    public /* synthetic */ o(NotificationSettingsFragment notificationSettingsFragment) {
        this.a = notificationSettingsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationSettingsFragment notificationSettingsFragment = this.a;
        k<Object>[] kVarArr = NotificationSettingsFragment.Z1;
        i.e(notificationSettingsFragment, "this$0");
        if (compoundButton.isPressed()) {
            notificationSettingsFragment.O0().p(new t1(z));
        }
    }
}
