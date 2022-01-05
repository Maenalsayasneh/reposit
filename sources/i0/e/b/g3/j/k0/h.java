package i0.e.b.g3.j.k0;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ActivityOverflowViewModel.kt */
public final class h implements c {
    public final int a;
    public final ActionableNotification b;

    public h(int i, ActionableNotification actionableNotification) {
        i.e(actionableNotification, "notification");
        this.a = i;
        this.b = actionableNotification;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && i.a(this.b, hVar.b);
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
