package i0.e.b.g3.l;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ClubViewModel.kt */
public final class p2 implements c {
    public final int a;
    public final boolean b;

    public p2(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.a == p2Var.a && this.b == p2Var.b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdateLetMemberStartRoom(clubId=");
        P0.append(this.a);
        P0.append(", isCommunity=");
        return a.C0(P0, this.b, ')');
    }
}
