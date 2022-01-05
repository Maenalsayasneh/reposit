package com.clubhouse.android.ui.hallway;

import i0.e.b.g3.p.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$onViewCreated$3 extends Lambda implements l<String, i> {
    public final /* synthetic */ HallwayFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$onViewCreated$3(HallwayFragment hallwayFragment) {
        super(1);
        this.c = hallwayFragment;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        if (str != null) {
            HallwayFragment hallwayFragment = this.c;
            k<Object>[] kVarArr = HallwayFragment.Z1;
            hallwayFragment.P0().p(new v(str));
        }
        return i.a;
    }
}
