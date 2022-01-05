package n0.c.k;

import i0.j.f.p.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.d;

/* compiled from: CollectionSerializers.kt */
public final class b1<ElementKlass, Element extends ElementKlass> extends l0<Element, Element[], ArrayList<Element>> {
    public final SerialDescriptor b;
    public final d<ElementKlass> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1(d<ElementKlass> dVar, KSerializer<Element> kSerializer) {
        super(kSerializer, (f) null);
        i.e(dVar, "kClass");
        i.e(kSerializer, "eSerializer");
        this.c = dVar;
        this.b = new c(kSerializer.getDescriptor());
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
        Object[] objArr = (Object[]) obj;
        i.e(objArr, "$this$collectionIterator");
        return h.C2(objArr);
    }

    public int e(Object obj) {
        Object[] objArr = (Object[]) obj;
        i.e(objArr, "$this$collectionSize");
        return objArr.length;
    }

    public SerialDescriptor getDescriptor() {
        return this.b;
    }

    public Object i(Object obj) {
        Object[] objArr = (Object[]) obj;
        i.e(objArr, "$this$toBuilder");
        return new ArrayList(g.d(objArr));
    }

    public Object j(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "$this$toResult");
        d<ElementKlass> dVar = this.c;
        i.e(arrayList, "$this$toNativeArrayImpl");
        i.e(dVar, "eClass");
        Object newInstance = Array.newInstance(h.l1(dVar), arrayList.size());
        Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        i.d(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return array;
    }

    public void k(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "$this$insert");
        arrayList.add(i, obj2);
    }
}
