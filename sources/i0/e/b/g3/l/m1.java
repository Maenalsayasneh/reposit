package i0.e.b.g3.l;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.clubs.HalfWelcomeNewClubArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ClubFragmentDirections.kt */
public final class m1 implements l {
    public final HalfWelcomeNewClubArgs a;

    public m1(HalfWelcomeNewClubArgs halfWelcomeNewClubArgs) {
        i.e(halfWelcomeNewClubArgs, "mavericksArg");
        this.a = halfWelcomeNewClubArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(HalfWelcomeNewClubArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(HalfWelcomeNewClubArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(HalfWelcomeNewClubArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_clubFragment_to_halfWelcomeNewClubDialog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && i.a(this.a, ((m1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionClubFragmentToHalfWelcomeNewClubDialog(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
