package com.airbnb.paris.typed_array_wrappers;

import android.content.res.ColorStateList;
import i0.b.c.e.a;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: MapTypedArrayWrapper.kt */
public final class MapTypedArrayWrapper$getColorStateList$2 extends Lambda implements l<a, ColorStateList> {
    public static final MapTypedArrayWrapper$getColorStateList$2 c = new MapTypedArrayWrapper$getColorStateList$2();

    public MapTypedArrayWrapper$getColorStateList$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        i.e((a) obj, "colorValue");
        ColorStateList valueOf = ColorStateList.valueOf(0);
        i.d(valueOf, "ColorStateList.valueOf(this)");
        return valueOf;
    }
}
