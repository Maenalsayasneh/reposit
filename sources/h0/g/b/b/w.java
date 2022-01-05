package h0.g.b.b;

import android.view.animation.Interpolator;
import h0.g.a.g.a.c;

/* compiled from: ViewTransition */
public class w implements Interpolator {
    public final /* synthetic */ c a;

    public w(x xVar, c cVar) {
        this.a = cVar;
    }

    public float getInterpolation(float f) {
        return (float) this.a.a((double) f);
    }
}
