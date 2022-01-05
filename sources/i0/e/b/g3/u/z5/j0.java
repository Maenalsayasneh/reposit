package i0.e.b.g3.u.z5;

import android.content.DialogInterface;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class j0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsFragment c;

    public /* synthetic */ j0(SettingsFragment settingsFragment) {
        this.c = settingsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsFragment settingsFragment = this.c;
        i.e(settingsFragment, "this$0");
        settingsFragment.O0().p(w0.a);
        dialogInterface.dismiss();
    }
}
