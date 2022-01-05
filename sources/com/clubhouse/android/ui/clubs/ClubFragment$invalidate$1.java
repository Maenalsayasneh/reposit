package com.clubhouse.android.ui.clubs;

import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$invalidate$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$invalidate$1(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            i0.e.b.g3.l.v1 r1 = (i0.e.b.g3.l.v1) r1
            java.lang.String r2 = "state"
            m0.n.b.i.e(r1, r2)
            com.clubhouse.android.ui.clubs.ClubFragment r2 = r0.c
            m0.r.k<java.lang.Object>[] r3 = com.clubhouse.android.ui.clubs.ClubFragment.e2
            com.clubhouse.android.databinding.FragmentClubBinding r2 = r2.S0()
            android.widget.FrameLayout r2 = r2.c
            java.lang.String r3 = "binding.loading"
            m0.n.b.i.d(r2, r3)
            i0.b.b.b<com.clubhouse.android.data.models.remote.response.GetClubResponse> r3 = r1.c
            boolean r3 = r3 instanceof i0.b.b.f
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "<this>"
            m0.n.b.i.e(r2, r4)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r3 = m0.n.b.i.a(r3, r5)
            if (r3 == 0) goto L_0x0033
            i0.e.b.d3.k.l(r2)
            goto L_0x0036
        L_0x0033:
            i0.e.b.d3.k.m(r2)
        L_0x0036:
            com.clubhouse.android.ui.clubs.ClubFragment r2 = r0.c
            com.clubhouse.android.databinding.FragmentClubBinding r2 = r2.S0()
            android.widget.ImageView r2 = r2.f
            java.lang.String r3 = "binding.share"
            m0.n.b.i.d(r2, r3)
            com.clubhouse.android.ui.clubs.ClubFragment r3 = r0.c
            h0.q.p r3 = r3.getViewLifecycleOwner()
            java.lang.String r5 = "viewLifecycleOwner"
            m0.n.b.i.d(r3, r5)
            androidx.lifecycle.LifecycleCoroutineScope r3 = h0.q.q.a(r3)
            com.clubhouse.android.ui.clubs.ClubFragment r6 = r0.c
            i0.e.b.g3.l.o0 r7 = new i0.e.b.g3.l.o0
            r7.<init>(r6, r1)
            i0.e.b.d3.k.H(r2, r3, r7)
            i0.b.b.b<com.clubhouse.android.data.models.remote.response.GetClubResponse> r2 = r1.c
            boolean r3 = r2 instanceof i0.b.b.f0
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0245
            i0.b.b.b<com.clubhouse.android.data.models.remote.response.GetEventsResponse> r3 = r1.d
            boolean r3 = r3 instanceof i0.b.b.f0
            if (r3 == 0) goto L_0x0245
            i0.e.b.g3.l.y2.a r3 = r1.h
            boolean r9 = r3.a
            if (r9 != 0) goto L_0x0245
            boolean r9 = r3 instanceof i0.e.b.g3.l.y2.a.b
            if (r9 == 0) goto L_0x0076
            r10 = 1
            goto L_0x0078
        L_0x0076:
            boolean r10 = r3 instanceof i0.e.b.g3.l.y2.a.c
        L_0x0078:
            if (r10 == 0) goto L_0x007c
            r10 = 1
            goto L_0x007e
        L_0x007c:
            boolean r10 = r3 instanceof i0.e.b.g3.l.y2.a.d
        L_0x007e:
            if (r10 == 0) goto L_0x0245
            com.clubhouse.android.ui.clubs.ClubFragment r10 = r0.c
            i0.b.b.f0 r2 = (i0.b.b.f0) r2
            T r2 = r2.b
            com.clubhouse.android.data.models.remote.response.GetClubResponse r2 = (com.clubhouse.android.data.models.remote.response.GetClubResponse) r2
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r2 = r2.c
            android.view.LayoutInflater r11 = r10.getLayoutInflater()
            r12 = 2131558476(0x7f0d004c, float:1.8742269E38)
            android.view.View r11 = r11.inflate(r12, r6)
            com.clubhouse.android.databinding.ClubMigrationUpsellBinding r12 = com.clubhouse.android.databinding.ClubMigrationUpsellBinding.bind(r11)
            java.lang.String r13 = "bind(upsellView)"
            m0.n.b.i.d(r12, r13)
            android.widget.TextView r13 = r12.d
            android.content.res.Resources r14 = r10.getResources()
            java.lang.String r15 = "resources"
            m0.n.b.i.d(r14, r15)
            m0.n.b.i.e(r3, r4)
            m0.n.b.i.e(r14, r15)
            boolean r8 = r3 instanceof i0.e.b.g3.l.y2.a.C0201a
            if (r8 == 0) goto L_0x00b4
            goto L_0x00d5
        L_0x00b4:
            if (r9 == 0) goto L_0x00be
            r6 = 2131952945(0x7f130531, float:1.9542347E38)
            java.lang.CharSequence r6 = r14.getText(r6)
            goto L_0x00d5
        L_0x00be:
            boolean r6 = r3 instanceof i0.e.b.g3.l.y2.a.c
            if (r6 == 0) goto L_0x00ca
            r6 = 2131952950(0x7f130536, float:1.9542357E38)
            java.lang.CharSequence r6 = r14.getText(r6)
            goto L_0x00d5
        L_0x00ca:
            boolean r6 = r3 instanceof i0.e.b.g3.l.y2.a.d
            if (r6 == 0) goto L_0x023f
            r6 = 2131952955(0x7f13053b, float:1.9542367E38)
            java.lang.CharSequence r6 = r14.getText(r6)
        L_0x00d5:
            r13.setText(r6)
            android.widget.TextView r6 = r12.a
            android.content.res.Resources r13 = r10.getResources()
            m0.n.b.i.d(r13, r15)
            m0.n.b.i.e(r3, r4)
            m0.n.b.i.e(r13, r15)
            if (r8 == 0) goto L_0x00eb
            r13 = 0
            goto L_0x011b
        L_0x00eb:
            if (r9 == 0) goto L_0x00f5
            r14 = 2131952944(0x7f130530, float:1.9542345E38)
            java.lang.CharSequence r13 = r13.getText(r14)
            goto L_0x011b
        L_0x00f5:
            boolean r14 = r3 instanceof i0.e.b.g3.l.y2.a.c
            if (r14 == 0) goto L_0x0110
            r14 = r3
            i0.e.b.g3.l.y2.a$c r14 = (i0.e.b.g3.l.y2.a.c) r14
            boolean r14 = r14.c
            if (r14 == 0) goto L_0x0108
            r14 = 2131952947(0x7f130533, float:1.9542351E38)
            java.lang.CharSequence r13 = r13.getText(r14)
            goto L_0x011b
        L_0x0108:
            r14 = 2131952946(0x7f130532, float:1.954235E38)
            java.lang.CharSequence r13 = r13.getText(r14)
            goto L_0x011b
        L_0x0110:
            boolean r14 = r3 instanceof i0.e.b.g3.l.y2.a.d
            if (r14 == 0) goto L_0x0239
            r14 = 2131952953(0x7f130539, float:1.9542363E38)
            java.lang.CharSequence r13 = r13.getText(r14)
        L_0x011b:
            r6.setText(r13)
            android.widget.Button r6 = r12.c
            android.content.res.Resources r13 = r10.getResources()
            m0.n.b.i.d(r13, r15)
            m0.n.b.i.e(r3, r4)
            m0.n.b.i.e(r13, r15)
            if (r8 == 0) goto L_0x0130
            goto L_0x013e
        L_0x0130:
            if (r9 == 0) goto L_0x0133
            goto L_0x013e
        L_0x0133:
            boolean r14 = r3 instanceof i0.e.b.g3.l.y2.a.c
            if (r14 == 0) goto L_0x0148
            r14 = r3
            i0.e.b.g3.l.y2.a$c r14 = (i0.e.b.g3.l.y2.a.c) r14
            boolean r14 = r14.c
            if (r14 == 0) goto L_0x0140
        L_0x013e:
            r13 = 0
            goto L_0x0153
        L_0x0140:
            r14 = 2131952948(0x7f130534, float:1.9542353E38)
            java.lang.CharSequence r13 = r13.getText(r14)
            goto L_0x0153
        L_0x0148:
            boolean r14 = r3 instanceof i0.e.b.g3.l.y2.a.d
            if (r14 == 0) goto L_0x0233
            r14 = 2131952954(0x7f13053a, float:1.9542365E38)
            java.lang.CharSequence r13 = r13.getText(r14)
        L_0x0153:
            r6.setText(r13)
            android.widget.Button r6 = r12.e
            android.content.res.Resources r13 = r10.getResources()
            m0.n.b.i.d(r13, r15)
            m0.n.b.i.e(r3, r4)
            m0.n.b.i.e(r13, r15)
            if (r8 == 0) goto L_0x0169
            r8 = 0
            goto L_0x0199
        L_0x0169:
            if (r9 == 0) goto L_0x0173
            r8 = 2131951920(0x7f130130, float:1.9540268E38)
            java.lang.CharSequence r8 = r13.getText(r8)
            goto L_0x0199
        L_0x0173:
            boolean r8 = r3 instanceof i0.e.b.g3.l.y2.a.c
            if (r8 == 0) goto L_0x018e
            r8 = r3
            i0.e.b.g3.l.y2.a$c r8 = (i0.e.b.g3.l.y2.a.c) r8
            boolean r8 = r8.c
            if (r8 == 0) goto L_0x0186
            r8 = 2131952806(0x7f1304a6, float:1.9542065E38)
            java.lang.CharSequence r8 = r13.getText(r8)
            goto L_0x0199
        L_0x0186:
            r8 = 2131952951(0x7f130537, float:1.954236E38)
            java.lang.CharSequence r8 = r13.getText(r8)
            goto L_0x0199
        L_0x018e:
            boolean r8 = r3 instanceof i0.e.b.g3.l.y2.a.d
            if (r8 == 0) goto L_0x022d
            r8 = 2131952956(0x7f13053c, float:1.954237E38)
            java.lang.CharSequence r8 = r13.getText(r8)
        L_0x0199:
            r6.setText(r8)
            android.widget.Button r6 = r12.c
            java.lang.String r8 = "upsellBinding.noButton"
            m0.n.b.i.d(r6, r8)
            m0.n.b.i.e(r3, r4)
            boolean r8 = r3 instanceof i0.e.b.g3.l.y2.a.d
            if (r8 == 0) goto L_0x01ab
            goto L_0x01b6
        L_0x01ab:
            boolean r9 = r3 instanceof i0.e.b.g3.l.y2.a.c
            if (r9 == 0) goto L_0x01b8
            r9 = r3
            i0.e.b.g3.l.y2.a$c r9 = (i0.e.b.g3.l.y2.a.c) r9
            boolean r9 = r9.c
            if (r9 != 0) goto L_0x01b8
        L_0x01b6:
            r9 = 1
            goto L_0x01b9
        L_0x01b8:
            r9 = r7
        L_0x01b9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            i0.e.b.d3.k.L(r6, r9)
            android.widget.Button r6 = r12.b
            java.lang.String r9 = "upsellBinding.faqButton"
            m0.n.b.i.d(r6, r9)
            m0.n.b.i.e(r3, r4)
            boolean r4 = r3 instanceof i0.e.b.g3.l.y2.a.c
            if (r4 == 0) goto L_0x01cf
            r8 = 1
        L_0x01cf:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            i0.e.b.d3.k.L(r6, r4)
            h0.b.a.d$a r4 = new h0.b.a.d$a
            android.content.Context r6 = r10.requireContext()
            r8 = 2132017388(0x7f1400ec, float:1.9673053E38)
            r4.<init>(r6, r8)
            r4.f(r11)
            androidx.appcompat.app.AlertController$b r6 = r4.a
            r6.k = r7
            h0.b.a.d r4 = r4.a()
            java.lang.String r6 = "Builder(requireContext(), R.style.Clubhouse_AlertDialog_Rounded).apply {\n                setView(upsellView)\n                setCancelable(false)\n            }.create()"
            m0.n.b.i.d(r4, r6)
            android.view.Window r6 = r4.getWindow()
            if (r6 != 0) goto L_0x01f9
            goto L_0x01ff
        L_0x01f9:
            r8 = 1028443341(0x3d4ccccd, float:0.05)
            r6.setDimAmount(r8)
        L_0x01ff:
            android.widget.Button r6 = r12.e
            i0.e.b.g3.l.p r8 = new i0.e.b.g3.l.p
            r8.<init>(r3, r2, r10, r4)
            r6.setOnClickListener(r8)
            android.widget.Button r6 = r12.c
            i0.e.b.g3.l.s r8 = new i0.e.b.g3.l.s
            r8.<init>(r3, r2, r10, r4)
            r6.setOnClickListener(r8)
            android.widget.Button r2 = r12.b
            i0.e.b.g3.l.d r6 = new i0.e.b.g3.l.d
            r6.<init>(r10)
            r2.setOnClickListener(r6)
            com.clubhouse.android.ui.clubs.ClubViewModel r2 = r10.T0()
            i0.e.b.g3.l.r2 r6 = new i0.e.b.g3.l.r2
            r6.<init>(r3)
            r2.p(r6)
            r4.show()
            goto L_0x0245
        L_0x022d:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x0233:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x0239:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x023f:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x0245:
            com.clubhouse.android.ui.clubs.ClubFragment r2 = r0.c
            h0.q.p r2 = r2.getViewLifecycleOwner()
            m0.n.b.i.d(r2, r5)
            androidx.lifecycle.LifecycleCoroutineScope r8 = h0.q.q.a(r2)
            r9 = 0
            r10 = 0
            com.clubhouse.android.ui.clubs.ClubFragment$invalidate$1$2 r11 = new com.clubhouse.android.ui.clubs.ClubFragment$invalidate$1$2
            com.clubhouse.android.ui.clubs.ClubFragment r2 = r0.c
            r3 = 0
            r11.<init>(r2, r3)
            r12 = 3
            r13 = 0
            m0.r.t.a.r.m.a1.a.E2(r8, r9, r10, r11, r12, r13)
            com.clubhouse.android.data.models.remote.response.GetClubResponse r2 = r1.e
            if (r2 != 0) goto L_0x0266
            goto L_0x026d
        L_0x0266:
            boolean r3 = r2.d
            r4 = 1
            if (r3 != r4) goto L_0x026d
            r4 = 1
            goto L_0x026e
        L_0x026d:
            r4 = r7
        L_0x026e:
            if (r4 == 0) goto L_0x028f
            com.clubhouse.android.ui.clubs.ClubFragment r2 = r0.c
            com.clubhouse.android.databinding.FragmentClubBinding r3 = r2.S0()
            com.clubhouse.android.data.models.remote.response.GetClubResponse r4 = r1.e
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r5 = r4.c
            android.widget.ImageView r6 = r3.d
            java.lang.String r7 = "menuAdmin"
            m0.n.b.i.d(r6, r7)
            i0.e.b.d3.k.K(r6)
            android.widget.ImageView r3 = r3.d
            i0.e.b.g3.l.k0 r6 = new i0.e.b.g3.l.k0
            r6.<init>(r2, r4, r5)
            r3.setOnClickListener(r6)
            goto L_0x02d9
        L_0x028f:
            if (r2 != 0) goto L_0x0292
            goto L_0x0298
        L_0x0292:
            boolean r2 = r2.x
            r3 = 1
            if (r2 != r3) goto L_0x0298
            r7 = r3
        L_0x0298:
            if (r7 == 0) goto L_0x02b9
            com.clubhouse.android.ui.clubs.ClubFragment r2 = r0.c
            com.clubhouse.android.databinding.FragmentClubBinding r3 = r2.S0()
            com.clubhouse.android.data.models.remote.response.GetClubResponse r4 = r1.e
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r4 = r4.c
            android.widget.ImageView r5 = r3.e
            java.lang.String r6 = "menuLeader"
            m0.n.b.i.d(r5, r6)
            i0.e.b.d3.k.K(r5)
            android.widget.ImageView r3 = r3.e
            i0.e.b.g3.l.c r5 = new i0.e.b.g3.l.c
            r5.<init>(r2, r4)
            r3.setOnClickListener(r5)
            goto L_0x02d9
        L_0x02b9:
            com.clubhouse.android.ui.clubs.ClubFragment r2 = r0.c
            com.clubhouse.android.databinding.FragmentClubBinding r2 = r2.S0()
            android.widget.ImageView r2 = r2.d
            java.lang.String r3 = "binding.menuAdmin"
            m0.n.b.i.d(r2, r3)
            i0.e.b.d3.k.p(r2)
            com.clubhouse.android.ui.clubs.ClubFragment r2 = r0.c
            com.clubhouse.android.databinding.FragmentClubBinding r2 = r2.S0()
            android.widget.ImageView r2 = r2.e
            java.lang.String r3 = "binding.menuLeader"
            m0.n.b.i.d(r2, r3)
            i0.e.b.d3.k.p(r2)
        L_0x02d9:
            boolean r2 = r1.g
            if (r2 == 0) goto L_0x0302
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r1 = r1.i
            if (r1 == 0) goto L_0x0302
            com.clubhouse.android.ui.clubs.ClubFragment r2 = r0.c
            com.clubhouse.android.ui.clubs.HalfWelcomeNewClubArgs r3 = new com.clubhouse.android.ui.clubs.HalfWelcomeNewClubArgs
            r3.<init>(r1)
            java.lang.String r1 = "mavericksArg"
            m0.n.b.i.e(r3, r1)
            i0.e.b.g3.l.m1 r1 = new i0.e.b.g3.l.m1
            r1.<init>(r3)
            r3 = 2
            r4 = 0
            h0.b0.v.a1(r2, r1, r4, r3)
            com.clubhouse.android.ui.clubs.ClubFragment r1 = r0.c
            com.clubhouse.android.ui.clubs.ClubViewModel r1 = r1.T0()
            i0.e.b.g3.l.c1 r2 = i0.e.b.g3.l.c1.a
            r1.p(r2)
        L_0x0302:
            m0.i r1 = m0.i.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.clubs.ClubFragment$invalidate$1.invoke(java.lang.Object):java.lang.Object");
    }
}
