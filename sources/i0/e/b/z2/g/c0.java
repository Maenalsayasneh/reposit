package i0.e.b.z2.g;

import com.clubhouse.android.channels.analytics.LeaveReason;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ChannelControlModel.kt */
public final class c0 implements c {
    public final LeaveReason a;

    public c0(LeaveReason leaveReason) {
        i.e(leaveReason, "reason");
        this.a = leaveReason;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.a == ((c0) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("LeaveChannel(reason=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
