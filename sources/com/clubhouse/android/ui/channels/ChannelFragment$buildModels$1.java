package com.clubhouse.android.ui.channels;

import androidx.recyclerview.widget.GridLayoutManager;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.channels.repos.SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.k.m;
import i0.e.b.g3.k.n;
import i0.e.b.g3.k.p;
import i0.e.b.g3.k.x0.d;
import i0.e.b.g3.k.x0.g;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ GridLayoutManager c;
    public final /* synthetic */ ChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$buildModels$1(GridLayoutManager gridLayoutManager, ChannelFragment channelFragment) {
        super(1);
        this.c = gridLayoutManager;
        this.d = channelFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        this.c.g = oVar.getSpanSizeLookup();
        ChannelViewModel S0 = this.d.S0();
        final ChannelFragment channelFragment = this.d;
        v.v2(S0, new l<i0.e.b.z2.g.l, i>() {
            public Object invoke(Object obj) {
                i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
                m0.n.b.i.e(lVar, "state");
                o oVar = o.this;
                ChannelFragment channelFragment = channelFragment;
                g gVar = new g();
                gVar.N("header");
                gVar.L(lVar.u);
                gVar.O(new m(channelFragment));
                gVar.M(new i0.e.b.g3.k.o(channelFragment, lVar));
                oVar.add(gVar);
                List<UserInChannel> list = lVar.p.k;
                o oVar2 = o.this;
                ChannelFragment channelFragment2 = channelFragment;
                for (UserInChannel userInChannel : list) {
                    i0.e.b.g3.k.x0.i iVar = new i0.e.b.g3.k.x0.i();
                    iVar.M(new Number[]{userInChannel.getId()});
                    iVar.Q(userInChannel);
                    iVar.N(lVar.p.e(userInChannel.getId().intValue()));
                    iVar.P(a.f1(new SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1(channelFragment2.S0().A.a.o, userInChannel.getId().intValue())));
                    iVar.O(channelFragment2.S0().A.b(userInChannel.getId()));
                    iVar.L(new p(channelFragment2, userInChannel));
                    oVar2.add(iVar);
                }
                if (!lVar.p.l.isEmpty()) {
                    o oVar3 = o.this;
                    ChannelFragment channelFragment3 = channelFragment;
                    d dVar = new d();
                    dVar.L("friends");
                    dVar.M(channelFragment3.getString(R.string.followed_by_speakers));
                    oVar3.add(dVar);
                }
                List<UserInChannel> list2 = lVar.p.l;
                o oVar4 = o.this;
                ChannelFragment channelFragment4 = channelFragment;
                for (UserInChannel userInChannel2 : list2) {
                    i0.e.b.g3.k.x0.l lVar2 = new i0.e.b.g3.k.x0.l();
                    lVar2.M(new Number[]{userInChannel2.getId()});
                    lVar2.O(userInChannel2);
                    lVar2.N(lVar.C.a.contains(Integer.valueOf(userInChannel2.getId().intValue())) && lVar.q);
                    lVar2.L(new i0.e.b.g3.k.l(channelFragment4, userInChannel2));
                    oVar4.add(lVar2);
                }
                if (!lVar.p.m.isEmpty()) {
                    o oVar5 = o.this;
                    ChannelFragment channelFragment5 = channelFragment;
                    d dVar2 = new d();
                    dVar2.L("lurkers");
                    dVar2.M(channelFragment5.getString(R.string.others_in_room));
                    oVar5.add(dVar2);
                }
                List<UserInChannel> list3 = lVar.p.m;
                o oVar6 = o.this;
                ChannelFragment channelFragment6 = channelFragment;
                for (UserInChannel userInChannel3 : list3) {
                    i0.e.b.g3.k.x0.l lVar3 = new i0.e.b.g3.k.x0.l();
                    lVar3.M(new Number[]{userInChannel3.getId()});
                    lVar3.O(userInChannel3);
                    lVar3.N(lVar.C.a.contains(Integer.valueOf(userInChannel3.getId().intValue())) && lVar.q);
                    lVar3.L(new n(channelFragment6, userInChannel3));
                    oVar6.add(lVar3);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
