package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.Channel;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$onViewCreated$14$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$onViewCreated$14$1(ChannelFragment channelFragment) {
        super(1);
        this.c = channelFragment;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "it");
        ChannelFragment channelFragment = this.c;
        Channel channel = lVar.u;
        m0.n.b.i.e(channelFragment, "<this>");
        if (channel != null) {
            v.G(channelFragment, new ChannelNavigation$showPingIntoRoom$1$1(channel));
        }
        return i.a;
    }
}
