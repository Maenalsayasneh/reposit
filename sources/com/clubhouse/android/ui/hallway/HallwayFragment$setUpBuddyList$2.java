package com.clubhouse.android.ui.hallway;

import h0.a.b;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$setUpBuddyList$2 extends Lambda implements l<b, i> {
    public final /* synthetic */ HallwayFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$setUpBuddyList$2(HallwayFragment hallwayFragment) {
        super(1);
        this.c = hallwayFragment;
    }

    public Object invoke(Object obj) {
        b bVar = (b) obj;
        m0.n.b.i.e(bVar, "$this$addCallback");
        HallwayFragment hallwayFragment = this.c;
        k<Object>[] kVarArr = HallwayFragment.Z1;
        if (hallwayFragment.N0().g.getCurrentItem() == 0) {
            this.c.N0().g.setCurrentItem(1);
        } else {
            bVar.a = false;
            this.c.requireActivity().onBackPressed();
        }
        return i.a;
    }
}
