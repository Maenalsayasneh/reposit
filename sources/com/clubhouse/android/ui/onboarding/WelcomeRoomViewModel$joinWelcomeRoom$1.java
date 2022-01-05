package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import i0.e.b.g3.r.y2;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: WelcomeRoomViewModel.kt */
public final class WelcomeRoomViewModel$joinWelcomeRoom$1 extends Lambda implements l<y2, i> {
    public final /* synthetic */ WelcomeRoomViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeRoomViewModel$joinWelcomeRoom$1(WelcomeRoomViewModel welcomeRoomViewModel) {
        super(1);
        this.c = welcomeRoomViewModel;
    }

    public Object invoke(Object obj) {
        y2 y2Var = (y2) obj;
        m0.n.b.i.e(y2Var, "state");
        ChannelInRoom a = y2Var.a.a();
        if (a != null) {
            this.c.m(new WelcomeRoomViewModel$joinWelcomeRoom$1$1$1(a));
        }
        return i.a;
    }
}
