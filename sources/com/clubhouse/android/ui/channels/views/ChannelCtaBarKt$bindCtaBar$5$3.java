package com.clubhouse.android.ui.channels.views;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.z2.g.b0;
import i0.e.b.z2.g.l;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelCtaBar.kt */
public final class ChannelCtaBarKt$bindCtaBar$5$3 extends Lambda implements a<i> {
    public final /* synthetic */ l c;
    public final /* synthetic */ ChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelCtaBarKt$bindCtaBar$5$3(l lVar, ChannelFragment channelFragment) {
        super(0);
        this.c = lVar;
        this.d = channelFragment;
    }

    public Object invoke() {
        Club i;
        Channel channel = this.c.u;
        if (!(channel == null || (i = channel.i()) == null)) {
            this.d.S0().p(new b0(i, (String) null, 2));
        }
        return i.a;
    }
}
