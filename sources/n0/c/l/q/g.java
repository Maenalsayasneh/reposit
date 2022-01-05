package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.l.a;

/* compiled from: TreeJsonDecoder.kt */
public final class g extends a {
    public final JsonPrimitive f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(a aVar, JsonPrimitive jsonPrimitive) {
        super(aVar, jsonPrimitive, (f) null);
        i.e(aVar, "json");
        i.e(jsonPrimitive, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.f = jsonPrimitive;
        this.a.add("primitive");
    }

    public JsonElement S(String str) {
        i.e(str, "tag");
        if (str == "primitive") {
            return this.f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    public JsonElement W() {
        return this.f;
    }

    public int x(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        return 0;
    }
}
