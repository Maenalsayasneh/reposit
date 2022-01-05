package i0.e.b.z2.g;

import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ChannelControlModel.kt */
public final class t0 implements b {
    public final User a;
    public final boolean b;

    public t0(User user, boolean z) {
        i.e(user, "user");
        this.a = user;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return i.a(this.a, t0Var.a) && this.b == t0Var.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShowBlockedFromChannel(user=");
        P0.append(this.a);
        P0.append(", showReportConfirmationAfter=");
        return a.C0(P0, this.b, ')');
    }
}
