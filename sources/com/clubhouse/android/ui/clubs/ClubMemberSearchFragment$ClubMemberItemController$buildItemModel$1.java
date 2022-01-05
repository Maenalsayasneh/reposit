package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.android.ui.clubs.ClubMemberSearchFragment;
import i0.e.b.b3.b.e.f;
import i0.e.b.g3.l.c3.s;
import i0.e.b.g3.l.h2;
import i0.e.b.g3.l.l2;
import i0.e.b.g3.l.s0;
import i0.e.b.g3.l.s1;
import i0.e.b.g3.l.t0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ClubMemberSearchFragment.kt */
public final class ClubMemberSearchFragment$ClubMemberItemController$buildItemModel$1 extends Lambda implements l<s1, s> {
    public final /* synthetic */ f c;
    public final /* synthetic */ ClubMemberSearchFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubMemberSearchFragment$ClubMemberItemController$buildItemModel$1(f fVar, ClubMemberSearchFragment clubMemberSearchFragment) {
        super(1);
        this.c = fVar;
        this.d = clubMemberSearchFragment;
    }

    public Object invoke(Object obj) {
        ClubRole clubRole;
        s1 s1Var = (s1) obj;
        i.e(s1Var, "state");
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
        boolean z3 = !fVar.h && !fVar.j && !s1Var.b;
        sVar.w();
        sVar.m = z3;
        if (this.c.h || !s1Var.b) {
            z = false;
        }
        sVar.w();
        sVar.n = z;
        s0 s0Var = new s0(this.d, this.c);
        sVar.w();
        sVar.l = s0Var;
        t0 t0Var = new t0(this.d, this.c);
        sVar.w();
        sVar.q = t0Var;
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
        final ClubMemberSearchFragment clubMemberSearchFragment = this.d;
        final f fVar2 = this.c;
        AnonymousClass3 r6 = new l<ClubRole, m0.i>() {
            public Object invoke(Object obj) {
                ClubRole clubRole = (ClubRole) obj;
                ClubMemberSearchFragment clubMemberSearchFragment = ClubMemberSearchFragment.this;
                ClubMemberSearchFragment.a aVar = ClubMemberSearchFragment.Z1;
                ClubMemberSearchViewModel O0 = clubMemberSearchFragment.O0();
                UserInClub userInClub = fVar2.g;
                i.d(clubRole, "role");
                O0.p(new l2(userInClub, clubRole));
                return m0.i.a;
            }
        };
        sVar.w();
        sVar.r = r6;
        final ClubMemberSearchFragment clubMemberSearchFragment2 = this.d;
        final f fVar3 = this.c;
        AnonymousClass4 r62 = new a<m0.i>() {
            public Object invoke() {
                ClubMemberSearchFragment clubMemberSearchFragment = ClubMemberSearchFragment.this;
                ClubMemberSearchFragment.a aVar = ClubMemberSearchFragment.Z1;
                clubMemberSearchFragment.O0().p(new h2(fVar3.g));
                return m0.i.a;
            }
        };
        sVar.w();
        sVar.s = r62;
        return sVar;
    }
}
