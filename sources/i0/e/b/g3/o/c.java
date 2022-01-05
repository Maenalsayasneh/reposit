package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.EventsFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.o.e0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ EventsFragment c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ c(EventsFragment eventsFragment, EventInClub eventInClub) {
        this.c = eventsFragment;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        EventsFragment eventsFragment = this.c;
        EventInClub eventInClub = this.d;
        i.e(eventsFragment, "this$0");
        i.e(eventInClub, "$event");
        AddEditEventArgs addEditEventArgs = new AddEditEventArgs(eventInClub);
        i.e(eventsFragment, "<this>");
        i.e(addEditEventArgs, "addEditEventArgs");
        i.e(addEditEventArgs, "mavericksArg");
        v.a1(eventsFragment, new e0.a(addEditEventArgs), (q) null, 2);
    }
}
