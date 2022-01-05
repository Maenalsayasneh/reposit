package com.clubhouse.android.ui.profile;

import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.o4;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$6$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$6$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        HalfProfileFragment halfProfileFragment = this.c;
        FollowListArgs followListArgs = new FollowListArgs(q4Var.a.getId().intValue(), 0, FollowListType.FOLLOWERS, 2);
        halfProfileFragment.P0();
        m0.n.b.i.e(followListArgs, "mavericksArg");
        v.a1(halfProfileFragment, new o4.f(followListArgs), (q) null, 2);
        return i.a;
    }
}
