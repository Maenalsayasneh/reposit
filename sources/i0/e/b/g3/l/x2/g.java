package i0.e.b.g3.l.x2;

import android.view.View;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment$handleBackNavigation$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ GrowClubFragment c;

    public /* synthetic */ g(GrowClubFragment growClubFragment) {
        this.c = growClubFragment;
    }

    public final void onClick(View view) {
        GrowClubFragment growClubFragment = this.c;
        k<Object>[] kVarArr = GrowClubFragment.Z1;
        i.e(growClubFragment, "this$0");
        v.v2(growClubFragment.R0(), new GrowClubFragment$handleBackNavigation$1(growClubFragment));
    }
}
