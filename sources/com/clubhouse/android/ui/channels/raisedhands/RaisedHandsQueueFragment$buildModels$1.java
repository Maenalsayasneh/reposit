package com.clubhouse.android.ui.channels.raisedhands;

import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.k.v0.b;
import i0.e.b.g3.k.v0.e.c;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RaisedHandsQueueFragment.kt */
public final class RaisedHandsQueueFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ RaisedHandsQueueFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RaisedHandsQueueFragment$buildModels$1(RaisedHandsQueueFragment raisedHandsQueueFragment) {
        super(1);
        this.c = raisedHandsQueueFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        ChannelViewModel S0 = RaisedHandsQueueFragment.S0(this.c);
        final RaisedHandsQueueFragment raisedHandsQueueFragment = this.c;
        v.v2(S0, new l<i0.e.b.z2.g.l, i>() {
            public Object invoke(Object obj) {
                i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
                m0.n.b.i.e(lVar, "state");
                List<UserInChannel> list = lVar.F;
                o oVar = o.this;
                RaisedHandsQueueFragment raisedHandsQueueFragment = raisedHandsQueueFragment;
                for (UserInChannel userInChannel : list) {
                    c cVar = new c();
                    cVar.L(new Number[]{userInChannel.getId()});
                    cVar.O(userInChannel);
                    cVar.N(lVar.C.c.contains(Integer.valueOf(userInChannel.getId().intValue())));
                    cVar.M(new i0.e.b.g3.k.v0.c(raisedHandsQueueFragment, userInChannel));
                    cVar.P(new b(raisedHandsQueueFragment, userInChannel));
                    oVar.add(cVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
