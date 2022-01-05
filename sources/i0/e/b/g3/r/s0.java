package i0.e.b.g3.r;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.onboarding.ValidateNumberArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: CollectPhoneNumberFragmentDirections.kt */
public final class s0 implements l {
    public final ValidateNumberArgs a;

    public s0(ValidateNumberArgs validateNumberArgs) {
        i.e(validateNumberArgs, "mavericksArg");
        this.a = validateNumberArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ValidateNumberArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(ValidateNumberArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(ValidateNumberArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_collectPhoneNumberFragment_to_validateNumberFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && i.a(this.a, ((s0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionCollectPhoneNumberFragmentToValidateNumberFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
