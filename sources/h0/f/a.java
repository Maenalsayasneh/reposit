package h0.f;

import h0.f.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap */
public class a<K, V> extends h<K, V> implements Map<K, V> {
    public g<K, V> a2;

    /* renamed from: h0.f.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayMap */
    public class C0028a extends g<K, V> {
        public C0028a() {
        }

        public void a() {
            a.this.clear();
        }

        public Object b(int i, int i2) {
            return a.this.Y1[(i << 1) + i2];
        }

        public Map<K, V> c() {
            return a.this;
        }

        public int d() {
            return a.this.Z1;
        }

        public int e(Object obj) {
            return a.this.f(obj);
        }

        public int f(Object obj) {
            return a.this.h(obj);
        }

        public void g(K k, V v) {
            a.this.put(k, v);
        }

        public void h(int i) {
            a.this.j(i);
        }

        public V i(int i, V v) {
            int i2 = (i << 1) + 1;
            V[] vArr = a.this.Y1;
            V v2 = vArr[i2];
            vArr[i2] = v;
            return v2;
        }
    }

    public a() {
    }

    public Set<Map.Entry<K, V>> entrySet() {
        g m = m();
        if (m.a == null) {
            m.a = new g.b();
        }
        return m.a;
    }

    public Set<K> keySet() {
        g m = m();
        if (m.b == null) {
            m.b = new g.c();
        }
        return m.b;
    }

    public final g<K, V> m() {
        if (this.a2 == null) {
            this.a2 = new C0028a();
        }
        return this.a2;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.Z1);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        g m = m();
        if (m.c == null) {
            m.c = new g.e();
        }
        return m.c;
    }

    public a(int i) {
        super(i);
    }

    public a(h hVar) {
        if (hVar != null) {
            int i = hVar.Z1;
            b(this.Z1 + i);
            if (this.Z1 != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(hVar.i(i2), hVar.l(i2));
                }
            } else if (i > 0) {
                System.arraycopy(hVar.y, 0, this.y, 0, i);
                System.arraycopy(hVar.Y1, 0, this.Y1, 0, i << 1);
                this.Z1 = i;
            }
        }
    }
}
