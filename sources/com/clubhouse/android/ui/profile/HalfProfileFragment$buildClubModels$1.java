package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserProfile;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.u.a6.c;
import i0.e.b.g3.u.a6.f;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.u;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$buildClubModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$buildClubModels$1(HalfProfileFragment halfProfileFragment) {
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
                List<ClubWithAdmin> list;
                q4 q4Var = (q4) obj;
                m0.n.b.i.e(q4Var, "state");
                UserProfile userProfile = q4Var.k;
                if (!(userProfile == null || (list = userProfile.h2) == null)) {
                    o oVar = o.this;
                    HalfProfileFragment halfProfileFragment = halfProfileFragment;
                    for (ClubWithAdmin clubWithAdmin : list) {
                        c cVar = new c();
                        cVar.O(new Number[]{Integer.valueOf(clubWithAdmin.x)});
                        cVar.P(clubWithAdmin.y);
                        cVar.Q(clubWithAdmin.d2);
                        cVar.L(new i0.e.b.g3.u.v(halfProfileFragment, clubWithAdmin));
                        oVar.add(cVar);
                    }
                }
                if (q4Var.o && userProfile != null) {
                    o oVar2 = o.this;
                    HalfProfileFragment halfProfileFragment2 = halfProfileFragment;
                    f fVar = new f();
                    fVar.M(new Number[]{userProfile.getId()});
                    fVar.L(new u(halfProfileFragment2, userProfile));
                    oVar2.add(fVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
