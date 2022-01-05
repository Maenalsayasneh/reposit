package i0.e.b.g3.u;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: FollowListFragmentDirections.kt */
public final class j4 implements l {
    public final ProfileArgs a;
    public final String b;

    public j4(ProfileArgs profileArgs, String str) {
        i.e(profileArgs, "mavericksArg");
        this.a = profileArgs;
        this.b = str;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ProfileArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(ProfileArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(ProfileArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putString("username", this.b);
        return bundle;
    }

    public int b() {
        return R.id.action_followListFragment_to_profileFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return i.a(this.a, j4Var.a) && i.a(this.b, j4Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionFollowListFragmentToProfileFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(", username=");
        return a.w0(P0, this.b, ')');
    }
}
