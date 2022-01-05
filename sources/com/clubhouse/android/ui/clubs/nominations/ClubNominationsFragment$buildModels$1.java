package com.clubhouse.android.ui.clubs.nominations;

import com.clubhouse.android.data.models.local.club.ClubNominationUser;
import com.clubhouse.android.ui.clubs.nominations.viewholder.ApprovalStatus;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.l.a3.b;
import i0.e.b.g3.l.a3.d;
import i0.e.b.g3.l.a3.q;
import i0.e.b.g3.l.a3.v.c;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ClubNominationsFragment.kt */
public final class ClubNominationsFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ ClubNominationsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNominationsFragment$buildModels$1(ClubNominationsFragment clubNominationsFragment) {
        super(1);
        this.c = clubNominationsFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        ClubNominationsFragment clubNominationsFragment = this.c;
        k<Object>[] kVarArr = ClubNominationsFragment.Z1;
        ClubNominationsViewModel O0 = clubNominationsFragment.O0();
        final ClubNominationsFragment clubNominationsFragment2 = this.c;
        v.v2(O0, new l<q, i>() {
            public Object invoke(Object obj) {
                ApprovalStatus approvalStatus;
                q qVar = (q) obj;
                m0.n.b.i.e(qVar, "state");
                List<ClubNominationUser> list = qVar.b;
                o oVar = o.this;
                ClubNominationsFragment clubNominationsFragment = clubNominationsFragment2;
                for (ClubNominationUser clubNominationUser : list) {
                    c cVar = new c();
                    cVar.G(new Number[]{clubNominationUser.getId()});
                    cVar.H(clubNominationUser);
                    int intValue = clubNominationUser.getId().intValue();
                    if (qVar.c.contains(Integer.valueOf(intValue))) {
                        approvalStatus = ApprovalStatus.APPROVED;
                    } else if (qVar.d.contains(Integer.valueOf(intValue))) {
                        approvalStatus = ApprovalStatus.REJECTED;
                    } else {
                        approvalStatus = ApprovalStatus.DEFAULT;
                    }
                    cVar.D(approvalStatus);
                    cVar.J(new i0.e.b.g3.l.a3.c(clubNominationsFragment, clubNominationUser));
                    cVar.E(new b(clubNominationsFragment, clubNominationUser));
                    cVar.I(new d(clubNominationsFragment, clubNominationUser));
                    oVar.add(cVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
