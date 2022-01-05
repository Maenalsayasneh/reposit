package i0.e.b.g3.p.c0.e0;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import java.util.List;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ ImpressionTrackingEpoxyRecyclerView c;
    public final /* synthetic */ List d;
    public final /* synthetic */ EventInClub q;

    public /* synthetic */ g(ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView, List list, EventInClub eventInClub) {
        this.c = impressionTrackingEpoxyRecyclerView;
        this.d = list;
        this.q = eventInClub;
    }

    public final void run() {
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = this.c;
        List list = this.d;
        EventInClub eventInClub = this.q;
        i.e(impressionTrackingEpoxyRecyclerView, "$this_apply");
        i.e(list, "$events");
        i.e(eventInClub, "$event");
        impressionTrackingEpoxyRecyclerView.smoothScrollToPosition(list.indexOf(eventInClub) + 1);
    }
}
