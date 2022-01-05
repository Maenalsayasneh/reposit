package i0.e.b.g3.j;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ActivityViewModel.kt */
public final class h0 implements c {
    public final boolean a;

    public h0(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && this.a == ((h0) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("MarkNotificationsAsSeen(hasSeen="), this.a, ')');
    }
}
