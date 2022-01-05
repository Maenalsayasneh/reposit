package com.clubhouse.android.ui.profile;

import com.clubhouse.android.channels.mvi.ChannelViewModel;
import i0.e.b.z2.g.c;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$33$1 extends Lambda implements a<i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$33$1(HalfProfileFragment halfProfileFragment) {
        super(0);
        this.c = halfProfileFragment;
    }

    public Object invoke() {
        ChannelViewModel channelViewModel = this.c.j2;
        if (channelViewModel != null) {
            channelViewModel.p(new c((Integer) null, 1));
        }
        this.c.dismiss();
        return i.a;
    }
}
