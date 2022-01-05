package i0.e.b.g3.u.z5;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ SettingsFragment c;

    public /* synthetic */ s(SettingsFragment settingsFragment) {
        this.c = settingsFragment;
    }

    public final void onClick(View view) {
        SettingsFragment settingsFragment = this.c;
        k<Object>[] kVarArr = SettingsFragment.Z1;
        i.e(settingsFragment, "this$0");
        Context requireContext = settingsFragment.requireContext();
        i.d(requireContext, "requireContext()");
        i.e(requireContext, "<this>");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", requireContext.getPackageName());
        requireContext.startActivity(intent);
    }
}
