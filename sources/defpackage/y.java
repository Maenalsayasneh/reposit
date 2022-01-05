package defpackage;

import android.content.Context;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.android.ui.hallway.feed.FeedFragment$buildModels$1$1$2$7$4$1;
import com.clubhouse.android.ui.hallway.feed.FeedFragment$buildModels$1$1$2$7$4$2;
import com.clubhouse.android.ui.hallway.feed.FeedViewModel;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.p.c0.a0;
import i0.e.b.g3.p.c0.w;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* renamed from: y  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class y extends Lambda implements l<Club, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            ((FeedFragment) this.d).N0().c(SourceLocation.HALLWAY, ((Club) obj).c());
            return i.a;
        } else if (i == 1) {
            ClubArgs clubArgs = new ClubArgs(Integer.valueOf(((Club) obj).getId()), (String) null, (String) null, false, false, SourceLocation.HALLWAY, (Map) null, 94);
            m0.n.b.i.e(clubArgs, "mavericksArg");
            v.a1((FeedFragment) this.d, new i0.e.b.g3.p.l(clubArgs), (q) null, 2);
            return i.a;
        } else if (i == 2) {
            Club club = (Club) obj;
            k<Object>[] kVarArr = FeedFragment.Z1;
            FeedViewModel P0 = ((FeedFragment) this.d).P0();
            m0.n.b.i.d(club, "club");
            P0.p(new w(club, (String) null, 2));
            return i.a;
        } else if (i == 3) {
            Club club2 = (Club) obj;
            FeedFragment feedFragment = (FeedFragment) this.d;
            Context requireContext = feedFragment.requireContext();
            m0.n.b.i.d(requireContext, "requireContext()");
            v.d2(feedFragment, requireContext, club2.getName(), new FeedFragment$buildModels$1$1$2$7$4$1((FeedFragment) this.d, club2), new FeedFragment$buildModels$1$1$2$7$4$2((FeedFragment) this.d, club2));
            return i.a;
        } else if (i == 4) {
            Club club3 = (Club) obj;
            k<Object>[] kVarArr2 = FeedFragment.Z1;
            FeedViewModel P02 = ((FeedFragment) this.d).P0();
            m0.n.b.i.d(club3, "club");
            P02.p(new a0(club3));
            return i.a;
        } else {
            throw null;
        }
    }
}
