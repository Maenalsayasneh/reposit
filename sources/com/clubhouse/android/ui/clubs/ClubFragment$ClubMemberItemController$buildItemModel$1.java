package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.UserInClub;
import i0.e.b.b3.b.e.f;
import i0.e.b.g3.l.c3.s;
import i0.e.b.g3.l.h2;
import i0.e.b.g3.l.j;
import i0.e.b.g3.l.l2;
import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$ClubMemberItemController$buildItemModel$1 extends Lambda implements l<v1, s> {
    public final /* synthetic */ f c;
    public final /* synthetic */ ClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$ClubMemberItemController$buildItemModel$1(f fVar, ClubFragment clubFragment) {
        super(1);
        this.c = fVar;
        this.d = clubFragment;
    }

    public Object invoke(Object obj) {
        ClubRole clubRole;
        v1 v1Var = (v1) obj;
        i.e(v1Var, "state");
        s sVar = new s();
        boolean z = true;
        sVar.t(this.c.g.getId());
        UserInClub userInClub = this.c.g;
        sVar.w();
        sVar.j = userInClub;
        String str = this.c.g.y;
        sVar.w();
        sVar.k = str;
        boolean z2 = this.c.i;
        sVar.w();
        sVar.p = z2;
        f fVar = this.c;
        boolean z3 = !fVar.h && !fVar.j && !v1Var.m;
        sVar.w();
        sVar.m = z3;
        if (this.c.h || !v1Var.m) {
            z = false;
        }
        sVar.w();
        sVar.n = z;
        i0.e.b.g3.l.i iVar = new i0.e.b.g3.l.i(this.d, this.c);
        sVar.w();
        sVar.l = iVar;
        j jVar = new j(this.d, this.c);
        sVar.w();
        sVar.q = jVar;
        UserInClub userInClub2 = this.c.g;
        if (userInClub2.c) {
            clubRole = ClubRole.ADMIN;
        } else if (userInClub2.x) {
            clubRole = ClubRole.LEADER;
        } else {
            clubRole = ClubRole.MEMBER;
        }
        sVar.w();
        sVar.o = clubRole;
        final ClubFragment clubFragment = this.d;
        final f fVar2 = this.c;
        AnonymousClass3 r6 = new l<ClubRole, m0.i>() {
            public Object invoke(Object obj) {
                ClubRole clubRole = (ClubRole) obj;
                ClubViewModel T0 = ClubFragment.this.T0();
                UserInClub userInClub = fVar2.g;
                i.d(clubRole, "role");
                T0.p(new l2(userInClub, clubRole));
                return m0.i.a;
            }
        };
        sVar.w();
        sVar.r = r6;
        final ClubFragment clubFragment2 = this.d;
        final f fVar3 = this.c;
        AnonymousClass4 r62 = new a<m0.i>() {
            public Object invoke() {
                ClubFragment.this.T0().p(new h2(fVar3.g));
                return m0.i.a;
            }
        };
        sVar.w();
        sVar.s = r62;
        return sVar;
    }
}
