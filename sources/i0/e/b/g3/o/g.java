package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.EventsFragment;
import com.clubhouse.android.ui.events.EventsFragment$PagingController$addModels$1$1$2$1$3$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ EventsFragment c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ g(EventsFragment eventsFragment, EventInClub eventInClub) {
        this.c = eventsFragment;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        EventsFragment eventsFragment = this.c;
        EventInClub eventInClub = this.d;
        i.e(eventsFragment, "this$0");
        i.e(eventInClub, "$event");
        v.e(eventsFragment, new EventsFragment$PagingController$addModels$1$1$2$1$3$1(eventInClub, eventsFragment));
    }
}
