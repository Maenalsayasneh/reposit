package i0.e.b.g3.r;

import com.clubhouse.android.data.models.local.user.UserInList;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: FollowSuggestionsViewModel.kt */
public final class z1 implements c {
    public final UserInList a;

    public z1(UserInList userInList) {
        i.e(userInList, "user");
        this.a = userInList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1) && i.a(this.a, ((z1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ToggleFollow(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
