package com.clubhouse.android.ui.channels;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.k.m0;
import i0.e.b.g3.k.n0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showOnlyModeratorLeavingConfirmation$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showOnlyModeratorLeavingConfirmation$1(ChannelFragment channelFragment) {
        super(1);
        this.c = channelFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.exit_warning_last_moderator, R.string.exit_warning_last_moderator_explanation);
        aVar.c(R.string.cancel, n0.c);
        aVar.d(R.string.leave_quietly, new m0(this.c));
        return i.a;
    }
}
