package i0.b.b;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: MavericksTuples.kt */
public final class o<A, B> {
    public final A a;
    public final B b;

    public o(A a2, B b2) {
        this.a = a2;
        this.b = b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return i.a(this.a, oVar.a) && i.a(this.b, oVar.b);
    }

    public int hashCode() {
        A a2 = this.a;
        int i = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.b;
        if (b2 != null) {
            i = b2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("MavericksTuple2(a=");
        P0.append(this.a);
        P0.append(", b=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }
}
