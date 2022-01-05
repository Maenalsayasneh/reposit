package kotlinx.serialization.json;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import n0.c.i.a;
import n0.c.l.f;

/* compiled from: JsonElementSerializers.kt */
public final class JsonElementSerializer$descriptor$1 extends Lambda implements l<a, i> {
    public static final JsonElementSerializer$descriptor$1 c = new JsonElementSerializer$descriptor$1();

    public JsonElementSerializer$descriptor$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        a aVar = (a) obj;
        m0.n.b.i.e(aVar, "$receiver");
        a.a(aVar, "JsonPrimitive", new f(g.c), (List) null, false, 12);
        a.a(aVar, "JsonNull", new f(g.d), (List) null, false, 12);
        a.a(aVar, "JsonLiteral", new f(g.q), (List) null, false, 12);
        a.a(aVar, "JsonObject", new f(g.x), (List) null, false, 12);
        a.a(aVar, "JsonArray", new f(g.y), (List) null, false, 12);
        return i.a;
    }
}
