package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventArgs;
import h0.b0.v;
import h0.t.q;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ HalfEventFragment c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ t(HalfEventFragment halfEventFragment, EventInClub eventInClub) {
        this.c = halfEventFragment;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        HalfEventFragment halfEventFragment = this.c;
        EventInClub eventInClub = this.d;
        i.e(halfEventFragment, "this$0");
        i.e(eventInClub, "$event");
        AddEditEventArgs addEditEventArgs = new AddEditEventArgs(eventInClub);
        i.e(halfEventFragment, "<this>");
        i.e(addEditEventArgs, "addEditEventArgs");
        i.e(addEditEventArgs, "mavericksArg");
        v.a1(halfEventFragment, new i0(addEditEventArgs), (q) null, 2);
    }
}
