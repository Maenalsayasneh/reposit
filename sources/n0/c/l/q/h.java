package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;
import m0.i;
import m0.n.a.l;
import m0.n.b.f;
import n0.c.l.a;

/* compiled from: TreeJsonEncoder.kt */
public final class h extends AbstractJsonTreeEncoder {
    public JsonElement f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(a aVar, l<? super JsonElement, i> lVar) {
        super(aVar, lVar, (f) null);
        m0.n.b.i.e(aVar, "json");
        m0.n.b.i.e(lVar, "nodeConsumer");
        this.a.add("primitive");
    }

    public JsonElement N() {
        JsonElement jsonElement = this.f;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    public void O(String str, JsonElement jsonElement) {
        m0.n.b.i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        m0.n.b.i.e(jsonElement, "element");
        boolean z = true;
        if (str == "primitive") {
            if (this.f != null) {
                z = false;
            }
            if (z) {
                this.f = jsonElement;
                return;
            }
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
    }
}
