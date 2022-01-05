package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.hallway.feed.viewholder.HallwayEventsView;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ HallwayEventsView c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ h(HallwayEventsView hallwayEventsView, EventInClub eventInClub) {
        this.c = hallwayEventsView;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        HallwayEventsView hallwayEventsView = this.c;
        EventInClub eventInClub = this.d;
        i.e(hallwayEventsView, "this$0");
        i.e(eventInClub, "$event");
        HallwayEventsView.b bVar = hallwayEventsView.l;
        if (bVar != null) {
            bVar.a(eventInClub);
        }
    }
}
