package i0.e.b.g3.l.x2;

import android.content.Context;
import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment$buildUser$2$1$1;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment$buildUser$2$1$2;
import h0.b0.v;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.l.v1;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ GrowClubFragment c;
    public final /* synthetic */ m d;
    public final /* synthetic */ v1 q;

    public /* synthetic */ f(GrowClubFragment growClubFragment, m mVar, v1 v1Var) {
        this.c = growClubFragment;
        this.d = mVar;
        this.q = v1Var;
    }

    public final void onClick(View view) {
        String str;
        GrowClubFragment growClubFragment = this.c;
        m mVar = this.d;
        v1 v1Var = this.q;
        i.e(growClubFragment, "this$0");
        i.e(mVar, "$item");
        i.e(v1Var, "$clubState");
        Context requireContext = growClubFragment.requireContext();
        i.d(requireContext, "requireContext()");
        String str2 = mVar.g.y;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        ClubWithAdmin clubWithAdmin = v1Var.i;
        if (!(clubWithAdmin == null || (str = clubWithAdmin.y) == null)) {
            str3 = str;
        }
        v.g2(growClubFragment, requireContext, str2, str3, new GrowClubFragment$buildUser$2$1$1(growClubFragment, mVar), new GrowClubFragment$buildUser$2$1$2(growClubFragment, mVar));
    }
}
