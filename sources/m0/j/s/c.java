package m0.j.s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import m0.j.s.a;
import m0.n.b.i;
import m0.n.b.s.d;

/* compiled from: MapBuilder.kt */
public final class c<E> extends m0.j.c<E> implements Set<E>, d {
    public final a<E, ?> c;

    public c(a<E, ?> aVar) {
        i.e(aVar, "backing");
        this.c = aVar;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        i.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.c.q;
    }

    public void clear() {
        this.c.clear();
    }

    public boolean contains(Object obj) {
        return this.c.i(obj) >= 0;
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public Iterator<E> iterator() {
        a<E, ?> aVar = this.c;
        Objects.requireNonNull(aVar);
        return new a.e(aVar);
    }

    public boolean remove(Object obj) {
        a<E, ?> aVar = this.c;
        aVar.c();
        int i = aVar.i(obj);
        if (i < 0) {
            i = -1;
        } else {
            aVar.m(i);
        }
        return i >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.c.c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.c.c();
        return super.retainAll(collection);
    }
}
