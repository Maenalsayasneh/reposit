package defpackage;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.events.HalfEventArgs;
import com.clubhouse.android.ui.events.creation.AddEditEventArgs;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.android.ui.hallway.feed.FeedViewModel;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.o.p0;
import i0.e.b.g3.p.n;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* renamed from: u  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class u extends Lambda implements l<EventInClub, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            ((FeedFragment) this.d).N0().c(SourceLocation.HALLWAY, ((EventInClub) obj).h2);
            return i.a;
        } else if (i == 1) {
            EventInClub eventInClub = (EventInClub) obj;
            k<Object>[] kVarArr = FeedFragment.Z1;
            FeedViewModel P0 = ((FeedFragment) this.d).P0();
            m0.n.b.i.d(eventInClub, "event");
            P0.p(new p0(eventInClub, (Map) null, 2));
            return i.a;
        } else if (i == 2) {
            AddEditEventArgs addEditEventArgs = new AddEditEventArgs((EventInClub) obj);
            m0.n.b.i.e(addEditEventArgs, "mavericksArg");
            v.a1((FeedFragment) this.d, new i0.e.b.g3.p.k(addEditEventArgs), (q) null, 2);
            return i.a;
        } else if (i == 3) {
            HalfEventArgs halfEventArgs = new HalfEventArgs((String) null, (Integer) null, (String) null, (String) null, (EventInClub) obj, (SourceLocation) null, (Map) null, 111);
            m0.n.b.i.e(halfEventArgs, "mavericksArg");
            v.a1((FeedFragment) this.d, new n(halfEventArgs), (q) null, 2);
            return i.a;
        } else {
            throw null;
        }
    }
}
