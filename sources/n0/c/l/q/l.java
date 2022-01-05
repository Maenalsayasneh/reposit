package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.l.a;

/* compiled from: TreeJsonDecoder.kt */
public final class l extends a {
    public final int f;
    public int g = -1;
    public final JsonArray h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(a aVar, JsonArray jsonArray) {
        super(aVar, jsonArray, (f) null);
        i.e(aVar, "json");
        i.e(jsonArray, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.h = jsonArray;
        this.f = jsonArray.size();
    }

    public JsonElement S(String str) {
        i.e(str, "tag");
        return this.h.b(Integer.parseInt(str));
    }

    public String U(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "desc");
        return String.valueOf(i);
    }

    public JsonElement W() {
        return this.h;
    }

    public int x(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        int i = this.g;
        if (i >= this.f - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.g = i2;
        return i2;
    }
}
