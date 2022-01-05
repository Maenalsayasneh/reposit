package i0.e.b.a3.d;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: AsyncSearchDataSource.kt */
public final class b implements c {
    public final String a;

    public b() {
        this("");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && i.a(this.a, ((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("UpdateQuery(query="), this.a, ')');
    }

    public b(String str) {
        i.e(str, "query");
        this.a = str;
    }
}
