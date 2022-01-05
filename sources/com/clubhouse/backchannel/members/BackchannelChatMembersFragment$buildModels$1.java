package com.clubhouse.backchannel.members;

import com.clubhouse.backchannel.chat.BackchannelChatViewModel;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b0.v;
import i0.b.a.o;
import i0.e.c.c.y;
import i0.e.c.f.b.a.a;
import i0.e.c.i.d;
import i0.e.c.i.e;
import i0.e.c.i.g;
import i0.e.c.i.r.c;
import i0.e.c.i.r.f;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelChatMembersFragment.kt */
public final class BackchannelChatMembersFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ BackchannelChatMembersFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatMembersFragment$buildModels$1(BackchannelChatMembersFragment backchannelChatMembersFragment) {
        super(1);
        this.c = backchannelChatMembersFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        final BackchannelChatMembersFragment backchannelChatMembersFragment = this.c;
        v.v2((BackchannelChatViewModel) this.c.r2.getValue(), new l<y, i>() {
            public Object invoke(Object obj) {
                List<ChatMember> list;
                List<ChatMember> list2;
                y yVar = (y) obj;
                m0.n.b.i.e(yVar, "state");
                a aVar = yVar.b;
                boolean z = true;
                if (!(aVar == null || (list2 = aVar.l) == null)) {
                    o oVar = o.this;
                    BackchannelChatMembersFragment backchannelChatMembersFragment = backchannelChatMembersFragment;
                    for (ChatMember chatMember : list2) {
                        f fVar = new f();
                        fVar.G(new Number[]{chatMember.getId()});
                        fVar.I(chatMember.Y1);
                        fVar.E(chatMember.Z1);
                        fVar.D(true);
                        fVar.K(false);
                        fVar.H(chatMember.c2);
                        fVar.L(new i0.e.c.i.f(backchannelChatMembersFragment, chatMember));
                        oVar.add(fVar);
                    }
                }
                a aVar2 = yVar.b;
                if (!(aVar2 == null || (list = aVar2.m) == null)) {
                    o oVar2 = o.this;
                    BackchannelChatMembersFragment backchannelChatMembersFragment2 = backchannelChatMembersFragment;
                    for (ChatMember chatMember2 : list) {
                        int intValue = chatMember2.getId().intValue();
                        a aVar3 = yVar.b;
                        boolean z2 = intValue == aVar3.b;
                        boolean z3 = aVar3.s ? !z2 : z2;
                        f fVar2 = new f();
                        fVar2.G(new Number[]{chatMember2.getId()});
                        fVar2.I(chatMember2.Y1);
                        fVar2.E(chatMember2.Z1);
                        fVar2.D(false);
                        fVar2.K(z3);
                        fVar2.H(chatMember2.c2);
                        fVar2.L(new d(backchannelChatMembersFragment2, chatMember2));
                        fVar2.J(new g(backchannelChatMembersFragment2, z2, chatMember2));
                        oVar2.add(fVar2);
                    }
                }
                a aVar4 = yVar.b;
                if (aVar4 == null || !aVar4.s) {
                    z = false;
                }
                if (z) {
                    o oVar3 = o.this;
                    BackchannelChatMembersFragment backchannelChatMembersFragment3 = backchannelChatMembersFragment;
                    c cVar = new c();
                    cVar.E("add");
                    cVar.D(new e(backchannelChatMembersFragment3));
                    oVar3.add(cVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
