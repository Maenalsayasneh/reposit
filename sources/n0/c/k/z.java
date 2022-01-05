package n0.c.k;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectionSerializers.kt */
public final class z<E> extends l0<E, Set<? extends E>, HashSet<E>> {
    public final SerialDescriptor b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(KSerializer<E> kSerializer) {
        super(kSerializer, (f) null);
        i.e(kSerializer, "eSerializer");
        this.b = new y(kSerializer.getDescriptor());
    }

    public Object a() {
        return new HashSet();
    }

    public int b(Object obj) {
        HashSet hashSet = (HashSet) obj;
        i.e(hashSet, "$this$builderSize");
        return hashSet.size();
    }

    public void c(Object obj, int i) {
        i.e((HashSet) obj, "$this$checkCapacity");
    }

    public Iterator d(Object obj) {
        Set set = (Set) obj;
        i.e(set, "$this$collectionIterator");
        return set.iterator();
    }

    public int e(Object obj) {
        Set set = (Set) obj;
        i.e(set, "$this$collectionSize");
        return set.size();
    }

    public SerialDescriptor getDescriptor() {
        return this.b;
    }

    public Object i(Object obj) {
        Set set = (Set) obj;
        i.e(set, "$this$toBuilder");
        HashSet hashSet = (HashSet) (!(set instanceof HashSet) ? null : set);
        return hashSet != null ? hashSet : new HashSet(set);
    }

    public Object j(Object obj) {
        HashSet hashSet = (HashSet) obj;
        i.e(hashSet, "$this$toResult");
        return hashSet;
    }

    public void k(Object obj, int i, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        i.e(hashSet, "$this$insert");
        hashSet.add(obj2);
    }
}
