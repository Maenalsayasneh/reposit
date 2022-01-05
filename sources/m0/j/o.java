package m0.j;

import java.util.Iterator;
import m0.n.b.s.a;

/* compiled from: Iterators.kt */
public abstract class o implements Iterator<Integer>, a {
    public abstract int a();

    public Object next() {
        return Integer.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
