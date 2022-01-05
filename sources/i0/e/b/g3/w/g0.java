package i0.e.b.g3.w;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import i0.e.b.b3.b.e.e;
import m0.n.b.i;

/* compiled from: ExploreV2ViewModel.kt */
public final class g0 implements b {
    public final e a;

    public g0(e eVar) {
        i.e(eVar, "club");
        this.a = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && i.a(this.a, ((g0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShowClubRules(club=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
