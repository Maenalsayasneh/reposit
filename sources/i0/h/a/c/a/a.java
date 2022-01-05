package i0.h.a.c.a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import h0.p.a.a.b;
import h0.p.a.a.c;

/* compiled from: AnimationUtils */
public class a {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new b();
    public static final TimeInterpolator c = new h0.p.a.a.a();
    public static final TimeInterpolator d = new c();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static int a(int i, int i2, float f) {
        return Math.round(f * ((float) (i2 - i))) + i;
    }
}
