package i0.e.b.g3.w.j0;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ g c;
    public final /* synthetic */ EventInClub d;
    public final /* synthetic */ boolean q;

    public /* synthetic */ c(g gVar, EventInClub eventInClub, boolean z) {
        this.c = gVar;
        this.d = eventInClub;
        this.q = z;
    }

    public final void onClick(View view) {
        g gVar = this.c;
        EventInClub eventInClub = this.d;
        boolean z = this.q;
        i.e(gVar, "this$0");
        i.e(eventInClub, "$event");
        p<? super EventInClub, ? super Boolean, m0.i> pVar = gVar.k;
        if (pVar != null) {
            pVar.invoke(eventInClub, Boolean.valueOf(z));
        }
    }
}
