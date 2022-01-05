package i0.e.b.g3.l;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ClubViewModel.kt */
public final class q2 implements c {
    public final int a;
    public final boolean b;

    public q2(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.a == q2Var.a && this.b == q2Var.b;
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
        StringBuilder P0 = a.P0("UpdateMemberPrivacy(clubId=");
        P0.append(this.a);
        P0.append(", isMembershipPrivate=");
        return a.C0(P0, this.b, ')');
    }
}
