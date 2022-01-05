package com.airbnb.paris.typed_array_wrappers;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: MapTypedArrayWrapper.kt */
public final class MapTypedArrayWrapper$getDimensionPixelSize$1 extends Lambda implements l<Integer, Integer> {
    public final /* synthetic */ MapTypedArrayWrapper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getDimensionPixelSize$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.c = mapTypedArrayWrapper;
    }

    public Object invoke(Object obj) {
        return Integer.valueOf(this.c.b.getDimensionPixelSize(((Number) obj).intValue()));
    }
}
