package com.airbnb.paris.typed_array_wrappers;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: MapTypedArrayWrapper.kt */
public final class MapTypedArrayWrapper$styleableAttrIndexes$2 extends Lambda implements a<List<? extends Integer>> {
    public final /* synthetic */ MapTypedArrayWrapper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$styleableAttrIndexes$2(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(0);
        this.c = mapTypedArrayWrapper;
    }

    public Object invoke() {
        Set<Integer> keySet = this.c.g.keySet();
        ArrayList arrayList = new ArrayList(h.K(keySet, 10));
        for (Number intValue : keySet) {
            arrayList.add(Integer.valueOf(h.X1(this.c.f, intValue.intValue())));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).intValue() != -1) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
