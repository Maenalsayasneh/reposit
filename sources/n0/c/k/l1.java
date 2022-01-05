package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.h;
import m0.n.b.i;
import m0.n.b.o;
import m0.r.t.a.r.m.a1.a;

/* compiled from: InlineClasses.kt */
public final class l1 implements KSerializer<h> {
    public static final SerialDescriptor a = a.i("kotlin.UShort", f1.b);
    public static final l1 b = new l1();

    static {
        a.r3(o.a);
    }

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return new h(decoder.z(a).D());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        short s = ((h) obj).d;
        i.e(encoder, "encoder");
        Encoder y = encoder.y(a);
        if (y != null) {
            y.i(s);
        }
    }
}
