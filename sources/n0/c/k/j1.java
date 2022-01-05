package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.e;
import m0.n.b.h;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: InlineClasses.kt */
public final class j1 implements KSerializer<e> {
    public static final SerialDescriptor a = a.i("kotlin.UInt", e0.b);
    public static final j1 b = new j1();

    static {
        a.p3(h.a);
    }

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return new e(decoder.z(a).j());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        int i = ((e) obj).d;
        i.e(encoder, "encoder");
        Encoder y = encoder.y(a);
        if (y != null) {
            y.x(i);
        }
    }
}
