package com.clubhouse.android.ui.clubs.invites;

import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.x2.t;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$RecommendationPagingController$addModels$1 extends Lambda implements p<v1, t, i> {
    public final /* synthetic */ GrowClubFragment.RecommendationPagingController c;
    public final /* synthetic */ GrowClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$RecommendationPagingController$addModels$1(GrowClubFragment.RecommendationPagingController recommendationPagingController, GrowClubFragment growClubFragment) {
        super(2);
        this.c = recommendationPagingController;
        this.d = growClubFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            i0.e.b.g3.l.v1 r11 = (i0.e.b.g3.l.v1) r11
            i0.e.b.g3.l.x2.t r12 = (i0.e.b.g3.l.x2.t) r12
            java.lang.String r0 = "clubViewState"
            m0.n.b.i.e(r11, r0)
            java.lang.String r0 = "state"
            m0.n.b.i.e(r12, r0)
            i0.b.b.b<com.clubhouse.android.data.models.remote.response.GetEventsResponse> r0 = r11.d
            java.lang.Object r0 = r0.a()
            com.clubhouse.android.data.models.remote.response.GetEventsResponse r0 = (com.clubhouse.android.data.models.remote.response.GetEventsResponse) r0
            if (r0 != 0) goto L_0x001b
            r11 = 0
            goto L_0x0105
        L_0x001b:
            com.clubhouse.android.ui.clubs.invites.GrowClubFragment$RecommendationPagingController r0 = r10.c
            com.clubhouse.android.ui.clubs.invites.GrowClubFragment r1 = r10.d
            boolean r2 = r12.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0098
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r2 = r11.i
            if (r2 == 0) goto L_0x0098
            java.lang.String r2 = r11.l
            if (r2 != 0) goto L_0x002e
            goto L_0x003b
        L_0x002e:
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0036
            r2 = r4
            goto L_0x0037
        L_0x0036:
            r2 = r3
        L_0x0037:
            if (r2 != r4) goto L_0x003b
            r2 = r4
            goto L_0x003c
        L_0x003b:
            r2 = r3
        L_0x003c:
            if (r2 == 0) goto L_0x0098
            i0.e.b.g3.l.x2.m r2 = new i0.e.b.g3.l.x2.m
            r2.<init>()
            java.lang.String r5 = "invite"
            r2.E(r5)
            android.content.res.Resources r5 = r1.getResources()
            java.lang.String r6 = "resources"
            m0.n.b.i.d(r5, r6)
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r7 = r11.i
            com.clubhouse.android.data.models.local.EventInClub r8 = r11.k
            if (r8 == 0) goto L_0x0059
            r8 = r4
            goto L_0x005a
        L_0x0059:
            r8 = r3
        L_0x005a:
            java.lang.String r9 = "<this>"
            m0.n.b.i.e(r2, r9)
            m0.n.b.i.e(r5, r6)
            java.lang.String r6 = "club"
            m0.n.b.i.e(r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = r7.getName()
            r6[r3] = r7
            r7 = 2131951811(0x7f1300c3, float:1.9540047E38)
            java.lang.String r6 = r5.getString(r7, r6)
            r2.H(r6)
            if (r8 == 0) goto L_0x0083
            r6 = 2131952639(0x7f1303ff, float:1.9541726E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x008a
        L_0x0083:
            r6 = 2131952790(0x7f130496, float:1.9542033E38)
            java.lang.String r5 = r5.getString(r6)
        L_0x008a:
            r2.G(r5)
            i0.e.b.g3.l.x2.b r5 = new i0.e.b.g3.l.x2.b
            r5.<init>(r1, r11)
            r2.F(r5)
            r0.add(r2)
        L_0x0098:
            i0.b.b.b<com.clubhouse.android.data.models.remote.response.GetClubNominationsResponse> r11 = r12.h
            java.lang.Object r11 = r11.a()
            com.clubhouse.android.data.models.remote.response.GetClubNominationsResponse r11 = (com.clubhouse.android.data.models.remote.response.GetClubNominationsResponse) r11
            if (r11 != 0) goto L_0x00a3
            goto L_0x00eb
        L_0x00a3:
            java.util.List<com.clubhouse.android.data.models.local.club.ClubNominationUser> r12 = r11.a
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r4
            if (r12 == 0) goto L_0x00eb
            i0.e.b.g3.l.c3.y r12 = new i0.e.b.g3.l.c3.y
            r12.<init>()
            java.lang.String r2 = "nominations header"
            r12.D(r2)
            r2 = 2131952540(0x7f13039c, float:1.9541526E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.util.List<com.clubhouse.android.data.models.local.club.ClubNominationUser> r5 = r11.a
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            java.lang.String r2 = r1.getString(r2, r4)
            r12.E(r2)
            r0.add(r12)
            i0.e.b.g3.l.x2.p r12 = new i0.e.b.g3.l.x2.p
            r12.<init>()
            java.lang.String r2 = "nominations"
            r12.E(r2)
            java.util.List<com.clubhouse.android.data.models.local.club.ClubNominationUser> r11 = r11.a
            r12.F(r11)
            i0.e.b.g3.l.x2.a r11 = new i0.e.b.g3.l.x2.a
            r11.<init>(r1)
            r12.D(r11)
            r0.add(r12)
        L_0x00eb:
            i0.e.b.g3.l.c3.y r11 = new i0.e.b.g3.l.c3.y
            r11.<init>()
            java.lang.String r12 = "recommended"
            r11.D(r12)
            r12 = 2131952669(0x7f13041d, float:1.9541787E38)
            java.lang.String r12 = r1.getString(r12)
            r11.E(r12)
            m0.i r12 = m0.i.a
            r0.add(r11)
            r11 = r12
        L_0x0105:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.clubs.invites.GrowClubFragment$RecommendationPagingController$addModels$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
