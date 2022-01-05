package i0.h.c.j;

import i0.h.c.q.a;
import i0.h.c.q.b;

/* compiled from: OptionalProvider */
public class y<T> implements b<T> {
    public static final /* synthetic */ int a = 0;
    public a<T> b;
    public volatile b<T> c;

    public y(a<T> aVar, b<T> bVar) {
        this.b = aVar;
        this.c = bVar;
    }

    public T get() {
        return this.c.get();
    }
}
