package i0.e.b.b3.a.a.c;

import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.EmptySet;
import m0.j.g;
import m0.n.b.i;

/* compiled from: RaisedHands.kt */
public final class d {
    public final Set<Integer> a;
    public final Set<Integer> b;
    public final Set<Integer> c;

    public d() {
        this((Set) null, (Set) null, (Set) null, 7);
    }

    public d(Set<Integer> set, Set<Integer> set2, Set<Integer> set3) {
        i.e(set, "activeRaisedHands");
        i.e(set2, "allTimeRaisedHands");
        i.e(set3, "invited");
        this.a = set;
        this.b = set2;
        this.c = set3;
    }

    public static d a(d dVar, Set<Integer> set, Set<Integer> set2, Set<Integer> set3, int i) {
        if ((i & 1) != 0) {
            set = dVar.a;
        }
        if ((i & 2) != 0) {
            set2 = dVar.b;
        }
        if ((i & 4) != 0) {
            set3 = dVar.c;
        }
        i.e(set, "activeRaisedHands");
        i.e(set2, "allTimeRaisedHands");
        i.e(set3, "invited");
        return new d(set, set2, set3);
    }

    public final d b(int i) {
        return a(this, g.T(this.a, Integer.valueOf(i)), (Set) null, g.T(this.c, Integer.valueOf(i)), 2);
    }

    public final int c() {
        Set<Integer> set = this.a;
        ArrayList arrayList = new ArrayList();
        for (T next : set) {
            if (!this.c.contains(Integer.valueOf(((Number) next).intValue()))) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.a, dVar.a) && i.a(this.b, dVar.b) && i.a(this.c, dVar.c);
    }

    public int hashCode() {
        return this.c.hashCode() + a.I(this.b, this.a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("RaisedHands(activeRaisedHands=");
        P0.append(this.a);
        P0.append(", allTimeRaisedHands=");
        P0.append(this.b);
        P0.append(", invited=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(Set set, Set set2, Set set3, int i) {
        this((i & 1) != 0 ? EmptySet.c : null, (i & 2) != 0 ? EmptySet.c : null, (i & 4) != 0 ? EmptySet.c : null);
    }
}
