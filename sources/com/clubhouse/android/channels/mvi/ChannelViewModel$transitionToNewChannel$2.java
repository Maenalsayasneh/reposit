package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.analytics.LeaveReason;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.z2.f.e;
import i0.e.b.z2.g.c0;
import i0.e.b.z2.g.l;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$transitionToNewChannel$2 extends Lambda implements p<l, b<? extends ChannelInRoom>, l> {
    public final /* synthetic */ ChannelViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$transitionToNewChannel$2(ChannelViewModel channelViewModel) {
        super(2);
        this.c = channelViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        l lVar = (l) obj;
        b bVar = (b) obj2;
        i.e(lVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.r.p(new c0(LeaveReason.SIDE_CHANNEL));
            this.c.o(new e((Channel) ((f0) bVar).b, SourceLocation.SIDE_ROOM));
        }
        if (bVar instanceof c) {
            this.c.o(new d((String) null, 1));
        }
        return lVar;
    }
}
