package com.clubhouse.android.ui.hallway.feed.viewholder;

import android.content.res.Resources;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import h0.b0.v;
import i0.e.b.g3.p.c0.e0.w;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: EventSuggestions.kt */
public final class EventSuggestions$bindEventSuggestions$1$1$1$1$2 extends Lambda implements p<EventInClub, Boolean, i> {
    public final /* synthetic */ w c;
    public final /* synthetic */ w.a d;
    public final /* synthetic */ List<EventInClub> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventSuggestions$bindEventSuggestions$1$1$1$1$2(w wVar, w.a aVar, List<EventInClub> list) {
        super(2);
        this.c = wVar;
        this.d = aVar;
        this.q = list;
    }

    public Object invoke(Object obj, Object obj2) {
        EventInClub eventInClub = (EventInClub) obj;
        Boolean bool = (Boolean) obj2;
        l<? super EventInClub, i> lVar = this.c.n;
        if (lVar != null) {
            m0.n.b.i.d(eventInClub, "event");
            lVar.invoke(eventInClub);
        }
        w wVar = this.c;
        w.a aVar = this.d;
        List<EventInClub> list = this.q;
        m0.n.b.i.d(eventInClub, "event");
        m0.n.b.i.d(bool, "checkedAfter");
        boolean booleanValue = bool.booleanValue();
        Objects.requireNonNull(wVar);
        if (!m0.n.b.i.a(g.G(list), eventInClub) && booleanValue) {
            ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = aVar.b().a;
            i0.e.b.g3.p.c0.e0.g gVar = new i0.e.b.g3.p.c0.e0.g(impressionTrackingEpoxyRecyclerView, list, eventInClub);
            Resources resources = impressionTrackingEpoxyRecyclerView.getResources();
            m0.n.b.i.d(resources, "resources");
            impressionTrackingEpoxyRecyclerView.postDelayed(gVar, v.Y1(resources));
        }
        return i.a;
    }
}
