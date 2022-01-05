package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$buildHeaderModelForAdmin$2$2$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    public /* synthetic */ r(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        v.v2(clubFragment.T0(), new ClubFragment$buildHeaderModelForAdmin$2$2$1(clubFragment, clubWithAdmin));
    }
}
