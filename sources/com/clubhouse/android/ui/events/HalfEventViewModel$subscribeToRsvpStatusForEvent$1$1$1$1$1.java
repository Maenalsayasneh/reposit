package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.b.b.b;
import i0.e.b.g3.o.l0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: HalfEventViewModel.kt */
public final class HalfEventViewModel$subscribeToRsvpStatusForEvent$1$1$1$1$1 extends Lambda implements l<l0, l0> {
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventViewModel$subscribeToRsvpStatusForEvent$1$1$1$1$1(boolean z) {
        super(1);
        this.c = z;
    }

    public Object invoke(Object obj) {
        l0 l0Var = (l0) obj;
        i.e(l0Var, "$this$setState");
        return l0.copy$default(l0Var, (b) null, (HalfEventArgs) null, (EventInClub) null, this.c, false, false, 55, (Object) null);
    }
}
