package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.n.b.m;

/* compiled from: NullableSerializer.kt */
public final class s0<T> implements KSerializer<T> {
    public final SerialDescriptor a;
    public final KSerializer<T> b;

    public s0(KSerializer<T> kSerializer) {
        i.e(kSerializer, "serializer");
        this.b = kSerializer;
        this.a = new c1(kSerializer.getDescriptor());
    }

    public T deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return decoder.u() ? decoder.B(this.b) : decoder.l();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && !(i.a(m.a(s0.class), m.a(obj.getClass())) ^ true) && !(i.a(this.b, ((s0) obj).b) ^ true);
    }

    public SerialDescriptor getDescriptor() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void serialize(Encoder encoder, T t) {
        i.e(encoder, "encoder");
        if (t != null) {
            encoder.p();
            encoder.e(this.b, t);
            return;
        }
        encoder.f();
    }
}
