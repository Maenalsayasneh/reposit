package i0.e.b.g3.l;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ClubViewModel.kt */
public final class g2 implements c {
    public final int a;

    public g2(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2) && this.a == ((g2) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("Refresh(clubId="), this.a, ')');
    }
}
