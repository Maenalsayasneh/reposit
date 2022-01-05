package i0.e.b.g3.l;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.clubs.rules.EditClubRulesArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ClubFragmentDirections.kt */
public final class i1 implements l {
    public final EditClubRulesArgs a;

    public i1(EditClubRulesArgs editClubRulesArgs) {
        i.e(editClubRulesArgs, "mavericksArg");
        this.a = editClubRulesArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(EditClubRulesArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(EditClubRulesArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(EditClubRulesArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_clubFragment_to_editClubRulesFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && i.a(this.a, ((i1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionClubFragmentToEditClubRulesFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
