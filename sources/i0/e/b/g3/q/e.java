package i0.e.b.g3.q;

import android.view.View;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.ui.invites.InvitesFragment;
import com.clubhouse.android.ui.invites.PendingInvitesArgs;
import h0.b0.v;
import h0.t.q;
import java.util.List;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ InvitesFragment c;
    public final /* synthetic */ m d;

    public /* synthetic */ e(InvitesFragment invitesFragment, m mVar) {
        this.c = invitesFragment;
        this.d = mVar;
    }

    public final void onClick(View view) {
        InvitesFragment invitesFragment = this.c;
        m mVar = this.d;
        i.e(invitesFragment, "this$0");
        i.e(mVar, "$state");
        List<SuggestedInvite> list = mVar.h;
        k<Object>[] kVarArr = InvitesFragment.Z1;
        PendingInvitesArgs pendingInvitesArgs = new PendingInvitesArgs(list);
        i.e(pendingInvitesArgs, "mavericksArg");
        v.a1(invitesFragment, new k(pendingInvitesArgs), (q) null, 2);
    }
}
