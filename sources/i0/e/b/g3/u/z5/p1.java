package i0.e.b.g3.u.z5;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: NotificationSettingsViewModel.kt */
public final class p1 implements b {
    public final String a;

    public p1(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && i.a(this.a, ((p1) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return a.w0(a.P0("ShowUpdateTrendingError(message="), this.a, ')');
    }
}
