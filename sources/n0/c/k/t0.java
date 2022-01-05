package n0.c.k;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.h;

/* compiled from: ObjectSerializer.kt */
public final class t0<T> implements KSerializer<T> {
    public final SerialDescriptor a;
    public final T b;

    public t0(String str, T t) {
        i.e(str, "serialName");
        i.e(t, "objectInstance");
        this.b = t;
        this.a = a.g0(str, h.d.a, new SerialDescriptor[0], (l) null, 8);
    }

    public T deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        decoder.c(this.a).b(this.a);
        return this.b;
    }

    public SerialDescriptor getDescriptor() {
        return this.a;
    }

    public void serialize(Encoder encoder, T t) {
        i.e(encoder, "encoder");
        i.e(t, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.c(this.a).b(this.a);
    }
}
