package i0.e.b.z2.g;

import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class h implements c {
    public final boolean a;
    public final HandraisePermission b;

    public h(boolean z, HandraisePermission handraisePermission) {
        i.e(handraisePermission, "permission");
        this.a = z;
        this.b = handraisePermission;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        return this.b.hashCode() + ((z ? 1 : 0) * true);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ChangePermissions(isEnabled=");
        P0.append(this.a);
        P0.append(", permission=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
