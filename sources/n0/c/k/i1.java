package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.d;
import m0.n.b.b;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: InlineClasses.kt */
public final class i1 implements KSerializer<d> {
    public static final SerialDescriptor a = a.i("kotlin.UByte", k.b);
    public static final i1 b = new i1();

    static {
        a.o3(b.a);
    }

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return new d(decoder.z(a).C());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        byte b2 = ((d) obj).d;
        i.e(encoder, "encoder");
        Encoder y = encoder.y(a);
        if (y != null) {
            y.j(b2);
        }
    }
}
