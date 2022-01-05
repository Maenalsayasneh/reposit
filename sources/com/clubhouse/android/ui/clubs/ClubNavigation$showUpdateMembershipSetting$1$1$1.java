package com.clubhouse.android.ui.clubs;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.l.w0;
import i0.e.b.g3.l.x0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubNavigation.kt */
public final class ClubNavigation$showUpdateMembershipSetting$1$1$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNavigation$showUpdateMembershipSetting$1$1$1(ClubFragment clubFragment, boolean z) {
        super(1);
        this.c = clubFragment;
        this.d = z;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.are_you_sure, R.string.club_confirm_make_membership_open);
        aVar.c(R.string.never_mind, x0.c);
        aVar.d(R.string.sounds_good, new w0(this.c, this.d));
        return i.a;
    }
}
