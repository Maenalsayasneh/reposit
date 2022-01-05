package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.events.EventsFragment;
import com.clubhouse.android.ui.events.HalfEventArgs;
import h0.b0.v;
import h0.t.q;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ EventsFragment c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ e(EventsFragment eventsFragment, EventInClub eventInClub) {
        this.c = eventsFragment;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        EventsFragment eventsFragment = this.c;
        EventInClub eventInClub = this.d;
        i.e(eventsFragment, "this$0");
        i.e(eventInClub, "$event");
        i.e(eventsFragment, "<this>");
        i.e(eventInClub, "event");
        v.a1(eventsFragment, e0.a.a(new HalfEventArgs((String) null, (Integer) null, (String) null, (String) null, eventInClub, (SourceLocation) null, (Map) null, 111)), (q) null, 2);
    }
}
