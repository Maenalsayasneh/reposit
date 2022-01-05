package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.HalfClubRulesArgs;
import com.clubhouse.android.ui.clubs.HalfClubRulesFragment;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.android.ui.events.HalfEventFragment$handleClubRulesOnJoin$1;
import h0.t.q;
import i0.e.b.a3.b.b;
import i0.e.b.a3.f.j;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class v implements View.OnClickListener {
    public final /* synthetic */ HalfEventFragment c;
    public final /* synthetic */ j d;
    public final /* synthetic */ b q;

    public /* synthetic */ v(HalfEventFragment halfEventFragment, j jVar, b bVar) {
        this.c = halfEventFragment;
        this.d = jVar;
        this.q = bVar;
    }

    public final void onClick(View view) {
        HalfEventFragment halfEventFragment = this.c;
        j jVar = this.d;
        b bVar = this.q;
        i.e(halfEventFragment, "this$0");
        i.e(jVar, "$this_showBanner");
        i.e(bVar, "$it");
        Club club = ((t0) bVar).a;
        HalfEventFragment.b bVar2 = HalfEventFragment.p2;
        List<ClubRule> b0 = club.b0();
        if (b0 == null || b0.isEmpty()) {
            halfEventFragment.V0().p(new x(club.getId()));
            jVar.dismiss();
            return;
        }
        Objects.requireNonNull(HalfClubRulesFragment.p2);
        h0.b0.v.p0(halfEventFragment, HalfClubRulesFragment.r2, new HalfEventFragment$handleClubRulesOnJoin$1(halfEventFragment, club, jVar));
        HalfClubRulesArgs halfClubRulesArgs = new HalfClubRulesArgs(club, Boolean.TRUE, (String) null, SourceLocation.BULLETIN_EVENT, (Map) null, 20);
        i.e(halfClubRulesArgs, "mavericksArg");
        h0.b0.v.a1(halfEventFragment, new j0(halfClubRulesArgs), (q) null, 2);
    }
}
