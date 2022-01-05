package i0.e.c.i;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: BackchannelMembersViewModel.kt */
public final class q implements c {
    public final int a;

    public q(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.a == ((q) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("RemoveMember(userId="), this.a, ')');
    }
}
