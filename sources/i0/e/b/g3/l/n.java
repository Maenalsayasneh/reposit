package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.invites.GrowClubArgs;
import com.clubhouse.android.ui.clubs.invites.GrowClubMethod;
import com.clubhouse.android.ui.clubs.invites.GrowClubSource;
import h0.b0.v;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    public /* synthetic */ n(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        int i = clubWithAdmin.x;
        GrowClubMethod growClubMethod = GrowClubMethod.NOMINATION;
        i.e(clubFragment, "<this>");
        i.e(growClubMethod, "method");
        GrowClubArgs growClubArgs = new GrowClubArgs(i, growClubMethod, GrowClubSource.CLUB);
        i.e(growClubArgs, "mavericksArg");
        v.a1(clubFragment, new j1(growClubArgs), (q) null, 2);
    }
}
