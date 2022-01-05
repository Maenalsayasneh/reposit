package i0.e.b.g3.w;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.events.HalfEventArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ExploreV2FragmentDirections.kt */
public final class v implements l {
    public final HalfEventArgs a;

    public v(HalfEventArgs halfEventArgs) {
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
        return R.id.action_exploreV2Fragment_to_halfEventDialog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && i.a(this.a, ((v) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionExploreV2FragmentToHalfEventDialog(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
