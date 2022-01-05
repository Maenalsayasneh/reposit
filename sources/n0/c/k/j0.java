package n0.c.k;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectionSerializers.kt */
public final class j0<E> extends l0<E, Set<? extends E>, LinkedHashSet<E>> {
    public final SerialDescriptor b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(KSerializer<E> kSerializer) {
        super(kSerializer, (f) null);
        i.e(kSerializer, "eSerializer");
        this.b = new i0(kSerializer.getDescriptor());
    }

    public Object a() {
        return new LinkedHashSet();
    }

    public int b(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        i.e(linkedHashSet, "$this$builderSize");
        return linkedHashSet.size();
    }

    public void c(Object obj, int i) {
        i.e((LinkedHashSet) obj, "$this$checkCapacity");
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
        LinkedHashSet linkedHashSet = (LinkedHashSet) (!(set instanceof LinkedHashSet) ? null : set);
        return linkedHashSet != null ? linkedHashSet : new LinkedHashSet(set);
    }

    public Object j(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        i.e(linkedHashSet, "$this$toResult");
        return linkedHashSet;
    }

    public void k(Object obj, int i, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        i.e(linkedHashSet, "$this$insert");
        linkedHashSet.add(obj2);
    }
}
