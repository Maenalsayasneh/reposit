package i0.h.a.c.a;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty */
public class d extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new d();
    public final WeakHashMap<Drawable, Integer> b = new WeakHashMap<>();

    public d() {
        super(Integer.class, "drawableAlphaCompat");
    }

    public Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
