package i0.e.b.g3.p.b0;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: BuddyListViewModel.kt */
public final class v implements c {
    public final int a;

    public v(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a == ((v) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("StartClosedChannel(userId="), this.a, ')');
    }
}
