package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.ui.clubs.HalfClubRulesFragment;
import h0.b0.v;
import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class y0 implements View.OnClickListener {
    public final /* synthetic */ HalfClubRulesFragment c;

    public /* synthetic */ y0(HalfClubRulesFragment halfClubRulesFragment) {
        this.c = halfClubRulesFragment;
    }

    public final void onClick(View view) {
        HalfClubRulesFragment halfClubRulesFragment = this.c;
        HalfClubRulesFragment.a aVar = HalfClubRulesFragment.p2;
        i.e(halfClubRulesFragment, "this$0");
        ((AmplitudeAnalytics) v.l(halfClubRulesFragment)).b("Clubs-ViewedRules-Prompt-Accepted", a.m1("ClubId", Integer.valueOf(halfClubRulesFragment.U0().c.getId())));
        halfClubRulesFragment.W0().p(e2.a);
    }
}
