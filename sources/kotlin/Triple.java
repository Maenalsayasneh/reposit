package kotlin;

import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: Tuples.kt */
public final class Triple<A, B, C> implements Serializable {
    public final A c;
    public final B d;
    public final C q;

    public Triple(A a, B b, C c2) {
        this.c = a;
        this.d = b;
        this.q = c2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return i.a(this.c, triple.c) && i.a(this.d, triple.d) && i.a(this.q, triple.q);
    }

    public int hashCode() {
        A a = this.c;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.d;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c2 = this.q;
        if (c2 != null) {
            i = c2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder N0 = a.N0('(');
        N0.append(this.c);
        N0.append(", ");
        N0.append(this.d);
        N0.append(", ");
        N0.append(this.q);
        N0.append(')');
        return N0.toString();
    }
}
