package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import m0.j.g;
import m0.n.b.i;
import n0.c.l.a;

/* compiled from: TreeJsonDecoder.kt */
public final class n extends j {
    public final List<String> j;
    public final int k;
    public int l = -1;
    public final JsonObject m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(a aVar, JsonObject jsonObject) {
        super(aVar, jsonObject, (String) null, (SerialDescriptor) null, 12);
        i.e(aVar, "json");
        i.e(jsonObject, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.m = jsonObject;
        List<String> v02 = g.v0(jsonObject.keySet());
        this.j = v02;
        this.k = v02.size() * 2;
    }

    public JsonElement S(String str) {
        i.e(str, "tag");
        if (this.l % 2 == 0) {
            return m0.r.t.a.r.m.a1.a.s(str);
        }
        return (JsonElement) g.A(this.m, str);
    }

    public String U(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "desc");
        return this.j.get(i / 2);
    }

    public JsonElement W() {
        return this.m;
    }

    public JsonObject Y() {
        return this.m;
    }

    public void b(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
    }

    public int x(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        int i = this.l;
        if (i >= this.k - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.l = i2;
        return i2;
    }
}
