package i0.e.b.g3.v;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: RecentSpeakersViewModel.kt */
public final class g implements c {
    public final int a;

    public g(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("ToggleFollowUser(userId="), this.a, ')');
    }
}
