package i0.e.b.z2.g;

import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ChannelControlModel.kt */
public final class y implements b {
    public final String a;

    public y(String str) {
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && i.a(this.a, ((y) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("InviteToNewChannelAccepted(channel="), this.a, ')');
    }
}
