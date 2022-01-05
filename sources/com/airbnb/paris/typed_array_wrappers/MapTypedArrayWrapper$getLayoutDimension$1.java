package com.airbnb.paris.typed_array_wrappers;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: MapTypedArrayWrapper.kt */
public final class MapTypedArrayWrapper$getLayoutDimension$1 extends Lambda implements l<Integer, Integer> {
    public final /* synthetic */ MapTypedArrayWrapper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getLayoutDimension$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.c = mapTypedArrayWrapper;
    }

    public Object invoke(Object obj) {
        int i;
        int intValue = ((Number) obj).intValue();
        Resources resources = this.c.b;
        i.d(resources, "resources");
        i.e(resources, "$this$getLayoutDimension");
        TypedValue typedValue = new TypedValue();
        resources.getValue(intValue, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 16 || i2 > 31) {
            i = (int) typedValue.getDimension(resources.getDisplayMetrics());
        } else {
            i = typedValue.data;
        }
        return Integer.valueOf(i);
    }
}
