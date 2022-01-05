package i0.b.b;

import i0.d.a.a.a;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: Async.kt */
public final class f0<T> extends b<T> {
    public final T b;

    public f0(T t) {
        super(true, false, t, (f) null);
        this.b = t;
    }

    public T a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f0) && i.a(this.b, ((f0) obj).b);
        }
        return true;
    }

    public int hashCode() {
        T t = this.b;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Success(value=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }
}
