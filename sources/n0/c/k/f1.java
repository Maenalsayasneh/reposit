package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: Primitives.kt */
public final class f1 implements KSerializer<Short> {
    public static final SerialDescriptor a = new z0("kotlin.Short", d.h.a);
    public static final f1 b = new f1();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return Short.valueOf(decoder.D());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        i.e(encoder, "encoder");
        encoder.i(shortValue);
    }
}
