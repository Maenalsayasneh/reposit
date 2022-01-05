package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import com.clubhouse.android.ui.profile.ProfileFragment;
import h0.b0.v;
import i0.e.e.m.c;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class q3 implements View.OnClickListener {
    public final /* synthetic */ c c;
    public final /* synthetic */ ProfileFragment d;
    public final /* synthetic */ int q;

    public /* synthetic */ q3(c cVar, ProfileFragment profileFragment, int i) {
        this.c = cVar;
        this.d = profileFragment;
        this.q = i;
    }

    public final void onClick(View view) {
        c cVar = this.c;
        ProfileFragment profileFragment = this.d;
        int i = this.q;
        k<Object>[] kVarArr = ProfileFragment.Z1;
        i.e(cVar, "$this_apply");
        i.e(profileFragment, "this$0");
        cVar.a.d(cVar);
        i.e(profileFragment, "<this>");
        v.a2(profileFragment, new CreateChatArgs(SourceLocation.PROFILE, Integer.valueOf(i)));
    }
}
