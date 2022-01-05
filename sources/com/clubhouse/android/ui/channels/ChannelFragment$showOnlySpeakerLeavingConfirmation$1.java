package com.clubhouse.android.ui.channels;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.k.o0;
import i0.e.b.g3.k.p0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showOnlySpeakerLeavingConfirmation$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showOnlySpeakerLeavingConfirmation$1(ChannelFragment channelFragment) {
        super(1);
        this.c = channelFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.exit_warning_not_started, R.string.exit_warning_not_started_explanation);
        aVar.c(R.string.exit_warning_wait, o0.c);
        aVar.d(R.string.end_room, new p0(this.c));
        return i.a;
    }
}
