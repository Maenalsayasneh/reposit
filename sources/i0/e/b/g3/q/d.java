package i0.e.b.g3.q;

import android.view.View;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.ui.invites.InvitesFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ InvitesFragment c;
    public final /* synthetic */ SuggestedInvite d;

    public /* synthetic */ d(InvitesFragment invitesFragment, SuggestedInvite suggestedInvite) {
        this.c = invitesFragment;
        this.d = suggestedInvite;
    }

    public final void onClick(View view) {
        InvitesFragment invitesFragment = this.c;
        SuggestedInvite suggestedInvite = this.d;
        i.e(invitesFragment, "this$0");
        i.e(suggestedInvite, "$invite");
        k<Object>[] kVarArr = InvitesFragment.Z1;
        invitesFragment.O0().p(new h(suggestedInvite.c, suggestedInvite.y));
    }
}
