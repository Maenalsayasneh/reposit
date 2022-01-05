package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.k.e0;
import i0.e.b.g3.k.f0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showConfirmModeratorForSocialRoom$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ UserInChannel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showConfirmModeratorForSocialRoom$1(ChannelFragment channelFragment, UserInChannel userInChannel) {
        super(1);
        this.c = channelFragment;
        this.d = userInChannel;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.a.d = this.c.getString(R.string.moderator_social_mode_title, this.d.c);
        aVar.b(R.string.moderator_social_mode_explanation);
        aVar.c(R.string.never_mind, f0.c);
        aVar.d(R.string.sounds_good, new e0(this.c, this.d));
        return i.a;
    }
}
