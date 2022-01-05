package i0.e.b.g3.j;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ActivityViewModel.kt */
public final class e0 implements c {
    public final int a;
    public final ActionableNotification b;

    public e0(int i, ActionableNotification actionableNotification) {
        i.e(actionableNotification, "notification");
        this.a = i;
        this.b = actionableNotification;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.a == e0Var.a && i.a(this.b, e0Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("Follow(userId=");
        P0.append(this.a);
        P0.append(", notification=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
