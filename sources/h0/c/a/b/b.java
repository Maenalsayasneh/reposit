package h0.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> c;
    public c<K, V> d;
    public WeakHashMap<f<K, V>, Boolean> q = new WeakHashMap<>();
    public int x = 0;

    /* compiled from: SafeIterableMap */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.x;
        }

        public c<K, V> d(c<K, V> cVar) {
            return cVar.q;
        }
    }

    /* renamed from: h0.c.a.b.b$b  reason: collision with other inner class name */
    /* compiled from: SafeIterableMap */
    public static class C0026b<K, V> extends e<K, V> {
        public C0026b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.q;
        }

        public c<K, V> d(c<K, V> cVar) {
            return cVar.x;
        }
    }

    /* compiled from: SafeIterableMap */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K c;
        public final V d;
        public c<K, V> q;
        public c<K, V> x;

        public c(K k, V v) {
            this.c = k;
            this.d = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.c.equals(cVar.c) || !this.d.equals(cVar.d)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.c;
        }

        public V getValue() {
            return this.d;
        }

        public int hashCode() {
            return this.c.hashCode() ^ this.d.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.c + "=" + this.d;
        }
    }

    /* compiled from: SafeIterableMap */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> c;
        public boolean d = true;

        public d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.c;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.x;
                this.c = cVar3;
                this.d = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (!this.d) {
                c<K, V> cVar = this.c;
                if (cVar == null || cVar.q == null) {
                    return false;
                }
                return true;
            } else if (b.this.c != null) {
                return true;
            } else {
                return false;
            }
        }

        public Object next() {
            if (this.d) {
                this.d = false;
                this.c = b.this.c;
            } else {
                c<K, V> cVar = this.c;
                this.c = cVar != null ? cVar.q : null;
            }
            return this.c;
        }
    }

    /* compiled from: SafeIterableMap */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> c;
        public c<K, V> d;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.c = cVar2;
            this.d = cVar;
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.c == cVar && cVar == this.d) {
                this.d = null;
                this.c = null;
            }
            c<K, V> cVar3 = this.c;
            if (cVar3 == cVar) {
                this.c = c(cVar3);
            }
            c<K, V> cVar4 = this.d;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.c;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = d(cVar4);
                }
                this.d = cVar2;
            }
        }

        public abstract c<K, V> c(c<K, V> cVar);

        public abstract c<K, V> d(c<K, V> cVar);

        public boolean hasNext() {
            return this.d != null;
        }

        public Object next() {
            c<K, V> cVar = this.d;
            c<K, V> cVar2 = this.c;
            this.d = (cVar == cVar2 || cVar2 == null) ? null : d(cVar);
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> b(K k) {
        c<K, V> cVar = this.c;
        while (cVar != null && !cVar.c.equals(k)) {
            cVar = cVar.q;
        }
        return cVar;
    }

    public b<K, V>.defpackage.d c() {
        b<K, V>.defpackage.d dVar = new d();
        this.q.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> e(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.x++;
        c<K, V> cVar2 = this.d;
        if (cVar2 == null) {
            this.c = cVar;
            this.d = cVar;
            return cVar;
        }
        cVar2.q = cVar;
        cVar.x = cVar2;
        this.d = cVar;
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((h0.c.a.b.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof h0.c.a.b.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            h0.c.a.b.b r7 = (h0.c.a.b.b) r7
            int r1 = r6.x
            int r3 = r7.x
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            h0.c.a.b.b$e r3 = (h0.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            h0.c.a.b.b$e r4 = (h0.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            h0.c.a.b.b$e r7 = (h0.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.c, this.d);
        this.q.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k, V v) {
        c b = b(k);
        if (b != null) {
            return b.d;
        }
        e(k, v);
        return null;
    }

    public V k(K k) {
        c b = b(k);
        if (b == null) {
            return null;
        }
        this.x--;
        if (!this.q.isEmpty()) {
            for (f<K, V> a2 : this.q.keySet()) {
                a2.a(b);
            }
        }
        c<K, V> cVar = b.x;
        if (cVar != null) {
            cVar.q = b.q;
        } else {
            this.c = b.q;
        }
        c<K, V> cVar2 = b.q;
        if (cVar2 != null) {
            cVar2.x = cVar;
        } else {
            this.d = cVar;
        }
        b.q = null;
        b.x = null;
        return b.d;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                P0.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    P0.append(", ");
                }
            } else {
                P0.append("]");
                return P0.toString();
            }
        }
    }
}
