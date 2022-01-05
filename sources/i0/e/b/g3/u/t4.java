package i0.e.b.g3.u;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class t4 implements c {
    public final String a;
    public final SourceLocation b;

    public t4(String str, SourceLocation sourceLocation) {
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        i.e(sourceLocation, "sourceLocation");
        this.a = str;
        this.b = sourceLocation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return i.a(this.a, t4Var.a) && this.b == t4Var.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("JoinChannel(channel=");
        P0.append(this.a);
        P0.append(", sourceLocation=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
