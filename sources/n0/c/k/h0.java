package n0.c.k;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectionSerializers.kt */
public final class h0<K, V> extends q0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    public final SerialDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, (f) null);
        i.e(kSerializer, "kSerializer");
        i.e(kSerializer2, "vSerializer");
        this.c = new g0(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    public Object a() {
        return new LinkedHashMap();
    }

    public int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        i.e(linkedHashMap, "$this$builderSize");
        return linkedHashMap.size();
    }

    public void c(Object obj, int i) {
        i.e((LinkedHashMap) obj, "$this$checkCapacity");
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
        LinkedHashMap linkedHashMap = (LinkedHashMap) (!(map instanceof LinkedHashMap) ? null : map);
        return linkedHashMap != null ? linkedHashMap : new LinkedHashMap(map);
    }

    public Object j(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        i.e(linkedHashMap, "$this$toResult");
        return linkedHashMap;
    }
}
