package m0.j;

import java.util.Iterator;
import m0.n.b.i;
import m0.n.b.s.a;

/* compiled from: Iterators.kt */
public final class n<T> implements Iterator<l<? extends T>>, a {
    public int c;
    public final Iterator<T> d;

    public n(Iterator<? extends T> it) {
        i.e(it, "iterator");
        this.d = it;
    }

    public final boolean hasNext() {
        return this.d.hasNext();
    }

    public Object next() {
        int i = this.c;
        this.c = i + 1;
        if (i >= 0) {
            return new l(i, this.d.next());
        }
        g.r0();
        throw null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
