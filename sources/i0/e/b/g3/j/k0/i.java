package i0.e.b.g3.j.k0;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ActivityOverflowViewModel.kt */
public final class i implements c {
    public final ActionableNotification a;

    public i(ActionableNotification actionableNotification) {
        m0.n.b.i.e(actionableNotification, "notification");
        this.a = actionableNotification;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && m0.n.b.i.a(this.a, ((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("IgnoreNotification(notification=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
