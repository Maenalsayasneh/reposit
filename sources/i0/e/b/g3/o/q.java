package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.android.ui.events.HalfEventFragment$buildEventsModels$1$1$1$3$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ HalfEventFragment c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ q(HalfEventFragment halfEventFragment, EventInClub eventInClub) {
        this.c = halfEventFragment;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        HalfEventFragment halfEventFragment = this.c;
        EventInClub eventInClub = this.d;
        i.e(halfEventFragment, "this$0");
        i.e(eventInClub, "$event");
        v.e(halfEventFragment, new HalfEventFragment$buildEventsModels$1$1$1$3$1(eventInClub, halfEventFragment));
    }
}
