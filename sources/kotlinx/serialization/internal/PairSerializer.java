package kotlinx.serialization.internal;

import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.k.f0;

/* compiled from: Tuples.kt */
public final class PairSerializer<K, V> extends f0<K, V, Pair<? extends K, ? extends V>> {
    public final SerialDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairSerializer(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, (f) null);
        i.e(kSerializer, "keySerializer");
        i.e(kSerializer2, "valueSerializer");
        this.c = a.e0("kotlin.Pair", new SerialDescriptor[0], new PairSerializer$descriptor$1(kSerializer, kSerializer2));
    }

    public Object a(Object obj) {
        Pair pair = (Pair) obj;
        i.e(pair, "$this$key");
        return pair.c;
    }

    public Object b(Object obj) {
        Pair pair = (Pair) obj;
        i.e(pair, "$this$value");
        return pair.d;
    }

    public Object c(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public SerialDescriptor getDescriptor() {
        return this.c;
    }
}
