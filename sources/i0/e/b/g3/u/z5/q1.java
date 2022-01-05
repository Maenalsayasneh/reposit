package i0.e.b.g3.u.z5;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;

/* compiled from: NotificationSettingsViewModel.kt */
public final class q1 implements b {
    public final boolean a;

    public q1(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1) && this.a == ((q1) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("ShowUpdateTrendingSuccess(enabled="), this.a, ')');
    }
}
