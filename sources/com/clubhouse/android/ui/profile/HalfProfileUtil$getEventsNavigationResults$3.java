package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.e.b.a3.b.a;
import i0.e.b.g3.u.w5;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$getEventsNavigationResults$3 extends Lambda implements l<EventInClub, i> {
    public final /* synthetic */ a<?> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$getEventsNavigationResults$3(a<?> aVar) {
        super(1);
        this.c = aVar;
    }

    public Object invoke(Object obj) {
        EventInClub eventInClub = (EventInClub) obj;
        m0.n.b.i.e(eventInClub, "event");
        this.c.p(new w5(eventInClub));
        return i.a;
    }
}
