package com.airbnb.paris.typed_array_wrappers;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: MapTypedArrayWrapper.kt */
public final class MapTypedArrayWrapper$getDrawable$1 extends Lambda implements l<Integer, Drawable> {
    public final /* synthetic */ MapTypedArrayWrapper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getDrawable$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.c = mapTypedArrayWrapper;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (this.c.m(intValue)) {
            return null;
        }
        MapTypedArrayWrapper mapTypedArrayWrapper = this.c;
        return mapTypedArrayWrapper.b.getDrawable(intValue, mapTypedArrayWrapper.c);
    }
}
