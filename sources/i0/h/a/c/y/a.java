package i0.h.a.c.y;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: ElasticTabIndicatorInterpolator */
public class a extends b {
    public static float c(float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    public void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        RectF a = b.a(tabLayout, view);
        RectF a2 = b.a(tabLayout, view2);
        if (a.left < a2.left) {
            f3 = c(f);
            f2 = (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
        } else {
            f3 = (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
            f2 = c(f);
        }
        drawable.setBounds(i0.h.a.c.a.a.a((int) a.left, (int) a2.left, f3), drawable.getBounds().top, i0.h.a.c.a.a.a((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
