package i0.e.b.g3.u.z5;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;

/* compiled from: NotificationSettingsViewModel.kt */
public final class i1 implements b {
    public final boolean a;

    public i1(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && this.a == ((i1) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("ShowUpdateBackchannelSuccess(enabled="), this.a, ')');
    }
}
