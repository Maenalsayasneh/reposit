package i0.e.b.g3.q;

import android.view.View;
import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.RationaleHandler;
import com.clubhouse.android.shared.PermissionUtil$withContactsPermissions$1;
import com.clubhouse.android.ui.invites.InvitesFragment;
import com.clubhouse.android.ui.invites.InvitesFragment$onViewCreated$4$1;
import i0.a.a.b;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ InvitesFragment c;

    public /* synthetic */ a(InvitesFragment invitesFragment) {
        this.c = invitesFragment;
    }

    public final void onClick(View view) {
        InvitesFragment invitesFragment = this.c;
        k<Object>[] kVarArr = InvitesFragment.Z1;
        i.e(invitesFragment, "this$0");
        InvitesFragment$onViewCreated$4$1 invitesFragment$onViewCreated$4$1 = new InvitesFragment$onViewCreated$4$1(invitesFragment);
        i.e(invitesFragment, "<this>");
        i.e(invitesFragment$onViewCreated$4$1, "action");
        b.a(invitesFragment, new Permission[]{Permission.READ_CONTACTS}, 0, (RationaleHandler) null, new PermissionUtil$withContactsPermissions$1(invitesFragment$onViewCreated$4$1, invitesFragment), 6);
    }
}
