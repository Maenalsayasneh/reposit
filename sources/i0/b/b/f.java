package i0.b.b;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: Async.kt */
public final class f<T> extends b<T> implements e {
    public final T b;

    public f() {
        this((Object) null, 1);
    }

    public f(T t) {
        super(false, false, t, (m0.n.b.f) null);
        this.b = t;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && i.a(this.b, ((f) obj).b);
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
        StringBuilder P0 = a.P0("Loading(value=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Object obj, int i) {
        super(false, false, (Object) null, (m0.n.b.f) null);
        int i2 = i & 1;
        this.b = null;
    }
}
