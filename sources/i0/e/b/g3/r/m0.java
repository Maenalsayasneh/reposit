package i0.e.b.g3.r;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.onboarding.CollectUsernameArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: CollectNameFragmentDirections.kt */
public final class m0 implements l {
    public final CollectUsernameArgs a;

    public m0(CollectUsernameArgs collectUsernameArgs) {
        i.e(collectUsernameArgs, "mavericksArg");
        this.a = collectUsernameArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(CollectUsernameArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(CollectUsernameArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(CollectUsernameArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_collectNameFragment_to_collectUsernameWithSuggestionsFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && i.a(this.a, ((m0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionCollectNameFragmentToCollectUsernameWithSuggestionsFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
