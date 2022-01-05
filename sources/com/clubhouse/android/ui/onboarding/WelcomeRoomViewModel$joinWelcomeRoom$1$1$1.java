package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.r.w2;
import i0.e.b.g3.r.y2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: WelcomeRoomViewModel.kt */
public final class WelcomeRoomViewModel$joinWelcomeRoom$1$1$1 extends Lambda implements l<y2, y2> {
    public final /* synthetic */ ChannelInRoom c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeRoomViewModel$joinWelcomeRoom$1$1$1(ChannelInRoom channelInRoom) {
        super(1);
        this.c = channelInRoom;
    }

    public Object invoke(Object obj) {
        y2 y2Var = (y2) obj;
        i.e(y2Var, "$this$setState");
        return y2.copy$default(y2Var, (b) null, new f0(w2.b.a(w2.a, false, this.c.e(), 1)), 1, (Object) null);
    }
}
