package i0.e.b.g3.u.z5;

import android.view.View;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import com.clubhouse.android.ui.profile.settings.SettingsFragment$showLogoutConfirmationDialog$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class w implements View.OnClickListener {
    public final /* synthetic */ SettingsFragment c;

    public /* synthetic */ w(SettingsFragment settingsFragment) {
        this.c = settingsFragment;
    }

    public final void onClick(View view) {
        SettingsFragment settingsFragment = this.c;
        k<Object>[] kVarArr = SettingsFragment.Z1;
        i.e(settingsFragment, "this$0");
        SettingsFragment$showLogoutConfirmationDialog$1 settingsFragment$showLogoutConfirmationDialog$1 = new SettingsFragment$showLogoutConfirmationDialog$1(settingsFragment);
        i.e(settingsFragment, "<this>");
        i.e(settingsFragment$showLogoutConfirmationDialog$1, "f");
        d.a aVar = new d.a(settingsFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        settingsFragment$showLogoutConfirmationDialog$1.invoke(aVar);
        aVar.g();
    }
}
