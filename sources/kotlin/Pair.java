package kotlin;

import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: Tuples.kt */
public final class Pair<A, B> implements Serializable {
    public final A c;
    public final B d;

    public Pair(A a, B b) {
        this.c = a;
        this.d = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return i.a(this.c, pair.c) && i.a(this.d, pair.d);
    }

    public int hashCode() {
        A a = this.c;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.d;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder N0 = a.N0('(');
        N0.append(this.c);
        N0.append(", ");
        N0.append(this.d);
        N0.append(')');
        return N0.toString();
    }
}
