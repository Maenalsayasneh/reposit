package m0.o;

import m0.n.b.i;
import m0.r.k;

/* compiled from: ObservableProperty.kt */
public abstract class b<V> implements d<Object, V> {
    private V value;

    public b(V v) {
        this.value = v;
    }

    public void afterChange(k<?> kVar, V v, V v2) {
        i.e(kVar, "property");
    }

    public boolean beforeChange(k<?> kVar, V v, V v2) {
        i.e(kVar, "property");
        return true;
    }

    public V getValue(Object obj, k<?> kVar) {
        i.e(kVar, "property");
        return this.value;
    }

    public void setValue(Object obj, k<?> kVar, V v) {
        i.e(kVar, "property");
        V v2 = this.value;
        if (beforeChange(kVar, v2, v)) {
            this.value = v;
            afterChange(kVar, v2, v);
        }
    }
}
