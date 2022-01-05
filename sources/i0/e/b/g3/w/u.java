package i0.e.b.g3.w;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.clubs.HalfClubRulesArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ExploreV2FragmentDirections.kt */
public final class u implements l {
    public final HalfClubRulesArgs a;

    public u(HalfClubRulesArgs halfClubRulesArgs) {
        i.e(halfClubRulesArgs, "mavericksArg");
        this.a = halfClubRulesArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(HalfClubRulesArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(HalfClubRulesArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(HalfClubRulesArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_exploreV2Fragment_to_clubRules;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && i.a(this.a, ((u) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionExploreV2FragmentToClubRules(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
