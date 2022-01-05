package i0.e.c.h;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: BackchannelInboxViewModel.kt */
public final class n implements c {
    public final boolean a;

    public n(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a == ((n) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("SetRequestsEnabled(enabled="), this.a, ')');
    }
}
