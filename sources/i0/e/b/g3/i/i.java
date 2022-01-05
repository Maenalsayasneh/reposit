package i0.e.b.g3.i;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ActionSheetViewModel.kt */
public final class i implements c {
    public c a;

    public i(c cVar) {
        m0.n.b.i.e(cVar, "action");
        this.a = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && m0.n.b.i.a(this.a, ((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("SetSelected(action=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
