package com.clubhouse.android.ui.invites;

import h0.b0.v;
import i0.b.a.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PendingInvitesFragment.kt */
public final class PendingInvitesFragment$onViewCreated$2 extends Lambda implements l<o, i> {
    public final /* synthetic */ PendingInvitesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingInvitesFragment$onViewCreated$2(PendingInvitesFragment pendingInvitesFragment) {
        super(1);
        this.c = pendingInvitesFragment;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        PendingInvitesFragment pendingInvitesFragment = this.c;
        v.v2((i0.e.b.g3.q.o) pendingInvitesFragment.b2.getValue(), new PendingInvitesFragment$buildInvitesModels$1(oVar, pendingInvitesFragment));
        return i.a;
    }
}
