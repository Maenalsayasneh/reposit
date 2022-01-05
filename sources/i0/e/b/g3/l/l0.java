package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$navigateToMemberSearch$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class l0 implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;

    public /* synthetic */ l0(ClubFragment clubFragment) {
        this.c = clubFragment;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        v.v2(clubFragment.T0(), new ClubFragment$navigateToMemberSearch$1(clubFragment));
    }
}
