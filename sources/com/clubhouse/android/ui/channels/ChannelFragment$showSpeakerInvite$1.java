package com.clubhouse.android.ui.channels;

import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import i0.e.b.g3.k.q0;
import i0.e.b.g3.k.r0;
import i0.e.b.z2.g.y0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showSpeakerInvite$1 extends Lambda implements l<j, i> {
    public final /* synthetic */ y0 c;
    public final /* synthetic */ ChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showSpeakerInvite$1(y0 y0Var, ChannelFragment channelFragment) {
        super(1);
        this.c = y0Var;
        this.d = channelFragment;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showBanner");
        jVar.e(this.c.a);
        jVar.g(this.d.getString(R.string.received_speaker_invite_accept), new q0(this.d, this.c, jVar));
        jVar.f(this.d.getString(R.string.maybe_later), new r0(this.d, this.c, jVar));
        return i.a;
    }
}
