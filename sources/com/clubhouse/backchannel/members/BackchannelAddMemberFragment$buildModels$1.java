package com.clubhouse.backchannel.members;

import com.clubhouse.android.user.model.User;
import i0.b.a.o;
import i0.e.b.a3.d.a;
import i0.e.b.g3.r.c3.c;
import i0.e.c.i.p;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelAddMemberFragment.kt */
public final class BackchannelAddMemberFragment$buildModels$1 extends Lambda implements l<p, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ BackchannelAddMemberFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelAddMemberFragment$buildModels$1(o oVar, BackchannelAddMemberFragment backchannelAddMemberFragment) {
        super(1);
        this.c = oVar;
        this.d = backchannelAddMemberFragment;
    }

    public Object invoke(Object obj) {
        p pVar = (p) obj;
        m0.n.b.i.e(pVar, "state");
        List<a> a = pVar.b.a();
        if (a == null) {
            return null;
        }
        o oVar = this.c;
        BackchannelAddMemberFragment backchannelAddMemberFragment = this.d;
        for (a aVar : a) {
            c cVar = new c();
            cVar.N(new Number[]{((User) aVar.a).getId()});
            cVar.P(((User) aVar.a).getName());
            cVar.O(((User) aVar.a).b());
            cVar.R(false);
            cVar.L(new i0.e.c.i.a(backchannelAddMemberFragment, aVar));
            oVar.add(cVar);
        }
        return i.a;
    }
}
