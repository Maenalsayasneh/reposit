package i0.e.b.g3.p.c0.e0;

import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import i0.e.b.b3.b.e.m;
import java.util.List;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ ImpressionTrackingEpoxyRecyclerView c;
    public final /* synthetic */ List d;
    public final /* synthetic */ m q;

    public /* synthetic */ l(ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView, List list, m mVar) {
        this.c = impressionTrackingEpoxyRecyclerView;
        this.d = list;
        this.q = mVar;
    }

    public final void run() {
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = this.c;
        List list = this.d;
        m mVar = this.q;
        i.e(impressionTrackingEpoxyRecyclerView, "$this_apply");
        i.e(list, "$users");
        i.e(mVar, "$user");
        impressionTrackingEpoxyRecyclerView.smoothScrollToPosition(list.indexOf(mVar) + 1);
    }
}
