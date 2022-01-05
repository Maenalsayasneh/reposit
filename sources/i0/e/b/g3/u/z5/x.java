package i0.e.b.g3.u.z5;

import android.view.View;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.ui.profile.settings.EditTopicsArgs;
import com.clubhouse.android.ui.profile.settings.SettingsFragment;
import h0.b0.v;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class x implements View.OnClickListener {
    public final /* synthetic */ SettingsFragment c;

    public /* synthetic */ x(SettingsFragment settingsFragment) {
        this.c = settingsFragment;
    }

    public final void onClick(View view) {
        SettingsFragment settingsFragment = this.c;
        k<Object>[] kVarArr = SettingsFragment.Z1;
        i.e(settingsFragment, "this$0");
        EditTopicsArgs editTopicsArgs = new EditTopicsArgs((Topic) null, 1);
        i.e(editTopicsArgs, "mavericksArg");
        v.a1(settingsFragment, new a1(editTopicsArgs), (q) null, 2);
    }
}
