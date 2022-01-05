package i0.e.b.g3.p.c0;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.events.HalfEventArgs;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.android.ui.hallway.feed.viewholder.HallwayEventsView;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.p.n;
import java.util.Map;
import m0.n.b.i;

/* compiled from: FeedFragment.kt */
public final class t implements HallwayEventsView.b {
    public final /* synthetic */ FeedFragment a;

    public t(FeedFragment feedFragment) {
        this.a = feedFragment;
    }

    public void a(EventInClub eventInClub) {
        i.e(eventInClub, "item");
        FeedFragment feedFragment = this.a;
        HalfEventArgs halfEventArgs = new HalfEventArgs((String) null, Integer.valueOf(eventInClub.Y1), (String) null, (String) null, (EventInClub) null, (SourceLocation) null, (Map) null, 125);
        i.e(halfEventArgs, "mavericksArg");
        v.a1(feedFragment, new n(halfEventArgs), (q) null, 2);
    }
}
