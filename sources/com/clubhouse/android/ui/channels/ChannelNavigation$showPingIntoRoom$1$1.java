package com.clubhouse.android.ui.channels;

import android.os.Bundle;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.ui.channels.users.ping.PingUserFragment;
import h0.o.a.c0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelNavigation.kt */
public final class ChannelNavigation$showPingIntoRoom$1$1 extends Lambda implements l<c0, i> {
    public final /* synthetic */ Channel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelNavigation$showPingIntoRoom$1$1(Channel channel) {
        super(1);
        this.c = channel;
    }

    public Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        m0.n.b.i.e(c0Var, "$this$commitSafe");
        Channel channel = this.c;
        m0.n.b.i.e(channel, "arg");
        Bundle bundle = new Bundle();
        bundle.putParcelable("mavericks:arg", channel);
        c0Var.c(c0Var.k(PingUserFragment.class, bundle), (String) null);
        return i.a;
    }
}
