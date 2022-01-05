package com.clubhouse.android.ui.profile;

import h0.b0.v;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.g.l;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$onViewCreated$9$4$1 extends Lambda implements p<q4, l, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$onViewCreated$9$4$1(HalfProfileFragment halfProfileFragment) {
        super(2);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        l lVar = (l) obj2;
        m0.n.b.i.e(q4Var, "state");
        m0.n.b.i.e(lVar, "channelState");
        if (!q4Var.d && lVar.q) {
            HalfProfileFragment halfProfileFragment = this.c;
            m0.n.b.i.e(halfProfileFragment, "<this>");
            v.v2(halfProfileFragment.U0(), new HalfProfileUtil$showRemoveConfirmationDialog$1(true, halfProfileFragment, true));
        }
        return i.a;
    }
}
