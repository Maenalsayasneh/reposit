package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.UserMessage;
import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import i0.e.b.g3.k.a0;
import i0.e.b.g3.k.b0;
import i0.e.b.z2.g.s0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showAlert$10 extends Lambda implements l<j, i> {
    public final /* synthetic */ s0 c;
    public final /* synthetic */ ChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showAlert$10(s0 s0Var, ChannelFragment channelFragment) {
        super(1);
        this.c = s0Var;
        this.d = channelFragment;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showBanner");
        UserMessage userMessage = (UserMessage) this.c.a;
        String str = userMessage.c;
        Long l = userMessage.d;
        m0.n.b.i.c(l);
        long longValue = l.longValue();
        jVar.e(this.d.getString(R.string.invite_to_new_channel_received, str));
        jVar.g(this.d.getString(R.string.invited_to_new_channel_accept), new a0(this.d, longValue, jVar));
        jVar.f(this.d.getString(R.string.maybe_later), new b0(this.d, longValue, jVar));
        return i.a;
    }
}
