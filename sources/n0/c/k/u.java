package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: Primitives.kt */
public final class u implements KSerializer<Float> {
    public static final SerialDescriptor a = new z0("kotlin.Float", d.e.a);
    public static final u b = new u();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return Float.valueOf(decoder.E());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        i.e(encoder, "encoder");
        encoder.n(floatValue);
    }
}
