package com.clubhouse.android.ui.profile;

import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.g3.u.o5;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.g.x;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$35$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$35$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "it");
        HalfProfileFragment halfProfileFragment = this.c;
        ChannelViewModel channelViewModel = halfProfileFragment.j2;
        if (channelViewModel != null) {
            channelViewModel.p(new x(q4Var.a));
            this.c.dismiss();
        } else {
            halfProfileFragment.U0().p(new o5(q4Var.a.getId().intValue(), SourceLocation.BUDDY_LIST));
        }
        return i.a;
    }
}
