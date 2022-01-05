package m0.j;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: IndexedValue.kt */
public final class l<T> {
    public final int a;
    public final T b;

    public l(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && i.a(this.b, lVar.b);
    }

    public int hashCode() {
        int i = this.a * 31;
        T t = this.b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("IndexedValue(index=");
        P0.append(this.a);
        P0.append(", value=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }
}
