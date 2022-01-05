package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ProfileViewModel.kt */
public final class q5 implements c {
    public final boolean a;

    public q5(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5) && this.a == ((q5) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("ToggleUpcomingEventFollow(isFollowing="), this.a, ')');
    }
}
