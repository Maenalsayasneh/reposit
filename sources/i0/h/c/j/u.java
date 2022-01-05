package i0.h.c.j;

import i0.h.c.q.b;

/* compiled from: Lazy */
public class u<T> implements b<T> {
    public static final Object a = new Object();
    public volatile Object b = a;
    public volatile b<T> c;

    public u(b<T> bVar) {
        this.c = bVar;
    }

    public T get() {
        T t = this.b;
        T t2 = a;
        if (t == t2) {
            synchronized (this) {
                t = this.b;
                if (t == t2) {
                    t = this.c.get();
                    this.b = t;
                    this.c = null;
                }
            }
        }
        return t;
    }
}
