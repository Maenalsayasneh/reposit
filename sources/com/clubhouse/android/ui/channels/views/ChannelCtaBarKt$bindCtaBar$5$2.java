package com.clubhouse.android.ui.channels.views;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.z2.g.b0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelCtaBar.kt */
public final class ChannelCtaBarKt$bindCtaBar$5$2 extends Lambda implements l<String, i> {
    public final /* synthetic */ i0.e.b.z2.g.l c;
    public final /* synthetic */ ChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelCtaBarKt$bindCtaBar$5$2(i0.e.b.z2.g.l lVar, ChannelFragment channelFragment) {
        super(1);
        this.c = lVar;
        this.d = channelFragment;
    }

    public Object invoke(Object obj) {
        Club i;
        String str = (String) obj;
        m0.n.b.i.e(str, "reason");
        Channel channel = this.c.u;
        if (!(channel == null || (i = channel.i()) == null)) {
            this.d.S0().p(new b0(i, str));
        }
        return i.a;
    }
}
