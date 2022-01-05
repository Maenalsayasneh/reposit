package m0.r.t.a.r.j.p;

import m0.n.b.i;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public abstract class g<T> {
    public final T a;

    public g(T t) {
        this.a = t;
    }

    public abstract v a(u uVar);

    public T b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object b = b();
            Object obj2 = null;
            g gVar = obj instanceof g ? (g) obj : null;
            if (gVar != null) {
                obj2 = gVar.b();
            }
            return i.a(b, obj2);
        }
    }

    public int hashCode() {
        Object b = b();
        if (b == null) {
            return 0;
        }
        return b.hashCode();
    }

    public String toString() {
        return String.valueOf(b());
    }
}
