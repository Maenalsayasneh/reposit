package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import i0.e.b.g3.l.g2;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$handleClubRulesOnAccept$1 extends Lambda implements l<Boolean, i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$handleClubRulesOnAccept$1(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        super(1);
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.c.T0().p(new g2(this.d.x));
        }
        return i.a;
    }
}
