package i0.e.b.g3.l.x2;

import android.view.View;
import com.clubhouse.android.ui.clubs.invites.GrowClubArgs;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import h0.b0.v;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ GrowClubFragment c;

    public /* synthetic */ a(GrowClubFragment growClubFragment) {
        this.c = growClubFragment;
    }

    public final void onClick(View view) {
        GrowClubFragment growClubFragment = this.c;
        i.e(growClubFragment, "this$0");
        k<Object>[] kVarArr = GrowClubFragment.Z1;
        GrowClubArgs O0 = growClubFragment.O0();
        i.e(O0, "mavericksArg");
        v.a1(growClubFragment, new q(O0), (q) null, 2);
    }
}
