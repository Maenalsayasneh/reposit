package i0.e.b.g3.k.w0.a;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: FollowSpeakersViewModel.kt */
public final class f implements c {
    public final int a;

    public f(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("ToggleFollowUser(userId="), this.a, ')');
    }
}
