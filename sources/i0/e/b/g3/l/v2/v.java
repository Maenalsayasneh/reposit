package i0.e.b.g3.l.v2;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: CreateClubViewModel.kt */
public final class v implements c {
    public final boolean a;

    public v(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a == ((v) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("UpdateIsMembershipOpen(isMembershipOpen="), this.a, ')');
    }
}
