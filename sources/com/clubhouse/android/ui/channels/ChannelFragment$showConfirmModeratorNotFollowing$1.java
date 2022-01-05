package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.k.g0;
import i0.e.b.g3.k.h0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showConfirmModeratorNotFollowing$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ UserInChannel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showConfirmModeratorNotFollowing$1(ChannelFragment channelFragment, UserInChannel userInChannel) {
        super(1);
        this.c = channelFragment;
        this.d = userInChannel;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.a.d = this.c.getString(R.string.moderator_not_following_title, this.d.c);
        aVar.a.f = this.c.getString(R.string.moderator_not_following_explanation, this.d.c);
        aVar.c(R.string.cancel, h0.c);
        aVar.d(R.string.yes_im_sure, new g0(this.c, this.d));
        return i.a;
    }
}
