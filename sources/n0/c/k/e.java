package n0.c.k;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectionSerializers.kt */
public final class e<E> extends l0<E, List<? extends E>, ArrayList<E>> {
    public final SerialDescriptor b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(KSerializer<E> kSerializer) {
        super(kSerializer, (f) null);
        i.e(kSerializer, "element");
        this.b = new d(kSerializer.getDescriptor());
    }

    public Object a() {
        return new ArrayList();
    }

    public int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "$this$builderSize");
        return arrayList.size();
    }

    public void c(Object obj, int i) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "$this$checkCapacity");
        arrayList.ensureCapacity(i);
    }

    public Iterator d(Object obj) {
        List list = (List) obj;
        i.e(list, "$this$collectionIterator");
        return list.iterator();
    }

    public int e(Object obj) {
        List list = (List) obj;
        i.e(list, "$this$collectionSize");
        return list.size();
    }

    public SerialDescriptor getDescriptor() {
        return this.b;
    }

    public Object i(Object obj) {
        List list = (List) obj;
        i.e(list, "$this$toBuilder");
        ArrayList arrayList = (ArrayList) (!(list instanceof ArrayList) ? null : list);
        return arrayList != null ? arrayList : new ArrayList(list);
    }

    public Object j(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "$this$toResult");
        return arrayList;
    }

    public void k(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "$this$insert");
        arrayList.add(i, obj2);
    }
}
