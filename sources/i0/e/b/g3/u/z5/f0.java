package i0.e.b.g3.u.z5;

import android.net.Uri;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import h0.t.j;
import h0.t.q;
import h0.t.s;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ SettingsFragment c;

    public /* synthetic */ f0(SettingsFragment settingsFragment) {
        this.c = settingsFragment;
    }

    public final void onClick(View view) {
        SettingsFragment settingsFragment = this.c;
        i.e(settingsFragment, "this$0");
        i.f(settingsFragment, "$this$findNavController");
        NavController I0 = NavHostFragment.I0(settingsFragment);
        i.b(I0, "NavHostFragment.findNavController(this)");
        I0.i(new j(Uri.parse("clubhouse://onboarding"), (String) null, (String) null), (q) null, (s.a) null);
    }
}
