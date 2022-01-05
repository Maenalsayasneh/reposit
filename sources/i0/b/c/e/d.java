package i0.b.c.e;

import i0.b.c.g.e;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import m0.n.b.i;

/* compiled from: Styles.kt */
public final class d {
    public final List<e> a;

    public d() {
        ArrayList arrayList = new ArrayList();
        i.e(arrayList, "list");
        this.a = arrayList;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && i.a(this.a, ((d) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<e> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Styles(list=");
        P0.append(this.a);
        P0.append(")");
        return P0.toString();
    }
}
