package i0.e.b.a3.d;

import m0.n.b.i;

/* compiled from: AsyncSearchDataSource.kt */
public final class a<T> {
    public final T a;
    public final boolean b;

    public a(T t, boolean z) {
        this.a = t;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public int hashCode() {
        T t = this.a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SelectableItem(item=");
        P0.append(this.a);
        P0.append(", selected=");
        return i0.d.a.a.a.C0(P0, this.b, ')');
    }
}
