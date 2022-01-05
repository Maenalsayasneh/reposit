package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.user.model.UserInRoom;
import com.clubhouse.app.R;
import i0.b.a.e0;
import i0.e.b.g3.p.c0.e0.o;
import i0.e.b.g3.r.y2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: WelcomeRoomFragment.kt */
public final class WelcomeRoomFragment$buildChannel$1 extends Lambda implements l<y2, i> {
    public final /* synthetic */ e0 c;
    public final /* synthetic */ WelcomeRoomFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeRoomFragment$buildChannel$1(e0 e0Var, WelcomeRoomFragment welcomeRoomFragment) {
        super(1);
        this.c = e0Var;
        this.d = welcomeRoomFragment;
    }

    public Object invoke(Object obj) {
        y2 y2Var = (y2) obj;
        m0.n.b.i.e(y2Var, "state");
        ChannelInRoom a = y2Var.a.a();
        e0 e0Var = this.c;
        WelcomeRoomFragment welcomeRoomFragment = this.d;
        ChannelInRoom channelInRoom = a;
        if (channelInRoom == null) {
            return null;
        }
        List<UserInChannel> y = channelInRoom.y();
        ArrayList arrayList = new ArrayList();
        for (T next : y) {
            if (((UserInChannel) next).Y1) {
                arrayList.add(next);
            }
        }
        o oVar = new o();
        oVar.O(new Number[]{Integer.valueOf(channelInRoom.getId())});
        oVar.U(channelInRoom.u0());
        oVar.T(String.valueOf(arrayList.size()));
        oVar.S(String.valueOf(channelInRoom.y().size()));
        oVar.Q((UserInRoom) g.z(arrayList, 0));
        oVar.R((UserInRoom) g.z(arrayList, 1));
        oVar.P(channelInRoom.y());
        oVar.N(welcomeRoomFragment.getString(R.string.cd_welcome_room));
        oVar.M(new i0.e.b.g3.r.e0(welcomeRoomFragment));
        i iVar = i.a;
        e0Var.add(oVar);
        return iVar;
    }
}
