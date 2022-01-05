package i0.e.b.g3.w;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import i0.e.b.b3.b.e.g;
import m0.n.b.i;

/* compiled from: ExploreV2ViewModel.kt */
public final class d0 implements c {
    public final g a;
    public final boolean b;

    public d0(g gVar, boolean z) {
        i.e(gVar, "event");
        this.a = gVar;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return i.a(this.a, d0Var.a) && this.b == d0Var.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("RSVPEvent(event=");
        P0.append(this.a);
        P0.append(", isAttending=");
        return a.C0(P0, this.b, ')');
    }
}
