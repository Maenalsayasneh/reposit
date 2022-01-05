package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.club.Club;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showChannelOptions$1$1$1$5$1 extends Lambda implements a<i> {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ Channel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showChannelOptions$1$1$1$5$1(ChannelFragment channelFragment, Channel channel) {
        super(0);
        this.c = channelFragment;
        this.d = channel;
    }

    public Object invoke() {
        ChannelFragment channelFragment = this.c;
        Club i = this.d.i();
        m0.n.b.i.c(i);
        m0.n.b.i.e(channelFragment, "<this>");
        m0.n.b.i.e(i, "club");
        v.G(channelFragment, new ChannelNavigation$showClubRules$1(i));
        return i.a;
    }
}
