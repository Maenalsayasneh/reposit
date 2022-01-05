package i0.b.b;

import i0.b.b.j;
import i0.d.a.a.a;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: MavericksViewModelProvider.kt */
public final class e0<S extends j> {
    public final j0 a;
    public final l<S, S> b;

    public e0(j0 j0Var, l<? super S, ? extends S> lVar) {
        i.e(j0Var, "viewModelContext");
        i.e(lVar, "toRestoredState");
        this.a = j0Var;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return i.a(this.a, e0Var.a) && i.a(this.b, e0Var.b);
    }

    public int hashCode() {
        j0 j0Var = this.a;
        int i = 0;
        int hashCode = (j0Var != null ? j0Var.hashCode() : 0) * 31;
        l<S, S> lVar = this.b;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("StateRestorer(viewModelContext=");
        P0.append(this.a);
        P0.append(", toRestoredState=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }
}
