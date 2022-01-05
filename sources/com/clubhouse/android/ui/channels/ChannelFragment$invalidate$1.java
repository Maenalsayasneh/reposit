package com.clubhouse.android.ui.channels;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$invalidate$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$invalidate$1(ChannelFragment channelFragment) {
        super(1);
        this.c = channelFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            i0.e.b.z2.g.l r15 = (i0.e.b.z2.g.l) r15
            java.lang.String r0 = "state"
            m0.n.b.i.e(r15, r0)
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            m0.r.k<java.lang.Object>[] r2 = com.clubhouse.android.ui.channels.ChannelFragment.Z1
            com.clubhouse.android.databinding.FragmentChannelBinding r1 = r1.Q0()
            com.airbnb.epoxy.EpoxyRecyclerView r1 = r1.e
            r1.g()
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r1 = r1.Q0()
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r1.w
            boolean r2 = r15.c
            r1.setRefreshing(r2)
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r1 = r1.Q0()
            com.clubhouse.android.ui.channels.views.FacePile r1 = r1.m
            i0.e.b.b3.a.a.c.a r2 = r15.p
            java.util.List<com.clubhouse.android.data.models.local.channel.UserInChannel> r2 = r2.k
            java.util.List r2 = m0.j.g.v0(r2)
            i0.e.b.b3.a.a.c.a r3 = r15.p
            int r3 = r3.d()
            java.util.Objects.requireNonNull(r1)
            java.lang.String r4 = "users"
            m0.n.b.i.e(r2, r4)
            r4 = 0
            java.lang.Object r5 = m0.j.g.z(r2, r4)
            com.clubhouse.android.user.model.User r5 = (com.clubhouse.android.user.model.User) r5
            com.clubhouse.android.databinding.FacepileBinding r6 = r1.c
            com.clubhouse.android.shared.ui.AvatarView r6 = r6.b
            java.lang.String r7 = "binding.face1"
            m0.n.b.i.d(r6, r7)
            r1.a(r6, r5)
            r5 = 1
            java.lang.Object r2 = m0.j.g.z(r2, r5)
            com.clubhouse.android.user.model.User r2 = (com.clubhouse.android.user.model.User) r2
            com.clubhouse.android.databinding.FacepileBinding r6 = r1.c
            com.clubhouse.android.shared.ui.AvatarView r6 = r6.c
            java.lang.String r7 = "binding.face2"
            m0.n.b.i.d(r6, r7)
            r1.a(r6, r2)
            r2 = 2
            r6 = 8
            if (r3 <= r2) goto L_0x0084
            com.clubhouse.android.databinding.FacepileBinding r7 = r1.c
            com.clubhouse.android.shared.ui.AvatarView r7 = r7.d
            r7.setVisibility(r4)
            com.clubhouse.android.databinding.FacepileBinding r1 = r1.c
            com.clubhouse.android.shared.ui.AvatarView r1 = r1.d
            int r3 = r3 - r2
            java.lang.String r2 = i0.e.b.f3.d.a(r3)
            java.lang.String r3 = "+"
            java.lang.String r2 = m0.n.b.i.k(r3, r2)
            r1.setText(r2)
            goto L_0x008b
        L_0x0084:
            com.clubhouse.android.databinding.FacepileBinding r1 = r1.c
            com.clubhouse.android.shared.ui.AvatarView r1 = r1.d
            r1.setVisibility(r6)
        L_0x008b:
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r1 = r1.Q0()
            android.widget.ImageView r1 = r1.r
            java.lang.String r2 = "binding.iconRaiseHand"
            m0.n.b.i.d(r1, r2)
            java.lang.String r2 = "<this>"
            m0.n.b.i.e(r1, r2)
            m0.n.b.i.e(r15, r0)
            i0.e.b.b3.a.a.c.a r3 = r15.p
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x00aa
            r3 = r6
            goto L_0x00ab
        L_0x00aa:
            r3 = r4
        L_0x00ab:
            r1.setVisibility(r3)
            boolean r3 = r15.d
            if (r3 == 0) goto L_0x00b8
            int r3 = com.clubhouse.android.channels.R.drawable.ic_raise_hand_nux
            r1.setImageResource(r3)
            goto L_0x00c7
        L_0x00b8:
            boolean r3 = r15.G
            if (r3 == 0) goto L_0x00c2
            int r3 = com.clubhouse.android.channels.R.drawable.ic_raise_hand
            r1.setImageResource(r3)
            goto L_0x00c7
        L_0x00c2:
            int r3 = com.clubhouse.android.channels.R.drawable.ic_raise_hand_disabled
            r1.setImageResource(r3)
        L_0x00c7:
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r1 = r1.Q0()
            android.widget.ImageView r1 = r1.s
            java.lang.String r3 = "binding.iconRaisedHandsQueue"
            m0.n.b.i.d(r1, r3)
            m0.n.b.i.e(r1, r2)
            m0.n.b.i.e(r15, r0)
            boolean r3 = r15.q
            if (r3 == 0) goto L_0x00df
            r6 = r4
        L_0x00df:
            r1.setVisibility(r6)
            i0.e.b.a3.f.q r3 = i0.e.b.a3.f.q.a
            i0.e.b.b3.a.a.c.d r6 = r15.C
            int r6 = r6.c()
            int r7 = com.clubhouse.android.core.R.xml.badge_style
            r3.a(r1, r6, r7)
            android.content.res.Resources r6 = r1.getResources()
            int r7 = com.clubhouse.android.channels.R.plurals.cd_raised_hands_count
            i0.e.b.b3.a.a.c.d r8 = r15.C
            int r8 = r8.c()
            java.lang.String r6 = r6.getQuantityString(r7, r8)
            r1.setContentDescription(r6)
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r1 = r1.Q0()
            android.widget.ImageView r1 = r1.p
            java.lang.String r6 = "binding.iconMute"
            m0.n.b.i.d(r1, r6)
            i0.e.b.b3.a.a.c.a r6 = r15.p
            boolean r6 = r6.h()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            i0.e.b.d3.k.L(r1, r6)
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r1 = r1.Q0()
            android.widget.ImageView r1 = r1.n
            java.lang.String r6 = "binding.iconClip"
            m0.n.b.i.d(r1, r6)
            boolean r6 = r15.U
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            i0.e.b.d3.k.L(r1, r6)
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r1 = r1.Q0()
            android.widget.Button r1 = r1.t
            int r6 = r15.W
            r1.setText(r6)
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r6 = r1.Q0()
            com.clubhouse.android.ui.channels.views.ChannelCtaBar r6 = r6.d
            java.lang.String r7 = "binding.channelCtaBar"
            m0.n.b.i.d(r6, r7)
            m0.n.b.i.e(r1, r2)
            java.lang.String r7 = "ctaBar"
            m0.n.b.i.e(r6, r7)
            m0.n.b.i.e(r15, r0)
            boolean r7 = r15.q
            r8 = 0
            if (r7 == 0) goto L_0x018a
            com.clubhouse.android.data.models.local.channel.Channel r7 = r15.u
            if (r7 != 0) goto L_0x0162
            r7 = r8
            goto L_0x0166
        L_0x0162:
            com.clubhouse.android.channels.model.AudienceType r7 = h0.b0.v.o(r7)
        L_0x0166:
            com.clubhouse.android.channels.model.AudienceType r9 = com.clubhouse.android.channels.model.AudienceType.Closed
            if (r7 != r9) goto L_0x018a
            boolean r7 = r15.J
            if (r7 != 0) goto L_0x018a
            r4 = 2131951899(0x7f13011b, float:1.9540226E38)
            java.lang.String r7 = "resources.getString(R.string.closed_room_description)"
            java.lang.String r4 = i0.d.a.a.a.T(r1, r4, r7)
            r7 = 2131951900(0x7f13011c, float:1.9540228E38)
            java.lang.String r9 = "resources.getString(R.string.closed_room_open_up)"
            java.lang.String r7 = i0.d.a.a.a.T(r1, r7, r9)
            i0.e.b.g3.k.y0.d r9 = new i0.e.b.g3.k.y0.d
            r9.<init>(r1)
            r6.t(r4, r7, r9)
            goto L_0x0319
        L_0x018a:
            boolean r7 = r15.d
            if (r7 == 0) goto L_0x01f5
            boolean r7 = r15.n
            if (r7 != 0) goto L_0x01f5
            java.util.List<com.clubhouse.android.data.models.local.channel.PromptField> r7 = r15.m
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x01f5
            i0.e.b.b3.a.a.c.a r7 = r15.p
            com.clubhouse.android.data.models.local.channel.UserInChannel r7 = r7.a
            if (r7 != 0) goto L_0x01a3
            goto L_0x0319
        L_0x01a3:
            java.util.List<com.clubhouse.android.data.models.local.channel.PromptField> r7 = r15.m
            com.clubhouse.android.data.models.local.channel.PromptField r9 = com.clubhouse.android.data.models.local.channel.PromptField.PHOTO
            boolean r7 = r7.contains(r9)
            if (r7 == 0) goto L_0x01b9
            java.util.List<com.clubhouse.android.data.models.local.channel.PromptField> r7 = r15.m
            com.clubhouse.android.data.models.local.channel.PromptField r10 = com.clubhouse.android.data.models.local.channel.PromptField.BIO
            boolean r7 = r7.contains(r10)
            if (r7 != 0) goto L_0x01b9
            r7 = r5
            goto L_0x01ba
        L_0x01b9:
            r7 = r4
        L_0x01ba:
            java.util.List<com.clubhouse.android.data.models.local.channel.PromptField> r10 = r15.m
            com.clubhouse.android.data.models.local.channel.PromptField r11 = com.clubhouse.android.data.models.local.channel.PromptField.BIO
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x01cd
            java.util.List<com.clubhouse.android.data.models.local.channel.PromptField> r10 = r15.m
            boolean r9 = r10.contains(r9)
            if (r9 != 0) goto L_0x01cd
            r4 = r5
        L_0x01cd:
            if (r7 == 0) goto L_0x01d3
            r9 = 2131951675(0x7f13003b, float:1.9539771E38)
            goto L_0x01dc
        L_0x01d3:
            if (r4 == 0) goto L_0x01d9
            r9 = 2131951672(0x7f130038, float:1.9539765E38)
            goto L_0x01dc
        L_0x01d9:
            r9 = 2131951671(0x7f130037, float:1.9539763E38)
        L_0x01dc:
            java.lang.String r10 = "resources.getString(descriptionResource)"
            java.lang.String r9 = i0.d.a.a.a.T(r1, r9, r10)
            r10 = 2131952067(0x7f1301c3, float:1.9540566E38)
            java.lang.String r11 = "resources.getString(R.string.edit_profile)"
            java.lang.String r10 = i0.d.a.a.a.T(r1, r10, r11)
            i0.e.b.g3.k.y0.c r11 = new i0.e.b.g3.k.y0.c
            r11.<init>(r7, r1, r4, r6)
            r6.t(r9, r10, r11)
            goto L_0x0319
        L_0x01f5:
            i0.e.b.z2.g.k r7 = r15.a
            com.clubhouse.android.data.models.local.user.BasicUser r7 = r7.c()
            if (r7 == 0) goto L_0x024e
            i0.e.b.z2.g.k r7 = r15.a
            java.lang.Boolean r7 = r7.b()
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r7 = m0.n.b.i.a(r7, r9)
            if (r7 == 0) goto L_0x024e
            i0.e.b.z2.g.k r7 = r15.a
            com.clubhouse.android.data.models.local.user.BasicUser r7 = r7.c()
            m0.n.b.i.c(r7)
            android.content.res.Resources r9 = r1.getResources()
            r10 = 2131953003(0x7f13056b, float:1.9542465E38)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r12 = h0.b0.v.f0(r7)
            r11[r4] = r12
            java.lang.String r9 = r9.getString(r10, r11)
            java.lang.String r10 = "resources.getString(R.string.welcome_room_cta, user.firstName())"
            m0.n.b.i.d(r9, r10)
            android.content.res.Resources r10 = r1.getResources()
            r11 = 2131953005(0x7f13056d, float:1.9542469E38)
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.String r13 = h0.b0.v.f0(r7)
            r12[r4] = r13
            java.lang.String r4 = r10.getString(r11, r12)
            java.lang.String r10 = "resources.getString(R.string.welcome_room_cta_follow, user.firstName())"
            m0.n.b.i.d(r4, r10)
            i0.e.b.g3.k.y0.e r10 = new i0.e.b.g3.k.y0.e
            r10.<init>(r1, r7, r6)
            r6.t(r9, r4, r10)
            goto L_0x0319
        L_0x024e:
            boolean r7 = r15.I
            java.lang.String r9 = ""
            r10 = 2131953006(0x7f13056e, float:1.954247E38)
            if (r7 == 0) goto L_0x02a8
            boolean r11 = r15.x
            if (r11 == 0) goto L_0x02a8
            android.content.res.Resources r7 = r1.getResources()
            r11 = 2131952374(0x7f1302f6, float:1.9541189E38)
            java.lang.Object[] r12 = new java.lang.Object[r5]
            com.clubhouse.android.data.models.local.user.BasicUser r13 = r15.B
            if (r13 != 0) goto L_0x0269
            goto L_0x026d
        L_0x0269:
            java.lang.String r13 = r13.d
            if (r13 != 0) goto L_0x026e
        L_0x026d:
            r13 = r9
        L_0x026e:
            r12[r4] = r13
            java.lang.String r7 = r7.getString(r11, r12)
            java.lang.String r11 = "resources.getString(R.string.invited_you_to_this_club, state.userWhoInvited?.name ?: \"\")"
            m0.n.b.i.d(r7, r11)
            android.content.res.Resources r11 = r1.getResources()
            java.lang.Object[] r12 = new java.lang.Object[r5]
            com.clubhouse.android.data.models.local.channel.Channel r13 = r15.u
            if (r13 != 0) goto L_0x0284
            goto L_0x0293
        L_0x0284:
            com.clubhouse.android.data.models.local.club.Club r13 = r13.i()
            if (r13 != 0) goto L_0x028b
            goto L_0x0293
        L_0x028b:
            java.lang.String r13 = r13.getName()
            if (r13 != 0) goto L_0x0292
            goto L_0x0293
        L_0x0292:
            r9 = r13
        L_0x0293:
            r12[r4] = r9
            java.lang.String r4 = r11.getString(r10, r12)
            java.lang.String r9 = "resources.getString(R.string.welcome_room_cta_join, state.channel?.club?.name ?: \"\")"
            m0.n.b.i.d(r4, r9)
            i0.e.b.g3.k.y0.b r9 = new i0.e.b.g3.k.y0.b
            r9.<init>(r15, r6, r1)
            r6.t(r7, r4, r9)
            goto L_0x0319
        L_0x02a8:
            java.lang.String r10 = "resources.getString(R.string.enjoying_the_conversation)"
            r11 = 2131952075(0x7f1301cb, float:1.9540583E38)
            if (r7 == 0) goto L_0x02f6
            boolean r12 = r15.y
            if (r12 != 0) goto L_0x02f6
            boolean r12 = r15.z
            if (r12 != 0) goto L_0x02bb
            boolean r13 = r15.A
            if (r13 == 0) goto L_0x02f6
        L_0x02bb:
            if (r12 == 0) goto L_0x02c1
            r7 = 2131953006(0x7f13056e, float:1.954247E38)
            goto L_0x02c4
        L_0x02c1:
            r7 = 2131953004(0x7f13056c, float:1.9542467E38)
        L_0x02c4:
            java.lang.String r10 = i0.d.a.a.a.T(r1, r11, r10)
            android.content.res.Resources r11 = r1.getResources()
            java.lang.Object[] r12 = new java.lang.Object[r5]
            com.clubhouse.android.data.models.local.channel.Channel r13 = r15.u
            if (r13 != 0) goto L_0x02d3
            goto L_0x02e2
        L_0x02d3:
            com.clubhouse.android.data.models.local.club.Club r13 = r13.i()
            if (r13 != 0) goto L_0x02da
            goto L_0x02e2
        L_0x02da:
            java.lang.String r13 = r13.getName()
            if (r13 != 0) goto L_0x02e1
            goto L_0x02e2
        L_0x02e1:
            r9 = r13
        L_0x02e2:
            r12[r4] = r9
            java.lang.String r4 = r11.getString(r7, r12)
            java.lang.String r7 = "resources.getString(buttonStringRes, state.channel?.club?.name ?: \"\")"
            m0.n.b.i.d(r4, r7)
            i0.e.b.g3.k.y0.a r7 = new i0.e.b.g3.k.y0.a
            r7.<init>(r15, r1, r6)
            r6.t(r10, r4, r7)
            goto L_0x0319
        L_0x02f6:
            if (r7 == 0) goto L_0x0316
            boolean r4 = r15.g
            if (r4 != 0) goto L_0x0316
            boolean r4 = r15.r
            if (r4 != 0) goto L_0x0316
            java.lang.String r4 = i0.d.a.a.a.T(r1, r11, r10)
            r7 = 2131952165(0x7f130225, float:1.9540765E38)
            java.lang.String r9 = "resources.getString(R.string.follow_some_speakers)"
            java.lang.String r7 = i0.d.a.a.a.T(r1, r7, r9)
            i0.e.b.g3.k.y0.f r9 = new i0.e.b.g3.k.y0.f
            r9.<init>(r1, r6)
            r6.t(r4, r7, r9)
            goto L_0x0319
        L_0x0316:
            i0.e.b.d3.k.m(r6)
        L_0x0319:
            android.content.Context r4 = r1.requireContext()
            i0.e.b.g3.k.y0.l r7 = new i0.e.b.g3.k.y0.l
            r7.<init>(r1, r6, r4)
            r6.setOnTouchListener(r7)
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r4 = r1.Q0()
            com.clubhouse.android.ui.channels.views.NoticeBar r4 = r4.v
            java.lang.String r6 = "binding.noticeBar"
            m0.n.b.i.d(r4, r6)
            m0.n.b.i.e(r1, r2)
            java.lang.String r2 = "noticeBar"
            m0.n.b.i.e(r4, r2)
            m0.n.b.i.e(r15, r0)
            i0.e.b.z2.g.k r0 = r15.a
            boolean r0 = r0.q
            if (r0 == 0) goto L_0x034b
            com.clubhouse.android.ui.channels.views.NoticeType r0 = com.clubhouse.android.ui.channels.views.NoticeType.FirstTimeAudience
            int r1 = com.clubhouse.android.ui.channels.views.NoticeBar.c
            r4.b(r0, r8)
            goto L_0x03a8
        L_0x034b:
            java.util.List<java.lang.Integer> r0 = r15.K
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x0391
            i0.e.b.g3.k.y0.h r0 = new i0.e.b.g3.k.y0.h
            r0.<init>(r1, r15)
            r4.setOnClickListener(r0)
            i0.e.b.b3.a.a.c.a r0 = r15.p
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0376
            android.content.res.Resources r0 = r1.getResources()
            r1 = 2131820545(0x7f110001, float:1.9273808E38)
            java.util.List<java.lang.Integer> r2 = r15.K
            int r2 = r2.size()
            java.lang.String r0 = r0.getQuantityString(r1, r2)
            goto L_0x0386
        L_0x0376:
            android.content.res.Resources r0 = r1.getResources()
            r1 = 2131820544(0x7f110000, float:1.9273806E38)
            java.util.List<java.lang.Integer> r2 = r15.K
            int r2 = r2.size()
            java.lang.String r0 = r0.getQuantityString(r1, r2)
        L_0x0386:
            java.lang.String r1 = "if (state.users.isSelfSpeaker()) {\n            resources.getQuantityString(R.plurals.blocked_users, state.blockedUsersToShow.size)\n        } else {\n            resources.getQuantityString(R.plurals.blocked_speakers, state.blockedUsersToShow.size)\n        }"
            m0.n.b.i.d(r0, r1)
            com.clubhouse.android.ui.channels.views.NoticeType r1 = com.clubhouse.android.ui.channels.views.NoticeType.BlockedUsers
            r4.b(r1, r0)
            goto L_0x03a8
        L_0x0391:
            i0.e.b.z2.g.k r0 = r15.a
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x03a2
            com.clubhouse.android.ui.channels.views.NoticeType r0 = com.clubhouse.android.ui.channels.views.NoticeType.BadNetwork
            int r1 = com.clubhouse.android.ui.channels.views.NoticeBar.c
            r4.b(r0, r8)
            r4.setOnClickListener(r8)
            goto L_0x03a8
        L_0x03a2:
            r4.setOnClickListener(r8)
            i0.e.b.d3.k.m(r4)
        L_0x03a8:
            com.clubhouse.android.ui.channels.ChannelFragment r0 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r1 = r0.Q0()
            android.widget.ImageView r1 = r1.b
            java.lang.String r2 = "binding.backchannel"
            m0.n.b.i.d(r1, r2)
            i0.e.b.g3.k.z r2 = new i0.e.b.g3.k.z
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            int r0 = r15.i
            r2 = 2132148227(0x7f160003, float:1.9938426E38)
            r3.a(r1, r0, r2)
            i0.e.b.b3.a.a.c.a r0 = r15.p
            com.clubhouse.android.data.models.local.channel.UserInChannel r0 = r0.a
            if (r0 != 0) goto L_0x03cc
            goto L_0x0408
        L_0x03cc:
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r2 = r1.Q0()
            com.clubhouse.android.shared.ui.AvatarView r2 = r2.u
            java.lang.String r3 = "binding.me"
            m0.n.b.i.d(r2, r3)
            i0.e.b.d3.k.u(r2, r0)
            com.clubhouse.android.databinding.FragmentChannelBinding r2 = r1.Q0()
            com.clubhouse.android.shared.ui.AvatarView r2 = r2.u
            m0.n.b.i.d(r2, r3)
            h0.q.p r3 = r1.getViewLifecycleOwner()
            java.lang.String r4 = "viewLifecycleOwner"
            m0.n.b.i.d(r3, r4)
            androidx.lifecycle.LifecycleCoroutineScope r3 = h0.q.q.a(r3)
            i0.e.b.g3.k.w r4 = new i0.e.b.g3.k.w
            r4.<init>(r1, r0)
            i0.e.b.d3.k.H(r2, r3, r4)
            com.clubhouse.android.databinding.FragmentChannelBinding r2 = r1.Q0()
            com.clubhouse.android.shared.ui.AvatarView r2 = r2.u
            i0.e.b.g3.k.x r3 = new i0.e.b.g3.k.x
            r3.<init>(r1, r0)
            r2.setOnLongClickListener(r3)
        L_0x0408:
            com.clubhouse.android.ui.channels.ChannelFragment r0 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r0 = r0.Q0()
            android.widget.TextView r0 = r0.l
            java.lang.String r1 = r15.M
            r0.setText(r1)
            com.clubhouse.android.ui.channels.ChannelFragment r0 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r0 = r0.Q0()
            android.widget.TextView r0 = r0.j
            java.lang.String r1 = r15.N
            r0.setText(r1)
            com.clubhouse.android.ui.channels.ChannelFragment r0 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r0 = r0.Q0()
            android.widget.TextView r0 = r0.k
            java.lang.String r1 = r15.O
            r0.setText(r1)
            com.clubhouse.android.ui.channels.ChannelFragment r0 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r0 = r0.Q0()
            android.widget.LinearLayout r0 = r0.i
            java.lang.String r1 = "binding.emptyState"
            m0.n.b.i.d(r0, r1)
            boolean r1 = r15.Q
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            i0.e.b.d3.k.L(r0, r1)
            com.clubhouse.android.ui.channels.ChannelFragment r0 = r14.c
            com.clubhouse.android.databinding.FragmentChannelBinding r0 = r0.Q0()
            android.widget.TextView r0 = r0.k
            java.lang.String r1 = "binding.emptyStateButton"
            m0.n.b.i.d(r0, r1)
            boolean r15 = r15.R
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            i0.e.b.d3.k.L(r0, r15)
            m0.i r15 = m0.i.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.channels.ChannelFragment$invalidate$1.invoke(java.lang.Object):java.lang.Object");
    }
}
