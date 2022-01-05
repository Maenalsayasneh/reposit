package i0.h.a.c.n;

import android.content.Context;
import android.graphics.Color;
import com.google.android.material.R;
import i0.h.a.b.c.m.b;

/* compiled from: ElevationOverlayProvider */
public class a {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public a(Context context) {
        this.a = b.j0(context, R.attr.elevationOverlayEnabled, false);
        this.b = b.K(context, R.attr.elevationOverlayColor, 0);
        this.c = b.K(context, R.attr.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public int a(int i, float f) {
        if (!this.a) {
            return i;
        }
        if (!(h0.i.c.a.c(i, 255) == this.c)) {
            return i;
        }
        float f2 = this.d;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return h0.i.c.a.c(b.b0(h0.i.c.a.c(i, 255), this.b, f3), Color.alpha(i));
    }
}
