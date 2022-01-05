package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: Tuples.kt */
public abstract class f0<K, V, R> implements KSerializer<R> {
    public final KSerializer<K> a;
    public final KSerializer<V> b;

    public f0(KSerializer kSerializer, KSerializer kSerializer2, f fVar) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public abstract K a(R r);

    public abstract V b(R r);

    public abstract R c(K k, V v);

    public R deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        c c = decoder.c(getDescriptor());
        if (c.y()) {
            c cVar = c;
            return c(a.c1(cVar, getDescriptor(), 0, this.a, (Object) null, 8, (Object) null), a.c1(cVar, getDescriptor(), 1, this.b, (Object) null, 8, (Object) null));
        }
        Object obj = h1.a;
        Object obj2 = h1.a;
        Object obj3 = obj2;
        while (true) {
            int x = c.x(getDescriptor());
            if (x == -1) {
                c.b(getDescriptor());
                Object obj4 = h1.a;
                Object obj5 = h1.a;
                if (obj2 == obj5) {
                    throw new SerializationException("Element 'key' is missing");
                } else if (obj3 != obj5) {
                    return c(obj2, obj3);
                } else {
                    throw new SerializationException("Element 'value' is missing");
                }
            } else if (x == 0) {
                obj2 = a.c1(c, getDescriptor(), 0, this.a, (Object) null, 8, (Object) null);
            } else if (x == 1) {
                obj3 = a.c1(c, getDescriptor(), 1, this.b, (Object) null, 8, (Object) null);
            } else {
                throw new SerializationException(i0.d.a.a.a.e0("Invalid index: ", x));
            }
        }
    }

    public void serialize(Encoder encoder, R r) {
        i.e(encoder, "encoder");
        d c = encoder.c(getDescriptor());
        c.z(getDescriptor(), 0, this.a, a(r));
        c.z(getDescriptor(), 1, this.b, b(r));
        c.b(getDescriptor());
    }
}
