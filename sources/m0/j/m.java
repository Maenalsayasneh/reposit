package m0.j;

import java.util.Iterator;
import m0.n.b.i;
import m0.n.b.s.a;

/* compiled from: Iterables.kt */
public final class m<T> implements Iterable<l<? extends T>>, a {
    public final m0.n.a.a<Iterator<T>> c;

    public m(m0.n.a.a<? extends Iterator<? extends T>> aVar) {
        i.e(aVar, "iteratorFactory");
        this.c = aVar;
    }

    public Iterator<l<T>> iterator() {
        return new n(this.c.invoke());
    }
}
