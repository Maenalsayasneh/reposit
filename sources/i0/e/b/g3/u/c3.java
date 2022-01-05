package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.ui.profile.ProfileFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c3 implements View.OnClickListener {
    public final /* synthetic */ ProfileFragment c;

    public /* synthetic */ c3(ProfileFragment profileFragment) {
        this.c = profileFragment;
    }

    public final void onClick(View view) {
        ProfileFragment profileFragment = this.c;
        k<Object>[] kVarArr = ProfileFragment.Z1;
        i.e(profileFragment, "this$0");
        if (profileFragment.O0().m.isActivated()) {
            profileFragment.P0().p(s4.a);
        } else {
            profileFragment.Q0();
        }
    }
}
