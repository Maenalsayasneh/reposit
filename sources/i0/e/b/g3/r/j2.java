package i0.e.b.g3.r;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.onboarding.CollectNameArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ValidateNumberWithCallFragmentDirections.kt */
public final class j2 implements l {
    public final CollectNameArgs a;

    public j2(CollectNameArgs collectNameArgs) {
        i.e(collectNameArgs, "mavericksArg");
        this.a = collectNameArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(CollectNameArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(CollectNameArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(CollectNameArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_validateNumberWithCallFragment_to_collectNameFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && i.a(this.a, ((j2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionValidateNumberWithCallFragmentToCollectNameFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
