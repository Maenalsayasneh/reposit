package i0.e.b.z2.g;

import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ChannelControlModel.kt */
public final class e0 implements c {
    public final User a;

    public e0(User user) {
        i.e(user, "user");
        this.a = user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && i.a(this.a, ((e0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("MoveToAudience(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
