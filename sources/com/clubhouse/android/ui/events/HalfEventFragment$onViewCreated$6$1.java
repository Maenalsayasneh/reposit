package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.HalfEventFragment;
import i0.e.b.g3.o.l0;
import i0.e.b.g3.o.m0;
import i0.e.b.g3.o.z;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$onViewCreated$6$1 extends Lambda implements l<l0, i> {
    public final /* synthetic */ HalfEventFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$onViewCreated$6$1(HalfEventFragment halfEventFragment) {
        super(1);
        this.c = halfEventFragment;
    }

    public Object invoke(Object obj) {
        i iVar;
        l0 l0Var = (l0) obj;
        m0.n.b.i.e(l0Var, "state");
        EventInClub eventInClub = l0Var.c;
        if (eventInClub != null) {
            HalfEventFragment halfEventFragment = this.c;
            String str = eventInClub.f2;
            if (str == null) {
                iVar = null;
            } else {
                HalfEventFragment.b bVar = HalfEventFragment.p2;
                halfEventFragment.V0().p(new m0(str));
                iVar = i.a;
            }
            if (iVar == null) {
                HalfEventFragment.b bVar2 = HalfEventFragment.p2;
                halfEventFragment.V0().p(new z(eventInClub));
            }
        }
        return i.a;
    }
}
