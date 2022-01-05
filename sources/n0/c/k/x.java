package n0.c.k;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectionSerializers.kt */
public final class x<K, V> extends q0<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    public final SerialDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, (f) null);
        i.e(kSerializer, "kSerializer");
        i.e(kSerializer2, "vSerializer");
        this.c = new w(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    public Object a() {
        return new HashMap();
    }

    public int b(Object obj) {
        HashMap hashMap = (HashMap) obj;
        i.e(hashMap, "$this$builderSize");
        return hashMap.size();
    }

    public void c(Object obj, int i) {
        i.e((HashMap) obj, "$this$checkCapacity");
    }

    public Iterator d(Object obj) {
        Map map = (Map) obj;
        i.e(map, "$this$collectionIterator");
        return map.entrySet().iterator();
    }

    public int e(Object obj) {
        Map map = (Map) obj;
        i.e(map, "$this$collectionSize");
        return map.size();
    }

    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    public Object i(Object obj) {
        Map map = (Map) obj;
        i.e(map, "$this$toBuilder");
        HashMap hashMap = (HashMap) (!(map instanceof HashMap) ? null : map);
        return hashMap != null ? hashMap : new HashMap(map);
    }

    public Object j(Object obj) {
        HashMap hashMap = (HashMap) obj;
        i.e(hashMap, "$this$toResult");
        return hashMap;
    }
}
