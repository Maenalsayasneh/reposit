package i0.h.a.d.a.e;

import java.util.Objects;

public final class c0<T> implements d0, a0 {
    public static final Object a = new Object();
    public volatile d0<T> b;
    public volatile Object c = a;

    public c0(d0<T> d0Var) {
        this.b = d0Var;
    }

    public static <P extends d0<T>, T> a0<T> b(P p) {
        if (p instanceof a0) {
            return (a0) p;
        }
        Objects.requireNonNull(p);
        return new c0(p);
    }

    public final T a() {
        T t = this.c;
        T t2 = a;
        if (t == t2) {
            synchronized (this) {
                t = this.c;
                if (t == t2) {
                    t = this.b.a();
                    T t3 = this.c;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.c = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
