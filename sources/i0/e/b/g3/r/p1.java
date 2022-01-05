package i0.e.b.g3.r;

import h0.t.l;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: WaitlistViewModel.kt */
public final class p1 implements b {
    public final l a;

    public p1(l lVar) {
        i.e(lVar, "directions");
        this.a = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && i.a(this.a, ((p1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("NavigateTo(directions=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
