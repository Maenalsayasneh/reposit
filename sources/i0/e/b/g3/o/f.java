package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.EventsFragment;
import h0.b0.v;
import i0.e.a.a;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.Pair;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ EventsFragment c;
    public final /* synthetic */ EventInClub d;
    public final /* synthetic */ EventsFragment.PagingController q;

    public /* synthetic */ f(EventsFragment eventsFragment, EventInClub eventInClub, EventsFragment.PagingController pagingController) {
        this.c = eventsFragment;
        this.d = eventInClub;
        this.q = pagingController;
    }

    public final void onClick(View view) {
        boolean z;
        EventsFragment eventsFragment = this.c;
        EventInClub eventInClub = this.d;
        EventsFragment.PagingController pagingController = this.q;
        i.e(eventsFragment, "this$0");
        i.e(eventInClub, "$event");
        i.e(pagingController, "this$1");
        a l = v.l(eventsFragment);
        Boolean bool = eventInClub.x;
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        ((AmplitudeAnalytics) l).b("Bulletin-Tapped-Subscribe", h.S2(new Pair("subscribed", Boolean.valueOf(z))));
        k<Object>[] kVarArr = EventsFragment.Z1;
        eventsFragment.P0().p(new p0(eventInClub, (Map) null, 2));
        if ((view instanceof RSVPButton) && i.a(eventInClub.x, Boolean.FALSE)) {
            pagingController.showTooltipIfNeeded(view);
        }
    }
}
