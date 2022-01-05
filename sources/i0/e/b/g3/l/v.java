package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$handleClubRulesOnAccept$1;
import com.clubhouse.android.ui.clubs.HalfClubRulesArgs;
import com.clubhouse.android.ui.clubs.HalfClubRulesFragment;
import h0.t.q;
import i0.d.a.a.a;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class v implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ GetClubResponse d;

    public /* synthetic */ v(ClubFragment clubFragment, GetClubResponse getClubResponse) {
        this.c = clubFragment;
        this.d = getClubResponse;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        GetClubResponse getClubResponse = this.d;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        i.e(getClubResponse, "$clubInfo");
        ClubWithAdmin clubWithAdmin = getClubResponse.c;
        List<ClubRule> list = clubWithAdmin.a2;
        if (list == null || list.isEmpty()) {
            clubFragment.T0().p(new b1(getClubResponse.c.x));
            return;
        }
        Objects.requireNonNull(HalfClubRulesFragment.p2);
        h0.b0.v.p0(clubFragment, HalfClubRulesFragment.r2, new ClubFragment$handleClubRulesOnAccept$1(clubFragment, clubWithAdmin));
        Boolean valueOf = Boolean.valueOf(getClubResponse.y);
        i.e(clubFragment, "<this>");
        i.e(clubWithAdmin, "club");
        HalfClubRulesArgs halfClubRulesArgs = new HalfClubRulesArgs(clubWithAdmin, valueOf, "", SourceLocation.CLUB, (Map) null, 16);
        a.m(halfClubRulesArgs, "mavericksArg", halfClubRulesArgs, clubFragment, (q) null, 2);
    }
}
