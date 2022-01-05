package h0.c.a.b;

import h0.c.a.b.b;
import java.util.HashMap;

/* compiled from: FastSafeIterableMap */
public class a<K, V> extends b<K, V> {
    public HashMap<K, b.c<K, V>> y = new HashMap<>();

    public b.c<K, V> b(K k) {
        return this.y.get(k);
    }

    public boolean contains(K k) {
        return this.y.containsKey(k);
    }

    public V j(K k, V v) {
        b.c cVar = this.y.get(k);
        if (cVar != null) {
            return cVar.d;
        }
        this.y.put(k, e(k, v));
        return null;
    }

    public V k(K k) {
        V k2 = super.k(k);
        this.y.remove(k);
        return k2;
    }
}
