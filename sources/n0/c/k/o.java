package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: Primitives.kt */
public final class o implements KSerializer<Character> {
    public static final SerialDescriptor a = new z0("kotlin.Char", d.c.a);
    public static final o b = new o();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return Character.valueOf(decoder.f());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        char charValue = ((Character) obj).charValue();
        i.e(encoder, "encoder");
        encoder.o(charValue);
    }
}
