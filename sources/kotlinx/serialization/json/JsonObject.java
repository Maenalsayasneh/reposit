package kotlinx.serialization.json;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.s.a;
import n0.c.e;
import n0.c.l.n;

@e(with = n.class)
/* compiled from: JsonElement.kt */
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, a {
    public static final Companion Companion = new Companion((f) null);
    public final Map<String, JsonElement> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 4, 2})
    /* compiled from: JsonElement.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<JsonObject> serializer() {
            return n.b;
        }

        public Companion(f fVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonObject(Map<String, ? extends JsonElement> map) {
        super((f) null);
        i.e(map, "content");
        this.c = map;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return this.c.containsKey(str);
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        JsonElement jsonElement = (JsonElement) obj;
        i.e(jsonElement, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        return this.c.containsValue(jsonElement);
    }

    public final Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.c.entrySet();
    }

    public boolean equals(Object obj) {
        return i.a(this.c, obj);
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return this.c.get(str);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final Set<String> keySet() {
        return this.c.keySet();
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.c.size();
    }

    public String toString() {
        return g.E(this.c.entrySet(), InstabugDbContract.COMMA_SEP, "{", "}", 0, (CharSequence) null, JsonObject$toString$1.c, 24);
    }

    public final Collection<JsonElement> values() {
        return this.c.values();
    }
}
