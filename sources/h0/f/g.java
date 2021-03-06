package h0.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections */
public abstract class g<K, V> {
    public g<K, V>.defpackage.b a;
    public g<K, V>.defpackage.c b;
    public g<K, V>.defpackage.e c;

    /* compiled from: MapCollections */
    public final class a<T> implements Iterator<T> {
        public final int c;
        public int d;
        public int q;
        public boolean x = false;

        public a(int i) {
            this.c = i;
            this.d = g.this.d();
        }

        public boolean hasNext() {
            return this.q < this.d;
        }

        public T next() {
            if (hasNext()) {
                T b = g.this.b(this.q, this.c);
                this.q++;
                this.x = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.x) {
                int i = this.q - 1;
                this.q = i;
                this.d--;
                this.x = false;
                g.this.h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = g.this.d();
            for (Map.Entry entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return d != g.this.d();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = g.this.e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return d.c(g.this.b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = g.this.d() - 1; d >= 0; d--) {
                Object b = g.this.b(d, 0);
                Object b2 = g.this.b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return g.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections */
    public final class c implements Set<K> {
        public c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map c2 = g.this.c();
            for (Object containsKey : collection) {
                if (!c2.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d = g.this.d() - 1; d >= 0; d--) {
                Object b = g.this.b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e = g.this.e(obj);
            if (e < 0) {
                return false;
            }
            g.this.h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Map c2 = g.this.c();
            int size = c2.size();
            for (Object remove : collection) {
                c2.remove(remove);
            }
            return size != c2.size();
        }

        public boolean retainAll(Collection<?> collection) {
            return g.k(g.this.c(), collection);
        }

        public int size() {
            return g.this.d();
        }

        public Object[] toArray() {
            return g.this.l(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.m(tArr, 0);
        }
    }

    /* compiled from: MapCollections */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int c;
        public int d;
        public boolean q = false;

        public d() {
            this.c = g.this.d() - 1;
            this.d = -1;
        }

        public boolean equals(Object obj) {
            if (!this.q) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!d.c(entry.getKey(), g.this.b(this.d, 0)) || !d.c(entry.getValue(), g.this.b(this.d, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.q) {
                return g.this.b(this.d, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.q) {
                return g.this.b(this.d, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.d < this.c;
        }

        public int hashCode() {
            int i;
            if (this.q) {
                int i2 = 0;
                Object b = g.this.b(this.d, 0);
                Object b2 = g.this.b(this.d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (hasNext()) {
                this.d++;
                this.q = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.q) {
                g.this.h(this.d);
                this.d--;
                this.c--;
                this.q = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.q) {
                return g.this.i(this.d, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections */
    public final class e implements Collection<V> {
        public e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f = g.this.f(obj);
            if (f < 0) {
                return false;
            }
            g.this.h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = g.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(g.this.b(i, 1))) {
                    g.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = g.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(g.this.b(i, 1))) {
                    g.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return g.this.d();
        }

        public Object[] toArray() {
            return g.this.l(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.m(tArr, 1);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k, V v);

    public abstract void h(int i);

    public abstract V i(int i, V v);

    public Object[] l(int i) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        return objArr;
    }

    public <T> T[] m(T[] tArr, int i) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2);
        }
        for (int i2 = 0; i2 < d2; i2++) {
            tArr[i2] = b(i2, i);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}
