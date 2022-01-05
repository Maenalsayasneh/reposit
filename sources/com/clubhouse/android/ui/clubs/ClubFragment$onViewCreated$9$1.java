package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import i0.e.b.g3.l.g2;
import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$onViewCreated$9$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$onViewCreated$9$1(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    public Object invoke(Object obj) {
        v1 v1Var = (v1) obj;
        m0.n.b.i.e(v1Var, "state");
        GetClubResponse getClubResponse = v1Var.e;
        if (getClubResponse != null) {
            this.c.T0().p(new g2(getClubResponse.c.x));
        }
        return i.a;
    }
}
