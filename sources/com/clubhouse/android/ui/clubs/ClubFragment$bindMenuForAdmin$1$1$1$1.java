package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.l.w;
import i0.e.b.g3.l.x;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$bindMenuForAdmin$1$1$1$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ClubWithAdmin c;
    public final /* synthetic */ ClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$bindMenuForAdmin$1$1$1$1(ClubWithAdmin clubWithAdmin, ClubFragment clubFragment) {
        super(1);
        this.c = clubWithAdmin;
        this.d = clubFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.leave_the_club);
        aVar.b(this.c.g2 ? R.string.leave_club_message_admin_open_membership : R.string.leave_club_message_admin);
        aVar.d(R.string.leave, new x(this.d));
        aVar.c(R.string.never_mind, w.c);
        return i.a;
    }
}
