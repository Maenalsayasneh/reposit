package i0.e.b.g3.u;

import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class r5 implements c {
    public final User a;

    public r5(User user) {
        i.e(user, "user");
        this.a = user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5) && i.a(this.a, ((r5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("UnblockUser(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
