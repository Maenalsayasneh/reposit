package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.channel.Channel;
import i0.e.b.z2.g.d0;
import i0.e.b.z2.g.p;
import i0.e.b.z2.g.p0;
import i0.e.b.z2.g.q;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$handleRequestMakeModerator$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelViewModel c;
    public final /* synthetic */ p0 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$handleRequestMakeModerator$1(ChannelViewModel channelViewModel, p0 p0Var) {
        super(1);
        this.c = channelViewModel;
        this.d = p0Var;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        Channel channel = lVar.u;
        if (channel != null) {
            ChannelViewModel channelViewModel = this.c;
            p0 p0Var = this.d;
            if (!channelViewModel.t.t(p0Var.a.getId().intValue())) {
                channelViewModel.o(new p(p0Var.a));
            } else if (!channel.U() || lVar.e) {
                channelViewModel.r.p(new d0(p0Var.a));
            } else {
                channelViewModel.o(new q(p0Var.a));
                channelViewModel.m(ChannelViewModel$handleRequestMakeModerator$1$1$1.c);
            }
        }
        return i.a;
    }
}
