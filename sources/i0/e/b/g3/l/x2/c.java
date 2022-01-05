package i0.e.b.g3.l.x2;

import android.view.View;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import i0.e.b.b3.b.e.m;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ GrowClubFragment c;
    public final /* synthetic */ m d;

    public /* synthetic */ c(GrowClubFragment growClubFragment, m mVar) {
        this.c = growClubFragment;
        this.d = mVar;
    }

    public final void onClick(View view) {
        GrowClubFragment growClubFragment = this.c;
        m mVar = this.d;
        i.e(growClubFragment, "this$0");
        i.e(mVar, "$item");
        k<Object>[] kVarArr = GrowClubFragment.Z1;
        growClubFragment.R0().p(new i(mVar.g, (String) null, 2));
    }
}
