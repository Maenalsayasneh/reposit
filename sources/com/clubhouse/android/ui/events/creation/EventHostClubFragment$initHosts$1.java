package com.clubhouse.android.ui.events.creation;

import h0.b0.v;
import i0.b.a.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: EventHostClubFragment.kt */
public final class EventHostClubFragment$initHosts$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ EventHostClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventHostClubFragment$initHosts$1(EventHostClubFragment eventHostClubFragment) {
        super(1);
        this.c = eventHostClubFragment;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        EventHostClubFragment eventHostClubFragment = this.c;
        k<Object>[] kVarArr = EventHostClubFragment.p2;
        v.v2(eventHostClubFragment.V0(), new EventHostClubFragment$buildHostsModels$1(oVar, eventHostClubFragment));
        return i.a;
    }
}
