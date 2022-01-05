package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import i0.e.b.g3.p.c0.e0.t;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ t c;
    public final /* synthetic */ EventInClub d;
    public final /* synthetic */ t.a q;

    public /* synthetic */ f(t tVar, EventInClub eventInClub, t.a aVar) {
        this.c = tVar;
        this.d = eventInClub;
        this.q = aVar;
    }

    public final void onClick(View view) {
        t tVar = this.c;
        EventInClub eventInClub = this.d;
        t.a aVar = this.q;
        i.e(tVar, "this$0");
        i.e(eventInClub, "$event");
        i.e(aVar, "$this_bindBellIcon");
        p<? super EventInClub, ? super Boolean, m0.i> pVar = tVar.l;
        if (pVar != null) {
            pVar.invoke(eventInClub, Boolean.valueOf(aVar.b().b.isChecked()));
        }
    }
}
