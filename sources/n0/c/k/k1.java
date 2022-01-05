package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.f;
import m0.n.b.i;
import m0.n.b.k;
import m0.r.t.a.r.m.a1.a;

/* compiled from: InlineClasses.kt */
public final class k1 implements KSerializer<f> {
    public static final SerialDescriptor a = a.i("kotlin.ULong", o0.b);
    public static final k1 b = new k1();

    static {
        a.q3(k.a);
    }

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return new f(decoder.z(a).r());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        long j = ((f) obj).d;
        i.e(encoder, "encoder");
        Encoder y = encoder.y(a);
        if (y != null) {
            y.C(j);
        }
    }
}
