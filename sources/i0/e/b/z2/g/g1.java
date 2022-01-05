package i0.e.b.z2.g;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ChannelControlModel.kt */
public final class g1 implements b {
    public final UserInChannel a;

    public g1(UserInChannel userInChannel) {
        i.e(userInChannel, "fromUser");
        this.a = userInChannel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && i.a(this.a, ((g1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShowSpeakerInvite(fromUser=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
