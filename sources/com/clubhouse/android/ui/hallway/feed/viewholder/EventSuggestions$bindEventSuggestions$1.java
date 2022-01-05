package com.clubhouse.android.ui.hallway.feed.viewholder;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.b.a.o;
import i0.e.b.g3.p.c0.e0.v;
import i0.e.b.g3.p.c0.e0.w;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EventSuggestions.kt */
public final class EventSuggestions$bindEventSuggestions$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ w c;
    public final /* synthetic */ w.a d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventSuggestions$bindEventSuggestions$1(w wVar, w.a aVar) {
        super(1);
        this.c = wVar;
        this.d = aVar;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        w wVar = this.c;
        List<EventInClub> list = wVar.k;
        if (list != null) {
            w.a aVar = this.d;
            for (EventInClub eventInClub : list) {
                v vVar = new v();
                vVar.Q(new Number[]{Integer.valueOf(eventInClub.Y1)});
                vVar.R(new EventSuggestions$bindEventSuggestions$1$1$1$1$1(wVar, eventInClub));
                vVar.O(eventInClub);
                vVar.M(wVar.l);
                vVar.L(new EventSuggestions$bindEventSuggestions$1$1$1$1$2(wVar, aVar, list));
                vVar.N(wVar.o);
                vVar.P(wVar.p);
                oVar.add(vVar);
            }
        }
        return i.a;
    }
}
