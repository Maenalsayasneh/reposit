package com.clubhouse.android.ui.clubs.invites;

import h0.b0.v;
import i0.e.b.a3.d.b;
import i0.e.b.g3.l.x2.t;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$handleBackNavigation$1 extends Lambda implements l<t, i> {
    public final /* synthetic */ GrowClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$handleBackNavigation$1(GrowClubFragment growClubFragment) {
        super(1);
        this.c = growClubFragment;
    }

    public Object invoke(Object obj) {
        t tVar = (t) obj;
        m0.n.b.i.e(tVar, "state");
        if (tVar.g.length() > 0) {
            v.x0(this.c);
            GrowClubFragment growClubFragment = this.c;
            k<Object>[] kVarArr = GrowClubFragment.Z1;
            growClubFragment.R0().p(new b(""));
        } else {
            v.V1(this.c, "club_update_result", Boolean.TRUE);
            v.c1(this.c);
        }
        return i.a;
    }
}
