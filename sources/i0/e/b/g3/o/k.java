package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.ui.events.EventsFragment;
import com.clubhouse.android.ui.events.EventsFragment$showEventsOptions$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ EventsFragment c;

    public /* synthetic */ k(EventsFragment eventsFragment) {
        this.c = eventsFragment;
    }

    public final void onClick(View view) {
        EventsFragment eventsFragment = this.c;
        m0.r.k<Object>[] kVarArr = EventsFragment.Z1;
        i.e(eventsFragment, "this$0");
        v.v2(eventsFragment.P0(), new EventsFragment$showEventsOptions$1(eventsFragment));
    }
}
