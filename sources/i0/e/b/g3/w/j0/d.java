package i0.e.b.g3.w.j0;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ g c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ d(g gVar, EventInClub eventInClub) {
        this.c = gVar;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        g gVar = this.c;
        EventInClub eventInClub = this.d;
        i.e(gVar, "this$0");
        i.e(eventInClub, "$event");
        l<? super EventInClub, m0.i> lVar = gVar.l;
        if (lVar != null) {
            lVar.invoke(eventInClub);
        }
    }
}
