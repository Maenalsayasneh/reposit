package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ t c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ d(t tVar, EventInClub eventInClub) {
        this.c = tVar;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        t tVar = this.c;
        EventInClub eventInClub = this.d;
        i.e(tVar, "this$0");
        i.e(eventInClub, "$event");
        l<? super EventInClub, m0.i> lVar = tVar.m;
        if (lVar != null) {
            lVar.invoke(eventInClub);
        }
    }
}
