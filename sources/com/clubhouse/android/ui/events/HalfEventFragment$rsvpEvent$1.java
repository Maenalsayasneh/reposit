package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import h0.b0.v;
import i0.e.b.g3.o.l0;
import i0.e.b.g3.o.p0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$rsvpEvent$1 extends Lambda implements l<l0, i> {
    public final /* synthetic */ HalfEventFragment c;
    public final /* synthetic */ EventInClub d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$rsvpEvent$1(HalfEventFragment halfEventFragment, EventInClub eventInClub) {
        super(1);
        this.c = halfEventFragment;
        this.d = eventInClub;
    }

    public Object invoke(Object obj) {
        l0 l0Var = (l0) obj;
        m0.n.b.i.e(l0Var, "it");
        EventInClub eventInClub = this.d;
        HalfEventArgs halfEventArgs = l0Var.b;
        ((EventsViewModel) this.c.v2.getValue()).p(new p0(eventInClub, v.t2(halfEventArgs.Z1, halfEventArgs.Y1)));
        return i.a;
    }
}
