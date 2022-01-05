package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.clubs.invites.GrowClubArgs;
import com.clubhouse.android.ui.clubs.invites.GrowClubMethod;
import com.clubhouse.android.ui.clubs.invites.GrowClubSource;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.l.j1;
import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$buildHeaderModelForAdmin$2$2$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$buildHeaderModelForAdmin$2$2$1(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        super(1);
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((v1) obj, "it");
        ClubFragment clubFragment = this.c;
        int i = this.d.x;
        GrowClubMethod growClubMethod = GrowClubMethod.INVITE;
        m0.n.b.i.e(clubFragment, "<this>");
        m0.n.b.i.e(growClubMethod, "method");
        GrowClubArgs growClubArgs = new GrowClubArgs(i, growClubMethod, GrowClubSource.CLUB);
        m0.n.b.i.e(growClubArgs, "mavericksArg");
        v.a1(clubFragment, new j1(growClubArgs), (q) null, 2);
        return i.a;
    }
}
