package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.ui.events.EventsFragment;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ d c;

    public /* synthetic */ a(d dVar) {
        this.c = dVar;
    }

    public final void onClick(View view) {
        d dVar = this.c;
        k<Object>[] kVarArr = EventsFragment.Z1;
        i.e(dVar, "$alertDialog");
        dVar.dismiss();
    }
}
