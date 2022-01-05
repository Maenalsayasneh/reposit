package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.l.b0;
import i0.e.b.g3.l.c0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$bindMenuForLeader$1$1$1$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ClubWithAdmin c;
    public final /* synthetic */ ClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$bindMenuForLeader$1$1$1$1(ClubWithAdmin clubWithAdmin, ClubFragment clubFragment) {
        super(1);
        this.c = clubWithAdmin;
        this.d = clubFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.leave_the_club);
        aVar.b(this.c.g2 ? R.string.leave_club_message_leader_open_membership : R.string.leave_club_message_leader);
        aVar.d(R.string.leave, new c0(this.d));
        aVar.c(R.string.never_mind, b0.c);
        return i.a;
    }
}
