package i0.e.b.f3.j;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: CompositeSelectableUserDataSource.kt */
public final class d {
    public final String a;
    public final String b;

    public d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.a, dVar.a) && i.a(this.b, dVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Query(channel=");
        P0.append(this.a);
        P0.append(", query=");
        return a.w0(P0, this.b, ')');
    }
}
