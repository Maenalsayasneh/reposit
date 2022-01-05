package i0.e.b.g3.w;

import com.clubhouse.android.data.models.local.user.UserInList;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ExploreViewModel.kt */
public final class h0 implements c {
    public final UserInList a;

    public h0(UserInList userInList) {
        i.e(userInList, "user");
        this.a = userInList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && i.a(this.a, ((h0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ToggleFollowUser(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
