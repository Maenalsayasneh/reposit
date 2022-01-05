package com.clubhouse.android.ui.invites;

import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.ui.invites.viewholder.Type;
import i0.b.a.o;
import i0.e.b.g3.q.g;
import i0.e.b.g3.q.p;
import i0.e.b.g3.q.r.c;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PendingInvitesFragment.kt */
public final class PendingInvitesFragment$buildInvitesModels$1 extends Lambda implements l<p, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ PendingInvitesFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingInvitesFragment$buildInvitesModels$1(o oVar, PendingInvitesFragment pendingInvitesFragment) {
        super(1);
        this.c = oVar;
        this.d = pendingInvitesFragment;
    }

    public Object invoke(Object obj) {
        p pVar = (p) obj;
        m0.n.b.i.e(pVar, "state");
        List<SuggestedInvite> list = pVar.a;
        if (list != null) {
            o oVar = this.c;
            PendingInvitesFragment pendingInvitesFragment = this.d;
            for (SuggestedInvite suggestedInvite : list) {
                c cVar = new c();
                cVar.M(suggestedInvite.c);
                cVar.O(Type.PENDING_INVITE);
                cVar.N(suggestedInvite);
                cVar.L(new g(pendingInvitesFragment, suggestedInvite));
                oVar.add(cVar);
            }
        }
        return i.a;
    }
}
