package i0.h.a.a.i.q.a;

/* compiled from: DoubleCheck */
public final class a<T> implements l0.a.a<T> {
    public static final Object a = new Object();
    public volatile l0.a.a<T> b;
    public volatile Object c = a;

    public a(l0.a.a<T> aVar) {
        this.b = aVar;
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.c;
        T t2 = a;
        if (t == t2) {
            synchronized (this) {
                t = this.c;
                if (t == t2) {
                    t = this.b.get();
                    a(this.c, t);
                    this.c = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
