package n0.c.k;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: Primitives.kt */
public final class g1 implements KSerializer<String> {
    public static final SerialDescriptor a = new z0("kotlin.String", d.i.a);
    public static final g1 b = new g1();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return decoder.n();
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        i.e(encoder, "encoder");
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.F(str);
    }
}
