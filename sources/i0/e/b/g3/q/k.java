package i0.e.b.g3.q;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.invites.PendingInvitesArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: InvitesFragmentDirections.kt */
public final class k implements l {
    public final PendingInvitesArgs a;

    public k(PendingInvitesArgs pendingInvitesArgs) {
        i.e(pendingInvitesArgs, "mavericksArg");
        this.a = pendingInvitesArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(PendingInvitesArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(PendingInvitesArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(PendingInvitesArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_invitesFragment_to_pendingInvitesFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && i.a(this.a, ((k) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionInvitesFragmentToPendingInvitesFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
