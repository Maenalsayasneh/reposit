package i0.e.b.g3.p.b0;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: BuddyListViewModel.kt */
public final class w implements c {
    public final int a;

    public w(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a == ((w) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("StartClubChannel(clubId="), this.a, ')');
    }
}
