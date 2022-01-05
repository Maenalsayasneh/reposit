package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserInList;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.f3;
import i0.e.b.g3.u.g3;
import i0.e.b.g3.u.h3;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$buildFollowSuggestionModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$buildFollowSuggestionModels$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        ProfileViewModel P0 = this.c.P0();
        final ProfileFragment profileFragment = this.c;
        v.v2(P0, new l<c5, i>() {
            public Object invoke(Object obj) {
                c5 c5Var = (c5) obj;
                m0.n.b.i.e(c5Var, "state");
                List<UserInList> list = c5Var.m;
                if (list != null) {
                    o oVar = o.this;
                    ProfileFragment profileFragment = profileFragment;
                    for (UserInList userInList : list) {
                        i0.e.b.g3.u.a6.i iVar = new i0.e.b.g3.u.a6.i();
                        iVar.N(new Number[]{userInList.getId()});
                        iVar.O(userInList.y);
                        iVar.P(userInList.Z1);
                        iVar.L(userInList.c);
                        iVar.M(new f3(profileFragment, userInList));
                        iVar.R(new h3(profileFragment, userInList));
                        iVar.Q(new g3(profileFragment, userInList));
                        oVar.add(iVar);
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
