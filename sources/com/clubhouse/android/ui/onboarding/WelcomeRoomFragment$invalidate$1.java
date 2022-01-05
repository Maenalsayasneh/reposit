package com.clubhouse.android.ui.onboarding;

import i0.e.b.g3.r.y2;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: WelcomeRoomFragment.kt */
public final class WelcomeRoomFragment$invalidate$1 extends Lambda implements l<y2, i> {
    public final /* synthetic */ WelcomeRoomFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeRoomFragment$invalidate$1(WelcomeRoomFragment welcomeRoomFragment) {
        super(1);
        this.c = welcomeRoomFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            i0.e.b.g3.r.y2 r11 = (i0.e.b.g3.r.y2) r11
            java.lang.String r0 = "state"
            m0.n.b.i.e(r11, r0)
            com.clubhouse.android.ui.onboarding.WelcomeRoomFragment r0 = r10.c
            com.clubhouse.android.databinding.FragmentWelcomeRoomBinding r0 = com.clubhouse.android.ui.onboarding.WelcomeRoomFragment.N0(r0)
            android.widget.ProgressBar r0 = r0.c
            java.lang.String r1 = "binding.loading"
            m0.n.b.i.d(r0, r1)
            i0.b.b.b<com.clubhouse.android.data.models.local.channel.ChannelInRoom> r1 = r11.a
            boolean r1 = r1 instanceof i0.b.b.f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            i0.e.b.d3.k.L(r0, r1)
            i0.b.b.b<com.clubhouse.android.data.models.local.channel.ChannelInRoom> r0 = r11.a
            boolean r0 = r0 instanceof i0.b.b.f0
            if (r0 == 0) goto L_0x0324
            com.clubhouse.android.ui.onboarding.WelcomeRoomFragment r0 = r10.c
            com.clubhouse.android.databinding.FragmentWelcomeRoomBinding r0 = com.clubhouse.android.ui.onboarding.WelcomeRoomFragment.N0(r0)
            android.widget.LinearLayout r0 = r0.b
            java.lang.String r1 = "binding.channelViews"
            m0.n.b.i.d(r0, r1)
            i0.e.b.d3.k.l(r0)
            com.clubhouse.android.ui.onboarding.WelcomeRoomFragment r0 = r10.c
            com.clubhouse.android.databinding.FragmentWelcomeRoomBinding r0 = com.clubhouse.android.ui.onboarding.WelcomeRoomFragment.N0(r0)
            android.widget.Button r0 = r0.d
            java.lang.String r1 = "binding.noThanks"
            m0.n.b.i.d(r0, r1)
            i0.e.b.d3.k.l(r0)
            com.clubhouse.android.ui.onboarding.WelcomeRoomFragment r0 = r10.c
            com.clubhouse.android.databinding.FragmentWelcomeRoomBinding r0 = com.clubhouse.android.ui.onboarding.WelcomeRoomFragment.N0(r0)
            android.widget.TextView r0 = r0.e
            com.clubhouse.android.ui.onboarding.WelcomeRoomFragment r1 = r10.c
            i0.b.b.b<com.clubhouse.android.data.models.local.channel.ChannelInRoom> r11 = r11.a
            i0.b.b.f0 r11 = (i0.b.b.f0) r11
            T r11 = r11.b
            com.clubhouse.android.data.models.local.channel.ChannelInRoom r11 = (com.clubhouse.android.data.models.local.channel.ChannelInRoom) r11
            java.util.Objects.requireNonNull(r1)
            java.util.List r2 = r11.y()
            boolean r2 = r2.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x006f
            r11 = 2131953012(0x7f130574, float:1.9542483E38)
            java.lang.String r11 = r1.getString(r11)
            goto L_0x00e8
        L_0x006f:
            java.util.List r2 = r11.y()
            int r2 = r2.size()
            if (r2 != r3) goto L_0x0091
            r2 = 2131953014(0x7f130576, float:1.9542487E38)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.util.List r11 = r11.y()
            java.lang.Object r11 = r11.get(r4)
            com.clubhouse.android.data.models.local.channel.UserInChannel r11 = (com.clubhouse.android.data.models.local.channel.UserInChannel) r11
            java.lang.String r11 = r11.c
            r5[r4] = r11
            java.lang.String r11 = r1.getString(r2, r5)
            goto L_0x00e8
        L_0x0091:
            java.util.List r2 = r11.y()
            int r2 = r2.size()
            r5 = 2
            if (r2 != r5) goto L_0x00c2
            r2 = 2131953015(0x7f130577, float:1.954249E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.util.List r6 = r11.y()
            java.lang.Object r6 = r6.get(r4)
            com.clubhouse.android.data.models.local.channel.UserInChannel r6 = (com.clubhouse.android.data.models.local.channel.UserInChannel) r6
            java.lang.String r6 = r6.c
            r5[r4] = r6
            java.util.List r11 = r11.y()
            java.lang.Object r11 = r11.get(r3)
            com.clubhouse.android.data.models.local.channel.UserInChannel r11 = (com.clubhouse.android.data.models.local.channel.UserInChannel) r11
            java.lang.String r11 = r11.c
            r5[r3] = r11
            java.lang.String r11 = r1.getString(r2, r5)
            goto L_0x00e8
        L_0x00c2:
            r2 = 2131953013(0x7f130575, float:1.9542485E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.util.List r6 = r11.y()
            java.lang.Object r6 = r6.get(r4)
            com.clubhouse.android.data.models.local.channel.UserInChannel r6 = (com.clubhouse.android.data.models.local.channel.UserInChannel) r6
            java.lang.String r6 = r6.c
            r5[r4] = r6
            java.util.List r11 = r11.y()
            int r11 = r11.size()
            int r11 = r11 - r3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5[r3] = r11
            java.lang.String r11 = r1.getString(r2, r5)
        L_0x00e8:
            java.lang.String r1 = "when {\n            users.isEmpty() -> {\n                getString(R.string.welcome_room_title_empty)\n            }\n            users.size == 1 -> {\n                getString(R.string.welcome_room_title_one_friend, users[0].firstName)\n            }\n            users.size == 2 -> {\n                getString(\n                    R.string.welcome_room_title_two_friends, users[0].firstName, users[1].firstName\n                )\n            }\n            else -> {\n                getString(\n                    R.string.welcome_room_title_more_friends, users[0].firstName, users.size - 1\n                )\n            }\n        }"
            m0.n.b.i.d(r11, r1)
            r0.setText(r11)
            com.clubhouse.android.ui.onboarding.WelcomeRoomFragment r11 = r10.c
            m0.c r11 = r11.c2
            java.lang.Object r11 = r11.getValue()
            com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder r11 = (com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder) r11
            com.airbnb.epoxy.EpoxyViewBinder r0 = r11.c
            android.view.View r1 = r11.d
            r2 = 0
            if (r1 != 0) goto L_0x0235
            m0.n.a.a<android.view.View> r1 = r11.y
            java.lang.Object r1 = r1.invoke()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0229
            int r5 = r11.Y1
            boolean r6 = r11.a2
            android.view.View r7 = r1.findViewById(r5)
            if (r7 == 0) goto L_0x0117
            goto L_0x01b3
        L_0x0117:
            if (r6 == 0) goto L_0x01b2
            r7 = -1
            if (r5 != r7) goto L_0x011e
            goto L_0x01b2
        L_0x011e:
            android.content.res.Resources r7 = r1.getResources()     // Catch:{ NotFoundException -> 0x0129 }
            if (r7 == 0) goto L_0x015d
            java.lang.String r5 = r7.getResourceEntryName(r5)     // Catch:{ NotFoundException -> 0x0129 }
            goto L_0x015e
        L_0x0129:
            r5 = move-exception
            java.lang.String r7 = "Id not found in "
            java.lang.StringBuilder r7 = i0.d.a.a.a.P0(r7)
            java.lang.Class r8 = r1.getClass()
            m0.r.d r8 = m0.n.b.m.a(r8)
            r7.append(r8)
            java.lang.String r8 = ", fallbackToNameLookup: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ", "
            r7.append(r6)
            java.lang.String r6 = "error message: "
            r7.append(r6)
            java.lang.String r5 = r5.getLocalizedMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "ViewBinderViewExt"
            android.util.Log.e(r6, r5)
        L_0x015d:
            r5 = r2
        L_0x015e:
            if (r5 == 0) goto L_0x01b2
            java.lang.String r6 = h0.b0.v.n0(r1)
            boolean r6 = m0.n.b.i.a(r6, r5)
            if (r6 == 0) goto L_0x016c
            r7 = r1
            goto L_0x01b3
        L_0x016c:
            boolean r6 = r1 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x01b2
            r6 = r1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.String r7 = "$this$allRecursiveChildren"
            m0.n.b.i.e(r6, r7)
            java.lang.String r7 = "$this$children"
            m0.n.b.i.e(r6, r7)
            h0.i.i.w r7 = new h0.i.i.w
            r7.<init>(r6)
            com.airbnb.epoxy.ViewExtensionsKt$allRecursiveChildren$1 r6 = com.airbnb.epoxy.ViewExtensionsKt$allRecursiveChildren$1.c
            m0.s.h r6 = kotlin.sequences.SequencesKt___SequencesKt.f(r7, r6)
            com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder$view$$inlined$maybeFindViewByIdName$1 r7 = com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder$view$$inlined$maybeFindViewByIdName$1.c
            m0.s.h r6 = kotlin.sequences.SequencesKt___SequencesKt.d(r6, r7)
            m0.s.e r6 = (m0.s.e) r6
            m0.s.e$a r7 = new m0.s.e$a
            r7.<init>(r6)
        L_0x0195:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x01ad
            java.lang.Object r6 = r7.next()
            r8 = r6
            android.view.View r8 = (android.view.View) r8
            java.lang.String r8 = h0.b0.v.n0(r8)
            boolean r8 = m0.n.b.i.a(r8, r5)
            if (r8 == 0) goto L_0x0195
            goto L_0x01ae
        L_0x01ad:
            r6 = r2
        L_0x01ae:
            r7 = r6
            android.view.View r7 = (android.view.View) r7
            goto L_0x01b3
        L_0x01b2:
            r7 = r2
        L_0x01b3:
            if (r7 == 0) goto L_0x01f9
            r11.d = r7
            boolean r5 = r7 instanceof com.airbnb.epoxy.EpoxyViewStub
            if (r5 != 0) goto L_0x01ef
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x01c6 }
            int r5 = r11.Y1     // Catch:{ NotFoundException -> 0x01c6 }
            java.lang.String r1 = r1.getResourceName(r5)     // Catch:{ NotFoundException -> 0x01c6 }
            goto L_0x01d3
        L_0x01c6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r5 = r11.Y1
            java.lang.String r6 = " (name not found)"
            java.lang.String r1 = i0.d.a.a.a.u0(r1, r5, r6)
        L_0x01d3:
            com.airbnb.epoxy.EpoxyViewBinder r5 = r11.c
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "View binder should be using EpoxyViewStub. "
            java.lang.String r8 = "View ID: "
            java.lang.String r1 = i0.d.a.a.a.o0(r7, r8, r1)
            r6.<init>(r1)
            java.util.Objects.requireNonNull(r5)
            java.lang.String r1 = "exception"
            m0.n.b.i.e(r6, r1)
            m0.n.a.p<? super com.airbnb.epoxy.EpoxyViewBinder, ? super java.lang.RuntimeException, m0.i> r1 = com.airbnb.epoxy.EpoxyViewBinder.a
            r1.invoke(r5, r6)
        L_0x01ef:
            h0.q.p r1 = r11.x
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            r1.a(r11)
            goto L_0x0235
        L_0x01f9:
            java.lang.String r0 = "View could not be found, fallbackToNameLookup: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            boolean r2 = r11.a2
            r0.append(r2)
            r2 = 44
            r0.append(r2)
            java.lang.String r2 = " view id name: "
            r0.append(r2)
            android.content.res.Resources r1 = r1.getResources()
            int r11 = r11.Y1
            java.lang.String r11 = r1.getResourceEntryName(r11)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
        L_0x0229:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Root view is not created"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L_0x0235:
            android.view.View r1 = r11.d
            m0.n.b.i.c(r1)
            m0.n.a.p<i0.b.a.e0, android.content.Context, m0.i> r5 = r11.b2
            java.util.Objects.requireNonNull(r0)
            java.lang.String r6 = "previousView"
            m0.n.b.i.e(r1, r6)
            java.lang.String r7 = "modelProvider"
            m0.n.b.i.e(r5, r7)
            android.content.Context r7 = r1.getContext()
            java.lang.String r8 = "previousView.context"
            m0.n.b.i.d(r7, r8)
            r5.invoke(r0, r7)
            i0.b.a.t<?> r5 = r0.b
            r0.b = r2
            m0.n.b.i.e(r1, r6)
            if (r5 == 0) goto L_0x02e7
            i0.b.a.w r0 = h0.b0.v.v0(r1)
            if (r0 == 0) goto L_0x0280
            r0.a()
            i0.b.a.t r6 = r0.a
            java.lang.String r7 = "existingHolder.model"
            m0.n.b.i.d(r6, r7)
            int r7 = i0.b.a.o0.a(r5)
            int r6 = i0.b.a.o0.a(r6)
            if (r7 != r6) goto L_0x027a
            r6 = r3
            goto L_0x027b
        L_0x027a:
            r6 = r4
        L_0x027b:
            if (r6 != 0) goto L_0x027e
            goto L_0x0280
        L_0x027e:
            r8 = r0
            goto L_0x02ae
        L_0x0280:
            android.view.ViewParent r6 = r1.getParent()
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
            java.util.Objects.requireNonNull(r6, r7)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r7 = r5.n(r6)
            java.lang.String r8 = "newView"
            m0.n.b.i.d(r7, r8)
            int r8 = r1.getId()
            r7.setId(r8)
            int r8 = r6.indexOfChild(r1)
            r6.removeViewInLayout(r1)
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            r6.addView(r7, r8, r9)
            i0.b.a.w r8 = new i0.b.a.w
            r8.<init>(r6, r7, r4)
        L_0x02ae:
            android.view.View r6 = r8.itemView
            r6.setVisibility(r4)
            int r1 = r1.getId()
            r6.setId(r1)
            java.lang.String r1 = "viewHolder.itemView.appl…previousView.id\n        }"
            m0.n.b.i.d(r6, r1)
            if (r0 == 0) goto L_0x02c7
            r0.a()
            i0.b.a.t r0 = r0.a
            goto L_0x02c8
        L_0x02c7:
            r0 = r2
        L_0x02c8:
            boolean r1 = m0.n.b.i.a(r0, r5)
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x02e5
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
            r8.b(r5, r0, r1, r4)
            android.view.View r0 = r8.itemView
            java.lang.String r1 = "viewHolder.itemView"
            m0.n.b.i.d(r0, r1)
            java.lang.String r1 = "$this$viewHolder"
            m0.n.b.i.e(r0, r1)
            int r1 = com.airbnb.epoxy.viewbinder.R.id.epoxy_view_binder
            r0.setTag(r1, r8)
        L_0x02e5:
            r1 = r6
            goto L_0x02ec
        L_0x02e7:
            r0 = 8
            r1.setVisibility(r0)
        L_0x02ec:
            boolean r0 = r11.Z1
            if (r0 == 0) goto L_0x0322
            m0.c r0 = r11.q
            java.lang.Object r0 = r0.getValue()
            i0.b.a.v r0 = (i0.b.a.v) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r3 = "view"
            m0.n.b.i.e(r1, r3)
            android.view.View r3 = r0.e
            if (r3 == r1) goto L_0x0307
            r0.a()
        L_0x0307:
            r0.e = r1
            i0.b.a.v$b r3 = new i0.b.a.v$b
            r3.<init>(r0, r1)
            r0.f = r3
            java.lang.String r3 = "attach"
            r0.b(r1, r4, r3)
            boolean r3 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r3 != 0) goto L_0x031a
            goto L_0x031b
        L_0x031a:
            r2 = r1
        L_0x031b:
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L_0x0322
            r0.d(r2)
        L_0x0322:
            r11.d = r1
        L_0x0324:
            m0.i r11 = m0.i.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.onboarding.WelcomeRoomFragment$invalidate$1.invoke(java.lang.Object):java.lang.Object");
    }
}
