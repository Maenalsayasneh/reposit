package h0.b0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewUtils */
public class w {
    public static final c0 a;
    public static final Property<View, Float> b = new a(Float.class, "translationAlpha");

    /* compiled from: ViewUtils */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(w.a((View) obj));
        }

        public void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            w.a.e((View) obj, floatValue);
        }
    }

    /* compiled from: ViewUtils */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            AtomicInteger atomicInteger = q.a;
            return ((View) obj).getClipBounds();
        }

        public void set(Object obj, Object obj2) {
            AtomicInteger atomicInteger = q.a;
            ((View) obj).setClipBounds((Rect) obj2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new b0();
        } else {
            a = new a0();
        }
        new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return a.b(view);
    }

    public static void b(View view, int i, int i2, int i3, int i4) {
        a.d(view, i, i2, i3, i4);
    }
}
