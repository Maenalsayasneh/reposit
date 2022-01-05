package m0.r;

import m0.n.a.l;
import m0.r.k;

/* compiled from: KProperty.kt */
public interface m<T, V> extends k<V>, l<T, V> {

    /* compiled from: KProperty.kt */
    public interface a<T, V> extends k.a<V>, l<T, V> {
    }

    V get(T t);

    a<T, V> getGetter();
}
