package i0.e.b.b3.a.b.c;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import j$.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: DateTimeSerializer.kt */
public final class c implements KSerializer<OffsetDateTime> {
    public static final c a = new c();
    public static final SerialDescriptor b = a.w("OffsetDateTime", d.i.a);

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        OffsetDateTime parse = OffsetDateTime.parse(decoder.n());
        i.d(parse, "parse(decoder.decodeString())");
        return parse;
    }

    public SerialDescriptor getDescriptor() {
        return b;
    }

    public void serialize(Encoder encoder, Object obj) {
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        i.e(encoder, "encoder");
        i.e(offsetDateTime, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        String offsetDateTime2 = offsetDateTime.toString();
        i.d(offsetDateTime2, "value.toString()");
        encoder.F(offsetDateTime2);
    }
}
