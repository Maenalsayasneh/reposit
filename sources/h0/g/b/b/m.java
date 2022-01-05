package h0.g.b.b;

import android.view.animation.Interpolator;
import h0.g.a.g.a.c;

/* compiled from: MotionController */
public class m implements Interpolator {
    public final /* synthetic */ c a;

    public m(c cVar) {
        this.a = cVar;
    }

    public float getInterpolation(float f) {
        return (float) this.a.a((double) f);
    }
}
