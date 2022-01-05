package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.remote.response.GetEventResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.o.l0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: HalfEventViewModel.kt */
public final class HalfEventViewModel$loadEvent$2 extends Lambda implements p<l0, b<? extends GetEventResponse>, l0> {
    public final /* synthetic */ HalfEventViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventViewModel$loadEvent$2(HalfEventViewModel halfEventViewModel) {
        super(2);
        this.c = halfEventViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean z;
        l0 l0Var = (l0) obj;
        b bVar = (b) obj2;
        i.e(l0Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            EventInClub eventInClub = ((GetEventResponse) ((f0) bVar).b).a;
            Boolean bool = eventInClub.x;
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            return l0.copy$default(l0Var, (b) null, (HalfEventArgs) null, eventInClub, z, false, false, 51, (Object) null);
        } else if (!(bVar instanceof c)) {
            return l0Var;
        } else {
            this.c.o(new d(((c) bVar).b.getMessage()));
            return l0Var;
        }
    }
}
