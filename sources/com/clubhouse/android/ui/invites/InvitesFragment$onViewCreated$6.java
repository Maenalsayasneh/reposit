package com.clubhouse.android.ui.invites;

import com.airbnb.epoxy.EpoxyRecyclerView;
import h0.b0.v;
import i0.b.a.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: InvitesFragment.kt */
public final class InvitesFragment$onViewCreated$6 extends Lambda implements l<o, i> {
    public final /* synthetic */ InvitesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesFragment$onViewCreated$6(InvitesFragment invitesFragment) {
        super(1);
        this.c = invitesFragment;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        InvitesFragment invitesFragment = this.c;
        k<Object>[] kVarArr = InvitesFragment.Z1;
        EpoxyRecyclerView epoxyRecyclerView = invitesFragment.N0().b;
        m0.n.b.i.d(epoxyRecyclerView, "binding.invitesList");
        v.T1(oVar, epoxyRecyclerView);
        InvitesFragment invitesFragment2 = this.c;
        v.v2(invitesFragment2.O0(), new InvitesFragment$buildInvitesModels$1(invitesFragment2, oVar));
        return i.a;
    }
}
