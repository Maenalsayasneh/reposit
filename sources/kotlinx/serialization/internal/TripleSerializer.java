package kotlinx.serialization.internal;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Triple;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.c;
import n0.c.j.d;
import n0.c.k.h1;

/* compiled from: Tuples.kt */
public final class TripleSerializer<A, B, C> implements KSerializer<Triple<? extends A, ? extends B, ? extends C>> {
    public final SerialDescriptor a = a.e0("kotlin.Triple", new SerialDescriptor[0], new TripleSerializer$descriptor$1(this));
    public final KSerializer<A> b;
    public final KSerializer<B> c;
    public final KSerializer<C> d;

    public TripleSerializer(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        i.e(kSerializer, "aSerializer");
        i.e(kSerializer2, "bSerializer");
        i.e(kSerializer3, "cSerializer");
        this.b = kSerializer;
        this.c = kSerializer2;
        this.d = kSerializer3;
    }

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        c c2 = decoder.c(this.a);
        if (c2.y()) {
            c cVar = c2;
            Object c1 = a.c1(cVar, this.a, 0, this.b, (Object) null, 8, (Object) null);
            Object c12 = a.c1(cVar, this.a, 1, this.c, (Object) null, 8, (Object) null);
            Object c13 = a.c1(cVar, this.a, 2, this.d, (Object) null, 8, (Object) null);
            c2.b(this.a);
            return new Triple(c1, c12, c13);
        }
        Object obj = h1.a;
        Object obj2 = h1.a;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int x = c2.x(this.a);
            if (x == -1) {
                c2.b(this.a);
                Object obj5 = h1.a;
                Object obj6 = h1.a;
                if (obj2 == obj6) {
                    throw new SerializationException("Element 'first' is missing");
                } else if (obj3 == obj6) {
                    throw new SerializationException("Element 'second' is missing");
                } else if (obj4 != obj6) {
                    return new Triple(obj2, obj3, obj4);
                } else {
                    throw new SerializationException("Element 'third' is missing");
                }
            } else if (x == 0) {
                obj2 = a.c1(c2, this.a, 0, this.b, (Object) null, 8, (Object) null);
            } else if (x == 1) {
                obj3 = a.c1(c2, this.a, 1, this.c, (Object) null, 8, (Object) null);
            } else if (x == 2) {
                obj4 = a.c1(c2, this.a, 2, this.d, (Object) null, 8, (Object) null);
            } else {
                throw new SerializationException(i0.d.a.a.a.e0("Unexpected index ", x));
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return this.a;
    }

    public void serialize(Encoder encoder, Object obj) {
        Triple triple = (Triple) obj;
        i.e(encoder, "encoder");
        i.e(triple, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        d c2 = encoder.c(this.a);
        c2.z(this.a, 0, this.b, triple.c);
        c2.z(this.a, 1, this.c, triple.d);
        c2.z(this.a, 2, this.d, triple.q);
        c2.b(this.a);
    }
}
