package i0.b.b;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: MavericksTuples.kt */
public final class p<A, B, C, D> {
    public final A a;
    public final B b;
    public final C c;
    public final D d;

    public p(A a2, B b2, C c2, D d2) {
        this.a = a2;
        this.b = b2;
        this.c = c2;
        this.d = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return i.a(this.a, pVar.a) && i.a(this.b, pVar.b) && i.a(this.c, pVar.c) && i.a(this.d, pVar.d);
    }

    public int hashCode() {
        A a2 = this.a;
        int i = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.b;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c2 = this.c;
        int hashCode3 = (hashCode2 + (c2 != null ? c2.hashCode() : 0)) * 31;
        D d2 = this.d;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("MavericksTuple4(a=");
        P0.append(this.a);
        P0.append(", b=");
        P0.append(this.b);
        P0.append(", c=");
        P0.append(this.c);
        P0.append(", d=");
        P0.append(this.d);
        P0.append(")");
        return P0.toString();
    }
}
