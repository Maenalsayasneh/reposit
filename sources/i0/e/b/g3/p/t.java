package i0.e.b.g3.p;

import i0.d.a.a.a;

/* compiled from: HallwayViewModel.kt */
public final class t {
    public final boolean a;
    public final int b;

    public t(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        return Integer.hashCode(this.b) + ((z ? 1 : 0) * true);
    }

    public String toString() {
        StringBuilder P0 = a.P0("NotificationBadgeState(hasUnreadNotifications=");
        P0.append(this.a);
        P0.append(", actionableNotificationCount=");
        return a.s0(P0, this.b, ')');
    }
}
