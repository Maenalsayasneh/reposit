package i0.e.b.g3.u.z5;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.profile.settings.EditTopicsArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: SettingsFragmentDirections.kt */
public final class a1 implements l {
    public final EditTopicsArgs a;

    public a1(EditTopicsArgs editTopicsArgs) {
        i.e(editTopicsArgs, "mavericksArg");
        this.a = editTopicsArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(EditTopicsArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(EditTopicsArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(EditTopicsArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_settingsFragment_to_editTopicsFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && i.a(this.a, ((a1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionSettingsFragmentToEditTopicsFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
