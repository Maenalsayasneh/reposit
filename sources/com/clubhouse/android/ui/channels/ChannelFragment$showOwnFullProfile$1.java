package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showOwnFullProfile$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showOwnFullProfile$1(ChannelFragment channelFragment) {
        super(1);
        this.c = channelFragment;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        UserInChannel userInChannel = lVar.p.a;
        if (userInChannel == null) {
            return null;
        }
        ChannelFragment channelFragment = this.c;
        SourceLocation sourceLocation = SourceLocation.CHANNEL;
        m0.n.b.i.e(channelFragment, "<this>");
        m0.n.b.i.e(userInChannel, "user");
        m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        v.f(channelFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(userInChannel, sourceLocation, true, false, false, 16));
        return i.a;
    }
}
