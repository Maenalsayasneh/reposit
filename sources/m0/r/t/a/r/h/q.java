package m0.r.t.a.r.h;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap */
public class q<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int c = 0;
    public volatile q<K, V>.defpackage.d Y1;
    public final int d;
    public List<q<K, V>.defpackage.b> q = Collections.emptyList();
    public Map<K, V> x = Collections.emptyMap();
    public boolean y;

    /* compiled from: SmallSortedMap */
    public static class a {
        public static final Iterator<Object> a = new C0269a();
        public static final Iterable<Object> b = new b();

        /* renamed from: m0.r.t.a.r.h.q$a$a  reason: collision with other inner class name */
        /* compiled from: SmallSortedMap */
        public static class C0269a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap */
        public static class b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return a.a;
            }
        }
    }

    /* compiled from: SmallSortedMap */
    public class c implements Iterator<Map.Entry<K, V>> {
        public int c = -1;
        public boolean d;
        public Iterator<Map.Entry<K, V>> q;

        public c(p pVar) {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.q == null) {
                this.q = q.this.x.entrySet().iterator();
            }
            return this.q;
        }

        public boolean hasNext() {
            if (this.c + 1 < q.this.q.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        public Object next() {
            this.d = true;
            int i = this.c + 1;
            this.c = i;
            if (i < q.this.q.size()) {
                return q.this.q.get(this.c);
            }
            return (Map.Entry) a().next();
        }

        public void remove() {
            if (this.d) {
                this.d = false;
                q qVar = q.this;
                int i = q.c;
                qVar.b();
                if (this.c < q.this.q.size()) {
                    q qVar2 = q.this;
                    int i2 = this.c;
                    this.c = i2 - 1;
                    qVar2.i(i2);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* compiled from: SmallSortedMap */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d(p pVar) {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            q.this.h((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            q.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = q.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new c((p) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            q.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return q.this.size();
        }
    }

    public q(int i, p pVar) {
        this.d = i;
    }

    public final int a(K k) {
        int size = this.q.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.q.get(size).c);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.q.get(i2).c);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final void b() {
        if (this.y) {
            throw new UnsupportedOperationException();
        }
    }

    public Map.Entry<K, V> c(int i) {
        return this.q.get(i);
    }

    public void clear() {
        b();
        if (!this.q.isEmpty()) {
            this.q.clear();
        }
        if (!this.x.isEmpty()) {
            this.x.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.x.containsKey(comparable);
    }

    public int d() {
        return this.q.size();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.Y1 == null) {
            this.Y1 = new d((p) null);
        }
        return this.Y1;
    }

    public Iterable<Map.Entry<K, V>> f() {
        return this.x.isEmpty() ? a.b : this.x.entrySet();
    }

    public final SortedMap<K, V> g() {
        b();
        if (this.x.isEmpty() && !(this.x instanceof TreeMap)) {
            this.x = new TreeMap();
        }
        return (SortedMap) this.x;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return this.q.get(a2).d;
        }
        return this.x.get(comparable);
    }

    public V h(K k, V v) {
        b();
        int a2 = a(k);
        if (a2 >= 0) {
            b bVar = this.q.get(a2);
            q.this.b();
            V v2 = bVar.d;
            bVar.d = v;
            return v2;
        }
        b();
        if (this.q.isEmpty() && !(this.q instanceof ArrayList)) {
            this.q = new ArrayList(this.d);
        }
        int i = -(a2 + 1);
        if (i >= this.d) {
            return g().put(k, v);
        }
        int size = this.q.size();
        int i2 = this.d;
        if (size == i2) {
            b remove = this.q.remove(i2 - 1);
            g().put(remove.c, remove.d);
        }
        this.q.add(i, new b(k, v));
        return null;
    }

    public final V i(int i) {
        b();
        V v = this.q.remove(i).d;
        if (!this.x.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            this.q.add(new b(this, (Map.Entry) it.next()));
            it.remove();
        }
        return v;
    }

    public V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return i(a2);
        }
        if (this.x.isEmpty()) {
            return null;
        }
        return this.x.remove(comparable);
    }

    public int size() {
        return this.x.size() + this.q.size();
    }

    /* compiled from: SmallSortedMap */
    public class b implements Comparable<q<K, V>.defpackage.b>, Map.Entry<K, V> {
        public final K c;
        public V d;

        public b(q qVar, Map.Entry<K, V> entry) {
            V value = entry.getValue();
            q.this = qVar;
            this.c = (Comparable) entry.getKey();
            this.d = value;
        }

        public int compareTo(Object obj) {
            return this.c.compareTo(((b) obj).c);
        }

        public boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.c;
            Object key = entry.getKey();
            if (k == null) {
                z = key == null;
            } else {
                z = k.equals(key);
            }
            if (z) {
                V v = this.d;
                Object value = entry.getValue();
                if (v == null) {
                    z2 = value == null;
                } else {
                    z2 = v.equals(value);
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        public Object getKey() {
            return this.c;
        }

        public V getValue() {
            return this.d;
        }

        public int hashCode() {
            K k = this.c;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.d;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            q qVar = q.this;
            int i = q.c;
            qVar.b();
            V v2 = this.d;
            this.d = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.c);
            String valueOf2 = String.valueOf(this.d);
            return i0.d.a.a.a.z0(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, "=", valueOf2);
        }

        public b(K k, V v) {
            this.c = k;
            this.d = v;
        }
    }
}
