package i0.e.b.g3.u.z5;

import android.view.View;
import android.widget.EditText;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.shared.preferences.DeviceSharedPreferences;
import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import com.clubhouse.android.ui.profile.settings.SettingsFragment$showApiOverrideDialog$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import i0.e.b.f3.k.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d0 implements View.OnClickListener {
    public final /* synthetic */ SettingsFragment c;

    public /* synthetic */ d0(SettingsFragment settingsFragment) {
        this.c = settingsFragment;
    }

    public final void onClick(View view) {
        SettingsFragment settingsFragment = this.c;
        i.e(settingsFragment, "this$0");
        k<Object>[] kVarArr = SettingsFragment.Z1;
        DialogEditTextBinding inflate = DialogEditTextBinding.inflate(settingsFragment.getLayoutInflater());
        EditText editText = inflate.b;
        DeviceSharedPreferences deviceSharedPreferences = settingsFragment.a2;
        if (deviceSharedPreferences != null) {
            editText.setText(a.c(deviceSharedPreferences, Key.API_OVERRIDE, (String) null, 2, (Object) null));
            inflate.b.setHint("0.0.0.0:5000");
            i.d(inflate, "inflate(layoutInflater).apply {\n            text.setText(devicePreferences.getApiOverride())\n            text.hint = \"0.0.0.0:5000\"\n        }");
            SettingsFragment$showApiOverrideDialog$1 settingsFragment$showApiOverrideDialog$1 = new SettingsFragment$showApiOverrideDialog$1(inflate, settingsFragment);
            i.e(settingsFragment, "<this>");
            i.e(settingsFragment$showApiOverrideDialog$1, "f");
            d.a aVar = new d.a(settingsFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            settingsFragment$showApiOverrideDialog$1.invoke(aVar);
            aVar.g();
            return;
        }
        i.m("devicePreferences");
        throw null;
    }
}
