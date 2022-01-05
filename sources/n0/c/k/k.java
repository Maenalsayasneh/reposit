package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: Primitives.kt */
public final class k implements KSerializer<Byte> {
    public static final SerialDescriptor a = new z0("kotlin.Byte", d.b.a);
    public static final k b = new k();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return Byte.valueOf(decoder.C());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        i.e(encoder, "encoder");
        encoder.j(byteValue);
    }
}
