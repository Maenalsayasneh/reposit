package kotlinx.serialization.json;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.s.a;
import n0.c.e;
import n0.c.l.b;

@e(with = b.class)
/* compiled from: JsonElement.kt */
public final class JsonArray extends JsonElement implements List<JsonElement>, a {
    public static final Companion Companion = new Companion((f) null);
    public final List<JsonElement> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlinx/serialization/json/JsonArray$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 4, 2})
    /* compiled from: JsonElement.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<JsonArray> serializer() {
            return b.b;
        }

        public Companion(f fVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonArray(List<? extends JsonElement> list) {
        super((f) null);
        i.e(list, "content");
        this.c = list;
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement b(int i) {
        JsonElement jsonElement = this.c.get(i);
        i.d(jsonElement, "get(...)");
        return jsonElement;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        JsonElement jsonElement = (JsonElement) obj;
        i.e(jsonElement, "element");
        return this.c.contains(jsonElement);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        return this.c.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return i.a(this.c, obj);
    }

    public Object get(int i) {
        JsonElement jsonElement = this.c.get(i);
        i.d(jsonElement, "get(...)");
        return jsonElement;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        JsonElement jsonElement = (JsonElement) obj;
        i.e(jsonElement, "element");
        return this.c.indexOf(jsonElement);
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public Iterator<JsonElement> iterator() {
        return this.c.iterator();
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        JsonElement jsonElement = (JsonElement) obj;
        i.e(jsonElement, "element");
        return this.c.lastIndexOf(jsonElement);
    }

    public ListIterator<JsonElement> listIterator() {
        return this.c.listIterator();
    }

    public ListIterator<JsonElement> listIterator(int i) {
        return this.c.listIterator(i);
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.c.size();
    }

    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<JsonElement> subList(int i, int i2) {
        return this.c.subList(i, i2);
    }

    public Object[] toArray() {
        return m0.n.b.e.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return m0.n.b.e.b(this, tArr);
    }

    public String toString() {
        return g.E(this.c, InstabugDbContract.COMMA_SEP, "[", "]", 0, (CharSequence) null, (l) null, 56);
    }
}
