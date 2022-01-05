package i0.f.a.c.t;

/* compiled from: LookupCache */
public interface i<K, V> {
    V get(Object obj);

    V putIfAbsent(K k, V v);
}
