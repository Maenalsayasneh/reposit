package com.clubhouse.android.ui.hallway.feed.viewholder;

import i0.b.a.o;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.p.c0.e0.y0;
import i0.e.b.g3.p.c0.e0.z0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: UserSuggestions.kt */
public final class UserSuggestions$bindUserSuggestions$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ z0 c;
    public final /* synthetic */ z0.a d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserSuggestions$bindUserSuggestions$1(z0 z0Var, z0.a aVar) {
        super(1);
        this.c = z0Var;
        this.d = aVar;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        z0 z0Var = this.c;
        List<m> list = z0Var.k;
        if (list != null) {
            z0.a aVar = this.d;
            for (m mVar : list) {
                y0 y0Var = new y0();
                y0Var.O(new Number[]{mVar.g.getId()});
                y0Var.P(new UserSuggestions$bindUserSuggestions$1$1$1$1$1(z0Var, mVar));
                y0Var.Q(mVar);
                y0Var.R(z0Var.l);
                y0Var.N(new UserSuggestions$bindUserSuggestions$1$1$1$1$2(z0Var, aVar, list));
                y0Var.M(z0Var.o);
                oVar.add(y0Var);
            }
        }
        return i.a;
    }
}
