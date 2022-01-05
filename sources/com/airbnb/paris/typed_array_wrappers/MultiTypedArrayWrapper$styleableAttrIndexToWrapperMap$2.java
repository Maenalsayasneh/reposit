package com.airbnb.paris.typed_array_wrappers;

import i0.b.c.h.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.j.o;
import m0.n.a.a;
import m0.q.d;
import m0.q.i;

/* compiled from: MultiTypedArrayWrapper.kt */
public final class MultiTypedArrayWrapper$styleableAttrIndexToWrapperMap$2 extends Lambda implements a<HashMap<Integer, List<c>>> {
    public final /* synthetic */ MultiTypedArrayWrapper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTypedArrayWrapper$styleableAttrIndexToWrapperMap$2(MultiTypedArrayWrapper multiTypedArrayWrapper) {
        super(0);
        this.c = multiTypedArrayWrapper;
    }

    public Object invoke() {
        HashMap hashMap = new HashMap();
        for (c next : this.c.d) {
            Iterator it = i.f(0, next.g()).iterator();
            while (((d) it).hasNext()) {
                int f = next.f(((o) it).a());
                if (!hashMap.containsKey(Integer.valueOf(f))) {
                    hashMap.put(Integer.valueOf(f), g.U(next));
                } else {
                    Object obj = hashMap.get(Integer.valueOf(f));
                    m0.n.b.i.c(obj);
                    ((List) obj).add(next);
                }
            }
        }
        return hashMap;
    }
}
