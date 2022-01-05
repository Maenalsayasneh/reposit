package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import h0.b0.v;
import i0.e.b.z2.g.l;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showChannelOptions$1$1$1$7$1 extends Lambda implements a<i> {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ l d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showChannelOptions$1$1$1$7$1(ChannelFragment channelFragment, l lVar) {
        super(0);
        this.c = channelFragment;
        this.d = lVar;
    }

    public Object invoke() {
        ChannelFragment channelFragment = this.c;
        Channel channel = this.d.u;
        m0.n.b.i.c(channel);
        m0.n.b.i.e(channelFragment, "<this>");
        m0.n.b.i.e(channel, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        v.G(channelFragment, new ChannelNavigation$showReportRoomTopic$1(channel, v.R1(channelFragment)));
        return i.a;
    }
}
