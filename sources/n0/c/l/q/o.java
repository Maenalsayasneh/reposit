package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import m0.i;
import m0.n.a.l;
import n0.c.l.a;
import n0.c.l.b;
import n0.c.l.n;

/* compiled from: TreeJsonEncoder.kt */
public final class o extends k {
    public String g;
    public boolean h = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(a aVar, l<? super JsonElement, i> lVar) {
        super(aVar, lVar);
        m0.n.b.i.e(aVar, "json");
        m0.n.b.i.e(lVar, "nodeConsumer");
    }

    public JsonElement N() {
        return new JsonObject(this.f);
    }

    public void O(String str, JsonElement jsonElement) {
        m0.n.b.i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        m0.n.b.i.e(jsonElement, "element");
        if (!this.h) {
            Map<String, JsonElement> map = this.f;
            String str2 = this.g;
            if (str2 != null) {
                map.put(str2, jsonElement);
                this.h = true;
                return;
            }
            m0.n.b.i.m("tag");
            throw null;
        } else if (jsonElement instanceof JsonPrimitive) {
            this.g = ((JsonPrimitive) jsonElement).b();
            this.h = false;
        } else if (jsonElement instanceof JsonObject) {
            n nVar = n.b;
            throw m0.r.t.a.r.m.a1.a.m(n.a);
        } else if (jsonElement instanceof JsonArray) {
            b bVar = b.b;
            throw m0.r.t.a.r.m.a1.a.m(b.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
