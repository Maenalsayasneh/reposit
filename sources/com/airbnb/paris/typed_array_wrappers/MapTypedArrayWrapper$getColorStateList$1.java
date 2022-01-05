package com.airbnb.paris.typed_array_wrappers;

import android.content.res.ColorStateList;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: MapTypedArrayWrapper.kt */
public final class MapTypedArrayWrapper$getColorStateList$1 extends Lambda implements l<Integer, ColorStateList> {
    public final /* synthetic */ MapTypedArrayWrapper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getColorStateList$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.c = mapTypedArrayWrapper;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (this.c.m(intValue)) {
            return null;
        }
        MapTypedArrayWrapper mapTypedArrayWrapper = this.c;
        return mapTypedArrayWrapper.b.getColorStateList(intValue, mapTypedArrayWrapper.c);
    }
}
