package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: Primitives.kt */
public final class e0 implements KSerializer<Integer> {
    public static final SerialDescriptor a = new z0("kotlin.Int", d.f.a);
    public static final e0 b = new e0();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return Integer.valueOf(decoder.j());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        int intValue = ((Number) obj).intValue();
        i.e(encoder, "encoder");
        encoder.x(intValue);
    }
}
