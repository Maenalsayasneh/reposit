package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.EventsFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.o.e0;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ EventsFragment c;

    public /* synthetic */ j(EventsFragment eventsFragment) {
        this.c = eventsFragment;
    }

    public final void onClick(View view) {
        EventsFragment eventsFragment = this.c;
        k<Object>[] kVarArr = EventsFragment.Z1;
        i.e(eventsFragment, "this$0");
        ((AmplitudeAnalytics) v.l(eventsFragment)).a("Bulletin-Add-Event-Tapped");
        i.e(eventsFragment, "<this>");
        AddEditEventArgs addEditEventArgs = new AddEditEventArgs((EventInClub) null, 1);
        i.e(addEditEventArgs, "mavericksArg");
        v.a1(eventsFragment, new e0.a(addEditEventArgs), (q) null, 2);
    }
}
