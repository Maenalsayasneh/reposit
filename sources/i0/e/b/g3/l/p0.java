package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.HalfClubRulesArgs;
import h0.t.q;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class p0 implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    public /* synthetic */ p0(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        Boolean bool = Boolean.FALSE;
        i.e(clubFragment, "<this>");
        i.e(clubWithAdmin, "club");
        HalfClubRulesArgs halfClubRulesArgs = new HalfClubRulesArgs(clubWithAdmin, bool, "", SourceLocation.CLUB, (Map) null, 16);
        a.m(halfClubRulesArgs, "mavericksArg", halfClubRulesArgs, clubFragment, (q) null, 2);
    }
}
