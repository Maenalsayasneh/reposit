package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import i0.e.b.g3.l.o2;
import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubNavigation.kt */
public final class ClubNavigation$showUpdateMembershipSetting$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNavigation$showUpdateMembershipSetting$1(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    public Object invoke(Object obj) {
        int i;
        v1 v1Var = (v1) obj;
        m0.n.b.i.e(v1Var, "state");
        GetClubResponse getClubResponse = v1Var.e;
        if (getClubResponse == null) {
            return null;
        }
        ClubFragment clubFragment = this.c;
        boolean z = !getClubResponse.c.g2;
        Integer num = getClubResponse.e2;
        if (num == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        if (!z || i <= 0) {
            clubFragment.T0().p(new o2(z));
        } else {
            ClubNavigation$showUpdateMembershipSetting$1$1$1 clubNavigation$showUpdateMembershipSetting$1$1$1 = new ClubNavigation$showUpdateMembershipSetting$1$1$1(clubFragment, z);
            m0.n.b.i.e(clubFragment, "<this>");
            m0.n.b.i.e(clubNavigation$showUpdateMembershipSetting$1$1$1, "f");
            d.a aVar = new d.a(clubFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            clubNavigation$showUpdateMembershipSetting$1$1$1.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
