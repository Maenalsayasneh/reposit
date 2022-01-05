package com.clubhouse.android.ui.channels.users.ping;

import i0.e.b.g3.k.w0.b.f;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PingUserFragment.kt */
public final class PingUserFragment$invalidate$1 extends Lambda implements l<f, i> {
    public final /* synthetic */ PingUserFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PingUserFragment$invalidate$1(PingUserFragment pingUserFragment) {
        super(1);
        this.c = pingUserFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e9, code lost:
        if ((r9.length() == 0) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            i0.e.b.g3.k.w0.b.f r9 = (i0.e.b.g3.k.w0.b.f) r9
            java.lang.String r0 = "state"
            m0.n.b.i.e(r9, r0)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r0 = r8.c
            m0.r.k<java.lang.Object>[] r1 = com.clubhouse.android.ui.channels.users.ping.PingUserFragment.r2
            com.clubhouse.android.databinding.FragmentUserGridBinding r0 = r0.S0()
            android.widget.TextView r0 = r0.i
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r1 = r8.c
            com.clubhouse.android.data.models.local.channel.Channel r2 = r9.a
            boolean r2 = r2.T()
            if (r2 == 0) goto L_0x001f
            r2 = 2131952358(0x7f1302e6, float:1.9541156E38)
            goto L_0x0022
        L_0x001f:
            r2 = 2131952626(0x7f1303f2, float:1.95417E38)
        L_0x0022:
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r0 = r8.c
            com.clubhouse.android.databinding.FragmentUserGridBinding r0 = r0.S0()
            android.widget.TextView r0 = r0.d
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r1 = r8.c
            r2 = 2131952624(0x7f1303f0, float:1.9541696E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r0 = r8.c
            h0.q.p r0 = r0.getViewLifecycleOwner()
            java.lang.String r1 = "viewLifecycleOwner"
            m0.n.b.i.d(r0, r1)
            androidx.lifecycle.LifecycleCoroutineScope r2 = h0.q.q.a(r0)
            r3 = 0
            r4 = 0
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment$invalidate$1$1 r5 = new com.clubhouse.android.ui.channels.users.ping.PingUserFragment$invalidate$1$1
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r0 = r8.c
            r1 = 0
            r5.<init>(r9, r1)
            r6 = 3
            r7 = 0
            m0.r.t.a.r.m.a1.a.E2(r2, r3, r4, r5, r6, r7)
            com.clubhouse.android.data.models.local.channel.Channel r0 = r9.a
            boolean r0 = r0.T()
            if (r0 != 0) goto L_0x0123
            boolean r0 = r9.c
            if (r0 == 0) goto L_0x0123
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r0 = r8.c
            com.clubhouse.android.databinding.FragmentUserGridBinding r0 = r0.S0()
            com.airbnb.epoxy.EpoxyRecyclerView r0 = r0.b
            java.lang.String r1 = "binding.actionsList"
            m0.n.b.i.d(r0, r1)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r2 = r8.c
            java.util.Objects.requireNonNull(r2)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment$buildActionModels$1 r3 = new com.clubhouse.android.ui.channels.users.ping.PingUserFragment$buildActionModels$1
            r3.<init>(r2)
            i0.e.b.d3.k.D(r0, r2, r3)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r0 = r8.c
            com.clubhouse.android.databinding.FragmentUserGridBinding r0 = r0.S0()
            com.airbnb.epoxy.EpoxyRecyclerView r0 = r0.b
            m0.n.b.i.d(r0, r1)
            com.clubhouse.android.data.models.local.channel.Channel r1 = r9.a
            boolean r1 = r1.T()
            java.lang.String r2 = "binding.search.text"
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x00b4
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r1 = r8.c
            com.clubhouse.android.databinding.FragmentUserGridBinding r1 = r1.S0()
            android.widget.EditText r1 = r1.h
            android.text.Editable r1 = r1.getText()
            m0.n.b.i.d(r1, r2)
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00af
            r1 = r3
            goto L_0x00b0
        L_0x00af:
            r1 = r4
        L_0x00b0:
            if (r1 == 0) goto L_0x00b4
            r1 = r3
            goto L_0x00b5
        L_0x00b4:
            r1 = r4
        L_0x00b5:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            i0.e.b.d3.k.L(r0, r1)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r0 = r8.c
            com.clubhouse.android.databinding.FragmentUserGridBinding r0 = r0.S0()
            android.view.View r0 = r0.c
            java.lang.String r1 = "binding.actionsListTopDelimiter"
            m0.n.b.i.d(r0, r1)
            com.clubhouse.android.data.models.local.channel.Channel r9 = r9.a
            boolean r9 = r9.T()
            if (r9 != 0) goto L_0x00ec
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r9 = r8.c
            com.clubhouse.android.databinding.FragmentUserGridBinding r9 = r9.S0()
            android.widget.EditText r9 = r9.h
            android.text.Editable r9 = r9.getText()
            m0.n.b.i.d(r9, r2)
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00e8
            r9 = r3
            goto L_0x00e9
        L_0x00e8:
            r9 = r4
        L_0x00e9:
            if (r9 == 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r3 = r4
        L_0x00ed:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            i0.e.b.d3.k.L(r0, r9)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r9 = r8.c
            com.clubhouse.android.databinding.FragmentUserGridBinding r9 = r9.S0()
            com.airbnb.epoxy.EpoxyRecyclerView r9 = r9.j
            java.lang.String r0 = "binding.userGrid"
            m0.n.b.i.d(r9, r0)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r0 = r8.c
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165476(0x7f070124, float:1.794517E38)
            int r0 = r0.getDimensionPixelSize(r1)
            i0.e.b.d3.k.G(r9, r0)
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r9 = r8.c
            com.clubhouse.android.databinding.FragmentUserGridBinding r9 = r9.S0()
            android.widget.LinearLayout r9 = r9.g
            com.clubhouse.android.ui.channels.users.ping.PingUserFragment r0 = r8.c
            i0.e.b.g3.k.w0.b.c r1 = new i0.e.b.g3.k.w0.b.c
            r1.<init>(r0)
            r9.post(r1)
        L_0x0123:
            m0.i r9 = m0.i.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.channels.users.ping.PingUserFragment$invalidate$1.invoke(java.lang.Object):java.lang.Object");
    }
}
