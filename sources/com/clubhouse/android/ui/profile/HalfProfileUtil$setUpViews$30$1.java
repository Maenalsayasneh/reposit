package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.t4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$30$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$30$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        String str = q4Var.z;
        if (str != null) {
            this.c.U0().p(new t4(str, SourceLocation.BUDDY_LIST));
        }
        return i.a;
    }
}
