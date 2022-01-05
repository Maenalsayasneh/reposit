package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserProfile;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.u.a6.c;
import i0.e.b.g3.u.a6.f;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.d3;
import i0.e.b.g3.u.e3;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$buildClubModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$buildClubModels$1(ProfileFragment profileFragment) {
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
                List<ClubWithAdmin> list;
                c5 c5Var = (c5) obj;
                m0.n.b.i.e(c5Var, "state");
                UserProfile userProfile = c5Var.l;
                if (!(userProfile == null || (list = userProfile.h2) == null)) {
                    o oVar = o.this;
                    ProfileFragment profileFragment = profileFragment;
                    for (ClubWithAdmin clubWithAdmin : list) {
                        c cVar = new c();
                        cVar.O(new Number[]{Integer.valueOf(clubWithAdmin.x)});
                        cVar.P(clubWithAdmin.y);
                        cVar.Q(clubWithAdmin.d2);
                        cVar.M(clubWithAdmin.c);
                        cVar.N(clubWithAdmin.d);
                        cVar.L(new d3(profileFragment, clubWithAdmin));
                        oVar.add(cVar);
                    }
                }
                if (c5Var.p && userProfile != null) {
                    o oVar2 = o.this;
                    ProfileFragment profileFragment2 = profileFragment;
                    f fVar = new f();
                    fVar.M(new Number[]{userProfile.getId()});
                    fVar.L(new e3(profileFragment2, userProfile));
                    oVar2.add(fVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
