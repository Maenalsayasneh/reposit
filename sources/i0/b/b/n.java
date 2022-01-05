package i0.b.b;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: MavericksTuples.kt */
public final class n<A> {
    public final A a;

    public n(A a2) {
        this.a = a2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof n) && i.a(this.a, ((n) obj).a);
        }
        return true;
    }

    public int hashCode() {
        A a2 = this.a;
        if (a2 != null) {
            return a2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("MavericksTuple1(a=");
        P0.append(this.a);
        P0.append(")");
        return P0.toString();
    }
}
