package i0.e.b.g3.o;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.clubs.HalfClubRulesArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: HalfEventFragmentDirections.kt */
public final class j0 implements l {
    public final HalfClubRulesArgs a;

    public j0(HalfClubRulesArgs halfClubRulesArgs) {
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
        return R.id.action_halfeventDialog_to_clubRulesDialog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && i.a(this.a, ((j0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionHalfeventDialogToClubRulesDialog(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
