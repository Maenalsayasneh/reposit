package m0.r.t.a.r.m.b1;

import m0.n.b.i;

/* compiled from: CapturedTypeApproximation.kt */
public final class a<T> {
    public final T a;
    public final T b;

    public a(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.b, aVar.b);
    }

    public int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ApproximationBounds(lower=");
        P0.append(this.a);
        P0.append(", upper=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
