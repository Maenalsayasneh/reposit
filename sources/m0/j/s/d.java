package m0.j.s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import m0.j.s.a;
import m0.n.b.i;
import m0.n.b.s.b;

/* compiled from: MapBuilder.kt */
public final class d<V> implements Collection<V>, b {
    public final a<?, V> c;

    public d(a<?, V> aVar) {
        i.e(aVar, "backing");
        this.c = aVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        i.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.c.clear();
    }

    public boolean contains(Object obj) {
        return this.c.j(obj) >= 0;
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public Iterator<V> iterator() {
        a<?, V> aVar = this.c;
        Objects.requireNonNull(aVar);
        return new a.f(aVar);
    }

    public boolean remove(Object obj) {
        a<?, V> aVar = this.c;
        aVar.c();
        int j = aVar.j(obj);
        if (j < 0) {
            return false;
        }
        aVar.m(j);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, m0.j.s.d] */
    public boolean removeAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.c.c();
        return d.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, m0.j.s.d] */
    public boolean retainAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.c.c();
        return d.super.retainAll(collection);
    }

    public final int size() {
        return this.c.q;
    }
}
