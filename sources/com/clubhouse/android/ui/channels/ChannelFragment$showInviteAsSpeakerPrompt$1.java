package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import i0.e.b.g3.k.k0;
import i0.e.b.g3.k.l0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showInviteAsSpeakerPrompt$1 extends Lambda implements l<j, i> {
    public final /* synthetic */ String c;
    public final /* synthetic */ ChannelFragment d;
    public final /* synthetic */ UserInChannel q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showInviteAsSpeakerPrompt$1(String str, ChannelFragment channelFragment, UserInChannel userInChannel) {
        super(1);
        this.c = str;
        this.d = channelFragment;
        this.q = userInChannel;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showBanner");
        jVar.e(this.c);
        jVar.g(this.d.getString(R.string.invite_to_speak), new l0(this.d, this.q, jVar));
        jVar.f(this.d.getString(R.string.dismiss), new k0(this.d, jVar));
        return i.a;
    }
}
