package n0.c.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: JsonElementSerializers.kt */
public final class o implements KSerializer<JsonPrimitive> {
    public static final SerialDescriptor a = a.g0("kotlinx.serialization.json.JsonPrimitive", d.i.a, new SerialDescriptor[0], (l) null, 8);
    public static final o b = new o();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        JsonElement i = a.U(decoder).i();
        if (i instanceof JsonPrimitive) {
            return (JsonPrimitive) i;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Unexpected JSON element, expected JsonPrimitive, had ");
        P0.append(m.a(i.getClass()));
        throw a.q(-1, P0.toString(), i.toString());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        i.e(encoder, "encoder");
        i.e(jsonPrimitive, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        a.V(encoder);
        if (jsonPrimitive instanceof k) {
            encoder.e(l.b, k.a);
        } else {
            encoder.e(j.b, (i) jsonPrimitive);
        }
    }
}
