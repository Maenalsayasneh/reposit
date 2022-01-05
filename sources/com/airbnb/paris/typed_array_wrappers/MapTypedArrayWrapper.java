package com.airbnb.paris.typed_array_wrappers;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import i0.b.c.e.a;
import i0.b.c.e.b;
import i0.b.c.e.d;
import i0.b.c.h.c;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: MapTypedArrayWrapper.kt */
public final class MapTypedArrayWrapper extends c {
    public final Resources b;
    public final Resources.Theme c;
    public final m0.c d = h.H2(new MapTypedArrayWrapper$styleableAttrIndexes$2(this));
    public final Context e;
    public final int[] f;
    public final Map<Integer, Object> g;

    public MapTypedArrayWrapper(Context context, int[] iArr, Map<Integer, ? extends Object> map) {
        i.e(context, "context");
        i.e(iArr, "styleableAttrs");
        i.e(map, "attrResToValueMap");
        this.e = context;
        this.f = iArr;
        this.g = map;
        this.b = context.getResources();
        this.c = context.getTheme();
    }

    public static /* synthetic */ Object p(MapTypedArrayWrapper mapTypedArrayWrapper, int i, l lVar, l lVar2, int i2) {
        return mapTypedArrayWrapper.o(i, lVar, (i2 & 4) != 0 ? MapTypedArrayWrapper$getValue$1.c : null);
    }

    public boolean a(int i) {
        return ((Boolean) p(this, i, new MapTypedArrayWrapper$getBoolean$1(this), (l) null, 4)).booleanValue();
    }

    public ColorStateList b(int i) {
        return (ColorStateList) o(i, new MapTypedArrayWrapper$getColorStateList$1(this), MapTypedArrayWrapper$getColorStateList$2.c);
    }

    public int c(int i) {
        return ((Number) p(this, i, new MapTypedArrayWrapper$getDimensionPixelSize$1(this), (l) null, 4)).intValue();
    }

    public Drawable d(int i) {
        return (Drawable) p(this, i, new MapTypedArrayWrapper$getDrawable$1(this), (l) null, 4);
    }

    public float e(int i) {
        return ((Number) p(this, i, new MapTypedArrayWrapper$getFloat$1(this), (l) null, 4)).floatValue();
    }

    public int f(int i) {
        return ((Number) ((List) this.d.getValue()).get(i)).intValue();
    }

    public int g() {
        return ((List) this.d.getValue()).size();
    }

    public int h(int i) {
        return ((Number) p(this, i, new MapTypedArrayWrapper$getInt$1(this), (l) null, 4)).intValue();
    }

    public int i(int i) {
        return ((Number) p(this, i, new MapTypedArrayWrapper$getLayoutDimension$1(this), (l) null, 4)).intValue();
    }

    public int j(int i) {
        int intValue = ((Number) p(this, i, MapTypedArrayWrapper$getResourceId$resId$1.c, (l) null, 4)).intValue();
        if (m(intValue)) {
            return 0;
        }
        return intValue;
    }

    public CharSequence k(int i) {
        return (CharSequence) p(this, i, new MapTypedArrayWrapper$getText$1(this), (l) null, 4);
    }

    public boolean l(int i) {
        return this.g.containsKey(Integer.valueOf(this.f[i]));
    }

    public void n() {
    }

    public final <T> T o(int i, l<? super Integer, ? extends T> lVar, l<? super a, ? extends T> lVar2) {
        T t = this.g.get(Integer.valueOf(this.f[i]));
        if (t instanceof a) {
            return lVar2.invoke(t);
        }
        if (t instanceof b) {
            Resources resources = this.b;
            i.d(resources, "resources");
            Objects.requireNonNull((b) t);
            i.e(resources, "$this$dpToPx");
            return Integer.valueOf((int) TypedValue.applyDimension(1, (float) 0, resources.getDisplayMetrics()));
        } else if (!(t instanceof i0.b.c.e.c)) {
            return t instanceof d ? i0.b.c.g.b.d("a_MapTypedArrayWrapper_MultiStyle", ((d) t).a) : t;
        } else {
            Objects.requireNonNull((i0.b.c.e.c) t);
            return lVar.invoke(0);
        }
    }
}
