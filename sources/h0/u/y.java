package h0.u;

import h0.u.x;
import i0.d.a.a.a;
import java.util.List;
import m0.n.b.i;

/* compiled from: PagingState.kt */
public final class y<Key, Value> {
    public final List<x.b.C0069b<Key, Value>> a;
    public final Integer b;
    public final v c;
    public final int d;

    public y(List<x.b.C0069b<Key, Value>> list, Integer num, v vVar, int i) {
        i.e(list, "pages");
        i.e(vVar, "config");
        this.a = list;
        this.b = num;
        this.c = vVar;
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            return i.a(this.a, yVar.a) && i.a(this.b, yVar.b) && i.a(this.c, yVar.c) && this.d == yVar.d;
        }
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Integer num = this.b;
        return Integer.hashCode(this.d) + this.c.hashCode() + hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("PagingState(pages=");
        P0.append(this.a);
        P0.append(", anchorPosition=");
        P0.append(this.b);
        P0.append(", config=");
        P0.append(this.c);
        P0.append(", ");
        P0.append("leadingPlaceholderCount=");
        return a.s0(P0, this.d, ')');
    }
}
