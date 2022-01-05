package i0.e.b.g3.l;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ClubViewModel.kt */
public final class j2 implements c {
    public final int a;

    public j2(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && this.a == ((j2) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("ToggleFollowUser(userId="), this.a, ')');
    }
}
