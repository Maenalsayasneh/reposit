package i0.e.b.z2.g;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class p0 implements c {
    public final UserInChannel a;

    public p0(UserInChannel userInChannel) {
        i.e(userInChannel, "user");
        this.a = userInChannel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && i.a(this.a, ((p0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("RequestMakeModerator(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
