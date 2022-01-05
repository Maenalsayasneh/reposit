package m0.j;

import java.util.Iterator;
import m0.n.b.s.a;

/* compiled from: Iterators.kt */
public abstract class p implements Iterator<Long>, a {
    public abstract long a();

    public Object next() {
        return Long.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
