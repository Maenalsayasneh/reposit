package kotlinx.serialization.internal;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.i.h;
import n0.c.k.f0;

/* compiled from: Tuples.kt */
public final class MapEntrySerializer<K, V> extends f0<K, V, Map.Entry<? extends K, ? extends V>> {
    public final SerialDescriptor c;

    /* compiled from: Tuples.kt */
    public static final class a<K, V> implements Map.Entry<K, V>, m0.n.b.s.a {
        public final K c;
        public final V d;

        public a(K k, V v) {
            this.c = k;
            this.d = v;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.c, aVar.c) && i.a(this.d, aVar.d);
        }

        public K getKey() {
            return this.c;
        }

        public V getValue() {
            return this.d;
        }

        public int hashCode() {
            K k = this.c;
            int i = 0;
            int hashCode = (k != null ? k.hashCode() : 0) * 31;
            V v = this.d;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode + i;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("MapEntry(key=");
            P0.append(this.c);
            P0.append(", value=");
            P0.append(this.d);
            P0.append(")");
            return P0.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, (f) null);
        i.e(kSerializer, "keySerializer");
        i.e(kSerializer2, "valueSerializer");
        this.c = m0.r.t.a.r.m.a1.a.f0("kotlin.collections.Map.Entry", h.c.a, new SerialDescriptor[0], new MapEntrySerializer$descriptor$1(kSerializer, kSerializer2));
    }

    public Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "$this$key");
        return entry.getKey();
    }

    public Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "$this$value");
        return entry.getValue();
    }

    public Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    public SerialDescriptor getDescriptor() {
        return this.c;
    }
}
