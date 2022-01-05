package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;
import m0.i;
import m0.n.a.l;
import m0.n.b.f;
import n0.c.l.a;

/* compiled from: TreeJsonEncoder.kt */
public final class m extends AbstractJsonTreeEncoder {
    public final ArrayList<JsonElement> f = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(a aVar, l<? super JsonElement, i> lVar) {
        super(aVar, lVar, (f) null);
        m0.n.b.i.e(aVar, "json");
        m0.n.b.i.e(lVar, "nodeConsumer");
    }

    public String G(SerialDescriptor serialDescriptor, int i) {
        m0.n.b.i.e(serialDescriptor, "descriptor");
        return String.valueOf(i);
    }

    public JsonElement N() {
        return new JsonArray(this.f);
    }

    public void O(String str, JsonElement jsonElement) {
        m0.n.b.i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        m0.n.b.i.e(jsonElement, "element");
        this.f.add(Integer.parseInt(str), jsonElement);
    }
}
