package m0.j.s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import m0.j.s.a;
import m0.n.b.i;

/* compiled from: MapBuilder.kt */
public final class b<K, V> {
    public final a<K, V> c;

    public b(a<K, V> aVar) {
        i.e(aVar, "backing");
        this.c = aVar;
    }

    public boolean add(Object obj) {
        i.e((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        i.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.c.q;
    }

    public void clear() {
        this.c.clear();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "element");
        i.e(entry, "element");
        return this.c.g(entry);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        return this.c.d(collection);
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a<K, V> aVar = this.c;
        Objects.requireNonNull(aVar);
        return new a.b(aVar);
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "element");
        a<K, V> aVar = this.c;
        Objects.requireNonNull(aVar);
        i.e(entry, "entry");
        aVar.c();
        int i = aVar.i(entry.getKey());
        if (i < 0) {
            return false;
        }
        V[] vArr = aVar.b2;
        i.c(vArr);
        if (!i.a(vArr[i], entry.getValue())) {
            return false;
        }
        aVar.m(i);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractSet, m0.j.s.b] */
    public boolean removeAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.c.c();
        return b.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractSet, m0.j.s.b] */
    public boolean retainAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.c.c();
        return b.super.retainAll(collection);
    }
}
