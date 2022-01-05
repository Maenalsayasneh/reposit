package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;
import m0.i;
import m0.n.a.l;
import m0.n.b.f;
import n0.c.l.a;

/* compiled from: TreeJsonEncoder.kt */
public class k extends AbstractJsonTreeEncoder {
    public final Map<String, JsonElement> f = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a aVar, l<? super JsonElement, i> lVar) {
        super(aVar, lVar, (f) null);
        m0.n.b.i.e(aVar, "json");
        m0.n.b.i.e(lVar, "nodeConsumer");
    }

    public JsonElement N() {
        return new JsonObject(this.f);
    }

    public void O(String str, JsonElement jsonElement) {
        m0.n.b.i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        m0.n.b.i.e(jsonElement, "element");
        this.f.put(str, jsonElement);
    }
}
