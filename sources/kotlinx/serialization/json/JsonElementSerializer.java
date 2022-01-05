package kotlinx.serialization.json;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.c;
import n0.c.l.b;
import n0.c.l.n;
import n0.c.l.o;

/* compiled from: JsonElementSerializers.kt */
public final class JsonElementSerializer implements KSerializer<JsonElement> {
    public static final SerialDescriptor a = a.f0("kotlinx.serialization.json.JsonElement", c.b.a, new SerialDescriptor[0], JsonElementSerializer$descriptor$1.c);
    public static final JsonElementSerializer b = new JsonElementSerializer();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return a.U(decoder).i();
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        i.e(encoder, "encoder");
        i.e(jsonElement, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        a.V(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.e(o.b, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            encoder.e(n.b, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.e(b.b, jsonElement);
        }
    }
}
