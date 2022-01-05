package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import i0.e.b.g3.k.t;
import i0.e.b.g3.k.u;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$handleWelcomeRoomRejected$1 extends Lambda implements l<j, i> {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ UserInChannel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$handleWelcomeRoomRejected$1(ChannelFragment channelFragment, UserInChannel userInChannel) {
        super(1);
        this.c = channelFragment;
        this.d = userInChannel;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showBanner");
        jVar.e(this.c.getString(R.string.welcome_room_declined, this.d));
        jVar.g(this.c.getString(R.string.welcome_room_dismiss), new u(this.c, jVar));
        jVar.f(this.c.getString(R.string.welcome_room_stay), new t(jVar));
        return i.a;
    }
}
