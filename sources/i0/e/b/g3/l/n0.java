package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$buildHeaderModelForLeader$2$3$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class n0 implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    public /* synthetic */ n0(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        v.e(clubFragment, new ClubFragment$buildHeaderModelForLeader$2$3$1(clubWithAdmin, clubFragment));
    }
}
