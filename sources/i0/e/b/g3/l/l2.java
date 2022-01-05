package i0.e.b.g3.l;

import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.android.ui.clubs.ClubRole;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class l2 implements c {
    public final UserInClub a;
    public final ClubRole b;

    public l2(UserInClub userInClub, ClubRole clubRole) {
        i.e(userInClub, "user");
        i.e(clubRole, "role");
        this.a = userInClub;
        this.b = clubRole;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return i.a(this.a, l2Var.a) && this.b == l2Var.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdateClubRole(user=");
        P0.append(this.a);
        P0.append(", role=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
