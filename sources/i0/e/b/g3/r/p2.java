package i0.e.b.g3.r;

import h0.t.l;
import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: ValidateNumberViewModel.kt */
public final class p2 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int d;
    public final l e;

    public p2(boolean z, boolean z2, String str, int i, l lVar) {
        i.e(lVar, "navigateToNext");
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = i;
        this.e = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.a == p2Var.a && this.b == p2Var.b && i.a(this.c, p2Var.c) && this.d == p2Var.d && i.a(this.e, p2Var.e);
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        String str = this.c;
        return this.e.hashCode() + a.M(this.d, (i2 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("VerificationStatus(isOnboarding=");
        P0.append(this.a);
        P0.append(", isVerified=");
        P0.append(this.b);
        P0.append(", username=");
        P0.append(this.c);
        P0.append(", numberOfAttemptsRemaining=");
        P0.append(this.d);
        P0.append(", navigateToNext=");
        P0.append(this.e);
        P0.append(')');
        return P0.toString();
    }
}
