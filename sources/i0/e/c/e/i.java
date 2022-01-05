package i0.e.c.e;

import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: BackchannelCreateChatViewModel.kt */
public final class i implements c {
    public final User a;

    public i(User user) {
        m0.n.b.i.e(user, "user");
        this.a = user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && m0.n.b.i.a(this.a, ((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ToggleUser(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
