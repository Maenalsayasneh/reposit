package i0.e.b.g3.r;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.onboarding.InvitedByFragment;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ValidateNumberFragmentDirections.kt */
public final class g2 implements l {
    public final InvitedByFragment.BundleInfo a;

    public g2(InvitedByFragment.BundleInfo bundleInfo) {
        i.e(bundleInfo, "mavericksArg");
        this.a = bundleInfo;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(InvitedByFragment.BundleInfo.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(InvitedByFragment.BundleInfo.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(InvitedByFragment.BundleInfo.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_validateNumberFragment_to_invitedByFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2) && i.a(this.a, ((g2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionValidateNumberFragmentToInvitedByFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
