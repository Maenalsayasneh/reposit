package m0.r.t.a.s;

import i0.d.a.a.a;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.reflect.jvm.internal.pcollections.MapEntry;

/* compiled from: HashPMap */
public final class b<K, V> {
    public static final b<Object, Object> a = new b<>(d.a, 0);
    public final d<a<MapEntry<K, V>>> b;
    public final int c;

    static {
        d<Object> dVar = d.a;
    }

    public b(d<a<MapEntry<K, V>>> dVar, int i) {
        this.b = dVar;
        this.c = i;
    }

    public b<K, V> a(K k, V v) {
        a<Object> aVar = (a) this.b.b.a((long) k.hashCode());
        if (aVar == null) {
            aVar = a.c;
        }
        int i = aVar.x;
        int i2 = 0;
        a aVar2 = aVar;
        while (true) {
            if (aVar2 == null || aVar2.x <= 0) {
                i2 = -1;
            } else if (((MapEntry) aVar2.d).c.equals(k)) {
                break;
            } else {
                aVar2 = aVar2.q;
                i2++;
            }
        }
        i2 = -1;
        if (i2 != -1) {
            if (i2 < 0 || i2 > aVar.x) {
                throw new IndexOutOfBoundsException();
            }
            try {
                aVar = aVar.b(aVar.c(i2).d);
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException(a.e0("Index: ", i2));
            }
        }
        MapEntry mapEntry = new MapEntry(k, v);
        Objects.requireNonNull(aVar);
        a aVar3 = new a(mapEntry, aVar);
        d<a<MapEntry<K, V>>> dVar = this.b;
        c<V> b2 = dVar.b.b((long) k.hashCode(), aVar3);
        if (b2 != dVar.b) {
            dVar = new d<>(b2);
        }
        return new b<>(dVar, (this.c - i) + aVar3.x);
    }
}
