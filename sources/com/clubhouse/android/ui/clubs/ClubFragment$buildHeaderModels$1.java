package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.data.models.remote.response.GetEventsResponse;
import com.clubhouse.android.ui.clubs.viewholder.ClubActionButtons;
import i0.b.a.o;
import i0.e.b.g3.l.a;
import i0.e.b.g3.l.b;
import i0.e.b.g3.l.c3.b0;
import i0.e.b.g3.l.c3.f;
import i0.e.b.g3.l.c3.h;
import i0.e.b.g3.l.c3.m;
import i0.e.b.g3.l.e;
import i0.e.b.g3.l.e0;
import i0.e.b.g3.l.g;
import i0.e.b.g3.l.j0;
import i0.e.b.g3.l.l0;
import i0.e.b.g3.l.m0;
import i0.e.b.g3.l.n;
import i0.e.b.g3.l.n0;
import i0.e.b.g3.l.p0;
import i0.e.b.g3.l.q;
import i0.e.b.g3.l.q0;
import i0.e.b.g3.l.r;
import i0.e.b.g3.l.t;
import i0.e.b.g3.l.u;
import i0.e.b.g3.l.v;
import i0.e.b.g3.l.v1;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$buildHeaderModels$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ o d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$buildHeaderModels$1(ClubFragment clubFragment, o oVar) {
        super(1);
        this.c = clubFragment;
        this.d = oVar;
    }

    public Object invoke(Object obj) {
        List<EventInClub> list;
        v1 v1Var = (v1) obj;
        m0.n.b.i.e(v1Var, "state");
        GetEventsResponse a = v1Var.d.a();
        if (a == null) {
            list = null;
        } else {
            list = a.a;
        }
        GetClubResponse getClubResponse = v1Var.e;
        if (getClubResponse == null) {
            return null;
        }
        ClubFragment clubFragment = this.c;
        o oVar = this.d;
        boolean z = true;
        if (getClubResponse.d) {
            k<Object>[] kVarArr = ClubFragment.e2;
            Objects.requireNonNull(clubFragment);
            ClubWithAdmin clubWithAdmin = getClubResponse.c;
            i0.e.b.g3.l.c3.o oVar2 = new i0.e.b.g3.l.c3.o();
            oVar2.t(Integer.valueOf(clubWithAdmin.x));
            String str = clubWithAdmin.d2;
            oVar2.w();
            oVar2.k = str;
            a aVar = new a(clubFragment, clubWithAdmin);
            oVar2.w();
            oVar2.l = aVar;
            String str2 = clubWithAdmin.y;
            oVar2.w();
            oVar2.j = str2;
            String X0 = clubFragment.X0(clubWithAdmin);
            oVar2.w();
            oVar2.m = X0;
            oVar2.w();
            oVar2.n = !clubWithAdmin.a2.isEmpty();
            t tVar = new t(clubFragment, clubWithAdmin);
            oVar2.w();
            oVar2.o = tVar;
            oVar.add(oVar2);
            f fVar = new f();
            fVar.s(m0.n.b.i.k("ClubActionButtons", Integer.valueOf(clubWithAdmin.x)));
            ClubActionButtons.ClubStatus clubStatus = ClubActionButtons.ClubStatus.ADMIN;
            fVar.w();
            fVar.j = clubStatus;
            Integer num = getClubResponse.e2;
            fVar.w();
            fVar.o = num;
            u uVar = new u(clubFragment, getClubResponse);
            fVar.w();
            fVar.q = uVar;
            r rVar = new r(clubFragment, clubWithAdmin);
            fVar.w();
            fVar.v = rVar;
            oVar.add(fVar);
            if (!(list == null || list.isEmpty()) || clubFragment.W0(getClubResponse)) {
                m mVar = new m();
                mVar.s(m0.n.b.i.k("ClubEvents", Integer.valueOf(clubWithAdmin.x)));
                mVar.w();
                mVar.j = list;
                boolean W0 = clubFragment.W0(getClubResponse);
                mVar.w();
                mVar.k = W0;
                c cVar = new c(0, clubFragment);
                mVar.w();
                mVar.l = cVar;
                c cVar2 = new c(1, clubFragment);
                mVar.w();
                mVar.m = cVar2;
                oVar.add(mVar);
            }
            String str3 = clubWithAdmin.Z1;
            if (!(str3 == null || str3.length() == 0)) {
                h hVar = new h();
                hVar.s(m0.n.b.i.k("Description", Integer.valueOf(clubWithAdmin.x)));
                String str4 = clubWithAdmin.Z1;
                hVar.w();
                hVar.j = str4;
                oVar.add(hVar);
            }
            List<Topic> list2 = getClubResponse.d2;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (!z) {
                b0 b0Var = new b0();
                b0Var.s(m0.n.b.i.k("Topics", Integer.valueOf(clubWithAdmin.x)));
                b0Var.L(getClubResponse.d2);
                oVar.add(b0Var);
            }
            i0.e.b.g3.l.c3.r rVar2 = new i0.e.b.g3.l.c3.r();
            rVar2.s(m0.n.b.i.k("Search Bar", Integer.valueOf(clubWithAdmin.x)));
            l0 l0Var = new l0(clubFragment);
            rVar2.w();
            rVar2.j = l0Var;
            oVar.add(rVar2);
        } else if (getClubResponse.x) {
            k<Object>[] kVarArr2 = ClubFragment.e2;
            Objects.requireNonNull(clubFragment);
            ClubWithAdmin clubWithAdmin2 = getClubResponse.c;
            i0.e.b.g3.l.c3.o oVar3 = new i0.e.b.g3.l.c3.o();
            oVar3.t(Integer.valueOf(clubWithAdmin2.x));
            String str5 = clubWithAdmin2.d2;
            oVar3.w();
            oVar3.k = str5;
            i0.e.b.g3.l.h hVar2 = new i0.e.b.g3.l.h(clubFragment, clubWithAdmin2);
            oVar3.w();
            oVar3.l = hVar2;
            String str6 = clubWithAdmin2.y;
            oVar3.w();
            oVar3.j = str6;
            String X02 = clubFragment.X0(clubWithAdmin2);
            oVar3.w();
            oVar3.m = X02;
            oVar3.w();
            oVar3.n = !clubWithAdmin2.a2.isEmpty();
            g gVar = new g(clubFragment, clubWithAdmin2);
            oVar3.w();
            oVar3.o = gVar;
            oVar.add(oVar3);
            f fVar2 = new f();
            fVar2.s(m0.n.b.i.k("ClubActionButtons", Integer.valueOf(clubWithAdmin2.x)));
            ClubActionButtons.ClubStatus clubStatus2 = ClubActionButtons.ClubStatus.LEADER;
            fVar2.w();
            fVar2.j = clubStatus2;
            boolean z2 = clubWithAdmin2.h2;
            fVar2.w();
            fVar2.m = z2;
            boolean z3 = clubWithAdmin2.g2;
            fVar2.w();
            fVar2.n = z3;
            j0 j0Var = new j0(clubFragment, getClubResponse);
            fVar2.w();
            fVar2.q = j0Var;
            n nVar = new n(clubFragment, clubWithAdmin2);
            fVar2.w();
            fVar2.w = nVar;
            n0 n0Var = new n0(clubFragment, clubWithAdmin2);
            fVar2.w();
            fVar2.u = n0Var;
            i0.e.b.g3.l.m mVar2 = new i0.e.b.g3.l.m(clubFragment, clubWithAdmin2);
            fVar2.w();
            fVar2.x = mVar2;
            oVar.add(fVar2);
            if (!(list == null || list.isEmpty()) || clubFragment.W0(getClubResponse)) {
                m mVar3 = new m();
                mVar3.s(m0.n.b.i.k("ClubEvents", Integer.valueOf(clubWithAdmin2.x)));
                mVar3.w();
                mVar3.j = list;
                boolean W02 = clubFragment.W0(getClubResponse);
                mVar3.w();
                mVar3.k = W02;
                h hVar3 = new h(0, clubFragment);
                mVar3.w();
                mVar3.l = hVar3;
                h hVar4 = new h(1, clubFragment);
                mVar3.w();
                mVar3.m = hVar4;
                oVar.add(mVar3);
            }
            String str7 = clubWithAdmin2.Z1;
            if (!(str7 == null || str7.length() == 0)) {
                h hVar5 = new h();
                hVar5.s(m0.n.b.i.k("Description", Integer.valueOf(clubWithAdmin2.x)));
                String str8 = clubWithAdmin2.Z1;
                hVar5.w();
                hVar5.j = str8;
                oVar.add(hVar5);
            }
            List<Topic> list3 = getClubResponse.d2;
            if (list3 != null && !list3.isEmpty()) {
                z = false;
            }
            if (!z) {
                b0 b0Var2 = new b0();
                b0Var2.s(m0.n.b.i.k("Topics", Integer.valueOf(clubWithAdmin2.x)));
                b0Var2.L(getClubResponse.d2);
                oVar.add(b0Var2);
            }
            i0.e.b.g3.l.c3.r rVar3 = new i0.e.b.g3.l.c3.r();
            rVar3.s(m0.n.b.i.k("Search Bar", Integer.valueOf(clubWithAdmin2.x)));
            q0 q0Var = new q0(clubFragment);
            rVar3.w();
            rVar3.j = q0Var;
            oVar.add(rVar3);
        } else if (getClubResponse.q) {
            k<Object>[] kVarArr3 = ClubFragment.e2;
            Objects.requireNonNull(clubFragment);
            ClubWithAdmin clubWithAdmin3 = getClubResponse.c;
            i0.e.b.g3.l.c3.o oVar4 = new i0.e.b.g3.l.c3.o();
            oVar4.t(Integer.valueOf(clubWithAdmin3.x));
            String str9 = clubWithAdmin3.d2;
            oVar4.w();
            oVar4.k = str9;
            i0.e.b.g3.l.f fVar3 = new i0.e.b.g3.l.f(clubFragment, clubWithAdmin3);
            oVar4.w();
            oVar4.l = fVar3;
            String str10 = clubWithAdmin3.y;
            oVar4.w();
            oVar4.j = str10;
            String X03 = clubFragment.X0(clubWithAdmin3);
            oVar4.w();
            oVar4.m = X03;
            oVar4.w();
            oVar4.n = !clubWithAdmin3.a2.isEmpty();
            p0 p0Var = new p0(clubFragment, clubWithAdmin3);
            oVar4.w();
            oVar4.o = p0Var;
            oVar.add(oVar4);
            f fVar4 = new f();
            fVar4.s(m0.n.b.i.k("ClubActionButtons", Integer.valueOf(clubWithAdmin3.x)));
            ClubActionButtons.ClubStatus clubStatus3 = ClubActionButtons.ClubStatus.MEMBER;
            fVar4.w();
            fVar4.j = clubStatus3;
            boolean z4 = clubWithAdmin3.h2;
            fVar4.w();
            fVar4.m = z4;
            boolean z5 = clubWithAdmin3.g2;
            fVar4.w();
            fVar4.n = z5;
            m0 m0Var = new m0(clubFragment, clubWithAdmin3);
            fVar4.w();
            fVar4.w = m0Var;
            q qVar = new q(clubFragment, clubWithAdmin3);
            fVar4.w();
            fVar4.u = qVar;
            i0.e.b.g3.l.o oVar5 = new i0.e.b.g3.l.o(clubFragment, clubWithAdmin3);
            fVar4.w();
            fVar4.x = oVar5;
            oVar.add(fVar4);
            if (!(list == null || list.isEmpty()) || clubFragment.W0(getClubResponse)) {
                m mVar4 = new m();
                mVar4.s(m0.n.b.i.k("ClubEvents", Integer.valueOf(clubWithAdmin3.x)));
                mVar4.w();
                mVar4.j = list;
                boolean W03 = clubFragment.W0(getClubResponse);
                mVar4.w();
                mVar4.k = W03;
                ClubFragment$buildHeaderModelForMember$3$1 clubFragment$buildHeaderModelForMember$3$1 = new ClubFragment$buildHeaderModelForMember$3$1(clubFragment);
                mVar4.w();
                mVar4.m = clubFragment$buildHeaderModelForMember$3$1;
                oVar.add(mVar4);
            }
            String str11 = clubWithAdmin3.Z1;
            if (!(str11 == null || str11.length() == 0)) {
                h hVar6 = new h();
                hVar6.s(m0.n.b.i.k("Description", Integer.valueOf(clubWithAdmin3.x)));
                String str12 = clubWithAdmin3.Z1;
                hVar6.w();
                hVar6.j = str12;
                oVar.add(hVar6);
            }
            List<Topic> list4 = getClubResponse.d2;
            if (list4 != null && !list4.isEmpty()) {
                z = false;
            }
            if (!z) {
                b0 b0Var3 = new b0();
                b0Var3.s(m0.n.b.i.k("Topics", Integer.valueOf(clubWithAdmin3.x)));
                b0Var3.L(getClubResponse.d2);
                oVar.add(b0Var3);
            }
        } else {
            k<Object>[] kVarArr4 = ClubFragment.e2;
            Objects.requireNonNull(clubFragment);
            ClubWithAdmin clubWithAdmin4 = getClubResponse.c;
            i0.e.b.g3.l.c3.o oVar6 = new i0.e.b.g3.l.c3.o();
            oVar6.t(Integer.valueOf(clubWithAdmin4.x));
            String str13 = clubWithAdmin4.d2;
            oVar6.w();
            oVar6.k = str13;
            e eVar = new e(clubFragment, clubWithAdmin4);
            oVar6.w();
            oVar6.l = eVar;
            String X04 = clubFragment.X0(clubWithAdmin4);
            oVar6.w();
            oVar6.m = X04;
            oVar6.w();
            oVar6.n = !clubWithAdmin4.a2.isEmpty();
            i0.e.b.g3.l.l lVar = new i0.e.b.g3.l.l(clubFragment, clubWithAdmin4);
            oVar6.w();
            oVar6.o = lVar;
            String str14 = clubWithAdmin4.y;
            oVar6.w();
            oVar6.j = str14;
            oVar.add(oVar6);
            f fVar5 = new f();
            fVar5.s(m0.n.b.i.k("ClubActionButtons", Integer.valueOf(clubWithAdmin4.x)));
            ClubActionButtons.ClubStatus clubStatus4 = ClubActionButtons.ClubStatus.STRANGER;
            fVar5.w();
            fVar5.j = clubStatus4;
            BasicUser basicUser = getClubResponse.a2;
            fVar5.w();
            fVar5.k = basicUser;
            boolean z6 = getClubResponse.y;
            fVar5.w();
            fVar5.l = z6;
            boolean z7 = getClubResponse.c.g2;
            fVar5.w();
            fVar5.n = z7;
            boolean z8 = getClubResponse.c.h2;
            fVar5.w();
            fVar5.m = z8;
            boolean z9 = getClubResponse.Y1;
            fVar5.w();
            fVar5.p = z9;
            b bVar = new b(getClubResponse, clubFragment, clubWithAdmin4);
            fVar5.w();
            fVar5.r = bVar;
            e0 e0Var = new e0(clubFragment, getClubResponse);
            fVar5.w();
            fVar5.s = e0Var;
            v vVar = new v(clubFragment, getClubResponse);
            fVar5.w();
            fVar5.t = vVar;
            oVar.add(fVar5);
            if (!(list == null || list.isEmpty()) || clubFragment.W0(getClubResponse)) {
                m mVar5 = new m();
                mVar5.s(m0.n.b.i.k("ClubEvents", Integer.valueOf(clubWithAdmin4.x)));
                mVar5.w();
                mVar5.j = list;
                boolean W04 = clubFragment.W0(getClubResponse);
                mVar5.w();
                mVar5.k = W04;
                ClubFragment$buildHeaderModelForStranger$3$1 clubFragment$buildHeaderModelForStranger$3$1 = new ClubFragment$buildHeaderModelForStranger$3$1(clubFragment);
                mVar5.w();
                mVar5.m = clubFragment$buildHeaderModelForStranger$3$1;
                oVar.add(mVar5);
            }
            String str15 = clubWithAdmin4.Z1;
            if (!(str15 == null || str15.length() == 0)) {
                h hVar7 = new h();
                hVar7.s(m0.n.b.i.k("Description", Integer.valueOf(clubWithAdmin4.x)));
                String str16 = clubWithAdmin4.Z1;
                hVar7.w();
                hVar7.j = str16;
                oVar.add(hVar7);
            }
            List<Topic> list5 = getClubResponse.d2;
            if (list5 != null && !list5.isEmpty()) {
                z = false;
            }
            if (!z) {
                b0 b0Var4 = new b0();
                b0Var4.s(m0.n.b.i.k("Topics", Integer.valueOf(clubWithAdmin4.x)));
                b0Var4.L(getClubResponse.d2);
                oVar.add(b0Var4);
            }
        }
        return i.a;
    }
}
