package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: Primitives.kt */
public final class h implements KSerializer<Boolean> {
    public static final SerialDescriptor a = new z0("kotlin.Boolean", d.a.a);
    public static final h b = new h();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return Boolean.valueOf(decoder.e());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i.e(encoder, "encoder");
        encoder.k(booleanValue);
    }
}
