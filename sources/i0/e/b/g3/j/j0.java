package i0.e.b.g3.j;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ActivityViewModel.kt */
public final class j0 implements c {
    public final ActionableNotification a;

    public j0(ActionableNotification actionableNotification) {
        i.e(actionableNotification, "notification");
        this.a = actionableNotification;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && i.a(this.a, ((j0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("RemoveNotification(notification=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
