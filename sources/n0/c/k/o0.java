package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: Primitives.kt */
public final class o0 implements KSerializer<Long> {
    public static final SerialDescriptor a = new z0("kotlin.Long", d.g.a);
    public static final o0 b = new o0();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return Long.valueOf(decoder.r());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        long longValue = ((Number) obj).longValue();
        i.e(encoder, "encoder");
        encoder.C(longValue);
    }
}
