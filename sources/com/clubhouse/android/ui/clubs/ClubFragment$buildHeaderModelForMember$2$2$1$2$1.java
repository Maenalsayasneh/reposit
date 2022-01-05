package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.l.h0;
import i0.e.b.g3.l.i0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$buildHeaderModelForMember$2$2$1$2$1 extends Lambda implements a<i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$buildHeaderModelForMember$2$2$1$2$1(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        super(0);
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public Object invoke() {
        final ClubFragment clubFragment = this.c;
        final ClubWithAdmin clubWithAdmin = this.d;
        AnonymousClass1 r1 = new l<d.a, i>() {
            public Object invoke(Object obj) {
                d.a aVar = (d.a) obj;
                m0.n.b.i.e(aVar, "$this$alertDialog");
                aVar.e(R.string.leave_the_club);
                aVar.b(ClubWithAdmin.this.g2 ? R.string.leave_club_message_member_open_membership : R.string.leave_club_message_member);
                aVar.d(R.string.leave, new h0(clubFragment));
                aVar.c(R.string.never_mind, i0.c);
                return i.a;
            }
        };
        m0.n.b.i.e(clubFragment, "<this>");
        m0.n.b.i.e(r1, "f");
        d.a aVar = new d.a(clubFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        r1.invoke(aVar);
        aVar.g();
        return i.a;
    }
}
