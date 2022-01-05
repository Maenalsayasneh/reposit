package i0.e.b.g3.l.v2;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.clubs.create.topics.ClubTopicsArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: CreateClubFragmentDirections.kt */
public final class m implements l {
    public final ClubTopicsArgs a;

    public m(ClubTopicsArgs clubTopicsArgs) {
        i.e(clubTopicsArgs, "mavericksArg");
        this.a = clubTopicsArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ClubTopicsArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(ClubTopicsArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(ClubTopicsArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_createClubFragment_to_clubTopicsFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && i.a(this.a, ((m) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionCreateClubFragmentToClubTopicsFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
