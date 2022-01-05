package n0.c.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.g;

/* compiled from: JsonElementSerializers.kt */
public final class l implements KSerializer<k> {
    public static final SerialDescriptor a = a.g0("kotlinx.serialization.json.JsonNull", g.b.a, new SerialDescriptor[0], (m0.n.a.l) null, 8);
    public static final l b = new l();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        a.U(decoder);
        decoder.l();
        return k.a;
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        i.e(encoder, "encoder");
        i.e((k) obj, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        a.V(encoder);
        encoder.f();
    }
}
