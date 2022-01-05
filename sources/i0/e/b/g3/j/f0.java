package i0.e.b.g3.j;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ActivityViewModel.kt */
public final class f0 implements c {
    public final ActionableNotification a;

    public f0(ActionableNotification actionableNotification) {
        i.e(actionableNotification, "notification");
        this.a = actionableNotification;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && i.a(this.a, ((f0) obj).a);
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
