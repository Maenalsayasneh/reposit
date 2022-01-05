package com.airbnb.paris.typed_array_wrappers;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: MapTypedArrayWrapper.kt */
public final class MapTypedArrayWrapper$getFloat$1 extends Lambda implements l<Integer, Float> {
    public final /* synthetic */ MapTypedArrayWrapper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getFloat$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.c = mapTypedArrayWrapper;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        Resources resources = this.c.b;
        i.d(resources, "resources");
        i.e(resources, "$this$getFloat");
        TypedValue typedValue = new TypedValue();
        resources.getValue(intValue, typedValue, true);
        return Float.valueOf(typedValue.getFloat());
    }
}
