package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.ui.profile.ProfileFragment;
import i0.e.e.m.c;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class i3 implements View.OnClickListener {
    public final /* synthetic */ c c;
    public final /* synthetic */ ProfileFragment d;
    public final /* synthetic */ int q;
    public final /* synthetic */ String x;

    public /* synthetic */ i3(c cVar, ProfileFragment profileFragment, int i, String str) {
        this.c = cVar;
        this.d = profileFragment;
        this.q = i;
        this.x = str;
    }

    public final void onClick(View view) {
        c cVar = this.c;
        ProfileFragment profileFragment = this.d;
        int i = this.q;
        String str = this.x;
        k<Object>[] kVarArr = ProfileFragment.Z1;
        i.e(cVar, "$this_apply");
        i.e(profileFragment, "this$0");
        i.e(str, "$waveId");
        cVar.a.d(cVar);
        profileFragment.P0().p(new s3(i, str));
    }
}
