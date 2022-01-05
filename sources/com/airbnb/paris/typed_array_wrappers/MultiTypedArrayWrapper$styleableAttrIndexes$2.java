package com.airbnb.paris.typed_array_wrappers;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: MultiTypedArrayWrapper.kt */
public final class MultiTypedArrayWrapper$styleableAttrIndexes$2 extends Lambda implements a<List<? extends Integer>> {
    public final /* synthetic */ MultiTypedArrayWrapper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTypedArrayWrapper$styleableAttrIndexes$2(MultiTypedArrayWrapper multiTypedArrayWrapper) {
        super(0);
        this.c = multiTypedArrayWrapper;
    }

    public Object invoke() {
        Set<Integer> keySet = this.c.o().keySet();
        i.d(keySet, "styleableAttrIndexToWrapperMap.keys");
        return g.v0(keySet);
    }
}
