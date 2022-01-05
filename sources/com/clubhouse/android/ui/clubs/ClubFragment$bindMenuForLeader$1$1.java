package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.app.R;
import h0.b.f.m0;
import i0.e.b.g3.l.d0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$bindMenuForLeader$1$1 extends Lambda implements l<m0, i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$bindMenuForLeader$1$1(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        super(1);
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public Object invoke(Object obj) {
        m0 m0Var = (m0) obj;
        m0.n.b.i.e(m0Var, "$this$popUpMenu");
        m0Var.a(R.menu.menu_club_leader);
        m0Var.e = new d0(this.c, this.d);
        return i.a;
    }
}
