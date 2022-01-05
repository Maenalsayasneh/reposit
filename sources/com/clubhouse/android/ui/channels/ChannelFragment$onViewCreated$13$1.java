package com.clubhouse.android.ui.channels;

import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.channels.repos.SpeakerStateDataSource;
import i0.e.b.z2.g.r0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$onViewCreated$13$1 extends Lambda implements a<i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$onViewCreated$13$1(ChannelFragment channelFragment) {
        super(0);
        this.c = channelFragment;
    }

    public Object invoke() {
        ChannelViewModel S0 = this.c.S0();
        SpeakerStateDataSource speakerStateDataSource = this.c.S0().A;
        S0.p(new r0(!speakerStateDataSource.a(speakerStateDataSource.b.b())));
        return i.a;
    }
}
