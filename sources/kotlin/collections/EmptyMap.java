package kotlin.collections;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m0.n.b.i;
import m0.n.b.s.a;

/* compiled from: Maps.kt */
public final class EmptyMap implements Map, Serializable, a {
    public static final EmptyMap c = new EmptyMap();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            i.e((Void) obj, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        }
        return false;
    }

    public final Set<Map.Entry> entrySet() {
        return EmptySet.c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final Set<Object> keySet() {
        return EmptySet.c;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final Collection values() {
        return EmptyList.c;
    }
}
