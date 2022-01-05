package i0.e.b.g3.l;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.events.HalfEventArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ClubFragmentDirections.kt */
public final class l1 implements l {
    public final HalfEventArgs a;

    public l1(HalfEventArgs halfEventArgs) {
        i.e(halfEventArgs, "mavericksArg");
        this.a = halfEventArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(HalfEventArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(HalfEventArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(HalfEventArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_clubFragment_to_halfEventDialog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && i.a(this.a, ((l1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionClubFragmentToHalfEventDialog(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
