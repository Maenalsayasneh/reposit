package i0.h.a.c.w;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize */
public final class a implements c {
    public final float a;

    public a(float f) {
        this.a = f;
    }

    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.a == ((a) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
