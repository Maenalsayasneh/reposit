package n0.a;

import i0.d.a.a.a;
import m0.i;
import m0.n.a.l;

/* compiled from: CompletionState.kt */
public final class a0 {
    public final Object a;
    public final l<Throwable, i> b;

    public a0(Object obj, l<? super Throwable, i> lVar) {
        this.a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return m0.n.b.i.a(this.a, a0Var.a) && m0.n.b.i.a(this.b, a0Var.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("CompletedWithCancellation(result=");
        P0.append(this.a);
        P0.append(", onCancellation=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
