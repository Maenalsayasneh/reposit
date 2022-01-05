package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.remote.response.AcceptChannelInviteResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.z2.g.k1;
import i0.e.b.z2.g.l;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$acceptNewChannelInvite$2 extends Lambda implements p<l, b<? extends AcceptChannelInviteResponse>, l> {
    public final /* synthetic */ ChannelViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$acceptNewChannelInvite$2(ChannelViewModel channelViewModel) {
        super(2);
        this.c = channelViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        l lVar = (l) obj;
        b bVar = (b) obj2;
        i.e(lVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.p(new k1(((AcceptChannelInviteResponse) ((f0) bVar).b).a));
        }
        if (bVar instanceof c) {
            this.c.o(new d((String) null, 1));
        }
        return lVar;
    }
}
