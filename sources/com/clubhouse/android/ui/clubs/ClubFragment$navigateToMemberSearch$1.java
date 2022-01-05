package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.l.f1;
import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$navigateToMemberSearch$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$navigateToMemberSearch$1(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    public Object invoke(Object obj) {
        v1 v1Var = (v1) obj;
        m0.n.b.i.e(v1Var, "state");
        Integer num = v1Var.a;
        if (num == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (v1Var.e != null) {
            ClubFragment clubFragment = this.c;
            int intValue = num.intValue();
            GetClubResponse getClubResponse = v1Var.e;
            ClubMemberSearchArgs clubMemberSearchArgs = new ClubMemberSearchArgs(intValue, getClubResponse.d, getClubResponse.x);
            m0.n.b.i.e(clubMemberSearchArgs, "mavericksArg");
            v.a1(clubFragment, new f1(clubMemberSearchArgs), (q) null, 2);
            return i.a;
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
