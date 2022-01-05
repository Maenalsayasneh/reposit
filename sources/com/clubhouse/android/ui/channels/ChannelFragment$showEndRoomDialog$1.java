package com.clubhouse.android.ui.channels;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.k.i0;
import i0.e.b.g3.k.j0;
import i0.e.b.z2.g.w0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showEndRoomDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ w0 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showEndRoomDialog$1(ChannelFragment channelFragment, w0 w0Var) {
        super(1);
        this.c = channelFragment;
        this.d = w0Var;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.are_you_sure);
        aVar.a.f = this.c.getString(R.string.room_end_confirmation_description, Integer.valueOf(this.d.a));
        aVar.c(R.string.cancel, j0.c);
        aVar.d(R.string.end_room, new i0(this.c));
        return i.a;
    }
}
