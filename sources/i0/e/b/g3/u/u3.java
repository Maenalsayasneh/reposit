package i0.e.b.g3.u;

import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class u3 implements c {
    public final User a;

    public u3(User user) {
        i.e(user, "user");
        this.a = user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3) && i.a(this.a, ((u3) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("BlockUser(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
