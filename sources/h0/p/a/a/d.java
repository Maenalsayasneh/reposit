package h0.p.a.a;

import android.view.animation.Interpolator;
import i0.d.a.a.a;

/* compiled from: LookupTableInterpolator */
public abstract class d implements Interpolator {
    public final float[] a;
    public final float b;

    public d(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.a;
        return a.a(fArr2[min + 1], fArr2[min], f3, fArr2[min]);
    }
}
