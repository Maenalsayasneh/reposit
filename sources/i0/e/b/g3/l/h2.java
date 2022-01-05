package i0.e.b.g3.l;

import com.clubhouse.android.data.models.local.user.UserInClub;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class h2 implements c {
    public final UserInClub a;

    public h2(UserInClub userInClub) {
        i.e(userInClub, "user");
        this.a = userInClub;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2) && i.a(this.a, ((h2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("RemoveFromClub(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
