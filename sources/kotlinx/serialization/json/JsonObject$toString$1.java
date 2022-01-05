package kotlinx.serialization.json;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import n0.c.l.q.u;

/* compiled from: JsonElement.kt */
public final class JsonObject$toString$1 extends Lambda implements l<Map.Entry<? extends String, ? extends JsonElement>, CharSequence> {
    public static final JsonObject$toString$1 c = new JsonObject$toString$1();

    public JsonObject$toString$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "<name for destructuring parameter 0>");
        StringBuilder sb = new StringBuilder();
        u.a(sb, (String) entry.getKey());
        sb.append(':');
        sb.append((JsonElement) entry.getValue());
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
