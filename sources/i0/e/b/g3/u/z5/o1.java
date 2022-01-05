package i0.e.b.g3.u.z5;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;

/* compiled from: SettingsViewModel.kt */
public final class o1 implements b {
    public final boolean a;

    public o1(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1) && this.a == ((o1) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("ShowUpdateSendFewerSuccess(enabled="), this.a, ')');
    }
}
