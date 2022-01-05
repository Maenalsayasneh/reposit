package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserInList;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.w;
import i0.e.b.g3.u.x;
import i0.e.b.g3.u.y;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$buildFollowSuggestionModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$buildFollowSuggestionModels$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        HalfProfileViewModel U0 = this.c.U0();
        final HalfProfileFragment halfProfileFragment = this.c;
        v.v2(U0, new l<q4, i>() {
            public Object invoke(Object obj) {
                q4 q4Var = (q4) obj;
                m0.n.b.i.e(q4Var, "state");
                List<UserInList> list = q4Var.l;
                if (list != null) {
                    o oVar = o.this;
                    HalfProfileFragment halfProfileFragment = halfProfileFragment;
                    for (UserInList userInList : list) {
                        i0.e.b.g3.u.a6.i iVar = new i0.e.b.g3.u.a6.i();
                        iVar.N(new Number[]{userInList.getId()});
                        iVar.O(userInList.y);
                        iVar.P(userInList.Z1);
                        iVar.L(userInList.c);
                        iVar.M(new y(halfProfileFragment, userInList));
                        iVar.R(new x(halfProfileFragment, userInList));
                        iVar.Q(new w(halfProfileFragment, userInList));
                        oVar.add(iVar);
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
