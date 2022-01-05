package com.clubhouse.android.ui.hallway.feed.viewholder;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.b.a.o;
import i0.e.b.g3.p.c0.e0.f0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HallwayEventsView.kt */
public final class HallwayEventsView$bind$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ HallwayEventsView c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayEventsView$bind$1(HallwayEventsView hallwayEventsView) {
        super(1);
        this.c = hallwayEventsView;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        HallwayEventsView hallwayEventsView = this.c;
        for (EventInClub K : hallwayEventsView.j) {
            hallwayEventsView.K(oVar, K, false);
        }
        if ((!hallwayEventsView.k.isEmpty()) && (!hallwayEventsView.j.isEmpty())) {
            f0 f0Var = new f0();
            f0Var.D("featured divider");
            oVar.add(f0Var);
        }
        for (EventInClub K2 : hallwayEventsView.k) {
            hallwayEventsView.K(oVar, K2, true);
        }
        return i.a;
    }
}
