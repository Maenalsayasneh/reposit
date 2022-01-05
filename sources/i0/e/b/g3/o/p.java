package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.android.ui.events.HalfEventFragment$rsvpEvent$1;
import h0.b0.v;
import i0.e.a.a;
import i0.j.f.p.h;
import kotlin.Pair;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ HalfEventFragment c;
    public final /* synthetic */ l0 d;
    public final /* synthetic */ EventInClub q;

    public /* synthetic */ p(HalfEventFragment halfEventFragment, l0 l0Var, EventInClub eventInClub) {
        this.c = halfEventFragment;
        this.d = l0Var;
        this.q = eventInClub;
    }

    public final void onClick(View view) {
        boolean z;
        HalfEventFragment halfEventFragment = this.c;
        l0 l0Var = this.d;
        EventInClub eventInClub = this.q;
        i.e(halfEventFragment, "this$0");
        i.e(l0Var, "$state");
        i.e(eventInClub, "$event");
        a l = v.l(halfEventFragment);
        Boolean bool = l0Var.c.x;
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        ((AmplitudeAnalytics) l).b("Bulletin-Sheet-Tapped-Subscribe", h.S2(new Pair("subscribed", Boolean.valueOf(z))));
        HalfEventFragment.b bVar = HalfEventFragment.p2;
        v.v2(halfEventFragment.V0(), new HalfEventFragment$rsvpEvent$1(halfEventFragment, eventInClub));
    }
}
