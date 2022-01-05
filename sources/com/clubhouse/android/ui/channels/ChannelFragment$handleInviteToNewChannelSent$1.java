package com.clubhouse.android.ui.channels;

import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import i0.e.b.g3.k.s;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$handleInviteToNewChannelSent$1 extends Lambda implements l<j, i> {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ long d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$handleInviteToNewChannelSent$1(ChannelFragment channelFragment, long j) {
        super(1);
        this.c = channelFragment;
        this.d = j;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showBanner");
        jVar.d(R.string.invited_to_new_channel_waiting);
        jVar.f(this.c.getString(R.string.invite_to_new_channel_cancel), new s(this.c, this.d, jVar));
        return i.a;
    }
}
