package com.clubhouse.backchannel.create;

import com.clubhouse.android.user.model.User;
import com.clubhouse.backchannel.R;
import i0.b.a.g;
import i0.b.a.o;
import i0.e.b.a3.d.a;
import i0.e.c.e.b;
import i0.e.c.e.h;
import i0.e.c.e.j.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelCreateChatFragment.kt */
public final class BackchannelCreateChatFragment$buildModels$1 extends Lambda implements l<h, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ BackchannelCreateChatFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelCreateChatFragment$buildModels$1(o oVar, BackchannelCreateChatFragment backchannelCreateChatFragment) {
        super(1);
        this.c = oVar;
        this.d = backchannelCreateChatFragment;
    }

    public Object invoke(Object obj) {
        h hVar = (h) obj;
        m0.n.b.i.e(hVar, "state");
        if (!hVar.b.isEmpty()) {
            o oVar = this.c;
            BackchannelCreateChatFragment backchannelCreateChatFragment = this.d;
            g gVar = new g();
            gVar.E("selected");
            Set<User> set = hVar.b;
            ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(set, 10));
            for (User user : set) {
                c cVar = new c();
                cVar.t(user.getId());
                String F = user.F();
                cVar.w();
                cVar.j = F;
                String b = user.b();
                cVar.w();
                cVar.k = b;
                i0.e.c.e.c cVar2 = new i0.e.c.e.c(backchannelCreateChatFragment, user);
                cVar.w();
                cVar.l = cVar2;
                arrayList.add(cVar);
            }
            gVar.F(arrayList);
            gVar.H(R.dimen.create_chat_selected_item_spacing);
            oVar.add(gVar);
            o oVar2 = this.c;
            i0.e.b.g3.m.e.c cVar3 = new i0.e.b.g3.m.e.c();
            cVar3.K("divider");
            oVar2.add(cVar3);
        }
        List<a> a = hVar.c.a();
        if (a == null) {
            return null;
        }
        o oVar3 = this.c;
        BackchannelCreateChatFragment backchannelCreateChatFragment2 = this.d;
        for (a aVar : a) {
            i0.e.b.g3.r.c3.c cVar4 = new i0.e.b.g3.r.c3.c();
            cVar4.N(new Number[]{((User) aVar.a).getId()});
            cVar4.P(((User) aVar.a).getName());
            cVar4.O(((User) aVar.a).b());
            cVar4.Q(hVar.b.contains(aVar.a));
            cVar4.M(false);
            cVar4.L(new b(backchannelCreateChatFragment2, aVar));
            oVar3.add(cVar4);
            i0.e.b.g3.m.e.c cVar5 = new i0.e.b.g3.m.e.c();
            cVar5.K(m0.n.b.i.k("divider", ((User) aVar.a).getId()));
            oVar3.add(cVar5);
        }
        return i.a;
    }
}
