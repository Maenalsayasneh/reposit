package i0.e.b.g3.o;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: HalfEventViewModel.kt */
public final class x implements c {
    public final int a;

    public x(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.a == ((x) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("AcceptClubInvite(clubId="), this.a, ')');
    }
}
