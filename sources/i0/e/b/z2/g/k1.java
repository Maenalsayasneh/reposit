package i0.e.b.z2.g;

import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class k1 implements c {
    public final String a;

    public k1(String str) {
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && i.a(this.a, ((k1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("TransitionToChannel(channel="), this.a, ')');
    }
}
