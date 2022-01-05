package i0.e.b.b3.a.b.c;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt$buildClassSerialDescriptor$1;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import m0.n.b.i;
import n0.c.l.e;
import n0.c.l.g;
import n0.c.l.k;
import n0.c.l.q.u;

/* compiled from: AnySerializer.kt */
public final class a implements KSerializer<Object> {
    public static final a a = new a();
    public static final SerialDescriptor b = m0.r.t.a.r.m.a1.a.e0("Any", new SerialDescriptor[0], SerialDescriptorsKt$buildClassSerialDescriptor$1.c);

    public final Object a(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            Map map = (Map) jsonElement;
            LinkedHashMap linkedHashMap = new LinkedHashMap(h.R2(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), a.a((JsonElement) entry.getValue()));
            }
            return linkedHashMap;
        } else if (jsonElement instanceof JsonArray) {
            Iterable<JsonElement> iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(h.K(iterable, 10));
            for (JsonElement a2 : iterable) {
                arrayList.add(a.a(a2));
            }
            return arrayList;
        } else if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (m0.r.t.a.r.m.a1.a.E1(jsonPrimitive) != null) {
                i.e(jsonPrimitive, "$this$boolean");
                Boolean b2 = u.b(jsonPrimitive.b());
                if (b2 != null) {
                    return Boolean.valueOf(b2.booleanValue());
                }
                throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
            }
            i.e(jsonPrimitive, "$this$doubleOrNull");
            if (m0.r.t.a.r.m.a1.a.a4(jsonPrimitive.b()) != null) {
                i.e(jsonPrimitive, "$this$double");
                return Double.valueOf(Double.parseDouble(jsonPrimitive.b()));
            }
            i.e(jsonPrimitive, "$this$floatOrNull");
            if (m0.r.t.a.r.m.a1.a.b4(jsonPrimitive.b()) != null) {
                i.e(jsonPrimitive, "$this$float");
                return Float.valueOf(Float.parseFloat(jsonPrimitive.b()));
            }
            i.e(jsonPrimitive, "$this$intOrNull");
            if (StringsKt__IndentKt.S(jsonPrimitive.b()) != null) {
                return Integer.valueOf(m0.r.t.a.r.m.a1.a.N1(jsonPrimitive));
            }
            i.e(jsonPrimitive, "$this$longOrNull");
            String b3 = jsonPrimitive.b();
            i.e(b3, "$this$toLongOrNull");
            if (StringsKt__IndentKt.U(b3, 10) == null) {
                return jsonPrimitive.b();
            }
            i.e(jsonPrimitive, "$this$long");
            return Long.valueOf(Long.parseLong(jsonPrimitive.b()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final JsonElement b(Object obj) {
        if (obj instanceof Map) {
            Set<Map.Entry> entrySet = ((Map) obj).entrySet();
            int R2 = h.R2(h.K(entrySet, 10));
            if (R2 < 16) {
                R2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(R2);
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(String.valueOf(entry.getKey()), a.b(entry.getValue()));
            }
            return new JsonObject(linkedHashMap);
        } else if (obj instanceof List) {
            Iterable<Object> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(h.K(iterable, 10));
            for (Object b2 : iterable) {
                arrayList.add(a.b(b2));
            }
            return new JsonArray(arrayList);
        } else if (obj instanceof Number) {
            return m0.r.t.a.r.m.a1.a.r((Number) obj);
        } else {
            if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    return k.a;
                }
                return new n0.c.l.i(bool, false);
            } else if (obj instanceof String) {
                return m0.r.t.a.r.m.a1.a.s((String) obj);
            } else {
                return m0.r.t.a.r.m.a1.a.s(String.valueOf(obj));
            }
        }
    }

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return a(((e) decoder).i());
    }

    public SerialDescriptor getDescriptor() {
        return b;
    }

    public void serialize(Encoder encoder, Object obj) {
        i.e(encoder, "encoder");
        i.e(obj, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        ((g) encoder).w(b(obj));
    }
}
