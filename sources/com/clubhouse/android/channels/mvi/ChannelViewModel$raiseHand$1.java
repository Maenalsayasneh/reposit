package com.clubhouse.android.channels.mvi;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import i0.e.b.z2.g.e1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$raiseHand$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$raiseHand$1(ChannelViewModel channelViewModel) {
        super(1);
        this.c = channelViewModel;
    }

    public Object invoke(Object obj) {
        String str;
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        UserInChannel userInChannel = lVar.p.a;
        if (userInChannel != null) {
            ChannelViewModel channelViewModel = this.c;
            Integer num = userInChannel.d;
            if (num != null && num.intValue() == 1) {
                str = "✋🏻";
            } else {
                Integer num2 = userInChannel.d;
                if (num2 != null && num2.intValue() == 2) {
                    str = "✋🏼";
                } else {
                    Integer num3 = userInChannel.d;
                    if (num3 != null && num3.intValue() == 4) {
                        str = "✋🏾";
                    } else {
                        Integer num4 = userInChannel.d;
                        str = (num4 != null && num4.intValue() == 5) ? "✋🏿" : "✋🏽";
                    }
                }
            }
            channelViewModel.o(new e1(str));
            MavericksViewModel.f(channelViewModel, new ChannelViewModel$raiseHand$1$1$1(channelViewModel, lVar, (c<? super ChannelViewModel$raiseHand$1$1$1>) null), (d0) null, (m) null, ChannelViewModel$raiseHand$1$1$2.c, 3, (Object) null);
        }
        return i.a;
    }
}
