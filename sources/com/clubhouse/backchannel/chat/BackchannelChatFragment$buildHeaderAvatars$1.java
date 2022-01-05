package com.clubhouse.backchannel.chat;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b0.v;
import i0.b.a.o;
import i0.e.c.c.k0.c;
import i0.e.c.c.y;
import i0.e.c.f.b.a.a;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$buildHeaderAvatars$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ BackchannelChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$buildHeaderAvatars$1(BackchannelChatFragment backchannelChatFragment) {
        super(1);
        this.c = backchannelChatFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        BackchannelChatFragment backchannelChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        BackchannelChatViewModel P0 = backchannelChatFragment.P0();
        final BackchannelChatFragment backchannelChatFragment2 = this.c;
        v.v2(P0, new l<y, i>() {
            public Object invoke(Object obj) {
                List<ChatMember> list;
                y yVar = (y) obj;
                m0.n.b.i.e(yVar, "state");
                a aVar = yVar.b;
                if (!(aVar == null || (list = aVar.n) == null)) {
                    o oVar = o.this;
                    BackchannelChatFragment backchannelChatFragment = backchannelChatFragment2;
                    for (ChatMember chatMember : list) {
                        c cVar = new c();
                        cVar.F(new Number[]{chatMember.getId()});
                        cVar.H(v.f0(chatMember));
                        cVar.D(chatMember.Z1);
                        cVar.G(chatMember.c2);
                        cVar.E(new i0.e.c.c.c(backchannelChatFragment, chatMember));
                        oVar.add(cVar);
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
