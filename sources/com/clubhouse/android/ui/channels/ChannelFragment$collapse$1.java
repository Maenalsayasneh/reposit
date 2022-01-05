package com.clubhouse.android.ui.channels;

import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.r.k;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$collapse$1 extends Lambda implements a<i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$collapse$1(ChannelFragment channelFragment) {
        super(0);
        this.c = channelFragment;
    }

    public Object invoke() {
        ChannelFragment channelFragment = this.c;
        k<Object>[] kVarArr = ChannelFragment.Z1;
        Toolbar toolbar = channelFragment.Q0().x;
        m0.n.b.i.d(toolbar, "binding.toolbar");
        i0.e.b.d3.k.p(toolbar);
        ImageView imageView = this.c.Q0().b;
        m0.n.b.i.d(imageView, "binding.backchannel");
        i0.e.b.d3.k.p(imageView);
        this.c.Q0().c.requestLayout();
        return i.a;
    }
}
