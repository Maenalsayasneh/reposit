package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: Primitives.kt */
public final class r implements KSerializer<Double> {
    public static final SerialDescriptor a = new z0("kotlin.Double", d.C0280d.a);
    public static final r b = new r();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return Double.valueOf(decoder.G());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        i.e(encoder, "encoder");
        encoder.h(doubleValue);
    }
}
