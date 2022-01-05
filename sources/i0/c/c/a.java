package i0.c.c;

/* compiled from: DoubleCheck */
public class a<T> implements b<T> {
    public static final Object a = new Object();
    public volatile b<T> b;
    public volatile Object c = a;

    public a(b<T> bVar) {
        this.b = bVar;
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
