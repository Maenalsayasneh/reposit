package m0.j;

import i0.j.f.p.h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import m0.n.b.e;
import m0.n.b.i;
import m0.n.b.s.a;

/* compiled from: Collections.kt */
public final class d<T> implements Collection<T>, a {
    public final T[] c;
    public final boolean d;

    public d(T[] tArr, boolean z) {
        i.e(tArr, "values");
        this.c = tArr;
        this.d = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return h.U(this.c, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.c.length == 0;
    }

    public Iterator<T> iterator() {
        return h.C2(this.c);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.c.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.c;
        boolean z = this.d;
        Class<Object[]> cls = Object[].class;
        i.e(tArr, "$this$copyToArrayOfAny");
        if (z && i.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        i.d(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    public <T> T[] toArray(T[] tArr) {
        return e.b(this, tArr);
    }
}
