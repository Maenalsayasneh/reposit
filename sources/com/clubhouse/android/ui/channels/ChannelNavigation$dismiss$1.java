package com.clubhouse.android.ui.channels;

import com.clubhouse.app.R;
import h0.o.a.c0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelNavigation.kt */
public final class ChannelNavigation$dismiss$1 extends Lambda implements l<c0, i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelNavigation$dismiss$1(ChannelFragment channelFragment) {
        super(1);
        this.c = channelFragment;
    }

    public Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        m0.n.b.i.e(c0Var, "$this$commitSafe");
        c0Var.q(R.anim.slide_up, R.anim.slide_down);
        c0Var.n(this.c);
        return i.a;
    }
}
