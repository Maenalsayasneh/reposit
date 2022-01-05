package i0.e.b.g3.u;

import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class u5 implements c {
    public final int a;
    public final FollowNotificationType b;

    public u5(int i, FollowNotificationType followNotificationType) {
        i.e(followNotificationType, "notificationType");
        this.a = i;
        this.b = followNotificationType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.a == u5Var.a && this.b == u5Var.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdateNotifyOptionsForUser(userId=");
        P0.append(this.a);
        P0.append(", notificationType=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
