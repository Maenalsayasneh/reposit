package i0.e.b.g3.u;

import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class l5 implements b {
    public final User a;

    public l5(User user) {
        i.e(user, "userProfile");
        this.a = user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5) && i.a(this.a, ((l5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShowUnblockSuccess(userProfile=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
