package i0.h.a.c.z;

import android.animation.ValueAnimator;

/* compiled from: ClearTextEndIconDelegate */
public class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
