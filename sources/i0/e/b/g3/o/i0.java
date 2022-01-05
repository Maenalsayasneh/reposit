package i0.e.b.g3.o;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.events.creation.AddEditEventArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: HalfEventFragmentDirections.kt */
public final class i0 implements l {
    public final AddEditEventArgs a;

    public i0(AddEditEventArgs addEditEventArgs) {
        i.e(addEditEventArgs, "mavericksArg");
        this.a = addEditEventArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(AddEditEventArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(AddEditEventArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(AddEditEventArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_halfEventFragment_to_addEditEventFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && i.a(this.a, ((i0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionHalfEventFragmentToAddEditEventFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
