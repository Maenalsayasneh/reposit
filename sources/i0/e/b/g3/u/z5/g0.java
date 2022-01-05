package i0.e.b.g3.u.z5;

import android.content.DialogInterface;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.shared.preferences.DeviceSharedPreferences;
import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class g0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsFragment c;
    public final /* synthetic */ DialogEditTextBinding d;

    public /* synthetic */ g0(SettingsFragment settingsFragment, DialogEditTextBinding dialogEditTextBinding) {
        this.c = settingsFragment;
        this.d = dialogEditTextBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsFragment settingsFragment = this.c;
        DialogEditTextBinding dialogEditTextBinding = this.d;
        i.e(settingsFragment, "this$0");
        i.e(dialogEditTextBinding, "$binding");
        DeviceSharedPreferences deviceSharedPreferences = settingsFragment.a2;
        if (deviceSharedPreferences != null) {
            String obj = dialogEditTextBinding.b.getText().toString();
            i.e(obj, "apiOverride");
            deviceSharedPreferences.i(Key.API_OVERRIDE, obj);
            dialogInterface.dismiss();
            return;
        }
        i.m("devicePreferences");
        throw null;
    }
}
