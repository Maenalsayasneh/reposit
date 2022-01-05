package i0.e.b.z2.g;

import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class x implements c {
    public final User a;

    public x(User user) {
        i.e(user, "user");
        this.a = user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && i.a(this.a, ((x) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("InviteToNewChannel(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
