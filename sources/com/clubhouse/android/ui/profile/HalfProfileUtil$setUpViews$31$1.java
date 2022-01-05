package com.clubhouse.android.ui.profile;

import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.g.p0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$31$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$31$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        UserInChannel userInChannel = q4Var.w;
        if (userInChannel != null) {
            HalfProfileFragment halfProfileFragment = this.c;
            ChannelViewModel channelViewModel = halfProfileFragment.j2;
            if (channelViewModel != null) {
                channelViewModel.p(new p0(userInChannel));
            }
            halfProfileFragment.dismiss();
        }
        return i.a;
    }
}
